package org.blayboy.newpipe.error

import android.content.Context
import android.content.Intent
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.core.view.isVisible
import androidx.fragment.app.Fragment
import com.jakewharton.rxbinding4.view.clicks
import io.reactivex.rxjava3.android.schedulers.AndroidSchedulers
import io.reactivex.rxjava3.disposables.Disposable
import org.blayboy.newpipe.MainActivity
import org.blayboy.newpipe.R
import org.blayboy.newpipe.ktx.animate
import org.blayboy.newpipe.ktx.isInterruptedCaused
import org.blayboy.newpipe.ktx.isNetworkRelated
import org.schabi.newpipe.extractor.exceptions.AgeRestrictedContentException
import org.schabi.newpipe.extractor.exceptions.ContentNotAvailableException
import org.schabi.newpipe.extractor.exceptions.ContentNotSupportedException
import org.schabi.newpipe.extractor.exceptions.GeographicRestrictionException
import org.schabi.newpipe.extractor.exceptions.PaidContentException
import org.schabi.newpipe.extractor.exceptions.PrivateContentException
import org.schabi.newpipe.extractor.exceptions.ReCaptchaException
import org.schabi.newpipe.extractor.exceptions.SoundCloudGoPlusContentException
import org.schabi.newpipe.extractor.exceptions.YoutubeMusicPremiumContentException
import java.util.concurrent.TimeUnit

class ErrorPanelHelper(
    private val fragment: Fragment,
    rootView: View,
    onRetry: Runnable
) {
    private val context: Context = rootView.context!!
    private val errorPanelRoot: View = rootView.findViewById(R.id.error_panel)
    private val errorTextView: TextView = errorPanelRoot.findViewById(R.id.error_message_view)
    private val errorButtonAction: Button = errorPanelRoot.findViewById(R.id.error_button_action)
    private val errorButtonRetry: Button = errorPanelRoot.findViewById(R.id.error_button_retry)

    private var errorDisposable: Disposable? = null

    init {
        errorDisposable = errorButtonRetry.clicks()
            .debounce(300, TimeUnit.MILLISECONDS)
            .observeOn(AndroidSchedulers.mainThread())
            .subscribe { onRetry.run() }
    }

    fun showError(errorInfo: ErrorInfo) {

        if (errorInfo.throwable != null && errorInfo.throwable!!.isInterruptedCaused) {
            if (DEBUG) {
                Log.w(TAG, "onError() isInterruptedCaused! = [$errorInfo.throwable]")
            }
            return
        }

        errorButtonAction.isVisible = true
        if (errorInfo.throwable is ReCaptchaException) {
            errorButtonAction.setText(R.string.recaptcha_solve)
            errorButtonAction.setOnClickListener {
                // Starting ReCaptcha Challenge Activity
                val intent = Intent(context, ReCaptchaActivity::class.java)
                intent.putExtra(
                    ReCaptchaActivity.RECAPTCHA_URL_EXTRA,
                    (errorInfo.throwable as ReCaptchaException).url
                )
                fragment.startActivityForResult(intent, ReCaptchaActivity.RECAPTCHA_REQUEST)
                errorButtonAction.setOnClickListener(null)
            }
            errorTextView.setText(R.string.recaptcha_request_toast)
            errorButtonRetry.isVisible = true
        } else {
            errorButtonAction.setText(R.string.error_snackbar_action)
            errorButtonAction.setOnClickListener {
                ErrorActivity.reportError(context, errorInfo)
            }

            // hide retry button by default, then show only if not unavailable/unsupported content
            errorButtonRetry.isVisible = false
            errorTextView.setText(
                when (errorInfo.throwable) {
                    is AgeRestrictedContentException -> R.string.restricted_video_no_stream
                    is GeographicRestrictionException -> R.string.georestricted_content
                    is PaidContentException -> R.string.paid_content
                    is PrivateContentException -> R.string.private_content
                    is SoundCloudGoPlusContentException -> R.string.soundcloud_go_plus_content
                    is YoutubeMusicPremiumContentException -> R.string.youtube_music_premium_content
                    is ContentNotAvailableException -> R.string.content_not_available
                    is ContentNotSupportedException -> R.string.content_not_supported
                    else -> {
                        // show retry button only for content which is not unavailable or unsupported
                        errorButtonRetry.isVisible = true
                        if (errorInfo.throwable != null && errorInfo.throwable!!.isNetworkRelated) {
                            R.string.network_error
                        } else {
                            R.string.error_snackbar_message
                        }
                    }
                }
            )
        }
        errorPanelRoot.animate(true, 300)
    }

    fun showTextError(errorString: String) {
        errorButtonAction.isVisible = false
        errorButtonRetry.isVisible = false
        errorTextView.text = errorString
    }

    fun hide() {
        errorButtonAction.setOnClickListener(null)
        errorPanelRoot.animate(false, 150)
    }

    fun isVisible(): Boolean {
        return errorPanelRoot.isVisible
    }

    fun dispose() {
        errorButtonAction.setOnClickListener(null)
        errorButtonRetry.setOnClickListener(null)
        errorDisposable?.dispose()
    }

    companion object {
        val TAG: String = ErrorPanelHelper::class.simpleName!!
        val DEBUG: Boolean = MainActivity.DEBUG
    }
}
