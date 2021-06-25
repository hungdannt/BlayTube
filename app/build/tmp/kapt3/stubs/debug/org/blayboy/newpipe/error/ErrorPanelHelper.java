package org.blayboy.newpipe.error;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u0000 \u001e2\u00020\u0001:\u0001\u001eB\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\u0006\u0010\u0013\u001a\u00020\u0014J\u0006\u0010\u0015\u001a\u00020\u0014J\u0006\u0010\u0016\u001a\u00020\u0017J\u000e\u0010\u0018\u001a\u00020\u00142\u0006\u0010\u0019\u001a\u00020\u001aJ\u000e\u0010\u001b\u001a\u00020\u00142\u0006\u0010\u001c\u001a\u00020\u001dR\u000e\u0010\t\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001f"}, d2 = {"Lorg/blayboy/newpipe/error/ErrorPanelHelper;", "", "fragment", "Landroidx/fragment/app/Fragment;", "rootView", "Landroid/view/View;", "onRetry", "Ljava/lang/Runnable;", "(Landroidx/fragment/app/Fragment;Landroid/view/View;Ljava/lang/Runnable;)V", "context", "Landroid/content/Context;", "errorButtonAction", "Landroid/widget/Button;", "errorButtonRetry", "errorDisposable", "Lio/reactivex/rxjava3/disposables/Disposable;", "errorPanelRoot", "errorTextView", "Landroid/widget/TextView;", "dispose", "", "hide", "isVisible", "", "showError", "errorInfo", "Lorg/blayboy/newpipe/error/ErrorInfo;", "showTextError", "errorString", "", "Companion", "app_debug"})
public final class ErrorPanelHelper {
    private final android.content.Context context = null;
    private final android.view.View errorPanelRoot = null;
    private final android.widget.TextView errorTextView = null;
    private final android.widget.Button errorButtonAction = null;
    private final android.widget.Button errorButtonRetry = null;
    private io.reactivex.rxjava3.disposables.Disposable errorDisposable;
    private final androidx.fragment.app.Fragment fragment = null;
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String TAG = null;
    private static final boolean DEBUG = false;
    public static final org.blayboy.newpipe.error.ErrorPanelHelper.Companion Companion = null;
    
    public final void showError(@org.jetbrains.annotations.NotNull()
    org.blayboy.newpipe.error.ErrorInfo errorInfo) {
    }
    
    public final void showTextError(@org.jetbrains.annotations.NotNull()
    java.lang.String errorString) {
    }
    
    public final void hide() {
    }
    
    public final boolean isVisible() {
        return false;
    }
    
    public final void dispose() {
    }
    
    public ErrorPanelHelper(@org.jetbrains.annotations.NotNull()
    androidx.fragment.app.Fragment fragment, @org.jetbrains.annotations.NotNull()
    android.view.View rootView, @org.jetbrains.annotations.NotNull()
    java.lang.Runnable onRetry) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0011\u0010\u0007\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n\u00a8\u0006\u000b"}, d2 = {"Lorg/blayboy/newpipe/error/ErrorPanelHelper$Companion;", "", "()V", "DEBUG", "", "getDEBUG", "()Z", "TAG", "", "getTAG", "()Ljava/lang/String;", "app_debug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getTAG() {
            return null;
        }
        
        public final boolean getDEBUG() {
            return false;
        }
        
        private Companion() {
            super();
        }
    }
}