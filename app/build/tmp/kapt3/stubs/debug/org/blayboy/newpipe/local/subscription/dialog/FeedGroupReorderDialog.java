package org.blayboy.newpipe.local.subscription.dialog;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0012\u001a\u00020\u0013H\u0002J\b\u0010\u0014\u001a\u00020\u0015H\u0002J\u0016\u0010\u0016\u001a\u00020\u00132\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00190\u0018H\u0002J\u0012\u0010\u001a\u001a\u00020\u00132\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0016J&\u0010\u001d\u001a\u0004\u0018\u00010\u001e2\u0006\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\"2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0016J\b\u0010#\u001a\u00020\u0013H\u0016J\u0010\u0010$\u001a\u00020\u00132\u0006\u0010%\u001a\u00020\u001cH\u0016J\u001a\u0010&\u001a\u00020\u00132\u0006\u0010\'\u001a\u00020\u001e2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0016R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\u00020\u00048BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0018\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006("}, d2 = {"Lorg/blayboy/newpipe/local/subscription/dialog/FeedGroupReorderDialog;", "Landroidx/fragment/app/DialogFragment;", "()V", "_binding", "Lorg/blayboy/newpipe/databinding/DialogFeedGroupReorderBinding;", "binding", "getBinding", "()Lorg/blayboy/newpipe/databinding/DialogFeedGroupReorderBinding;", "groupAdapter", "Lcom/xwray/groupie/GroupAdapter;", "Lcom/xwray/groupie/GroupieViewHolder;", "groupOrderedIdList", "Ljava/util/ArrayList;", "", "itemTouchHelper", "Landroidx/recyclerview/widget/ItemTouchHelper;", "viewModel", "Lorg/blayboy/newpipe/local/subscription/dialog/FeedGroupReorderDialogViewModel;", "disableInput", "", "getItemTouchCallback", "Landroidx/recyclerview/widget/ItemTouchHelper$SimpleCallback;", "handleGroups", "list", "", "Lorg/blayboy/newpipe/database/feed/model/FeedGroupEntity;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onDestroyView", "onSaveInstanceState", "outState", "onViewCreated", "view", "app_debug"})
public final class FeedGroupReorderDialog extends androidx.fragment.app.DialogFragment {
    private org.blayboy.newpipe.databinding.DialogFeedGroupReorderBinding _binding;
    private org.blayboy.newpipe.local.subscription.dialog.FeedGroupReorderDialogViewModel viewModel;
    @org.jetbrains.annotations.NotNull()
    @icepick.State()
    public java.util.ArrayList<java.lang.Long> groupOrderedIdList;
    private final com.xwray.groupie.GroupAdapter<com.xwray.groupie.GroupieViewHolder> groupAdapter = null;
    private final androidx.recyclerview.widget.ItemTouchHelper itemTouchHelper = null;
    private java.util.HashMap _$_findViewCache;
    
    private final org.blayboy.newpipe.databinding.DialogFeedGroupReorderBinding getBinding() {
        return null;
    }
    
    @java.lang.Override()
    public void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull()
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    @java.lang.Override()
    public void onViewCreated(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    public void onDestroyView() {
    }
    
    @java.lang.Override()
    public void onSaveInstanceState(@org.jetbrains.annotations.NotNull()
    android.os.Bundle outState) {
    }
    
    private final void handleGroups(java.util.List<org.blayboy.newpipe.database.feed.model.FeedGroupEntity> list) {
    }
    
    private final void disableInput() {
    }
    
    private final androidx.recyclerview.widget.ItemTouchHelper.SimpleCallback getItemTouchCallback() {
        return null;
    }
    
    public FeedGroupReorderDialog() {
        super();
    }
}