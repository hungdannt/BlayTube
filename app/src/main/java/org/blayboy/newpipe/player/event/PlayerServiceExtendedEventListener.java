package org.blayboy.newpipe.player.event;

import org.blayboy.newpipe.player.MainPlayer;
import org.blayboy.newpipe.player.Player;
import org.blayboy.newpipe.player.MainPlayer;
import org.blayboy.newpipe.player.Player;

public interface PlayerServiceExtendedEventListener extends PlayerServiceEventListener {
    void onServiceConnected(Player player,
                            MainPlayer playerService,
                            boolean playAfterConnect);
    void onServiceDisconnected();
}
