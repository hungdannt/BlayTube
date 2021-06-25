package org.blayboy.newpipe.database.history.dao;

import androidx.annotation.Nullable;
import androidx.room.Dao;
import androidx.room.Query;

import org.blayboy.newpipe.database.history.model.StreamHistoryEntity;
import org.blayboy.newpipe.database.stream.StreamStatisticsEntry;
import org.blayboy.newpipe.database.stream.model.StreamEntity;
import org.blayboy.newpipe.database.stream.model.StreamStateEntity;
import org.blayboy.newpipe.database.history.model.StreamHistoryEntity;
import org.blayboy.newpipe.database.history.model.StreamHistoryEntry;
import org.blayboy.newpipe.database.stream.StreamStatisticsEntry;

import java.util.List;

import io.reactivex.rxjava3.core.Flowable;

import static org.blayboy.newpipe.database.history.model.StreamHistoryEntity.JOIN_STREAM_ID;
import static org.blayboy.newpipe.database.history.model.StreamHistoryEntity.STREAM_ACCESS_DATE;
import static org.blayboy.newpipe.database.history.model.StreamHistoryEntity.STREAM_HISTORY_TABLE;
import static org.blayboy.newpipe.database.history.model.StreamHistoryEntity.STREAM_REPEAT_COUNT;
import static org.blayboy.newpipe.database.stream.StreamStatisticsEntry.STREAM_LATEST_DATE;
import static org.blayboy.newpipe.database.stream.StreamStatisticsEntry.STREAM_WATCH_COUNT;
import static org.blayboy.newpipe.database.stream.model.StreamEntity.STREAM_ID;
import static org.blayboy.newpipe.database.stream.model.StreamEntity.STREAM_TABLE;
import static org.blayboy.newpipe.database.stream.model.StreamStateEntity.JOIN_STREAM_ID_ALIAS;
import static org.blayboy.newpipe.database.stream.model.StreamStateEntity.STREAM_PROGRESS_TIME;
import static org.blayboy.newpipe.database.stream.model.StreamStateEntity.STREAM_STATE_TABLE;

@Dao
public abstract class StreamHistoryDAO implements HistoryDAO<StreamHistoryEntity> {
    @Query("SELECT * FROM " + StreamHistoryEntity.STREAM_HISTORY_TABLE
            + " WHERE " + StreamHistoryEntity.STREAM_ACCESS_DATE + " = "
            + "(SELECT MAX(" + StreamHistoryEntity.STREAM_ACCESS_DATE + ") FROM " + StreamHistoryEntity.STREAM_HISTORY_TABLE + ")")
    @Override
    @Nullable
    public abstract StreamHistoryEntity getLatestEntry();

    @Override
    @Query("SELECT * FROM " + StreamHistoryEntity.STREAM_HISTORY_TABLE)
    public abstract Flowable<List<StreamHistoryEntity>> getAll();

    @Override
    @Query("DELETE FROM " + StreamHistoryEntity.STREAM_HISTORY_TABLE)
    public abstract int deleteAll();

    @Override
    public Flowable<List<StreamHistoryEntity>> listByService(final int serviceId) {
        throw new UnsupportedOperationException();
    }

    @Query("SELECT * FROM " + StreamEntity.STREAM_TABLE
            + " INNER JOIN " + StreamHistoryEntity.STREAM_HISTORY_TABLE
            + " ON " + StreamEntity.STREAM_ID + " = " + StreamHistoryEntity.JOIN_STREAM_ID
            + " ORDER BY " + StreamHistoryEntity.STREAM_ACCESS_DATE + " DESC")
    public abstract Flowable<List<StreamHistoryEntry>> getHistory();


    @Query("SELECT * FROM " + StreamEntity.STREAM_TABLE
            + " INNER JOIN " + StreamHistoryEntity.STREAM_HISTORY_TABLE
            + " ON " + StreamEntity.STREAM_ID + " = " + StreamHistoryEntity.JOIN_STREAM_ID
            + " ORDER BY " + StreamEntity.STREAM_ID + " ASC")
    public abstract Flowable<List<StreamHistoryEntry>> getHistorySortedById();

    @Query("SELECT * FROM " + StreamHistoryEntity.STREAM_HISTORY_TABLE + " WHERE " + StreamHistoryEntity.JOIN_STREAM_ID
            + " = :streamId ORDER BY " + StreamHistoryEntity.STREAM_ACCESS_DATE + " DESC LIMIT 1")
    @Nullable
    public abstract StreamHistoryEntity getLatestEntry(long streamId);

    @Query("DELETE FROM " + StreamHistoryEntity.STREAM_HISTORY_TABLE + " WHERE " + StreamHistoryEntity.JOIN_STREAM_ID + " = :streamId")
    public abstract int deleteStreamHistory(long streamId);

    @Query("SELECT * FROM " + StreamEntity.STREAM_TABLE

            // Select the latest entry and watch count for each stream id on history table
            + " INNER JOIN "
            + "(SELECT " + StreamHistoryEntity.JOIN_STREAM_ID + ", "
            + "  MAX(" + StreamHistoryEntity.STREAM_ACCESS_DATE + ") AS " + StreamStatisticsEntry.STREAM_LATEST_DATE + ", "
            + "  SUM(" + StreamHistoryEntity.STREAM_REPEAT_COUNT + ") AS " + StreamStatisticsEntry.STREAM_WATCH_COUNT
            + " FROM " + StreamHistoryEntity.STREAM_HISTORY_TABLE + " GROUP BY " + StreamHistoryEntity.JOIN_STREAM_ID + ")"

            + " ON " + StreamEntity.STREAM_ID + " = " + StreamHistoryEntity.JOIN_STREAM_ID

            + " LEFT JOIN "
            + "(SELECT " + StreamHistoryEntity.JOIN_STREAM_ID + " AS " + StreamStateEntity.JOIN_STREAM_ID_ALIAS + ", "
            +  StreamStateEntity.STREAM_PROGRESS_TIME
            + " FROM " + StreamStateEntity.STREAM_STATE_TABLE + " )"
            + " ON " + StreamEntity.STREAM_ID + " = " + StreamStateEntity.JOIN_STREAM_ID_ALIAS)
    public abstract Flowable<List<StreamStatisticsEntry>> getStatistics();
}
