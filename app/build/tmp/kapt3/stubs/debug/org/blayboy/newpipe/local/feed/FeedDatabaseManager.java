package org.blayboy.newpipe.local.feed;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\u0018\u0000 52\u00020\u0001:\u00015B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u001c\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u00100\u000f2\b\b\u0002\u0010\u0012\u001a\u00020\u0013J\u0006\u0010\u0014\u001a\u00020\u0015J\u001c\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00130\u00172\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001bJ\u0006\u0010\u0005\u001a\u00020\u0006J\u000e\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u0012\u001a\u00020\u0013J\u0014\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001f0\u00172\u0006\u0010\u0012\u001a\u00020\u0013J\u0012\u0010 \u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001f0\u00100\u000fJ\u000e\u0010!\u001a\u00020\u00152\u0006\u0010\"\u001a\u00020\u0013J\u0016\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00130\u000f2\b\b\u0002\u0010\u0012\u001a\u00020\u0013J\u001a\u0010$\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020%0\u00100\u000f2\u0006\u0010\u0012\u001a\u00020\u0013J\u001a\u0010&\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\'0\u00100\u000f2\u0006\u0010(\u001a\u00020%J$\u0010)\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\'0\u00100\u000f2\b\b\u0002\u0010\u0012\u001a\u00020\u00132\u0006\u0010(\u001a\u00020%J\u0010\u0010*\u001a\u00020\u00152\b\b\u0002\u0010+\u001a\u00020%J\u001a\u0010,\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u00100\u000f2\u0006\u0010\u0012\u001a\u00020\u0013J\u000e\u0010-\u001a\u00020\u001d2\u0006\u0010.\u001a\u00020\u001fJ\u0014\u0010/\u001a\u00020\u001d2\f\u00100\u001a\b\u0012\u0004\u0012\u00020\u00130\u0010J\u001c\u00101\u001a\u00020\u001d2\u0006\u0010\u0012\u001a\u00020\u00132\f\u00102\u001a\b\u0012\u0004\u0012\u00020\u00130\u0010J&\u00103\u001a\u00020\u00152\u0006\u0010\"\u001a\u00020\u00132\f\u00104\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\b\b\u0002\u0010+\u001a\u00020%R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0007\u001a\n \t*\u0004\u0018\u00010\b0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\n\u001a\n \t*\u0004\u0018\u00010\u000b0\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\f\u001a\n \t*\u0004\u0018\u00010\r0\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u00066"}, d2 = {"Lorg/blayboy/newpipe/local/feed/FeedDatabaseManager;", "", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "database", "Lorg/blayboy/newpipe/database/AppDatabase;", "feedGroupTable", "Lorg/blayboy/newpipe/database/feed/dao/FeedGroupDAO;", "kotlin.jvm.PlatformType", "feedTable", "Lorg/blayboy/newpipe/database/feed/dao/FeedDAO;", "streamTable", "Lorg/blayboy/newpipe/database/stream/dao/StreamDAO;", "asStreamItems", "Lio/reactivex/rxjava3/core/Flowable;", "", "Lorg/schabi/newpipe/extractor/stream/StreamInfoItem;", "groupId", "", "clear", "", "createGroup", "Lio/reactivex/rxjava3/core/Maybe;", "name", "", "icon", "Lorg/blayboy/newpipe/local/subscription/FeedGroupIcon;", "deleteGroup", "Lio/reactivex/rxjava3/core/Completable;", "getGroup", "Lorg/blayboy/newpipe/database/feed/model/FeedGroupEntity;", "groups", "markAsOutdated", "subscriptionId", "notLoadedCount", "oldestSubscriptionUpdate", "Ljava/time/OffsetDateTime;", "outdatedSubscriptions", "Lorg/blayboy/newpipe/database/subscription/SubscriptionEntity;", "outdatedThreshold", "outdatedSubscriptionsForGroup", "removeOrphansOrOlderStreams", "oldestAllowedDate", "subscriptionIdsForGroup", "updateGroup", "feedGroupEntity", "updateGroupsOrder", "groupIdList", "updateSubscriptionsForGroup", "subscriptionIds", "upsertAll", "items", "Companion", "app_debug"})
public final class FeedDatabaseManager {
    private final org.blayboy.newpipe.database.AppDatabase database = null;
    private final org.blayboy.newpipe.database.feed.dao.FeedDAO feedTable = null;
    private final org.blayboy.newpipe.database.feed.dao.FeedGroupDAO feedGroupTable = null;
    private final org.blayboy.newpipe.database.stream.dao.StreamDAO streamTable = null;
    
    /**
     * Only items that are newer than this will be saved.
     */
    @org.jetbrains.annotations.NotNull()
    private static final java.time.OffsetDateTime FEED_OLDEST_ALLOWED_DATE = null;
    public static final org.blayboy.newpipe.local.feed.FeedDatabaseManager.Companion Companion = null;
    
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.rxjava3.core.Flowable<java.util.List<org.blayboy.newpipe.database.feed.model.FeedGroupEntity>> groups() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.blayboy.newpipe.database.AppDatabase database() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.rxjava3.core.Flowable<java.util.List<org.schabi.newpipe.extractor.stream.StreamInfoItem>> asStreamItems(long groupId) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.rxjava3.core.Flowable<java.util.List<org.blayboy.newpipe.database.subscription.SubscriptionEntity>> outdatedSubscriptions(@org.jetbrains.annotations.NotNull()
    java.time.OffsetDateTime outdatedThreshold) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.rxjava3.core.Flowable<java.lang.Long> notLoadedCount(long groupId) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.rxjava3.core.Flowable<java.util.List<org.blayboy.newpipe.database.subscription.SubscriptionEntity>> outdatedSubscriptionsForGroup(long groupId, @org.jetbrains.annotations.NotNull()
    java.time.OffsetDateTime outdatedThreshold) {
        return null;
    }
    
    public final void markAsOutdated(long subscriptionId) {
    }
    
    public final void upsertAll(long subscriptionId, @org.jetbrains.annotations.NotNull()
    java.util.List<? extends org.schabi.newpipe.extractor.stream.StreamInfoItem> items, @org.jetbrains.annotations.NotNull()
    java.time.OffsetDateTime oldestAllowedDate) {
    }
    
    public final void removeOrphansOrOlderStreams(@org.jetbrains.annotations.NotNull()
    java.time.OffsetDateTime oldestAllowedDate) {
    }
    
    public final void clear() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.rxjava3.core.Flowable<java.util.List<java.lang.Long>> subscriptionIdsForGroup(long groupId) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.rxjava3.core.Completable updateSubscriptionsForGroup(long groupId, @org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.Long> subscriptionIds) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.rxjava3.core.Maybe<java.lang.Long> createGroup(@org.jetbrains.annotations.NotNull()
    java.lang.String name, @org.jetbrains.annotations.NotNull()
    org.blayboy.newpipe.local.subscription.FeedGroupIcon icon) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.rxjava3.core.Maybe<org.blayboy.newpipe.database.feed.model.FeedGroupEntity> getGroup(long groupId) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.rxjava3.core.Completable updateGroup(@org.jetbrains.annotations.NotNull()
    org.blayboy.newpipe.database.feed.model.FeedGroupEntity feedGroupEntity) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.rxjava3.core.Completable deleteGroup(long groupId) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.rxjava3.core.Completable updateGroupsOrder(@org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.Long> groupIdList) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.rxjava3.core.Flowable<java.util.List<java.time.OffsetDateTime>> oldestSubscriptionUpdate(long groupId) {
        return null;
    }
    
    public FeedDatabaseManager(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0007"}, d2 = {"Lorg/blayboy/newpipe/local/feed/FeedDatabaseManager$Companion;", "", "()V", "FEED_OLDEST_ALLOWED_DATE", "Ljava/time/OffsetDateTime;", "getFEED_OLDEST_ALLOWED_DATE", "()Ljava/time/OffsetDateTime;", "app_debug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final java.time.OffsetDateTime getFEED_OLDEST_ALLOWED_DATE() {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}