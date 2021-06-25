package org.blayboy.newpipe.local.subscription.item;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\u0010\u0000\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 -2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001-B?\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00050\u0007\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u00a2\u0006\u0002\u0010\fJ\"\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\b\b\u0001\u0010\u001b\u001a\u00020\b2\u0006\u0010\u001c\u001a\u00020\u001dH\u0002J\u0018\u0010\u001e\u001a\u00020\u00052\u0006\u0010\u001f\u001a\u00020\u00022\u0006\u0010 \u001a\u00020\bH\u0016J&\u0010\u001e\u001a\u00020\u00052\u0006\u0010\u001f\u001a\u00020\u00022\u0006\u0010 \u001a\u00020\b2\f\u0010!\u001a\b\u0012\u0004\u0012\u00020#0\"H\u0016J\b\u0010$\u001a\u00020\bH\u0016J\u0010\u0010%\u001a\u00020\u00022\u0006\u0010&\u001a\u00020\u0018H\u0014J\u0010\u0010\'\u001a\u00020\u00052\u0006\u0010(\u001a\u00020\u001dH\u0002J\u0010\u0010)\u001a\u00020\u00052\u0006\u0010(\u001a\u00020\u001dH\u0002J\u0016\u0010*\u001a\u00020\u00052\f\u0010+\u001a\b\u0012\u0004\u0012\u00020\u00020,H\u0016R\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\n\u001a\u00020\u000bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u001d\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00050\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0013\u00a8\u0006."}, d2 = {"Lorg/blayboy/newpipe/local/subscription/item/FeedImportExportItem;", "Lcom/xwray/groupie/viewbinding/BindableItem;", "Lorg/blayboy/newpipe/databinding/FeedImportExportGroupBinding;", "onImportPreviousSelected", "Lkotlin/Function0;", "", "onImportFromServiceSelected", "Lkotlin/Function1;", "", "onExportSelected", "isExpanded", "", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Z)V", "expandIconListener", "Lorg/blayboy/newpipe/views/CollapsibleView$StateListener;", "()Z", "setExpanded", "(Z)V", "getOnExportSelected", "()Lkotlin/jvm/functions/Function0;", "getOnImportFromServiceSelected", "()Lkotlin/jvm/functions/Function1;", "getOnImportPreviousSelected", "addItemView", "Landroid/view/View;", "title", "", "icon", "container", "Landroid/view/ViewGroup;", "bind", "viewBinding", "position", "payloads", "", "", "getLayout", "initializeViewBinding", "view", "setupExportToItems", "listHolder", "setupImportFromItems", "unbind", "viewHolder", "Lcom/xwray/groupie/viewbinding/GroupieViewHolder;", "Companion", "app_debug"})
public final class FeedImportExportItem extends com.xwray.groupie.viewbinding.BindableItem<org.blayboy.newpipe.databinding.FeedImportExportGroupBinding> {
    private org.blayboy.newpipe.views.CollapsibleView.StateListener expandIconListener;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.jvm.functions.Function0<kotlin.Unit> onImportPreviousSelected = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.jvm.functions.Function1<java.lang.Integer, kotlin.Unit> onImportFromServiceSelected = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.jvm.functions.Function0<kotlin.Unit> onExportSelected = null;
    private boolean isExpanded;
    public static final int REFRESH_EXPANDED_STATUS = 123;
    public static final org.blayboy.newpipe.local.subscription.item.FeedImportExportItem.Companion Companion = null;
    
    @java.lang.Override()
    public void bind(@org.jetbrains.annotations.NotNull()
    org.blayboy.newpipe.databinding.FeedImportExportGroupBinding viewBinding, int position, @org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.Object> payloads) {
    }
    
    @java.lang.Override()
    public int getLayout() {
        return 0;
    }
    
    @java.lang.Override()
    public void bind(@org.jetbrains.annotations.NotNull()
    org.blayboy.newpipe.databinding.FeedImportExportGroupBinding viewBinding, int position) {
    }
    
    @java.lang.Override()
    public void unbind(@org.jetbrains.annotations.NotNull()
    com.xwray.groupie.viewbinding.GroupieViewHolder<org.blayboy.newpipe.databinding.FeedImportExportGroupBinding> viewHolder) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    protected org.blayboy.newpipe.databinding.FeedImportExportGroupBinding initializeViewBinding(@org.jetbrains.annotations.NotNull()
    android.view.View view) {
        return null;
    }
    
    private final android.view.View addItemView(java.lang.String title, @androidx.annotation.DrawableRes()
    int icon, android.view.ViewGroup container) {
        return null;
    }
    
    private final void setupImportFromItems(android.view.ViewGroup listHolder) {
    }
    
    private final void setupExportToItems(android.view.ViewGroup listHolder) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlin.jvm.functions.Function0<kotlin.Unit> getOnImportPreviousSelected() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlin.jvm.functions.Function1<java.lang.Integer, kotlin.Unit> getOnImportFromServiceSelected() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlin.jvm.functions.Function0<kotlin.Unit> getOnExportSelected() {
        return null;
    }
    
    public final boolean isExpanded() {
        return false;
    }
    
    public final void setExpanded(boolean p0) {
    }
    
    public FeedImportExportItem(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> onImportPreviousSelected, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.lang.Integer, kotlin.Unit> onImportFromServiceSelected, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> onExportSelected, boolean isExpanded) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lorg/blayboy/newpipe/local/subscription/item/FeedImportExportItem$Companion;", "", "()V", "REFRESH_EXPANDED_STATUS", "", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}