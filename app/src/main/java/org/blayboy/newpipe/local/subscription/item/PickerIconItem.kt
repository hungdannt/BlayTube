package org.blayboy.newpipe.local.subscription.item

import android.content.Context
import android.view.View
import androidx.annotation.DrawableRes
import com.xwray.groupie.viewbinding.BindableItem
import org.blayboy.newpipe.R
import org.blayboy.newpipe.databinding.PickerIconItemBinding
import org.blayboy.newpipe.local.subscription.FeedGroupIcon

class PickerIconItem(
    context: Context,
    val icon: FeedGroupIcon
) : BindableItem<PickerIconItemBinding>() {
    @DrawableRes
    val iconRes: Int = icon.getDrawableRes()

    override fun getLayout(): Int = R.layout.picker_icon_item

    override fun bind(viewBinding: PickerIconItemBinding, position: Int) {
        viewBinding.iconView.setImageResource(iconRes)
    }

    override fun initializeViewBinding(view: View) = PickerIconItemBinding.bind(view)
}
