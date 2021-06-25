package org.blayboy.newpipe.local.subscription.dialog;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001 B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001bH\u0002J\b\u0010\u001c\u001a\u00020\u0019H\u0014J\u0014\u0010\u001d\u001a\u00020\u00192\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001f0\u0012R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u000e\u0010\f\u001a\u00020\rX\u0082\u000e\u00a2\u0006\u0002\n\u0000R \u0010\u000e\u001a\u0014 \u0010*\t\u0018\u00010\u0006\u00a2\u0006\u0002\b\u000f0\u0006\u00a2\u0006\u0002\b\u000fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001d\u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u00120\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000bR\u0014\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\t0\u0016X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0017\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u00120\u0016X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006!"}, d2 = {"Lorg/blayboy/newpipe/local/subscription/dialog/FeedGroupReorderDialogViewModel;", "Landroidx/lifecycle/AndroidViewModel;", "application", "Landroid/app/Application;", "(Landroid/app/Application;)V", "actionProcessingDisposable", "Lio/reactivex/rxjava3/disposables/Disposable;", "dialogEventLiveData", "Landroidx/lifecycle/LiveData;", "Lorg/blayboy/newpipe/local/subscription/dialog/FeedGroupReorderDialogViewModel$DialogEvent;", "getDialogEventLiveData", "()Landroidx/lifecycle/LiveData;", "feedDatabaseManager", "Lorg/blayboy/newpipe/local/feed/FeedDatabaseManager;", "groupsDisposable", "Lio/reactivex/rxjava3/annotations/NonNull;", "kotlin.jvm.PlatformType", "groupsLiveData", "", "Lorg/blayboy/newpipe/database/feed/model/FeedGroupEntity;", "getGroupsLiveData", "mutableDialogEventLiveData", "Landroidx/lifecycle/MutableLiveData;", "mutableGroupsLiveData", "doAction", "", "completable", "Lio/reactivex/rxjava3/core/Completable;", "onCleared", "updateOrder", "groupIdList", "", "DialogEvent", "app_debug"})
public final class FeedGroupReorderDialogViewModel extends androidx.lifecycle.AndroidViewModel {
    private org.blayboy.newpipe.local.feed.FeedDatabaseManager feedDatabaseManager;
    private final androidx.lifecycle.MutableLiveData<java.util.List<org.blayboy.newpipe.database.feed.model.FeedGroupEntity>> mutableGroupsLiveData = null;
    private final androidx.lifecycle.MutableLiveData<org.blayboy.newpipe.local.subscription.dialog.FeedGroupReorderDialogViewModel.DialogEvent> mutableDialogEventLiveData = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<java.util.List<org.blayboy.newpipe.database.feed.model.FeedGroupEntity>> groupsLiveData = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<org.blayboy.newpipe.local.subscription.dialog.FeedGroupReorderDialogViewModel.DialogEvent> dialogEventLiveData = null;
    private io.reactivex.rxjava3.disposables.Disposable actionProcessingDisposable;
    private io.reactivex.rxjava3.disposables.Disposable groupsDisposable;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<org.blayboy.newpipe.database.feed.model.FeedGroupEntity>> getGroupsLiveData() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<org.blayboy.newpipe.local.subscription.dialog.FeedGroupReorderDialogViewModel.DialogEvent> getDialogEventLiveData() {
        return null;
    }
    
    @java.lang.Override()
    protected void onCleared() {
    }
    
    public final void updateOrder(@org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.Long> groupIdList) {
    }
    
    private final void doAction(io.reactivex.rxjava3.core.Completable completable) {
    }
    
    public FeedGroupReorderDialogViewModel(@org.jetbrains.annotations.NotNull()
    android.app.Application application) {
        super(null);
    }
    
    @kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0003\u0004B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u0082\u0001\u0002\u0005\u0006\u00a8\u0006\u0007"}, d2 = {"Lorg/blayboy/newpipe/local/subscription/dialog/FeedGroupReorderDialogViewModel$DialogEvent;", "", "()V", "ProcessingEvent", "SuccessEvent", "Lorg/blayboy/newpipe/local/subscription/dialog/FeedGroupReorderDialogViewModel$DialogEvent$ProcessingEvent;", "Lorg/blayboy/newpipe/local/subscription/dialog/FeedGroupReorderDialogViewModel$DialogEvent$SuccessEvent;", "app_debug"})
    public static abstract class DialogEvent {
        
        private DialogEvent() {
            super();
        }
        
        @kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lorg/blayboy/newpipe/local/subscription/dialog/FeedGroupReorderDialogViewModel$DialogEvent$ProcessingEvent;", "Lorg/blayboy/newpipe/local/subscription/dialog/FeedGroupReorderDialogViewModel$DialogEvent;", "()V", "app_debug"})
        public static final class ProcessingEvent extends org.blayboy.newpipe.local.subscription.dialog.FeedGroupReorderDialogViewModel.DialogEvent {
            public static final org.blayboy.newpipe.local.subscription.dialog.FeedGroupReorderDialogViewModel.DialogEvent.ProcessingEvent INSTANCE = null;
            
            private ProcessingEvent() {
                super();
            }
        }
        
        @kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lorg/blayboy/newpipe/local/subscription/dialog/FeedGroupReorderDialogViewModel$DialogEvent$SuccessEvent;", "Lorg/blayboy/newpipe/local/subscription/dialog/FeedGroupReorderDialogViewModel$DialogEvent;", "()V", "app_debug"})
        public static final class SuccessEvent extends org.blayboy.newpipe.local.subscription.dialog.FeedGroupReorderDialogViewModel.DialogEvent {
            public static final org.blayboy.newpipe.local.subscription.dialog.FeedGroupReorderDialogViewModel.DialogEvent.SuccessEvent INSTANCE = null;
            
            private SuccessEvent() {
                super();
            }
        }
    }
}