package org.blayboy.newpipe.local.feed;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0002\u0018\u0019B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\b\u0010\u0016\u001a\u00020\u0017H\u0014R \u0010\u0007\u001a\u0014 \n*\t\u0018\u00010\b\u00a2\u0006\u0002\b\t0\b\u00a2\u0006\u0002\b\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u0013\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015\u00a8\u0006\u001a"}, d2 = {"Lorg/blayboy/newpipe/local/feed/FeedViewModel;", "Landroidx/lifecycle/ViewModel;", "applicationContext", "Landroid/content/Context;", "groupId", "", "(Landroid/content/Context;J)V", "combineDisposable", "Lio/reactivex/rxjava3/disposables/Disposable;", "Lio/reactivex/rxjava3/annotations/NonNull;", "kotlin.jvm.PlatformType", "feedDatabaseManager", "Lorg/blayboy/newpipe/local/feed/FeedDatabaseManager;", "getGroupId", "()J", "mutableStateLiveData", "Landroidx/lifecycle/MutableLiveData;", "Lorg/blayboy/newpipe/local/feed/FeedState;", "stateLiveData", "Landroidx/lifecycle/LiveData;", "getStateLiveData", "()Landroidx/lifecycle/LiveData;", "onCleared", "", "CombineResultHolder", "Factory", "app_debug"})
public final class FeedViewModel extends androidx.lifecycle.ViewModel {
    private org.blayboy.newpipe.local.feed.FeedDatabaseManager feedDatabaseManager;
    private final androidx.lifecycle.MutableLiveData<org.blayboy.newpipe.local.feed.FeedState> mutableStateLiveData = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<org.blayboy.newpipe.local.feed.FeedState> stateLiveData = null;
    private io.reactivex.rxjava3.disposables.Disposable combineDisposable;
    private final long groupId = 0L;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<org.blayboy.newpipe.local.feed.FeedState> getStateLiveData() {
        return null;
    }
    
    @java.lang.Override()
    protected void onCleared() {
    }
    
    public final long getGroupId() {
        return 0L;
    }
    
    public FeedViewModel(@org.jetbrains.annotations.NotNull()
    android.content.Context applicationContext, long groupId) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\'\u0010\u000b\u001a\u0002H\f\"\n\b\u0000\u0010\f*\u0004\u0018\u00010\r2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u0002H\f0\u000fH\u0016\u00a2\u0006\u0002\u0010\u0010R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n\u00a8\u0006\u0011"}, d2 = {"Lorg/blayboy/newpipe/local/feed/FeedViewModel$Factory;", "Landroidx/lifecycle/ViewModelProvider$Factory;", "context", "Landroid/content/Context;", "groupId", "", "(Landroid/content/Context;J)V", "getContext", "()Landroid/content/Context;", "getGroupId", "()J", "create", "T", "Landroidx/lifecycle/ViewModel;", "modelClass", "Ljava/lang/Class;", "(Ljava/lang/Class;)Landroidx/lifecycle/ViewModel;", "app_debug"})
    public static final class Factory implements androidx.lifecycle.ViewModelProvider.Factory {
        @org.jetbrains.annotations.NotNull()
        private final android.content.Context context = null;
        private final long groupId = 0L;
        
        @kotlin.Suppress(names = {"UNCHECKED_CAST"})
        @java.lang.Override()
        public <T extends androidx.lifecycle.ViewModel>T create(@org.jetbrains.annotations.NotNull()
        java.lang.Class<T> modelClass) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.content.Context getContext() {
            return null;
        }
        
        public final long getGroupId() {
            return 0L;
        }
        
        public Factory(@org.jetbrains.annotations.NotNull()
        android.content.Context context, long groupId) {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0082\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u00a2\u0006\u0002\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0003H\u00c6\u0003J\u000f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u00c6\u0003J\t\u0010\u0016\u001a\u00020\bH\u00c6\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\nH\u00c6\u0003J9\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\nH\u00c6\u0001J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u001c\u001a\u00020\u001dH\u00d6\u0001J\t\u0010\u001e\u001a\u00020\u001fH\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0007\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\t\u001a\u0004\u0018\u00010\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013\u00a8\u0006 "}, d2 = {"Lorg/blayboy/newpipe/local/feed/FeedViewModel$CombineResultHolder;", "", "t1", "Lorg/blayboy/newpipe/local/feed/service/FeedEventManager$Event;", "t2", "", "Lorg/schabi/newpipe/extractor/stream/StreamInfoItem;", "t3", "", "t4", "Ljava/time/OffsetDateTime;", "(Lorg/blayboy/newpipe/local/feed/service/FeedEventManager$Event;Ljava/util/List;JLjava/time/OffsetDateTime;)V", "getT1", "()Lorg/blayboy/newpipe/local/feed/service/FeedEventManager$Event;", "getT2", "()Ljava/util/List;", "getT3", "()J", "getT4", "()Ljava/time/OffsetDateTime;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "", "app_debug"})
    static final class CombineResultHolder {
        @org.jetbrains.annotations.NotNull()
        private final org.blayboy.newpipe.local.feed.service.FeedEventManager.Event t1 = null;
        @org.jetbrains.annotations.NotNull()
        private final java.util.List<org.schabi.newpipe.extractor.stream.StreamInfoItem> t2 = null;
        private final long t3 = 0L;
        @org.jetbrains.annotations.Nullable()
        private final java.time.OffsetDateTime t4 = null;
        
        @org.jetbrains.annotations.NotNull()
        public final org.blayboy.newpipe.local.feed.service.FeedEventManager.Event getT1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.List<org.schabi.newpipe.extractor.stream.StreamInfoItem> getT2() {
            return null;
        }
        
        public final long getT3() {
            return 0L;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.time.OffsetDateTime getT4() {
            return null;
        }
        
        public CombineResultHolder(@org.jetbrains.annotations.NotNull()
        org.blayboy.newpipe.local.feed.service.FeedEventManager.Event t1, @org.jetbrains.annotations.NotNull()
        java.util.List<? extends org.schabi.newpipe.extractor.stream.StreamInfoItem> t2, long t3, @org.jetbrains.annotations.Nullable()
        java.time.OffsetDateTime t4) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final org.blayboy.newpipe.local.feed.service.FeedEventManager.Event component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.List<org.schabi.newpipe.extractor.stream.StreamInfoItem> component2() {
            return null;
        }
        
        public final long component3() {
            return 0L;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.time.OffsetDateTime component4() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final org.blayboy.newpipe.local.feed.FeedViewModel.CombineResultHolder copy(@org.jetbrains.annotations.NotNull()
        org.blayboy.newpipe.local.feed.service.FeedEventManager.Event t1, @org.jetbrains.annotations.NotNull()
        java.util.List<? extends org.schabi.newpipe.extractor.stream.StreamInfoItem> t2, long t3, @org.jetbrains.annotations.Nullable()
        java.time.OffsetDateTime t4) {
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
}