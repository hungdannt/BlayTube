package org.blayboy.newpipe.database.feed.model;

import java.lang.System;

@androidx.room.Entity(tableName = "feed_group_subscription_join", primaryKeys = {"group_id", "subscription_id"}, indices = {@androidx.room.Index(value = {"subscription_id"})}, foreignKeys = {@androidx.room.ForeignKey(entity = org.blayboy.newpipe.database.feed.model.FeedGroupEntity.class, childColumns = {"group_id"}, deferred = true, onUpdate = 5, onDelete = 5, parentColumns = {"uid"}), @androidx.room.ForeignKey(entity = org.blayboy.newpipe.database.subscription.SubscriptionEntity.class, childColumns = {"subscription_id"}, deferred = true, onUpdate = 5, onDelete = 5, parentColumns = {"uid"})})
@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0087\b\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0005J\t\u0010\f\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\r\u001a\u00020\u0003H\u00c6\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0012\u001a\u00020\u0013H\u00d6\u0001J\t\u0010\u0014\u001a\u00020\u0015H\u00d6\u0001R\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001e\u0010\u0004\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0007\"\u0004\b\u000b\u0010\t\u00a8\u0006\u0017"}, d2 = {"Lorg/blayboy/newpipe/database/feed/model/FeedGroupSubscriptionEntity;", "", "feedGroupId", "", "subscriptionId", "(JJ)V", "getFeedGroupId", "()J", "setFeedGroupId", "(J)V", "getSubscriptionId", "setSubscriptionId", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "Companion", "app_debug"})
public final class FeedGroupSubscriptionEntity {
    @androidx.room.ColumnInfo(name = "group_id")
    private long feedGroupId;
    @androidx.room.ColumnInfo(name = "subscription_id")
    private long subscriptionId;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String FEED_GROUP_SUBSCRIPTION_TABLE = "feed_group_subscription_join";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String GROUP_ID = "group_id";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String SUBSCRIPTION_ID = "subscription_id";
    public static final org.blayboy.newpipe.database.feed.model.FeedGroupSubscriptionEntity.Companion Companion = null;
    
    public final long getFeedGroupId() {
        return 0L;
    }
    
    public final void setFeedGroupId(long p0) {
    }
    
    public final long getSubscriptionId() {
        return 0L;
    }
    
    public final void setSubscriptionId(long p0) {
    }
    
    public FeedGroupSubscriptionEntity(long feedGroupId, long subscriptionId) {
        super();
    }
    
    public final long component1() {
        return 0L;
    }
    
    public final long component2() {
        return 0L;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.blayboy.newpipe.database.feed.model.FeedGroupSubscriptionEntity copy(long feedGroupId, long subscriptionId) {
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
    
    @kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0007"}, d2 = {"Lorg/blayboy/newpipe/database/feed/model/FeedGroupSubscriptionEntity$Companion;", "", "()V", "FEED_GROUP_SUBSCRIPTION_TABLE", "", "GROUP_ID", "SUBSCRIPTION_ID", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}