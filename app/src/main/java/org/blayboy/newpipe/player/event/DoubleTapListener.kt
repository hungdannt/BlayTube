package org.blayboy.newpipe.player.event

interface DoubleTapListener {
    fun onDoubleTapStarted(portion: DisplayPortion) {}
    fun onDoubleTapProgressDown(portion: DisplayPortion) {}
    fun onDoubleTapFinished() {}
}
