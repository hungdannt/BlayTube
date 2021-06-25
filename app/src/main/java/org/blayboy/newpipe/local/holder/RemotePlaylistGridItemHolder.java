package org.blayboy.newpipe.local.holder;

import android.view.ViewGroup;

import org.blayboy.newpipe.local.LocalItemBuilder;
import org.blayboy.newpipe.R;
import org.blayboy.newpipe.local.LocalItemBuilder;

public class RemotePlaylistGridItemHolder extends RemotePlaylistItemHolder {
    public RemotePlaylistGridItemHolder(final LocalItemBuilder infoItemBuilder,
                                        final ViewGroup parent) {
        super(infoItemBuilder, R.layout.list_playlist_grid_item, parent);
    }
}
