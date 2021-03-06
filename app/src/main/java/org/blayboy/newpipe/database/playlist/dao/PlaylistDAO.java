package org.blayboy.newpipe.database.playlist.dao;

import androidx.room.Dao;
import androidx.room.Query;

import org.blayboy.newpipe.database.BasicDAO;
import org.blayboy.newpipe.database.BasicDAO;
import org.blayboy.newpipe.database.playlist.model.PlaylistEntity;

import java.util.List;

import io.reactivex.rxjava3.core.Flowable;

import static org.blayboy.newpipe.database.playlist.model.PlaylistEntity.PLAYLIST_ID;
import static org.blayboy.newpipe.database.playlist.model.PlaylistEntity.PLAYLIST_TABLE;

@Dao
public abstract class PlaylistDAO implements BasicDAO<PlaylistEntity> {
    @Override
    @Query("SELECT * FROM " + PLAYLIST_TABLE)
    public abstract Flowable<List<PlaylistEntity>> getAll();

    @Override
    @Query("DELETE FROM " + PLAYLIST_TABLE)
    public abstract int deleteAll();

    @Override
    public Flowable<List<PlaylistEntity>> listByService(final int serviceId) {
        throw new UnsupportedOperationException();
    }

    @Query("SELECT * FROM " + PLAYLIST_TABLE + " WHERE " + PLAYLIST_ID + " = :playlistId")
    public abstract Flowable<List<PlaylistEntity>> getPlaylist(long playlistId);

    @Query("DELETE FROM " + PLAYLIST_TABLE + " WHERE " + PLAYLIST_ID + " = :playlistId")
    public abstract int deletePlaylist(long playlistId);

    @Query("SELECT COUNT(*) FROM " + PLAYLIST_TABLE)
    public abstract Flowable<Long> getCount();
}
