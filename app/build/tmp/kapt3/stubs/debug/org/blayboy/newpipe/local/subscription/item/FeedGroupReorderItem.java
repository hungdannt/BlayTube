package org.blayboy.newpipe.local.subscription.item;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010!\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0017\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0007B\'\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u000eJ,\u0010\u0017\u001a\u00020\u00182\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001f0\u001eH\u0016J\u0018\u0010\u0017\u001a\u00020\u00182\u0006\u0010 \u001a\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u001cH\u0016J\t\u0010!\u001a\u00020\tH\u00c6\u0003J\t\u0010\"\u001a\u00020\u000bH\u00c6\u0003J\t\u0010#\u001a\u00020\rH\u00c6\u0003J\t\u0010$\u001a\u00020\u0006H\u00c6\u0003J1\u0010%\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u0005\u001a\u00020\u0006H\u00c6\u0001J\u0013\u0010&\u001a\u00020\'2\b\u0010(\u001a\u0004\u0018\u00010\u001fH\u00d6\u0003J\b\u0010)\u001a\u00020\u001cH\u0016J\b\u0010*\u001a\u00020\tH\u0016J\b\u0010+\u001a\u00020\u001cH\u0016J\t\u0010,\u001a\u00020\u001cH\u00d6\u0001J\u0010\u0010-\u001a\u00020\u00022\u0006\u0010.\u001a\u00020/H\u0014J\t\u00100\u001a\u00020\u000bH\u00d6\u0001R\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\b\u001a\u00020\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\f\u001a\u00020\r\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\n\u001a\u00020\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016\u00a8\u00061"}, d2 = {"Lorg/blayboy/newpipe/local/subscription/item/FeedGroupReorderItem;", "Lcom/xwray/groupie/viewbinding/BindableItem;", "Lorg/blayboy/newpipe/databinding/FeedGroupReorderItemBinding;", "feedGroupEntity", "Lorg/blayboy/newpipe/database/feed/model/FeedGroupEntity;", "dragCallback", "Landroidx/recyclerview/widget/ItemTouchHelper;", "(Lorg/blayboy/newpipe/database/feed/model/FeedGroupEntity;Landroidx/recyclerview/widget/ItemTouchHelper;)V", "groupId", "", "name", "", "icon", "Lorg/blayboy/newpipe/local/subscription/FeedGroupIcon;", "(JLjava/lang/String;Lorg/blayboy/newpipe/local/subscription/FeedGroupIcon;Landroidx/recyclerview/widget/ItemTouchHelper;)V", "getDragCallback", "()Landroidx/recyclerview/widget/ItemTouchHelper;", "getGroupId", "()J", "getIcon", "()Lorg/blayboy/newpipe/local/subscription/FeedGroupIcon;", "getName", "()Ljava/lang/String;", "bind", "", "viewHolder", "Lcom/xwray/groupie/viewbinding/GroupieViewHolder;", "position", "", "payloads", "", "", "viewBinding", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "getDragDirs", "getId", "getLayout", "hashCode", "initializeViewBinding", "view", "Landroid/view/View;", "toString", "app_debug"})
public final class FeedGroupReorderItem extends com.xwray.groupie.viewbinding.BindableItem<org.blayboy.newpipe.databinding.FeedGroupReorderItemBinding> {
    private final long groupId = 0L;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String name = null;
    @org.jetbrains.annotations.NotNull()
    private final org.blayboy.newpipe.local.subscription.FeedGroupIcon icon = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.recyclerview.widget.ItemTouchHelper dragCallback = null;
    
    @java.lang.Override()
    public long getId() {
        return 0L;
    }
    
    @java.lang.Override()
    public int getLayout() {
        return 0;
    }
    
    @java.lang.Override()
    public void bind(@org.jetbrains.annotations.NotNull()
    org.blayboy.newpipe.databinding.FeedGroupReorderItemBinding viewBinding, int position) {
    }
    
    @java.lang.Override()
    public void bind(@org.jetbrains.annotations.NotNull()
    com.xwray.groupie.viewbinding.GroupieViewHolder<org.blayboy.newpipe.databinding.FeedGroupReorderItemBinding> viewHolder, int position, @org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.Object> payloads) {
    }
    
    @java.lang.Override()
    public int getDragDirs() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    protected org.blayboy.newpipe.databinding.FeedGroupReorderItemBinding initializeViewBinding(@org.jetbrains.annotations.NotNull()
    android.view.View view) {
        return null;
    }
    
    public final long getGroupId() {
        return 0L;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getName() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.blayboy.newpipe.local.subscription.FeedGroupIcon getIcon() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.recyclerview.widget.ItemTouchHelper getDragCallback() {
        return null;
    }
    
    public FeedGroupReorderItem(long groupId, @org.jetbrains.annotations.NotNull()
    java.lang.String name, @org.jetbrains.annotations.NotNull()
    org.blayboy.newpipe.local.subscription.FeedGroupIcon icon, @org.jetbrains.annotations.NotNull()
    androidx.recyclerview.widget.ItemTouchHelper dragCallback) {
        super();
    }
    
    public FeedGroupReorderItem(@org.jetbrains.annotations.NotNull()
    org.blayboy.newpipe.database.feed.model.FeedGroupEntity feedGroupEntity, @org.jetbrains.annotations.NotNull()
    androidx.recyclerview.widget.ItemTouchHelper dragCallback) {
        super();
    }
    
    public final long component1() {
        return 0L;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.blayboy.newpipe.local.subscription.FeedGroupIcon component3() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.recyclerview.widget.ItemTouchHelper component4() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.blayboy.newpipe.local.subscription.item.FeedGroupReorderItem copy(long groupId, @org.jetbrains.annotations.NotNull()
    java.lang.String name, @org.jetbrains.annotations.NotNull()
    org.blayboy.newpipe.local.subscription.FeedGroupIcon icon, @org.jetbrains.annotations.NotNull()
    androidx.recyclerview.widget.ItemTouchHelper dragCallback) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object p0) {
        return false;
    }
}