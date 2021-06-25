package org.blayboy.newpipe.local.holder;

import android.view.View;
import android.view.ViewGroup;

import org.blayboy.newpipe.database.LocalItem;
import org.blayboy.newpipe.local.LocalItemBuilder;
import org.blayboy.newpipe.util.ImageDisplayConstants;
import org.blayboy.newpipe.util.Localization;
import org.blayboy.newpipe.database.LocalItem;
import org.blayboy.newpipe.database.playlist.PlaylistMetadataEntry;
import org.blayboy.newpipe.local.LocalItemBuilder;
import org.blayboy.newpipe.local.history.HistoryRecordManager;
import org.blayboy.newpipe.util.ImageDisplayConstants;
import org.blayboy.newpipe.util.Localization;

import java.time.format.DateTimeFormatter;

public class LocalPlaylistItemHolder extends PlaylistItemHolder {
    public LocalPlaylistItemHolder(final LocalItemBuilder infoItemBuilder, final ViewGroup parent) {
        super(infoItemBuilder, parent);
    }

    LocalPlaylistItemHolder(final LocalItemBuilder infoItemBuilder, final int layoutId,
                            final ViewGroup parent) {
        super(infoItemBuilder, layoutId, parent);
    }

    @Override
    public void updateFromItem(final LocalItem localItem,
                               final HistoryRecordManager historyRecordManager,
                               final DateTimeFormatter dateTimeFormatter) {
        if (!(localItem instanceof PlaylistMetadataEntry)) {
            return;
        }
        final PlaylistMetadataEntry item = (PlaylistMetadataEntry) localItem;

        itemTitleView.setText(item.name);
        itemStreamCountView.setText(Localization.localizeStreamCountMini(
                itemStreamCountView.getContext(), item.streamCount));
        itemUploaderView.setVisibility(View.INVISIBLE);

        itemBuilder.displayImage(item.thumbnailUrl, itemThumbnailView,
                ImageDisplayConstants.DISPLAY_PLAYLIST_OPTIONS);

        super.updateFromItem(localItem, historyRecordManager, dateTimeFormatter);
    }
}
