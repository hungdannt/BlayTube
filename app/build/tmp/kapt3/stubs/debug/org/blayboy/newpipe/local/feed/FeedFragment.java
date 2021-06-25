package org.blayboy.newpipe.local.feed;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0088\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\r\u0018\u0000 D2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001DB\u0005\u00a2\u0006\u0002\u0010\u0004J\b\u0010\u0014\u001a\u00020\u0003H\u0014J\b\u0010\u0015\u001a\u00020\u0003H\u0016J\u0010\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0019H\u0002J\u0010\u0010\u001a\u001a\u00020\u00032\u0006\u0010\u001b\u001a\u00020\u001cH\u0002J\u0010\u0010\u001d\u001a\u00020\u00032\u0006\u0010\u001e\u001a\u00020\u001fH\u0002J\u0010\u0010 \u001a\u00020\u00032\u0006\u0010!\u001a\u00020\u0002H\u0016J\b\u0010\"\u001a\u00020\u0017H\u0014J\b\u0010#\u001a\u00020\u0003H\u0016J\b\u0010$\u001a\u00020\u0003H\u0014J\b\u0010%\u001a\u00020\u0003H\u0014J\u0012\u0010&\u001a\u00020\u00032\b\u0010\'\u001a\u0004\u0018\u00010(H\u0016J\u0018\u0010)\u001a\u00020\u00032\u0006\u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020-H\u0016J&\u0010.\u001a\u0004\u0018\u00010/2\u0006\u0010,\u001a\u0002002\b\u00101\u001a\u0004\u0018\u0001022\b\u0010\'\u001a\u0004\u0018\u00010(H\u0016J\b\u00103\u001a\u00020\u0003H\u0016J\b\u00104\u001a\u00020\u0003H\u0016J\b\u00105\u001a\u00020\u0003H\u0016J\u0010\u00106\u001a\u00020\u00172\u0006\u00107\u001a\u000208H\u0016J\b\u00109\u001a\u00020\u0003H\u0016J\b\u0010:\u001a\u00020\u0003H\u0016J\u001a\u0010;\u001a\u00020\u00032\u0006\u0010<\u001a\u00020/2\b\u0010\'\u001a\u0004\u0018\u00010(H\u0016J\b\u0010=\u001a\u00020\u0003H\u0016J\u0010\u0010>\u001a\u00020\u00032\u0006\u0010?\u001a\u00020\u0017H\u0016J\b\u0010@\u001a\u00020\u0003H\u0016J\b\u0010A\u001a\u00020\u0003H\u0016J\b\u0010B\u001a\u00020\u0003H\u0002J\b\u0010C\u001a\u00020\u0003H\u0002R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\u00068BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\b\u0010\tR\u000e\u0010\n\u001a\u00020\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\u0004\u0018\u00010\u000f8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006E"}, d2 = {"Lorg/blayboy/newpipe/local/feed/FeedFragment;", "Lorg/blayboy/newpipe/fragments/list/BaseListFragment;", "Lorg/blayboy/newpipe/local/feed/FeedState;", "", "()V", "_feedBinding", "Lorg/blayboy/newpipe/databinding/FragmentFeedBinding;", "feedBinding", "getFeedBinding", "()Lorg/blayboy/newpipe/databinding/FragmentFeedBinding;", "groupId", "", "groupName", "", "listState", "Landroid/os/Parcelable;", "oldestSubscriptionUpdate", "Ljava/time/OffsetDateTime;", "viewModel", "Lorg/blayboy/newpipe/local/feed/FeedViewModel;", "doInitialLoadLogic", "handleError", "handleErrorState", "", "errorState", "Lorg/blayboy/newpipe/local/feed/FeedState$ErrorState;", "handleLoadedState", "loadedState", "Lorg/blayboy/newpipe/local/feed/FeedState$LoadedState;", "handleProgressState", "progressState", "Lorg/blayboy/newpipe/local/feed/FeedState$ProgressState;", "handleResult", "result", "hasMoreItems", "hideLoading", "initListeners", "loadMoreItems", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateOptionsMenu", "menu", "Landroid/view/Menu;", "inflater", "Landroid/view/MenuInflater;", "onCreateView", "Landroid/view/View;", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onDestroy", "onDestroyOptionsMenu", "onDestroyView", "onOptionsItemSelected", "item", "Landroid/view/MenuItem;", "onPause", "onResume", "onViewCreated", "rootView", "reloadContent", "setUserVisibleHint", "isVisibleToUser", "showEmptyState", "showLoading", "updateRefreshViewState", "updateRelativeTimeViews", "Companion", "app_debug"})
public final class FeedFragment extends org.blayboy.newpipe.fragments.list.BaseListFragment<org.blayboy.newpipe.local.feed.FeedState, kotlin.Unit> {
    private org.blayboy.newpipe.databinding.FragmentFeedBinding _feedBinding;
    private org.blayboy.newpipe.local.feed.FeedViewModel viewModel;
    @org.jetbrains.annotations.Nullable()
    @icepick.State()
    public android.os.Parcelable listState;
    private long groupId = -1L;
    private java.lang.String groupName = "";
    private java.time.OffsetDateTime oldestSubscriptionUpdate;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String KEY_GROUP_ID = "ARG_GROUP_ID";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String KEY_GROUP_NAME = "ARG_GROUP_NAME";
    public static final org.blayboy.newpipe.local.feed.FeedFragment.Companion Companion = null;
    private java.util.HashMap _$_findViewCache;
    
    private final org.blayboy.newpipe.databinding.FragmentFeedBinding getFeedBinding() {
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
    android.view.View rootView, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    public void onPause() {
    }
    
    @java.lang.Override()
    public void onResume() {
    }
    
    @java.lang.Override()
    public void setUserVisibleHint(boolean isVisibleToUser) {
    }
    
    @java.lang.Override()
    protected void initListeners() {
    }
    
    @java.lang.Override()
    public void onCreateOptionsMenu(@org.jetbrains.annotations.NotNull()
    android.view.Menu menu, @org.jetbrains.annotations.NotNull()
    android.view.MenuInflater inflater) {
    }
    
    @java.lang.Override()
    public boolean onOptionsItemSelected(@org.jetbrains.annotations.NotNull()
    android.view.MenuItem item) {
        return false;
    }
    
    @java.lang.Override()
    public void onDestroyOptionsMenu() {
    }
    
    @java.lang.Override()
    public void onDestroy() {
    }
    
    @java.lang.Override()
    public void onDestroyView() {
    }
    
    @java.lang.Override()
    public void showLoading() {
    }
    
    @java.lang.Override()
    public void hideLoading() {
    }
    
    @java.lang.Override()
    public void showEmptyState() {
    }
    
    @java.lang.Override()
    public void handleResult(@org.jetbrains.annotations.NotNull()
    org.blayboy.newpipe.local.feed.FeedState result) {
    }
    
    @java.lang.Override()
    public void handleError() {
    }
    
    private final void handleProgressState(org.blayboy.newpipe.local.feed.FeedState.ProgressState progressState) {
    }
    
    private final void handleLoadedState(org.blayboy.newpipe.local.feed.FeedState.LoadedState loadedState) {
    }
    
    private final boolean handleErrorState(org.blayboy.newpipe.local.feed.FeedState.ErrorState errorState) {
        return false;
    }
    
    private final void updateRelativeTimeViews() {
    }
    
    private final void updateRefreshViewState() {
    }
    
    @java.lang.Override()
    protected void doInitialLoadLogic() {
    }
    
    @java.lang.Override()
    protected void loadMoreItems() {
    }
    
    @java.lang.Override()
    protected boolean hasMoreItems() {
        return false;
    }
    
    @java.lang.Override()
    public void reloadContent() {
    }
    
    public FeedFragment() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final org.blayboy.newpipe.local.feed.FeedFragment newInstance(long groupId, @org.jetbrains.annotations.Nullable()
    java.lang.String groupName) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u001e\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0004H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000b"}, d2 = {"Lorg/blayboy/newpipe/local/feed/FeedFragment$Companion;", "", "()V", "KEY_GROUP_ID", "", "KEY_GROUP_NAME", "newInstance", "Lorg/blayboy/newpipe/local/feed/FeedFragment;", "groupId", "", "groupName", "app_debug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final org.blayboy.newpipe.local.feed.FeedFragment newInstance(long groupId, @org.jetbrains.annotations.Nullable()
        java.lang.String groupName) {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}