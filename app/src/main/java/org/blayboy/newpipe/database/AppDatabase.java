package org.blayboy.newpipe.database;

import androidx.room.Database;
import androidx.room.RoomDatabase;
import androidx.room.TypeConverters;

import org.blayboy.newpipe.database.feed.dao.FeedDAO;
import org.blayboy.newpipe.database.feed.dao.FeedGroupDAO;
import org.blayboy.newpipe.database.feed.model.FeedEntity;
import org.blayboy.newpipe.database.feed.model.FeedGroupEntity;
import org.blayboy.newpipe.database.feed.model.FeedGroupSubscriptionEntity;
import org.blayboy.newpipe.database.feed.model.FeedLastUpdatedEntity;
import org.blayboy.newpipe.database.history.dao.SearchHistoryDAO;
import org.blayboy.newpipe.database.history.dao.StreamHistoryDAO;
import org.blayboy.newpipe.database.history.model.SearchHistoryEntry;
import org.blayboy.newpipe.database.history.model.StreamHistoryEntity;
import org.blayboy.newpipe.database.playlist.dao.PlaylistDAO;
import org.blayboy.newpipe.database.playlist.dao.PlaylistRemoteDAO;
import org.blayboy.newpipe.database.playlist.dao.PlaylistStreamDAO;
import org.blayboy.newpipe.database.playlist.model.PlaylistEntity;
import org.blayboy.newpipe.database.playlist.model.PlaylistRemoteEntity;
import org.blayboy.newpipe.database.playlist.model.PlaylistStreamEntity;
import org.blayboy.newpipe.database.stream.dao.StreamDAO;
import org.blayboy.newpipe.database.stream.dao.StreamStateDAO;
import org.blayboy.newpipe.database.stream.model.StreamEntity;
import org.blayboy.newpipe.database.stream.model.StreamStateEntity;
import org.blayboy.newpipe.database.subscription.SubscriptionDAO;
import org.blayboy.newpipe.database.subscription.SubscriptionEntity;

import static org.blayboy.newpipe.database.Migrations.DB_VER_3;

@TypeConverters({Converters.class})
@Database(
        entities = {
                SubscriptionEntity.class, SearchHistoryEntry.class,
                StreamEntity.class, StreamHistoryEntity.class, StreamStateEntity.class,
                PlaylistEntity.class, PlaylistStreamEntity.class, PlaylistRemoteEntity.class,
                FeedEntity.class, FeedGroupEntity.class, FeedGroupSubscriptionEntity.class,
                FeedLastUpdatedEntity.class
        },
        version = DB_VER_3
)
public abstract class AppDatabase extends RoomDatabase {
    public static final String DATABASE_NAME = "newpipe.db";

    public abstract SearchHistoryDAO searchHistoryDAO();

    public abstract StreamDAO streamDAO();

    public abstract StreamHistoryDAO streamHistoryDAO();

    public abstract StreamStateDAO streamStateDAO();

    public abstract PlaylistDAO playlistDAO();

    public abstract PlaylistStreamDAO playlistStreamDAO();

    public abstract PlaylistRemoteDAO playlistRemoteDAO();

    public abstract FeedDAO feedDAO();

    public abstract FeedGroupDAO feedGroupDAO();

    public abstract SubscriptionDAO subscriptionDAO();
}
