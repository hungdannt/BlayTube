package org.blayboy.newpipe.error;

import java.lang.System;

@kotlinx.android.parcel.Parcelize()
@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0011\n\u0002\b\u0012\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 .2\u00020\u0001:\u0001.B\'\b\u0012\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\tB-\b\u0012\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00030\n\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\u000bB\u001f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\fB\'\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\r\u001a\u00020\u000e\u00a2\u0006\u0002\u0010\u000fB)\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011\u00a2\u0006\u0002\u0010\u0012B%\b\u0016\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00030\n\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\u0013B-\b\u0016\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00030\n\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\r\u001a\u00020\u000e\u00a2\u0006\u0002\u0010\u0014B/\b\u0016\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00030\n\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011\u00a2\u0006\u0002\u0010\u0015B?\u0012\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00070\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\u0018\u001a\u00020\u000e\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0002\u0010\u0019J\t\u0010(\u001a\u00020\u000eH\u00d6\u0001J\u0019\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020,2\u0006\u0010-\u001a\u00020\u000eH\u00d6\u0001R\u0011\u0010\u0018\u001a\u00020\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\b\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001dR\u0019\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00070\u0017\u00a2\u0006\n\n\u0002\u0010!\u001a\u0004\b\u001f\u0010 R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b&\u0010\'\u00a8\u0006/"}, d2 = {"Lorg/blayboy/newpipe/error/ErrorInfo;", "Landroid/os/Parcelable;", "throwable", "", "userAction", "Lorg/blayboy/newpipe/error/UserAction;", "serviceName", "", "request", "(Ljava/lang/Throwable;Lorg/blayboy/newpipe/error/UserAction;Ljava/lang/String;Ljava/lang/String;)V", "", "(Ljava/util/List;Lorg/blayboy/newpipe/error/UserAction;Ljava/lang/String;Ljava/lang/String;)V", "(Ljava/lang/Throwable;Lorg/blayboy/newpipe/error/UserAction;Ljava/lang/String;)V", "serviceId", "", "(Ljava/lang/Throwable;Lorg/blayboy/newpipe/error/UserAction;Ljava/lang/String;I)V", "info", "Lorg/schabi/newpipe/extractor/Info;", "(Ljava/lang/Throwable;Lorg/blayboy/newpipe/error/UserAction;Ljava/lang/String;Lorg/schabi/newpipe/extractor/Info;)V", "(Ljava/util/List;Lorg/blayboy/newpipe/error/UserAction;Ljava/lang/String;)V", "(Ljava/util/List;Lorg/blayboy/newpipe/error/UserAction;Ljava/lang/String;I)V", "(Ljava/util/List;Lorg/blayboy/newpipe/error/UserAction;Ljava/lang/String;Lorg/schabi/newpipe/extractor/Info;)V", "stackTraces", "", "messageStringId", "([Ljava/lang/String;Lorg/blayboy/newpipe/error/UserAction;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Throwable;)V", "getMessageStringId", "()I", "getRequest", "()Ljava/lang/String;", "getServiceName", "getStackTraces", "()[Ljava/lang/String;", "[Ljava/lang/String;", "getThrowable", "()Ljava/lang/Throwable;", "setThrowable", "(Ljava/lang/Throwable;)V", "getUserAction", "()Lorg/blayboy/newpipe/error/UserAction;", "describeContents", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "Companion", "app_debug"})
public final class ErrorInfo implements android.os.Parcelable {
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String[] stackTraces = null;
    @org.jetbrains.annotations.NotNull()
    private final org.blayboy.newpipe.error.UserAction userAction = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String serviceName = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String request = null;
    private final int messageStringId = 0;
    @org.jetbrains.annotations.Nullable()
    private transient java.lang.Throwable throwable;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String SERVICE_NONE = "none";
    public static final org.blayboy.newpipe.error.ErrorInfo.Companion Companion = null;
    public static final android.os.Parcelable.Creator CREATOR = null;
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String[] getStackTraces() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.blayboy.newpipe.error.UserAction getUserAction() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getServiceName() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getRequest() {
        return null;
    }
    
    public final int getMessageStringId() {
        return 0;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Throwable getThrowable() {
        return null;
    }
    
    public final void setThrowable(@org.jetbrains.annotations.Nullable()
    java.lang.Throwable p0) {
    }
    
    public ErrorInfo(@org.jetbrains.annotations.NotNull()
    java.lang.String[] stackTraces, @org.jetbrains.annotations.NotNull()
    org.blayboy.newpipe.error.UserAction userAction, @org.jetbrains.annotations.NotNull()
    java.lang.String serviceName, @org.jetbrains.annotations.NotNull()
    java.lang.String request, int messageStringId, @org.jetbrains.annotations.Nullable()
    java.lang.Throwable throwable) {
        super();
    }
    
    private ErrorInfo(java.lang.Throwable throwable, org.blayboy.newpipe.error.UserAction userAction, java.lang.String serviceName, java.lang.String request) {
        super();
    }
    
    private ErrorInfo(java.util.List<? extends java.lang.Throwable> throwable, org.blayboy.newpipe.error.UserAction userAction, java.lang.String serviceName, java.lang.String request) {
        super();
    }
    
    public ErrorInfo(@org.jetbrains.annotations.NotNull()
    java.lang.Throwable throwable, @org.jetbrains.annotations.NotNull()
    org.blayboy.newpipe.error.UserAction userAction, @org.jetbrains.annotations.NotNull()
    java.lang.String request) {
        super();
    }
    
    public ErrorInfo(@org.jetbrains.annotations.NotNull()
    java.lang.Throwable throwable, @org.jetbrains.annotations.NotNull()
    org.blayboy.newpipe.error.UserAction userAction, @org.jetbrains.annotations.NotNull()
    java.lang.String request, int serviceId) {
        super();
    }
    
    public ErrorInfo(@org.jetbrains.annotations.NotNull()
    java.lang.Throwable throwable, @org.jetbrains.annotations.NotNull()
    org.blayboy.newpipe.error.UserAction userAction, @org.jetbrains.annotations.NotNull()
    java.lang.String request, @org.jetbrains.annotations.Nullable()
    org.schabi.newpipe.extractor.Info info) {
        super();
    }
    
    public ErrorInfo(@org.jetbrains.annotations.NotNull()
    java.util.List<? extends java.lang.Throwable> throwable, @org.jetbrains.annotations.NotNull()
    org.blayboy.newpipe.error.UserAction userAction, @org.jetbrains.annotations.NotNull()
    java.lang.String request) {
        super();
    }
    
    public ErrorInfo(@org.jetbrains.annotations.NotNull()
    java.util.List<? extends java.lang.Throwable> throwable, @org.jetbrains.annotations.NotNull()
    org.blayboy.newpipe.error.UserAction userAction, @org.jetbrains.annotations.NotNull()
    java.lang.String request, int serviceId) {
        super();
    }
    
    public ErrorInfo(@org.jetbrains.annotations.NotNull()
    java.util.List<? extends java.lang.Throwable> throwable, @org.jetbrains.annotations.NotNull()
    org.blayboy.newpipe.error.UserAction userAction, @org.jetbrains.annotations.NotNull()
    java.lang.String request, @org.jetbrains.annotations.Nullable()
    org.schabi.newpipe.extractor.Info info) {
        super();
    }
    
    @java.lang.Override()
    public int describeContents() {
        return 0;
    }
    
    @java.lang.Override()
    public void writeToParcel(@org.jetbrains.annotations.NotNull()
    android.os.Parcel parcel, int flags) {
    }
    
    @kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 3)
    public static final class Creator implements android.os.Parcelable.Creator {
        
        public Creator() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.Object[] newArray(int size) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.Object createFromParcel(@org.jetbrains.annotations.NotNull()
        android.os.Parcel in) {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010 \n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u001a\u0010\u0005\u001a\n \u0006*\u0004\u0018\u00010\u00040\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0002J\u001a\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\f2\u0006\u0010\r\u001a\u00020\u000eH\u0003J\u0010\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\fH\u0002J\u001f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00040\u00112\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u0012\u00a2\u0006\u0002\u0010\u0013J\u0019\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00040\u00112\u0006\u0010\u000b\u001a\u00020\f\u00a2\u0006\u0002\u0010\u0015R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0016"}, d2 = {"Lorg/blayboy/newpipe/error/ErrorInfo$Companion;", "", "()V", "SERVICE_NONE", "", "getInfoServiceName", "kotlin.jvm.PlatformType", "info", "Lorg/schabi/newpipe/extractor/Info;", "getMessageStringId", "", "throwable", "", "action", "Lorg/blayboy/newpipe/error/UserAction;", "getStackTrace", "throwableListToStringList", "", "", "(Ljava/util/List;)[Ljava/lang/String;", "throwableToStringList", "(Ljava/lang/Throwable;)[Ljava/lang/String;", "app_debug"})
    public static final class Companion {
        
        private final java.lang.String getStackTrace(java.lang.Throwable throwable) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String[] throwableToStringList(@org.jetbrains.annotations.NotNull()
        java.lang.Throwable throwable) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String[] throwableListToStringList(@org.jetbrains.annotations.NotNull()
        java.util.List<? extends java.lang.Throwable> throwable) {
            return null;
        }
        
        private final java.lang.String getInfoServiceName(org.schabi.newpipe.extractor.Info info) {
            return null;
        }
        
        @androidx.annotation.StringRes()
        private final int getMessageStringId(java.lang.Throwable throwable, org.blayboy.newpipe.error.UserAction action) {
            return 0;
        }
        
        private Companion() {
            super();
        }
    }
}