package org.blayboy.newpipe.local.holder;

import android.text.TextUtils;
import android.view.ViewGroup;

import org.blayboy.newpipe.database.LocalItem;
import org.blayboy.newpipe.local.LocalItemBuilder;
import org.blayboy.newpipe.util.ImageDisplayConstants;
import org.blayboy.newpipe.util.Localization;
import org.blayboy.newpipe.database.LocalItem;
import org.blayboy.newpipe.database.playlist.model.PlaylistRemoteEntity;
import org.schabi.newpipe.extractor.NewPipe;
import org.blayboy.newpipe.local.LocalItemBuilder;
import org.blayboy.newpipe.local.history.HistoryRecordManager;
import org.blayboy.newpipe.util.ImageDisplayConstants;
import org.blayboy.newpipe.util.Localization;

import java.time.format.DateTimeFormatter;

public class RemotePlaylistItemHolder extends PlaylistItemHolder {
    public RemotePlaylistItemHolder(final LocalItemBuilder infoItemBuilder,
                                    final ViewGroup parent) {
        super(infoItemBuilder, parent);
    }

    RemotePlaylistItemHolder(final LocalItemBuilder infoItemBuilder, final int layoutId,
                             final ViewGroup parent) {
        super(infoItemBuilder, layoutId, parent);
    }

    @Override
    public void updateFromItem(final LocalItem localItem,
                               final HistoryRecordManager historyRecordManager,
                               final DateTimeFormatter dateTimeFormatter) {
        if (!(localItem instanceof PlaylistRemoteEntity)) {
            return;
        }
        final PlaylistRemoteEntity item = (PlaylistRemoteEntity) localItem;

        itemTitleView.setText(item.getName());
        itemStreamCountView.setText(Localization.localizeStreamCountMini(
                itemStreamCountView.getContext(), item.getStreamCount()));
        // Here is where the uploader name is set in the bookmarked playlists library
        if (!TextUtils.isEmpty(item.getUploader())) {
            itemUploaderView.setText(Localization.concatenateStrings(item.getUploader(),
                    NewPipe.getNameOfService(item.getServiceId())));
        } else {
            itemUploaderView.setText(NewPipe.getNameOfService(item.getServiceId()));
        }


        itemBuilder.displayImage(item.getThumbnailUrl(), itemThumbnailView,
                ImageDisplayConstants.DISPLAY_PLAYLIST_OPTIONS);

        super.updateFromItem(localItem, historyRecordManager, dateTimeFormatter);
    }
}
