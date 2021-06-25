package org.blayboy.newpipe.local.feed.service;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u00b2\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0007\u0018\u0000 J2\u00020\u0001:\u0003JKLB\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010/\u001a\u000200H\u0002J\b\u00101\u001a\u00020\u001fH\u0002J\b\u00102\u001a\u000200H\u0002J\u0010\u00103\u001a\u0002002\u0006\u00104\u001a\u000205H\u0002J\u0012\u00106\u001a\u0004\u0018\u0001072\u0006\u00108\u001a\u000209H\u0016J\b\u0010:\u001a\u000200H\u0016J\u0012\u0010;\u001a\u0002002\b\u0010<\u001a\u0004\u0018\u00010$H\u0002J\"\u0010=\u001a\u00020>2\b\u00108\u001a\u0004\u0018\u0001092\u0006\u0010?\u001a\u00020>2\u0006\u0010@\u001a\u00020>H\u0016J\b\u0010A\u001a\u000200H\u0002J\b\u0010B\u001a\u000200H\u0002J\"\u0010C\u001a\u0002002\b\b\u0002\u0010D\u001a\u00020\u000e2\u0006\u0010E\u001a\u00020F2\u0006\u0010G\u001a\u00020>H\u0002J\b\u0010H\u001a\u000200H\u0002J\u0012\u0010I\u001a\u0002002\b\u0010<\u001a\u0004\u0018\u00010$H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R8\u0010\t\u001a&\u0012\"\u0012 \u0012\u001c\u0012\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u000f0\r0\f0\u000b0\n8BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u000e\u00a2\u0006\u0002\n\u0000R2\u0010\u0015\u001a \u0012\u001c\u0012\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u000f0\r0\f0\n8BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0016\u0010\u0012R\u000e\u0010\u0017\u001a\u00020\u0018X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u001aX\u0082.\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u001b\u001a\u0004\u0018\u00010\u001cX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u001fX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020!X\u0082.\u00a2\u0006\u0002\n\u0000R<\u0010\"\u001a0\u0012\f\u0012\n %*\u0004\u0018\u00010$0$ %*\u0017\u0012\f\u0012\n %*\u0004\u0018\u00010$0$\u0018\u00010#\u00a2\u0006\u0002\b&0#\u00a2\u0006\u0002\b&X\u0082\u000e\u00a2\u0006\u0002\n\u0000R2\u0010\'\u001a \u0012\u001c\u0012\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u000f0\r0\f0\n8BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b(\u0010\u0012R8\u0010)\u001a&\u0012\"\u0012 \u0012\u001c\u0012\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u000f0\r0\f0\u000b0*8BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b+\u0010,R\u000e\u0010-\u001a\u00020.X\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006M"}, d2 = {"Lorg/blayboy/newpipe/local/feed/service/FeedLoadService;", "Landroid/app/Service;", "()V", "broadcastReceiver", "Landroid/content/BroadcastReceiver;", "cancelSignal", "Ljava/util/concurrent/atomic/AtomicBoolean;", "currentProgress", "Ljava/util/concurrent/atomic/AtomicInteger;", "databaseConsumer", "Lio/reactivex/rxjava3/functions/Consumer;", "", "Lio/reactivex/rxjava3/core/Notification;", "Lkotlin/Pair;", "", "Lorg/schabi/newpipe/extractor/ListInfo;", "Lorg/schabi/newpipe/extractor/stream/StreamInfoItem;", "getDatabaseConsumer", "()Lio/reactivex/rxjava3/functions/Consumer;", "disposables", "Lio/reactivex/rxjava3/disposables/CompositeDisposable;", "errorHandlingConsumer", "getErrorHandlingConsumer", "feedDatabaseManager", "Lorg/blayboy/newpipe/local/feed/FeedDatabaseManager;", "feedResultsHolder", "Lorg/blayboy/newpipe/local/feed/service/FeedLoadService$ResultsHolder;", "loadingSubscription", "Lorg/reactivestreams/Subscription;", "maxProgress", "notificationBuilder", "Landroidx/core/app/NotificationCompat$Builder;", "notificationManager", "Landroidx/core/app/NotificationManagerCompat;", "notificationUpdater", "Lio/reactivex/rxjava3/processors/PublishProcessor;", "", "kotlin.jvm.PlatformType", "Lio/reactivex/rxjava3/annotations/NonNull;", "notificationsConsumer", "getNotificationsConsumer", "resultSubscriber", "Lorg/reactivestreams/Subscriber;", "getResultSubscriber", "()Lorg/reactivestreams/Subscriber;", "subscriptionManager", "Lorg/blayboy/newpipe/local/subscription/SubscriptionManager;", "broadcastProgress", "", "createNotification", "disposeAll", "handleError", "error", "", "onBind", "Landroid/os/IBinder;", "intent", "Landroid/content/Intent;", "onCreate", "onItemCompleted", "updateDescription", "onStartCommand", "", "flags", "startId", "setupBroadcastReceiver", "setupNotification", "startLoading", "groupId", "useFeedExtractor", "", "thresholdOutdatedSeconds", "stopService", "updateNotificationProgress", "Companion", "RequestException", "ResultsHolder", "app_debug"})
public final class FeedLoadService extends android.app.Service {
    private org.reactivestreams.Subscription loadingSubscription;
    private org.blayboy.newpipe.local.subscription.SubscriptionManager subscriptionManager;
    private org.blayboy.newpipe.local.feed.FeedDatabaseManager feedDatabaseManager;
    private org.blayboy.newpipe.local.feed.service.FeedLoadService.ResultsHolder feedResultsHolder;
    private io.reactivex.rxjava3.disposables.CompositeDisposable disposables;
    private io.reactivex.rxjava3.processors.PublishProcessor<java.lang.String> notificationUpdater;
    private androidx.core.app.NotificationManagerCompat notificationManager;
    private androidx.core.app.NotificationCompat.Builder notificationBuilder;
    private java.util.concurrent.atomic.AtomicInteger currentProgress;
    private java.util.concurrent.atomic.AtomicInteger maxProgress;
    private android.content.BroadcastReceiver broadcastReceiver;
    private final java.util.concurrent.atomic.AtomicBoolean cancelSignal = null;
    private static final java.lang.String TAG = null;
    private static final int NOTIFICATION_ID = 7293450;
    private static final java.lang.String ACTION_CANCEL = "org.blayboy.newpipe.local.feed.service.FeedLoadService.CANCEL";
    
    /**
     * How often the notification will be updated.
     */
    private static final int NOTIFICATION_SAMPLING_PERIOD = 1500;
    
    /**
     * How many extractions will be running in parallel.
     */
    private static final int PARALLEL_EXTRACTIONS = 6;
    
    /**
     * Number of items to buffer to mass-insert in the database.
     */
    private static final int BUFFER_COUNT_BEFORE_INSERT = 20;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String EXTRA_GROUP_ID = "FeedLoadService.EXTRA_GROUP_ID";
    public static final org.blayboy.newpipe.local.feed.service.FeedLoadService.Companion Companion = null;
    
    @java.lang.Override()
    public void onCreate() {
    }
    
    @java.lang.Override()
    public int onStartCommand(@org.jetbrains.annotations.Nullable()
    android.content.Intent intent, int flags, int startId) {
        return 0;
    }
    
    private final void disposeAll() {
    }
    
    private final void stopService() {
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public android.os.IBinder onBind(@org.jetbrains.annotations.NotNull()
    android.content.Intent intent) {
        return null;
    }
    
    private final void startLoading(long groupId, boolean useFeedExtractor, int thresholdOutdatedSeconds) {
    }
    
    private final void broadcastProgress() {
    }
    
    private final org.reactivestreams.Subscriber<java.util.List<io.reactivex.rxjava3.core.Notification<kotlin.Pair<java.lang.Long, org.schabi.newpipe.extractor.ListInfo<org.schabi.newpipe.extractor.stream.StreamInfoItem>>>>> getResultSubscriber() {
        return null;
    }
    
    private final io.reactivex.rxjava3.functions.Consumer<java.util.List<io.reactivex.rxjava3.core.Notification<kotlin.Pair<java.lang.Long, org.schabi.newpipe.extractor.ListInfo<org.schabi.newpipe.extractor.stream.StreamInfoItem>>>>> getDatabaseConsumer() {
        return null;
    }
    
    private final io.reactivex.rxjava3.functions.Consumer<io.reactivex.rxjava3.core.Notification<kotlin.Pair<java.lang.Long, org.schabi.newpipe.extractor.ListInfo<org.schabi.newpipe.extractor.stream.StreamInfoItem>>>> getErrorHandlingConsumer() {
        return null;
    }
    
    private final io.reactivex.rxjava3.functions.Consumer<io.reactivex.rxjava3.core.Notification<kotlin.Pair<java.lang.Long, org.schabi.newpipe.extractor.ListInfo<org.schabi.newpipe.extractor.stream.StreamInfoItem>>>> getNotificationsConsumer() {
        return null;
    }
    
    private final void onItemCompleted(java.lang.String updateDescription) {
    }
    
    private final androidx.core.app.NotificationCompat.Builder createNotification() {
        return null;
    }
    
    private final void setupNotification() {
    }
    
    private final void updateNotificationProgress(java.lang.String updateDescription) {
    }
    
    private final void setupBroadcastReceiver() {
    }
    
    private final void handleError(java.lang.Throwable error) {
    }
    
    public FeedLoadService() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0005\b\u0002\u0018\u0000 \f2\u00060\u0001j\u0002`\u0002:\u0001\fB\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u00a2\u0006\u0002\u0010\tR\u0011\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b\u00a8\u0006\r"}, d2 = {"Lorg/blayboy/newpipe/local/feed/service/FeedLoadService$RequestException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "subscriptionId", "", "message", "", "cause", "", "(JLjava/lang/String;Ljava/lang/Throwable;)V", "getSubscriptionId", "()J", "Companion", "app_debug"})
    static final class RequestException extends java.lang.Exception {
        private final long subscriptionId = 0L;
        public static final org.blayboy.newpipe.local.feed.service.FeedLoadService.RequestException.Companion Companion = null;
        
        public final long getSubscriptionId() {
            return 0L;
        }
        
        public RequestException(long subscriptionId, @org.jetbrains.annotations.NotNull()
        java.lang.String message, @org.jetbrains.annotations.NotNull()
        java.lang.Throwable cause) {
            super();
        }
        
        @kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\"\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0006\u001a\u00020\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t\u00a8\u0006\u000b"}, d2 = {"Lorg/blayboy/newpipe/local/feed/service/FeedLoadService$RequestException$Companion;", "", "()V", "wrapList", "", "", "subscriptionId", "", "info", "Lorg/schabi/newpipe/extractor/ListInfo;", "Lorg/schabi/newpipe/extractor/stream/StreamInfoItem;", "app_debug"})
        public static final class Companion {
            
            @org.jetbrains.annotations.NotNull()
            public final java.util.List<java.lang.Throwable> wrapList(long subscriptionId, @org.jetbrains.annotations.NotNull()
            org.schabi.newpipe.extractor.ListInfo<org.schabi.newpipe.extractor.stream.StreamInfoItem> info) {
                return null;
            }
            
            private Companion() {
                super();
            }
        }
    }
    
    @kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u0003\n\u0002\b\u0005\n\u0002\u0010!\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u0005J\u0014\u0010\u000f\u001a\u00020\r2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004J\u0006\u0010\u0011\u001a\u00020\rR \u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0080.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0012"}, d2 = {"Lorg/blayboy/newpipe/local/feed/service/FeedLoadService$ResultsHolder;", "", "()V", "itemsErrors", "", "", "getItemsErrors$app_debug", "()Ljava/util/List;", "setItemsErrors$app_debug", "(Ljava/util/List;)V", "itemsErrorsHolder", "", "addError", "", "error", "addErrors", "errors", "ready", "app_debug"})
    public static final class ResultsHolder {
        
        /**
         * List of errors that may have happen during loading.
         */
        @org.jetbrains.annotations.NotNull()
        public java.util.List<? extends java.lang.Throwable> itemsErrors;
        private final java.util.List<java.lang.Throwable> itemsErrorsHolder = null;
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.List<java.lang.Throwable> getItemsErrors$app_debug() {
            return null;
        }
        
        public final void setItemsErrors$app_debug(@org.jetbrains.annotations.NotNull()
        java.util.List<? extends java.lang.Throwable> p0) {
        }
        
        public final void addError(@org.jetbrains.annotations.NotNull()
        java.lang.Throwable error) {
        }
        
        public final void addErrors(@org.jetbrains.annotations.NotNull()
        java.util.List<? extends java.lang.Throwable> errors) {
        }
        
        public final void ready() {
        }
        
        public ResultsHolder() {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0006X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0006X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0006X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\f"}, d2 = {"Lorg/blayboy/newpipe/local/feed/service/FeedLoadService$Companion;", "", "()V", "ACTION_CANCEL", "", "BUFFER_COUNT_BEFORE_INSERT", "", "EXTRA_GROUP_ID", "NOTIFICATION_ID", "NOTIFICATION_SAMPLING_PERIOD", "PARALLEL_EXTRACTIONS", "TAG", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}