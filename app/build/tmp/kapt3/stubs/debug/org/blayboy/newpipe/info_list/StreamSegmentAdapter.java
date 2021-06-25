package org.blayboy.newpipe.info_list;

import java.lang.System;

/**
 * Custom RecyclerView.Adapter/GroupieAdapter for [StreamSegmentItem] for handling selection state.
 */
@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0016B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005J\u000e\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eJ\u000e\u0010\u000f\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u0007J\u000e\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014J\b\u0010\u0015\u001a\u00020\fH\u0002R\u001e\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0007@BX\u0086\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0017"}, d2 = {"Lorg/blayboy/newpipe/info_list/StreamSegmentAdapter;", "Lcom/xwray/groupie/GroupAdapter;", "Lcom/xwray/groupie/GroupieViewHolder;", "listener", "Lorg/blayboy/newpipe/info_list/StreamSegmentAdapter$StreamSegmentListener;", "(Lorg/blayboy/newpipe/info_list/StreamSegmentAdapter$StreamSegmentListener;)V", "<set-?>", "", "currentIndex", "getCurrentIndex", "()I", "selectSegment", "", "segment", "Lorg/blayboy/newpipe/info_list/StreamSegmentItem;", "selectSegmentAt", "position", "setItems", "", "info", "Lorg/schabi/newpipe/extractor/stream/StreamInfo;", "unSelectCurrentSegment", "StreamSegmentListener", "app_debug"})
public final class StreamSegmentAdapter extends com.xwray.groupie.GroupAdapter<com.xwray.groupie.GroupieViewHolder> {
    private int currentIndex = 0;
    private final org.blayboy.newpipe.info_list.StreamSegmentAdapter.StreamSegmentListener listener = null;
    
    public final int getCurrentIndex() {
        return 0;
    }
    
    /**
     * Returns `true` if the provided [StreamInfo] contains segments, `false` otherwise.
     */
    public final boolean setItems(@org.jetbrains.annotations.NotNull()
    org.schabi.newpipe.extractor.stream.StreamInfo info) {
        return false;
    }
    
    public final void selectSegment(@org.jetbrains.annotations.NotNull()
    org.blayboy.newpipe.info_list.StreamSegmentItem segment) {
    }
    
    public final void selectSegmentAt(int position) {
    }
    
    private final void unSelectCurrentSegment() {
    }
    
    public StreamSegmentAdapter(@org.jetbrains.annotations.NotNull()
    org.blayboy.newpipe.info_list.StreamSegmentAdapter.StreamSegmentListener listener) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&\u00a8\u0006\b"}, d2 = {"Lorg/blayboy/newpipe/info_list/StreamSegmentAdapter$StreamSegmentListener;", "", "onItemClick", "", "item", "Lorg/blayboy/newpipe/info_list/StreamSegmentItem;", "seconds", "", "app_debug"})
    public static abstract interface StreamSegmentListener {
        
        public abstract void onItemClick(@org.jetbrains.annotations.NotNull()
        org.blayboy.newpipe.info_list.StreamSegmentItem item, int seconds);
    }
}