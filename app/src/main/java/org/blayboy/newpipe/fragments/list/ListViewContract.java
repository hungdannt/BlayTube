package org.blayboy.newpipe.fragments.list;

import org.blayboy.newpipe.fragments.ViewContract;
import org.blayboy.newpipe.fragments.ViewContract;

public interface ListViewContract<I, N> extends ViewContract<I> {
    void showListFooter(boolean show);

    void handleNextItems(N result);
}
