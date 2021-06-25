package org.blayboy.newpipe.database.stream.model;

import java.lang.System;

@androidx.room.Entity(tableName = "streams", indices = {@androidx.room.Index(unique = true, value = {"service_id", "url"})})
@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b8\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0087\b\u0018\u0000 X2\u00020\u0001:\u0001XB\u000f\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004B\u000f\b\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0007B\u000f\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\b\u00a2\u0006\u0002\u0010\tB{\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0011\u001a\u00020\u0012\u0012\u0006\u0010\u0013\u001a\u00020\u000b\u0012\u0006\u0010\u0014\u001a\u00020\u000f\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0019\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u001b\u00a2\u0006\u0002\u0010\u001cJ\t\u0010D\u001a\u00020\u000bH\u00c6\u0003J\u000b\u0010E\u001a\u0004\u0018\u00010\u000fH\u00c6\u0003J\u000b\u0010F\u001a\u0004\u0018\u00010\u0019H\u00c6\u0003J\u0010\u0010G\u001a\u0004\u0018\u00010\u001bH\u00c6\u0003\u00a2\u0006\u0002\u0010!J\t\u0010H\u001a\u00020\rH\u00c6\u0003J\t\u0010I\u001a\u00020\u000fH\u00c6\u0003J\t\u0010J\u001a\u00020\u000fH\u00c6\u0003J\t\u0010K\u001a\u00020\u0012H\u00c6\u0003J\t\u0010L\u001a\u00020\u000bH\u00c6\u0003J\t\u0010M\u001a\u00020\u000fH\u00c6\u0003J\u000b\u0010N\u001a\u0004\u0018\u00010\u000fH\u00c6\u0003J\u0010\u0010O\u001a\u0004\u0018\u00010\u000bH\u00c6\u0003\u00a2\u0006\u0002\u0010@J\u0090\u0001\u0010P\u001a\u00020\u00002\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u0011\u001a\u00020\u00122\b\b\u0002\u0010\u0013\u001a\u00020\u000b2\b\b\u0002\u0010\u0014\u001a\u00020\u000f2\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00192\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u00c6\u0001\u00a2\u0006\u0002\u0010QJ\u0013\u0010R\u001a\u00020\u001b2\b\u0010S\u001a\u0004\u0018\u00010TH\u00d6\u0003J\t\u0010U\u001a\u00020\rH\u00d6\u0001J\u0006\u0010V\u001a\u00020\u0003J\t\u0010W\u001a\u00020\u000fH\u00d6\u0001R\u001e\u0010\u0013\u001a\u00020\u000b8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\"\u0010\u001a\u001a\u0004\u0018\u00010\u001b8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010$\u001a\u0004\b\u001a\u0010!\"\u0004\b\"\u0010#R\u001e\u0010\f\u001a\u00020\r8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b%\u0010&\"\u0004\b\'\u0010(R\u001e\u0010\u0011\u001a\u00020\u00128\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R \u0010\u0017\u001a\u0004\u0018\u00010\u000f8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R \u0010\u0015\u001a\u0004\u0018\u00010\u000f8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b1\u0010.\"\u0004\b2\u00100R\u001e\u0010\u0010\u001a\u00020\u000f8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b3\u0010.\"\u0004\b4\u00100R\u001e\u0010\n\u001a\u00020\u000b8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b5\u0010\u001e\"\u0004\b6\u0010 R \u0010\u0018\u001a\u0004\u0018\u00010\u00198\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b7\u00108\"\u0004\b9\u0010:R\u001e\u0010\u0014\u001a\u00020\u000f8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b;\u0010.\"\u0004\b<\u00100R\u001e\u0010\u000e\u001a\u00020\u000f8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b=\u0010.\"\u0004\b>\u00100R\"\u0010\u0016\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010C\u001a\u0004\b?\u0010@\"\u0004\bA\u0010B\u00a8\u0006Y"}, d2 = {"Lorg/blayboy/newpipe/database/stream/model/StreamEntity;", "Ljava/io/Serializable;", "item", "Lorg/schabi/newpipe/extractor/stream/StreamInfoItem;", "(Lorg/schabi/newpipe/extractor/stream/StreamInfoItem;)V", "info", "Lorg/schabi/newpipe/extractor/stream/StreamInfo;", "(Lorg/schabi/newpipe/extractor/stream/StreamInfo;)V", "Lorg/blayboy/newpipe/player/playqueue/PlayQueueItem;", "(Lorg/blayboy/newpipe/player/playqueue/PlayQueueItem;)V", "uid", "", "serviceId", "", "url", "", "title", "streamType", "Lorg/schabi/newpipe/extractor/stream/StreamType;", "duration", "uploader", "thumbnailUrl", "viewCount", "textualUploadDate", "uploadDate", "Ljava/time/OffsetDateTime;", "isUploadDateApproximation", "", "(JILjava/lang/String;Ljava/lang/String;Lorg/schabi/newpipe/extractor/stream/StreamType;JLjava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/time/OffsetDateTime;Ljava/lang/Boolean;)V", "getDuration", "()J", "setDuration", "(J)V", "()Ljava/lang/Boolean;", "setUploadDateApproximation", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "getServiceId", "()I", "setServiceId", "(I)V", "getStreamType", "()Lorg/schabi/newpipe/extractor/stream/StreamType;", "setStreamType", "(Lorg/schabi/newpipe/extractor/stream/StreamType;)V", "getTextualUploadDate", "()Ljava/lang/String;", "setTextualUploadDate", "(Ljava/lang/String;)V", "getThumbnailUrl", "setThumbnailUrl", "getTitle", "setTitle", "getUid", "setUid", "getUploadDate", "()Ljava/time/OffsetDateTime;", "setUploadDate", "(Ljava/time/OffsetDateTime;)V", "getUploader", "setUploader", "getUrl", "setUrl", "getViewCount", "()Ljava/lang/Long;", "setViewCount", "(Ljava/lang/Long;)V", "Ljava/lang/Long;", "component1", "component10", "component11", "component12", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(JILjava/lang/String;Ljava/lang/String;Lorg/schabi/newpipe/extractor/stream/StreamType;JLjava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/time/OffsetDateTime;Ljava/lang/Boolean;)Lorg/blayboy/newpipe/database/stream/model/StreamEntity;", "equals", "other", "", "hashCode", "toStreamInfoItem", "toString", "Companion", "app_debug"})
public final class StreamEntity implements java.io.Serializable {
    @androidx.room.ColumnInfo(name = "uid")
    @androidx.room.PrimaryKey(autoGenerate = true)
    private long uid;
    @androidx.room.ColumnInfo(name = "service_id")
    private int serviceId;
    @org.jetbrains.annotations.NotNull()
    @androidx.room.ColumnInfo(name = "url")
    private java.lang.String url;
    @org.jetbrains.annotations.NotNull()
    @androidx.room.ColumnInfo(name = "title")
    private java.lang.String title;
    @org.jetbrains.annotations.NotNull()
    @androidx.room.ColumnInfo(name = "stream_type")
    private org.schabi.newpipe.extractor.stream.StreamType streamType;
    @androidx.room.ColumnInfo(name = "duration")
    private long duration;
    @org.jetbrains.annotations.NotNull()
    @androidx.room.ColumnInfo(name = "uploader")
    private java.lang.String uploader;
    @org.jetbrains.annotations.Nullable()
    @androidx.room.ColumnInfo(name = "thumbnail_url")
    private java.lang.String thumbnailUrl;
    @org.jetbrains.annotations.Nullable()
    @androidx.room.ColumnInfo(name = "view_count")
    private java.lang.Long viewCount;
    @org.jetbrains.annotations.Nullable()
    @androidx.room.ColumnInfo(name = "textual_upload_date")
    private java.lang.String textualUploadDate;
    @org.jetbrains.annotations.Nullable()
    @androidx.room.ColumnInfo(name = "upload_date")
    private java.time.OffsetDateTime uploadDate;
    @org.jetbrains.annotations.Nullable()
    @androidx.room.ColumnInfo(name = "is_upload_date_approximation")
    private java.lang.Boolean isUploadDateApproximation;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String STREAM_TABLE = "streams";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String STREAM_ID = "uid";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String STREAM_SERVICE_ID = "service_id";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String STREAM_URL = "url";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String STREAM_TITLE = "title";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String STREAM_TYPE = "stream_type";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String STREAM_DURATION = "duration";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String STREAM_UPLOADER = "uploader";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String STREAM_THUMBNAIL_URL = "thumbnail_url";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String STREAM_VIEWS = "view_count";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String STREAM_TEXTUAL_UPLOAD_DATE = "textual_upload_date";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String STREAM_UPLOAD_DATE = "upload_date";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String STREAM_IS_UPLOAD_DATE_APPROXIMATION = "is_upload_date_approximation";
    public static final org.blayboy.newpipe.database.stream.model.StreamEntity.Companion Companion = null;
    
    @org.jetbrains.annotations.NotNull()
    public final org.schabi.newpipe.extractor.stream.StreamInfoItem toStreamInfoItem() {
        return null;
    }
    
    public final long getUid() {
        return 0L;
    }
    
    public final void setUid(long p0) {
    }
    
    public final int getServiceId() {
        return 0;
    }
    
    public final void setServiceId(int p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getUrl() {
        return null;
    }
    
    public final void setUrl(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getTitle() {
        return null;
    }
    
    public final void setTitle(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.schabi.newpipe.extractor.stream.StreamType getStreamType() {
        return null;
    }
    
    public final void setStreamType(@org.jetbrains.annotations.NotNull()
    org.schabi.newpipe.extractor.stream.StreamType p0) {
    }
    
    public final long getDuration() {
        return 0L;
    }
    
    public final void setDuration(long p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getUploader() {
        return null;
    }
    
    public final void setUploader(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getThumbnailUrl() {
        return null;
    }
    
    public final void setThumbnailUrl(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Long getViewCount() {
        return null;
    }
    
    public final void setViewCount(@org.jetbrains.annotations.Nullable()
    java.lang.Long p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getTextualUploadDate() {
        return null;
    }
    
    public final void setTextualUploadDate(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.time.OffsetDateTime getUploadDate() {
        return null;
    }
    
    public final void setUploadDate(@org.jetbrains.annotations.Nullable()
    java.time.OffsetDateTime p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Boolean isUploadDateApproximation() {
        return null;
    }
    
    public final void setUploadDateApproximation(@org.jetbrains.annotations.Nullable()
    java.lang.Boolean p0) {
    }
    
    public StreamEntity(long uid, int serviceId, @org.jetbrains.annotations.NotNull()
    java.lang.String url, @org.jetbrains.annotations.NotNull()
    java.lang.String title, @org.jetbrains.annotations.NotNull()
    org.schabi.newpipe.extractor.stream.StreamType streamType, long duration, @org.jetbrains.annotations.NotNull()
    java.lang.String uploader, @org.jetbrains.annotations.Nullable()
    java.lang.String thumbnailUrl, @org.jetbrains.annotations.Nullable()
    java.lang.Long viewCount, @org.jetbrains.annotations.Nullable()
    java.lang.String textualUploadDate, @org.jetbrains.annotations.Nullable()
    java.time.OffsetDateTime uploadDate, @org.jetbrains.annotations.Nullable()
    java.lang.Boolean isUploadDateApproximation) {
        super();
    }
    
    @androidx.room.Ignore()
    public StreamEntity(@org.jetbrains.annotations.NotNull()
    org.schabi.newpipe.extractor.stream.StreamInfoItem item) {
        super();
    }
    
    @androidx.room.Ignore()
    public StreamEntity(@org.jetbrains.annotations.NotNull()
    org.schabi.newpipe.extractor.stream.StreamInfo info) {
        super();
    }
    
    @androidx.room.Ignore()
    public StreamEntity(@org.jetbrains.annotations.NotNull()
    org.blayboy.newpipe.player.playqueue.PlayQueueItem item) {
        super();
    }
    
    public final long component1() {
        return 0L;
    }
    
    public final int component2() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component3() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component4() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.schabi.newpipe.extractor.stream.StreamType component5() {
        return null;
    }
    
    public final long component6() {
        return 0L;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component7() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component8() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Long component9() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component10() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.time.OffsetDateTime component11() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Boolean component12() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.blayboy.newpipe.database.stream.model.StreamEntity copy(long uid, int serviceId, @org.jetbrains.annotations.NotNull()
    java.lang.String url, @org.jetbrains.annotations.NotNull()
    java.lang.String title, @org.jetbrains.annotations.NotNull()
    org.schabi.newpipe.extractor.stream.StreamType streamType, long duration, @org.jetbrains.annotations.NotNull()
    java.lang.String uploader, @org.jetbrains.annotations.Nullable()
    java.lang.String thumbnailUrl, @org.jetbrains.annotations.Nullable()
    java.lang.Long viewCount, @org.jetbrains.annotations.Nullable()
    java.lang.String textualUploadDate, @org.jetbrains.annotations.Nullable()
    java.time.OffsetDateTime uploadDate, @org.jetbrains.annotations.Nullable()
    java.lang.Boolean isUploadDateApproximation) {
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
    
    @kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\r\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0011"}, d2 = {"Lorg/blayboy/newpipe/database/stream/model/StreamEntity$Companion;", "", "()V", "STREAM_DURATION", "", "STREAM_ID", "STREAM_IS_UPLOAD_DATE_APPROXIMATION", "STREAM_SERVICE_ID", "STREAM_TABLE", "STREAM_TEXTUAL_UPLOAD_DATE", "STREAM_THUMBNAIL_URL", "STREAM_TITLE", "STREAM_TYPE", "STREAM_UPLOADER", "STREAM_UPLOAD_DATE", "STREAM_URL", "STREAM_VIEWS", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}