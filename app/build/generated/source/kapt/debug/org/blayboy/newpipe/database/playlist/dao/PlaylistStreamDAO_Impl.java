package org.blayboy.newpipe.database.playlist.dao;

import android.database.Cursor;
import androidx.room.EntityDeletionOrUpdateAdapter;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.SharedSQLiteStatement;
import androidx.room.rxjava3.RxRoom;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import io.reactivex.rxjava3.core.Flowable;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.Exception;
import java.lang.Integer;
import java.lang.Long;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
import org.blayboy.newpipe.database.Converters;
import org.blayboy.newpipe.database.playlist.PlaylistMetadataEntry;
import org.blayboy.newpipe.database.playlist.PlaylistStreamEntry;
import org.blayboy.newpipe.database.playlist.model.PlaylistStreamEntity;
import org.blayboy.newpipe.database.stream.model.StreamEntity;
import org.schabi.newpipe.extractor.stream.StreamType;

@SuppressWarnings({"unchecked", "deprecation"})
public final class PlaylistStreamDAO_Impl extends PlaylistStreamDAO {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<PlaylistStreamEntity> __insertionAdapterOfPlaylistStreamEntity;

  private final EntityDeletionOrUpdateAdapter<PlaylistStreamEntity> __deletionAdapterOfPlaylistStreamEntity;

  private final EntityDeletionOrUpdateAdapter<PlaylistStreamEntity> __updateAdapterOfPlaylistStreamEntity;

  private final SharedSQLiteStatement __preparedStmtOfDeleteAll;

  private final SharedSQLiteStatement __preparedStmtOfDeleteBatch;

  public PlaylistStreamDAO_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfPlaylistStreamEntity = new EntityInsertionAdapter<PlaylistStreamEntity>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR ABORT INTO `playlist_stream_join` (`playlist_id`,`stream_id`,`join_index`) VALUES (?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, PlaylistStreamEntity value) {
        stmt.bindLong(1, value.getPlaylistUid());
        stmt.bindLong(2, value.getStreamUid());
        stmt.bindLong(3, value.getIndex());
      }
    };
    this.__deletionAdapterOfPlaylistStreamEntity = new EntityDeletionOrUpdateAdapter<PlaylistStreamEntity>(__db) {
      @Override
      public String createQuery() {
        return "DELETE FROM `playlist_stream_join` WHERE `playlist_id` = ? AND `join_index` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, PlaylistStreamEntity value) {
        stmt.bindLong(1, value.getPlaylistUid());
        stmt.bindLong(2, value.getIndex());
      }
    };
    this.__updateAdapterOfPlaylistStreamEntity = new EntityDeletionOrUpdateAdapter<PlaylistStreamEntity>(__db) {
      @Override
      public String createQuery() {
        return "UPDATE OR ABORT `playlist_stream_join` SET `playlist_id` = ?,`stream_id` = ?,`join_index` = ? WHERE `playlist_id` = ? AND `join_index` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, PlaylistStreamEntity value) {
        stmt.bindLong(1, value.getPlaylistUid());
        stmt.bindLong(2, value.getStreamUid());
        stmt.bindLong(3, value.getIndex());
        stmt.bindLong(4, value.getPlaylistUid());
        stmt.bindLong(5, value.getIndex());
      }
    };
    this.__preparedStmtOfDeleteAll = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "DELETE FROM playlist_stream_join";
        return _query;
      }
    };
    this.__preparedStmtOfDeleteBatch = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "DELETE FROM playlist_stream_join WHERE playlist_id = ?";
        return _query;
      }
    };
  }

  @Override
  public long insert(final PlaylistStreamEntity entity) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      long _result = __insertionAdapterOfPlaylistStreamEntity.insertAndReturnId(entity);
      __db.setTransactionSuccessful();
      return _result;
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public List<Long> insertAll(final PlaylistStreamEntity... entities) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      List<Long> _result = __insertionAdapterOfPlaylistStreamEntity.insertAndReturnIdsList(entities);
      __db.setTransactionSuccessful();
      return _result;
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public List<Long> insertAll(final Collection<PlaylistStreamEntity> entities) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      List<Long> _result = __insertionAdapterOfPlaylistStreamEntity.insertAndReturnIdsList(entities);
      __db.setTransactionSuccessful();
      return _result;
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void delete(final PlaylistStreamEntity entity) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __deletionAdapterOfPlaylistStreamEntity.handle(entity);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public int delete(final Collection<PlaylistStreamEntity> entities) {
    __db.assertNotSuspendingTransaction();
    int _total = 0;
    __db.beginTransaction();
    try {
      _total +=__deletionAdapterOfPlaylistStreamEntity.handleMultiple(entities);
      __db.setTransactionSuccessful();
      return _total;
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public int update(final PlaylistStreamEntity entity) {
    __db.assertNotSuspendingTransaction();
    int _total = 0;
    __db.beginTransaction();
    try {
      _total +=__updateAdapterOfPlaylistStreamEntity.handle(entity);
      __db.setTransactionSuccessful();
      return _total;
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void update(final Collection<PlaylistStreamEntity> entities) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __updateAdapterOfPlaylistStreamEntity.handleMultiple(entities);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public int deleteAll() {
    __db.assertNotSuspendingTransaction();
    final SupportSQLiteStatement _stmt = __preparedStmtOfDeleteAll.acquire();
    __db.beginTransaction();
    try {
      final int _result = _stmt.executeUpdateDelete();
      __db.setTransactionSuccessful();
      return _result;
    } finally {
      __db.endTransaction();
      __preparedStmtOfDeleteAll.release(_stmt);
    }
  }

  @Override
  public void deleteBatch(final long playlistId) {
    __db.assertNotSuspendingTransaction();
    final SupportSQLiteStatement _stmt = __preparedStmtOfDeleteBatch.acquire();
    int _argIndex = 1;
    _stmt.bindLong(_argIndex, playlistId);
    __db.beginTransaction();
    try {
      _stmt.executeUpdateDelete();
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
      __preparedStmtOfDeleteBatch.release(_stmt);
    }
  }

  @Override
  public Flowable<List<PlaylistStreamEntity>> getAll() {
    final String _sql = "SELECT * FROM playlist_stream_join";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return RxRoom.createFlowable(__db, false, new String[]{"playlist_stream_join"}, new Callable<List<PlaylistStreamEntity>>() {
      @Override
      public List<PlaylistStreamEntity> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfPlaylistUid = CursorUtil.getColumnIndexOrThrow(_cursor, "playlist_id");
          final int _cursorIndexOfStreamUid = CursorUtil.getColumnIndexOrThrow(_cursor, "stream_id");
          final int _cursorIndexOfIndex = CursorUtil.getColumnIndexOrThrow(_cursor, "join_index");
          final List<PlaylistStreamEntity> _result = new ArrayList<PlaylistStreamEntity>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final PlaylistStreamEntity _item;
            final long _tmpPlaylistUid;
            _tmpPlaylistUid = _cursor.getLong(_cursorIndexOfPlaylistUid);
            final long _tmpStreamUid;
            _tmpStreamUid = _cursor.getLong(_cursorIndexOfStreamUid);
            final int _tmpIndex;
            _tmpIndex = _cursor.getInt(_cursorIndexOfIndex);
            _item = new PlaylistStreamEntity(_tmpPlaylistUid,_tmpStreamUid,_tmpIndex);
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }

  @Override
  public Flowable<Integer> getMaximumIndexOf(final long playlistId) {
    final String _sql = "SELECT COALESCE(MAX(join_index), -1) FROM playlist_stream_join WHERE playlist_id = ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    _statement.bindLong(_argIndex, playlistId);
    return RxRoom.createFlowable(__db, false, new String[]{"playlist_stream_join"}, new Callable<Integer>() {
      @Override
      public Integer call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final Integer _result;
          if(_cursor.moveToFirst()) {
            final Integer _tmp;
            if (_cursor.isNull(0)) {
              _tmp = null;
            } else {
              _tmp = _cursor.getInt(0);
            }
            _result = _tmp;
          } else {
            _result = null;
          }
          return _result;
        } finally {
          _cursor.close();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }

  @Override
  public Flowable<List<PlaylistStreamEntry>> getOrderedStreamsOf(final long playlistId) {
    final String _sql = "SELECT * FROM streams INNER JOIN (SELECT stream_id,join_index FROM playlist_stream_join WHERE playlist_id = ?) ON uid = stream_id LEFT JOIN (SELECT stream_id AS stream_id_alias, progress_time FROM stream_state ) ON uid = stream_id_alias ORDER BY join_index ASC";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    _statement.bindLong(_argIndex, playlistId);
    return RxRoom.createFlowable(__db, true, new String[]{"streams","playlist_stream_join","stream_state"}, new Callable<List<PlaylistStreamEntry>>() {
      @Override
      public List<PlaylistStreamEntry> call() throws Exception {
        __db.beginTransaction();
        try {
          final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
          try {
            final int _cursorIndexOfUid = CursorUtil.getColumnIndexOrThrow(_cursor, "uid");
            final int _cursorIndexOfServiceId = CursorUtil.getColumnIndexOrThrow(_cursor, "service_id");
            final int _cursorIndexOfUrl = CursorUtil.getColumnIndexOrThrow(_cursor, "url");
            final int _cursorIndexOfTitle = CursorUtil.getColumnIndexOrThrow(_cursor, "title");
            final int _cursorIndexOfStreamType = CursorUtil.getColumnIndexOrThrow(_cursor, "stream_type");
            final int _cursorIndexOfDuration = CursorUtil.getColumnIndexOrThrow(_cursor, "duration");
            final int _cursorIndexOfUploader = CursorUtil.getColumnIndexOrThrow(_cursor, "uploader");
            final int _cursorIndexOfThumbnailUrl = CursorUtil.getColumnIndexOrThrow(_cursor, "thumbnail_url");
            final int _cursorIndexOfViewCount = CursorUtil.getColumnIndexOrThrow(_cursor, "view_count");
            final int _cursorIndexOfTextualUploadDate = CursorUtil.getColumnIndexOrThrow(_cursor, "textual_upload_date");
            final int _cursorIndexOfUploadDate = CursorUtil.getColumnIndexOrThrow(_cursor, "upload_date");
            final int _cursorIndexOfIsUploadDateApproximation = CursorUtil.getColumnIndexOrThrow(_cursor, "is_upload_date_approximation");
            final int _cursorIndexOfStreamId = CursorUtil.getColumnIndexOrThrow(_cursor, "stream_id");
            final int _cursorIndexOfJoinIndex = CursorUtil.getColumnIndexOrThrow(_cursor, "join_index");
            final int _cursorIndexOfProgressTime = CursorUtil.getColumnIndexOrThrow(_cursor, "progress_time");
            final List<PlaylistStreamEntry> _result = new ArrayList<PlaylistStreamEntry>(_cursor.getCount());
            while(_cursor.moveToNext()) {
              final PlaylistStreamEntry _item;
              final long _tmpStreamId;
              _tmpStreamId = _cursor.getLong(_cursorIndexOfStreamId);
              final int _tmpJoinIndex;
              _tmpJoinIndex = _cursor.getInt(_cursorIndexOfJoinIndex);
              final long _tmpProgressTime;
              _tmpProgressTime = _cursor.getLong(_cursorIndexOfProgressTime);
              final StreamEntity _tmpStreamEntity;
              if (! (_cursor.isNull(_cursorIndexOfUid) && _cursor.isNull(_cursorIndexOfServiceId) && _cursor.isNull(_cursorIndexOfUrl) && _cursor.isNull(_cursorIndexOfTitle) && _cursor.isNull(_cursorIndexOfStreamType) && _cursor.isNull(_cursorIndexOfDuration) && _cursor.isNull(_cursorIndexOfUploader) && _cursor.isNull(_cursorIndexOfThumbnailUrl) && _cursor.isNull(_cursorIndexOfViewCount) && _cursor.isNull(_cursorIndexOfTextualUploadDate) && _cursor.isNull(_cursorIndexOfUploadDate) && _cursor.isNull(_cursorIndexOfIsUploadDateApproximation))) {
                final long _tmpUid;
                _tmpUid = _cursor.getLong(_cursorIndexOfUid);
                final int _tmpServiceId;
                _tmpServiceId = _cursor.getInt(_cursorIndexOfServiceId);
                final String _tmpUrl;
                _tmpUrl = _cursor.getString(_cursorIndexOfUrl);
                final String _tmpTitle;
                _tmpTitle = _cursor.getString(_cursorIndexOfTitle);
                final StreamType _tmpStreamType;
                final String _tmp;
                _tmp = _cursor.getString(_cursorIndexOfStreamType);
                _tmpStreamType = Converters.streamTypeOf(_tmp);
                final long _tmpDuration;
                _tmpDuration = _cursor.getLong(_cursorIndexOfDuration);
                final String _tmpUploader;
                _tmpUploader = _cursor.getString(_cursorIndexOfUploader);
                final String _tmpThumbnailUrl;
                _tmpThumbnailUrl = _cursor.getString(_cursorIndexOfThumbnailUrl);
                final Long _tmpViewCount;
                if (_cursor.isNull(_cursorIndexOfViewCount)) {
                  _tmpViewCount = null;
                } else {
                  _tmpViewCount = _cursor.getLong(_cursorIndexOfViewCount);
                }
                final String _tmpTextualUploadDate;
                _tmpTextualUploadDate = _cursor.getString(_cursorIndexOfTextualUploadDate);
                final OffsetDateTime _tmpUploadDate;
                final Long _tmp_1;
                if (_cursor.isNull(_cursorIndexOfUploadDate)) {
                  _tmp_1 = null;
                } else {
                  _tmp_1 = _cursor.getLong(_cursorIndexOfUploadDate);
                }
                _tmpUploadDate = Converters.offsetDateTimeFromTimestamp(_tmp_1);
                final Boolean _tmpIsUploadDateApproximation;
                final Integer _tmp_2;
                if (_cursor.isNull(_cursorIndexOfIsUploadDateApproximation)) {
                  _tmp_2 = null;
                } else {
                  _tmp_2 = _cursor.getInt(_cursorIndexOfIsUploadDateApproximation);
                }
                _tmpIsUploadDateApproximation = _tmp_2 == null ? null : _tmp_2 != 0;
                _tmpStreamEntity = new StreamEntity(_tmpUid,_tmpServiceId,_tmpUrl,_tmpTitle,_tmpStreamType,_tmpDuration,_tmpUploader,_tmpThumbnailUrl,_tmpViewCount,_tmpTextualUploadDate,_tmpUploadDate,_tmpIsUploadDateApproximation);
              }  else  {
                _tmpStreamEntity = null;
              }
              _item = new PlaylistStreamEntry(_tmpStreamEntity,_tmpProgressTime,_tmpStreamId,_tmpJoinIndex);
              _result.add(_item);
            }
            __db.setTransactionSuccessful();
            return _result;
          } finally {
            _cursor.close();
          }
        } finally {
          __db.endTransaction();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }

  @Override
  public Flowable<List<PlaylistMetadataEntry>> getPlaylistMetadata() {
    final String _sql = "SELECT uid, name, thumbnail_url, COALESCE(COUNT(playlist_id), 0) AS streamCount FROM playlists LEFT JOIN playlist_stream_join ON uid = playlist_id GROUP BY playlist_id ORDER BY name COLLATE NOCASE ASC";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return RxRoom.createFlowable(__db, true, new String[]{"playlists","playlist_stream_join"}, new Callable<List<PlaylistMetadataEntry>>() {
      @Override
      public List<PlaylistMetadataEntry> call() throws Exception {
        __db.beginTransaction();
        try {
          final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
          try {
            final int _cursorIndexOfUid = CursorUtil.getColumnIndexOrThrow(_cursor, "uid");
            final int _cursorIndexOfName = CursorUtil.getColumnIndexOrThrow(_cursor, "name");
            final int _cursorIndexOfThumbnailUrl = CursorUtil.getColumnIndexOrThrow(_cursor, "thumbnail_url");
            final int _cursorIndexOfStreamCount = CursorUtil.getColumnIndexOrThrow(_cursor, "streamCount");
            final List<PlaylistMetadataEntry> _result = new ArrayList<PlaylistMetadataEntry>(_cursor.getCount());
            while(_cursor.moveToNext()) {
              final PlaylistMetadataEntry _item;
              final long _tmpUid;
              _tmpUid = _cursor.getLong(_cursorIndexOfUid);
              final String _tmpName;
              _tmpName = _cursor.getString(_cursorIndexOfName);
              final String _tmpThumbnailUrl;
              _tmpThumbnailUrl = _cursor.getString(_cursorIndexOfThumbnailUrl);
              final long _tmpStreamCount;
              _tmpStreamCount = _cursor.getLong(_cursorIndexOfStreamCount);
              _item = new PlaylistMetadataEntry(_tmpUid,_tmpName,_tmpThumbnailUrl,_tmpStreamCount);
              _result.add(_item);
            }
            __db.setTransactionSuccessful();
            return _result;
          } finally {
            _cursor.close();
          }
        } finally {
          __db.endTransaction();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }

  public static List<Class<?>> getRequiredConverters() {
    return Collections.emptyList();
  }
}
