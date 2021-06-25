package org.blayboy.newpipe.database.stream

import androidx.room.ColumnInfo
import androidx.room.Embedded
import org.blayboy.newpipe.database.LocalItem
import org.blayboy.newpipe.database.history.model.StreamHistoryEntity
import org.blayboy.newpipe.database.stream.model.StreamEntity
import org.blayboy.newpipe.database.stream.model.StreamStateEntity.STREAM_PROGRESS_TIME
import org.schabi.newpipe.extractor.stream.StreamInfoItem
import java.time.OffsetDateTime

class StreamStatisticsEntry(
    @Embedded
    val streamEntity: StreamEntity,

    @ColumnInfo(name = STREAM_PROGRESS_TIME, defaultValue = "0")
    val progressTime: Long,

    @ColumnInfo(name = StreamHistoryEntity.JOIN_STREAM_ID)
    val streamId: Long,

    @ColumnInfo(name = STREAM_LATEST_DATE)
    val latestAccessDate: OffsetDateTime,

    @ColumnInfo(name = STREAM_WATCH_COUNT)
    val watchCount: Long
) : LocalItem {
    fun toStreamInfoItem(): StreamInfoItem {
        val item = StreamInfoItem(streamEntity.serviceId, streamEntity.url, streamEntity.title, streamEntity.streamType)
        item.duration = streamEntity.duration
        item.uploaderName = streamEntity.uploader
        item.thumbnailUrl = streamEntity.thumbnailUrl

        return item
    }

    override fun getLocalItemType(): LocalItem.LocalItemType {
        return LocalItem.LocalItemType.STATISTIC_STREAM_ITEM
    }

    companion object {
        const val STREAM_LATEST_DATE = "latestAccess"
        const val STREAM_WATCH_COUNT = "watchCount"
    }
}
