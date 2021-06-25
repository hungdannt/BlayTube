package org.blayboy.newpipe.player.event;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\u0010\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\u0016\u00a8\u0006\b"}, d2 = {"Lorg/blayboy/newpipe/player/event/DoubleTapListener;", "", "onDoubleTapFinished", "", "onDoubleTapProgressDown", "portion", "Lorg/blayboy/newpipe/player/event/DisplayPortion;", "onDoubleTapStarted", "app_debug"})
public abstract interface DoubleTapListener {
    
    public abstract void onDoubleTapStarted(@org.jetbrains.annotations.NotNull()
    org.blayboy.newpipe.player.event.DisplayPortion portion);
    
    public abstract void onDoubleTapProgressDown(@org.jetbrains.annotations.NotNull()
    org.blayboy.newpipe.player.event.DisplayPortion portion);
    
    public abstract void onDoubleTapFinished();
    
    @kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 3)
    public final class DefaultImpls {
        
        public static void onDoubleTapStarted(@org.jetbrains.annotations.NotNull()
        org.blayboy.newpipe.player.event.DoubleTapListener $this, @org.jetbrains.annotations.NotNull()
        org.blayboy.newpipe.player.event.DisplayPortion portion) {
        }
        
        public static void onDoubleTapProgressDown(@org.jetbrains.annotations.NotNull()
        org.blayboy.newpipe.player.event.DoubleTapListener $this, @org.jetbrains.annotations.NotNull()
        org.blayboy.newpipe.player.event.DisplayPortion portion) {
        }
        
        public static void onDoubleTapFinished(@org.jetbrains.annotations.NotNull()
        org.blayboy.newpipe.player.event.DoubleTapListener $this) {
        }
    }
}