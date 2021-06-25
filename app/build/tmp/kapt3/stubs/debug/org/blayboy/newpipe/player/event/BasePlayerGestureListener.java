package org.blayboy.newpipe.player.event;

import java.lang.System;

/**
 * Base gesture handling for [Player]
 *
 * This class contains the logic for the player gestures like View preparations
 * and provides some abstract methods to make it easier separating the logic from the UI.
 */
@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\b&\u0018\u0000 T2\u00020\u00012\u00020\u0002:\u0001TB\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0007J\u000e\u0010\n\u001a\u00020\u00002\u0006\u0010%\u001a\u00020\tJ\u000e\u0010&\u001a\u00020\u00002\u0006\u0010\'\u001a\u00020\u001eJ\u0006\u0010(\u001a\u00020)J\u0010\u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020-H\u0002J\u0010\u0010.\u001a\u00020+2\u0006\u0010,\u001a\u00020-H\u0002J\u0010\u0010/\u001a\u00020\u001b2\u0006\u00100\u001a\u000201H\u0002J\u0010\u00102\u001a\u00020\u001b2\u0006\u00100\u001a\u000201H\u0002J\u0010\u00103\u001a\u00020\u001e2\u0006\u00104\u001a\u00020-H\u0002J\u0006\u00105\u001a\u00020)J\u0010\u00106\u001a\u00020\u001e2\u0006\u0010,\u001a\u00020-H\u0016J\u0018\u00106\u001a\u00020)2\u0006\u00104\u001a\u00020-2\u0006\u00107\u001a\u00020+H&J\u0010\u00108\u001a\u00020\u001e2\u0006\u0010,\u001a\u00020-H\u0016J\u0010\u00109\u001a\u00020\u001e2\u0006\u0010,\u001a\u00020-H\u0002J,\u0010:\u001a\u00020\u001e2\b\u0010;\u001a\u0004\u0018\u00010-2\b\u0010<\u001a\u0004\u0018\u00010-2\u0006\u0010=\u001a\u00020\u00142\u0006\u0010>\u001a\u00020\u0014H\u0016J\u0012\u0010?\u001a\u00020)2\b\u0010,\u001a\u0004\u0018\u00010-H\u0016J\b\u0010@\u001a\u00020)H&J\b\u0010A\u001a\u00020)H&J(\u0010B\u001a\u00020\u001e2\u0006\u0010C\u001a\u00020-2\u0006\u0010D\u001a\u00020-2\u0006\u0010E\u001a\u00020\u00142\u0006\u0010F\u001a\u00020\u0014H\u0016J8\u0010B\u001a\u00020)2\u0006\u0010G\u001a\u00020H2\u0006\u00107\u001a\u00020+2\u0006\u0010C\u001a\u00020-2\u0006\u0010D\u001a\u00020-2\u0006\u0010E\u001a\u00020\u00142\u0006\u0010F\u001a\u00020\u0014H&J\u0018\u0010I\u001a\u00020)2\u0006\u0010G\u001a\u00020H2\u0006\u00104\u001a\u00020-H&J(\u0010J\u001a\u00020\u001e2\u0006\u0010C\u001a\u00020-2\u0006\u0010D\u001a\u00020-2\u0006\u0010E\u001a\u00020\u00142\u0006\u0010F\u001a\u00020\u0014H\u0002J(\u0010K\u001a\u00020\u001e2\u0006\u0010C\u001a\u00020-2\u0006\u0010D\u001a\u00020-2\u0006\u0010E\u001a\u00020\u00142\u0006\u0010F\u001a\u00020\u0014H\u0002J\u0010\u0010L\u001a\u00020)2\u0006\u0010G\u001a\u00020HH&J\u0010\u0010M\u001a\u00020\u001e2\u0006\u0010,\u001a\u00020-H\u0016J\u0018\u0010N\u001a\u00020\u001e2\u0006\u0010O\u001a\u00020P2\u0006\u00104\u001a\u00020-H\u0016J\u0018\u0010Q\u001a\u00020\u001e2\u0006\u0010O\u001a\u00020P2\u0006\u00104\u001a\u00020-H\u0002J\u0018\u0010R\u001a\u00020\u001e2\u0006\u0010O\u001a\u00020P2\u0006\u00104\u001a\u00020-H\u0002J\u000e\u0010S\u001a\u00020)2\u0006\u0010,\u001a\u00020-R\"\u0010\n\u001a\u0004\u0018\u00010\t2\b\u0010\b\u001a\u0004\u0018\u00010\t@BX\u0086\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u000e\u0010\r\u001a\u00020\u000eX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0014X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0014X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u0014X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u001bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u001bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u001d\u001a\u00020\u001e8F\u00a2\u0006\u0006\u001a\u0004\b\u001d\u0010\u001fR\u001e\u0010 \u001a\u00020\u001e2\u0006\u0010\b\u001a\u00020\u001e@BX\u0086\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b \u0010\u001fR\u000e\u0010!\u001a\u00020\u001eX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\"\u001a\u00020\u001eX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010#\u001a\u00020\u001eX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0003\u001a\u00020\u00048\u0004X\u0085\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u00020\u00068\u0004X\u0085\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010$\u001a\u00020\u001bX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006U"}, d2 = {"Lorg/blayboy/newpipe/player/event/BasePlayerGestureListener;", "Landroid/view/GestureDetector$SimpleOnGestureListener;", "Landroid/view/View$OnTouchListener;", "player", "Lorg/blayboy/newpipe/player/Player;", "service", "Lorg/blayboy/newpipe/player/MainPlayer;", "(Lorg/blayboy/newpipe/player/Player;Lorg/blayboy/newpipe/player/MainPlayer;)V", "<set-?>", "Lorg/blayboy/newpipe/player/event/DoubleTapListener;", "doubleTapControls", "getDoubleTapControls", "()Lorg/blayboy/newpipe/player/event/DoubleTapListener;", "doubleTapDelay", "", "doubleTapHandler", "Landroid/os/Handler;", "doubleTapRunnable", "Ljava/lang/Runnable;", "initFirstPointerX", "", "initFirstPointerY", "initPointerDistance", "", "initSecPointerX", "initSecPointerY", "initialPopupX", "", "initialPopupY", "isDoubleTapEnabled", "", "()Z", "isDoubleTapping", "isMovingInMain", "isMovingInPopup", "isResizing", "tossFlingVelocity", "listener", "enableMultiDoubleTap", "enable", "endMultiDoubleTap", "", "getDisplayHalfPortion", "Lorg/blayboy/newpipe/player/event/DisplayPortion;", "e", "Landroid/view/MotionEvent;", "getDisplayPortion", "getNavigationBarHeight", "context", "Landroid/content/Context;", "getStatusBarHeight", "handleMultiDrag", "event", "keepInDoubleTapMode", "onDoubleTap", "portion", "onDown", "onDownInPopup", "onFling", "e1", "e2", "velocityX", "velocityY", "onLongPress", "onPopupResizingEnd", "onPopupResizingStart", "onScroll", "initialEvent", "movingEvent", "distanceX", "distanceY", "playerType", "Lorg/blayboy/newpipe/player/MainPlayer$PlayerType;", "onScrollEnd", "onScrollInMain", "onScrollInPopup", "onSingleTap", "onSingleTapConfirmed", "onTouch", "v", "Landroid/view/View;", "onTouchInMain", "onTouchInPopup", "startMultiDoubleTap", "Companion", "app_debug"})
public abstract class BasePlayerGestureListener extends android.view.GestureDetector.SimpleOnGestureListener implements android.view.View.OnTouchListener {
    private int initialPopupX = -1;
    private int initialPopupY = -1;
    private boolean isMovingInMain = false;
    private boolean isMovingInPopup = false;
    private boolean isResizing = false;
    private final int tossFlingVelocity = 0;
    private double initPointerDistance = -1.0;
    private float initFirstPointerX = -1.0F;
    private float initFirstPointerY = -1.0F;
    private float initSecPointerX = -1.0F;
    private float initSecPointerY = -1.0F;
    @org.jetbrains.annotations.Nullable()
    private org.blayboy.newpipe.player.event.DoubleTapListener doubleTapControls;
    private boolean isDoubleTapping = false;
    private long doubleTapDelay = 550L;
    private final android.os.Handler doubleTapHandler = null;
    private final java.lang.Runnable doubleTapRunnable = null;
    @org.jetbrains.annotations.NotNull()
    protected final org.blayboy.newpipe.player.Player player = null;
    @org.jetbrains.annotations.NotNull()
    protected final org.blayboy.newpipe.player.MainPlayer service = null;
    private static final java.lang.String TAG = "BasePlayerGestListener";
    private static final boolean DEBUG = false;
    private static final long DOUBLE_TAP_DELAY = 550L;
    private static final int MOVEMENT_THRESHOLD = 40;
    public static final org.blayboy.newpipe.player.event.BasePlayerGestureListener.Companion Companion = null;
    
    public abstract void onDoubleTap(@org.jetbrains.annotations.NotNull()
    android.view.MotionEvent event, @org.jetbrains.annotations.NotNull()
    org.blayboy.newpipe.player.event.DisplayPortion portion);
    
    public abstract void onSingleTap(@org.jetbrains.annotations.NotNull()
    org.blayboy.newpipe.player.MainPlayer.PlayerType playerType);
    
    public abstract void onScroll(@org.jetbrains.annotations.NotNull()
    org.blayboy.newpipe.player.MainPlayer.PlayerType playerType, @org.jetbrains.annotations.NotNull()
    org.blayboy.newpipe.player.event.DisplayPortion portion, @org.jetbrains.annotations.NotNull()
    android.view.MotionEvent initialEvent, @org.jetbrains.annotations.NotNull()
    android.view.MotionEvent movingEvent, float distanceX, float distanceY);
    
    public abstract void onScrollEnd(@org.jetbrains.annotations.NotNull()
    org.blayboy.newpipe.player.MainPlayer.PlayerType playerType, @org.jetbrains.annotations.NotNull()
    android.view.MotionEvent event);
    
    public abstract void onPopupResizingStart();
    
    public abstract void onPopupResizingEnd();
    
    @java.lang.Override()
    public boolean onTouch(@org.jetbrains.annotations.NotNull()
    android.view.View v, @org.jetbrains.annotations.NotNull()
    android.view.MotionEvent event) {
        return false;
    }
    
    private final boolean onTouchInMain(android.view.View v, android.view.MotionEvent event) {
        return false;
    }
    
    private final boolean onTouchInPopup(android.view.View v, android.view.MotionEvent event) {
        return false;
    }
    
    private final boolean handleMultiDrag(android.view.MotionEvent event) {
        return false;
    }
    
    @java.lang.Override()
    public boolean onDown(@org.jetbrains.annotations.NotNull()
    android.view.MotionEvent e) {
        return false;
    }
    
    private final boolean onDownInPopup(android.view.MotionEvent e) {
        return false;
    }
    
    @java.lang.Override()
    public boolean onDoubleTap(@org.jetbrains.annotations.NotNull()
    android.view.MotionEvent e) {
        return false;
    }
    
    @java.lang.Override()
    public boolean onSingleTapConfirmed(@org.jetbrains.annotations.NotNull()
    android.view.MotionEvent e) {
        return false;
    }
    
    @java.lang.Override()
    public void onLongPress(@org.jetbrains.annotations.Nullable()
    android.view.MotionEvent e) {
    }
    
    @java.lang.Override()
    public boolean onScroll(@org.jetbrains.annotations.NotNull()
    android.view.MotionEvent initialEvent, @org.jetbrains.annotations.NotNull()
    android.view.MotionEvent movingEvent, float distanceX, float distanceY) {
        return false;
    }
    
    @java.lang.Override()
    public boolean onFling(@org.jetbrains.annotations.Nullable()
    android.view.MotionEvent e1, @org.jetbrains.annotations.Nullable()
    android.view.MotionEvent e2, float velocityX, float velocityY) {
        return false;
    }
    
    private final boolean onScrollInMain(android.view.MotionEvent initialEvent, android.view.MotionEvent movingEvent, float distanceX, float distanceY) {
        return false;
    }
    
    private final boolean onScrollInPopup(android.view.MotionEvent initialEvent, android.view.MotionEvent movingEvent, float distanceX, float distanceY) {
        return false;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final org.blayboy.newpipe.player.event.DoubleTapListener getDoubleTapControls() {
        return null;
    }
    
    public final boolean isDoubleTapEnabled() {
        return false;
    }
    
    public final boolean isDoubleTapping() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.blayboy.newpipe.player.event.BasePlayerGestureListener doubleTapControls(@org.jetbrains.annotations.NotNull()
    org.blayboy.newpipe.player.event.DoubleTapListener listener) {
        return null;
    }
    
    public final void startMultiDoubleTap(@org.jetbrains.annotations.NotNull()
    android.view.MotionEvent e) {
    }
    
    public final void keepInDoubleTapMode() {
    }
    
    public final void endMultiDoubleTap() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.blayboy.newpipe.player.event.BasePlayerGestureListener enableMultiDoubleTap(boolean enable) {
        return null;
    }
    
    private final org.blayboy.newpipe.player.event.DisplayPortion getDisplayPortion(android.view.MotionEvent e) {
        return null;
    }
    
    private final org.blayboy.newpipe.player.event.DisplayPortion getDisplayHalfPortion(android.view.MotionEvent e) {
        return null;
    }
    
    private final int getNavigationBarHeight(android.content.Context context) {
        return 0;
    }
    
    private final int getStatusBarHeight(android.content.Context context) {
        return 0;
    }
    
    public BasePlayerGestureListener(@org.jetbrains.annotations.NotNull()
    org.blayboy.newpipe.player.Player player, @org.jetbrains.annotations.NotNull()
    org.blayboy.newpipe.player.MainPlayer service) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000b"}, d2 = {"Lorg/blayboy/newpipe/player/event/BasePlayerGestureListener$Companion;", "", "()V", "DEBUG", "", "DOUBLE_TAP_DELAY", "", "MOVEMENT_THRESHOLD", "", "TAG", "", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}