package org.blayboy.newpipe.util;

import java.lang.System;

/**
 * Information about the saved state on the disk.
 */
@kotlinx.android.parcel.Parcelize()
@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\nH\u00d6\u0001J\b\u0010\u000b\u001a\u00020\u0003H\u0016J\u0019\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\nH\u00d6\u0001R\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007\u00a8\u0006\u0011"}, d2 = {"Lorg/blayboy/newpipe/util/SavedState;", "Landroid/os/Parcelable;", "prefixFileSaved", "", "pathFileSaved", "(Ljava/lang/String;Ljava/lang/String;)V", "getPathFileSaved", "()Ljava/lang/String;", "getPrefixFileSaved", "describeContents", "", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "app_debug"})
public final class SavedState implements android.os.Parcelable {
    
    /**
     * Get the prefix of the saved file.
     *
     * @return the file prefix
     */
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String prefixFileSaved = null;
    
    /**
     * Get the path to the saved file.
     *
     * @return the path to the saved file
     */
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String pathFileSaved = null;
    public static final android.os.Parcelable.Creator CREATOR = null;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    /**
     * Get the prefix of the saved file.
     *
     * @return the file prefix
     */
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getPrefixFileSaved() {
        return null;
    }
    
    /**
     * Get the path to the saved file.
     *
     * @return the path to the saved file
     */
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getPathFileSaved() {
        return null;
    }
    
    public SavedState(@org.jetbrains.annotations.NotNull()
    java.lang.String prefixFileSaved, @org.jetbrains.annotations.NotNull()
    java.lang.String pathFileSaved) {
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
}