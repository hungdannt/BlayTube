package org.blayboy.newpipe.local.subscription.item

import android.view.View
import com.xwray.groupie.viewbinding.BindableItem
import org.blayboy.newpipe.R
import org.blayboy.newpipe.databinding.FeedGroupAddNewItemBinding

class FeedGroupAddItem : BindableItem<FeedGroupAddNewItemBinding>() {
    override fun getLayout(): Int = R.layout.feed_group_add_new_item
    override fun bind(viewBinding: FeedGroupAddNewItemBinding, position: Int) {}
    override fun initializeViewBinding(view: View) = FeedGroupAddNewItemBinding.bind(view)
}
