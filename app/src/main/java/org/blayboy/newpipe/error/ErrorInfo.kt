package org.blayboy.newpipe.error

import android.os.Parcelable
import androidx.annotation.StringRes
import kotlinx.android.parcel.Parcelize
import org.blayboy.newpipe.R
import org.blayboy.newpipe.ktx.isNetworkRelated
import org.schabi.newpipe.extractor.Info
import org.schabi.newpipe.extractor.NewPipe
import org.schabi.newpipe.extractor.exceptions.ContentNotAvailableException
import org.schabi.newpipe.extractor.exceptions.ContentNotSupportedException
import org.schabi.newpipe.extractor.exceptions.ExtractionException
import org.schabi.newpipe.extractor.services.youtube.extractors.YoutubeStreamExtractor.DeobfuscateException
import java.io.PrintWriter
import java.io.StringWriter

@Parcelize
class ErrorInfo(
    val stackTraces: Array<String>,
    val userAction: UserAction,
    val serviceName: String,
    val request: String,
    val messageStringId: Int,
    @Transient // no need to store throwable, all data for report is in other variables
    var throwable: Throwable? = null
) : Parcelable {

    private constructor(
        throwable: Throwable,
        userAction: UserAction,
        serviceName: String,
        request: String
    ) : this(
        throwableToStringList(throwable),
        userAction,
        serviceName,
        request,
        getMessageStringId(throwable, userAction),
        throwable
    )

    private constructor(
        throwable: List<Throwable>,
        userAction: UserAction,
        serviceName: String,
        request: String
    ) : this(
        throwableListToStringList(throwable),
        userAction,
        serviceName,
        request,
        getMessageStringId(throwable.firstOrNull(), userAction),
        throwable.firstOrNull()
    )

    // constructors with single throwable
    constructor(throwable: Throwable, userAction: UserAction, request: String) :
        this(throwable, userAction, SERVICE_NONE, request)
    constructor(throwable: Throwable, userAction: UserAction, request: String, serviceId: Int) :
        this(throwable, userAction, NewPipe.getNameOfService(serviceId), request)
    constructor(throwable: Throwable, userAction: UserAction, request: String, info: Info?) :
        this(throwable, userAction, getInfoServiceName(info), request)

    // constructors with list of throwables
    constructor(throwable: List<Throwable>, userAction: UserAction, request: String) :
        this(throwable, userAction, SERVICE_NONE, request)
    constructor(throwable: List<Throwable>, userAction: UserAction, request: String, serviceId: Int) :
        this(throwable, userAction, NewPipe.getNameOfService(serviceId), request)
    constructor(throwable: List<Throwable>, userAction: UserAction, request: String, info: Info?) :
        this(throwable, userAction, getInfoServiceName(info), request)

    companion object {
        const val SERVICE_NONE = "none"

        private fun getStackTrace(throwable: Throwable): String {
            StringWriter().use { stringWriter ->
                PrintWriter(stringWriter, true).use { printWriter ->
                    throwable.printStackTrace(printWriter)
                    return stringWriter.buffer.toString()
                }
            }
        }

        fun throwableToStringList(throwable: Throwable) = arrayOf(getStackTrace(throwable))

        fun throwableListToStringList(throwable: List<Throwable>) =
            Array(throwable.size) { i -> getStackTrace(throwable[i]) }

        private fun getInfoServiceName(info: Info?) =
            if (info == null) SERVICE_NONE else NewPipe.getNameOfService(info.serviceId)

        @StringRes
        private fun getMessageStringId(
            throwable: Throwable?,
            action: UserAction
        ): Int {
            return when {
                throwable is ContentNotAvailableException -> R.string.content_not_available
                throwable != null && throwable.isNetworkRelated -> R.string.network_error
                throwable is ContentNotSupportedException -> R.string.content_not_supported
                throwable is DeobfuscateException -> R.string.youtube_signature_deobfuscation_error
                throwable is ExtractionException -> R.string.parsing_error
                action == UserAction.UI_ERROR -> R.string.app_ui_crash
                action == UserAction.REQUESTED_COMMENTS -> R.string.error_unable_to_load_comments
                action == UserAction.SUBSCRIPTION_CHANGE -> R.string.subscription_change_failed
                action == UserAction.SUBSCRIPTION_UPDATE -> R.string.subscription_update_failed
                action == UserAction.LOAD_IMAGE -> R.string.could_not_load_thumbnails
                action == UserAction.DOWNLOAD_OPEN_DIALOG -> R.string.could_not_setup_download_menu
                else -> R.string.general_error
            }
        }
    }
}
