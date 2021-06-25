package org.blayboy.newpipe.info_list.holder;

import android.view.ViewGroup;

import org.blayboy.newpipe.info_list.InfoItemBuilder;
import org.blayboy.newpipe.R;
import org.blayboy.newpipe.info_list.InfoItemBuilder;

public class PlaylistGridInfoItemHolder extends PlaylistMiniInfoItemHolder {
    public PlaylistGridInfoItemHolder(final InfoItemBuilder infoItemBuilder,
                                      final ViewGroup parent) {
        super(infoItemBuilder, R.layout.list_playlist_grid_item, parent);
    }
}
