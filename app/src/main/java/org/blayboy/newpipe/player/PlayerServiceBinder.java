package org.blayboy.newpipe.player;

import android.os.Binder;

import androidx.annotation.NonNull;

class PlayerServiceBinder extends Binder {
    private final Player player;

    PlayerServiceBinder(@NonNull final Player player) {
        this.player = player;
    }

    Player getPlayerInstance() {
        return player;
    }
}
