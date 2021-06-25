package org.blayboy.newpipe.database.history.dao;

import androidx.annotation.Nullable;
import androidx.room.Dao;
import androidx.room.Query;

import org.blayboy.newpipe.database.history.model.SearchHistoryEntry;
import org.blayboy.newpipe.database.history.model.SearchHistoryEntry;

import java.util.List;

import io.reactivex.rxjava3.core.Flowable;

import static org.blayboy.newpipe.database.history.model.SearchHistoryEntry.CREATION_DATE;
import static org.blayboy.newpipe.database.history.model.SearchHistoryEntry.ID;
import static org.blayboy.newpipe.database.history.model.SearchHistoryEntry.SEARCH;
import static org.blayboy.newpipe.database.history.model.SearchHistoryEntry.SERVICE_ID;
import static org.blayboy.newpipe.database.history.model.SearchHistoryEntry.TABLE_NAME;

@Dao
public interface SearchHistoryDAO extends HistoryDAO<SearchHistoryEntry> {
    String ORDER_BY_CREATION_DATE = " ORDER BY " + SearchHistoryEntry.CREATION_DATE + " DESC";

    @Query("SELECT * FROM " + SearchHistoryEntry.TABLE_NAME
            + " WHERE " + SearchHistoryEntry.ID + " = (SELECT MAX(" + SearchHistoryEntry.ID + ") FROM " + SearchHistoryEntry.TABLE_NAME + ")")
    @Nullable
    SearchHistoryEntry getLatestEntry();

    @Query("DELETE FROM " + SearchHistoryEntry.TABLE_NAME)
    @Override
    int deleteAll();

    @Query("DELETE FROM " + SearchHistoryEntry.TABLE_NAME + " WHERE " + SearchHistoryEntry.SEARCH + " = :query")
    int deleteAllWhereQuery(String query);

    @Query("SELECT * FROM " + SearchHistoryEntry.TABLE_NAME + ORDER_BY_CREATION_DATE)
    @Override
    Flowable<List<SearchHistoryEntry>> getAll();

    @Query("SELECT * FROM " + SearchHistoryEntry.TABLE_NAME + " GROUP BY " + SearchHistoryEntry.SEARCH + ORDER_BY_CREATION_DATE
            + " LIMIT :limit")
    Flowable<List<SearchHistoryEntry>> getUniqueEntries(int limit);

    @Query("SELECT * FROM " + SearchHistoryEntry.TABLE_NAME
            + " WHERE " + SearchHistoryEntry.SERVICE_ID + " = :serviceId" + ORDER_BY_CREATION_DATE)
    @Override
    Flowable<List<SearchHistoryEntry>> listByService(int serviceId);

    @Query("SELECT * FROM " + SearchHistoryEntry.TABLE_NAME + " WHERE " + SearchHistoryEntry.SEARCH + " LIKE :query || '%'"
            + " GROUP BY " + SearchHistoryEntry.SEARCH + " LIMIT :limit")
    Flowable<List<SearchHistoryEntry>> getSimilarEntries(String query, int limit);
}
