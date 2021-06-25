package org.blayboy.newpipe.local.subscription.item;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\bH\u0016J\b\u0010\t\u001a\u00020\bH\u0016J\u0018\u0010\n\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u0010\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u000eH\u0014\u00a8\u0006\u000f"}, d2 = {"Lorg/blayboy/newpipe/local/subscription/item/EmptyPlaceholderItem;", "Lcom/xwray/groupie/viewbinding/BindableItem;", "Lorg/blayboy/newpipe/databinding/ListEmptyViewBinding;", "()V", "bind", "", "viewBinding", "position", "", "getLayout", "getSpanSize", "spanCount", "initializeViewBinding", "view", "Landroid/view/View;", "app_debug"})
public final class EmptyPlaceholderItem extends com.xwray.groupie.viewbinding.BindableItem<org.blayboy.newpipe.databinding.ListEmptyViewBinding> {
    
    @java.lang.Override()
    public int getLayout() {
        return 0;
    }
    
    @java.lang.Override()
    public void bind(@org.jetbrains.annotations.NotNull()
    org.blayboy.newpipe.databinding.ListEmptyViewBinding viewBinding, int position) {
    }
    
    @java.lang.Override()
    public int getSpanSize(int spanCount, int position) {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    protected org.blayboy.newpipe.databinding.ListEmptyViewBinding initializeViewBinding(@org.jetbrains.annotations.NotNull()
    android.view.View view) {
        return null;
    }
    
    public EmptyPlaceholderItem() {
        super();
    }
}