package org.blayboy.newpipe.database.history.dao;

import org.blayboy.newpipe.database.BasicDAO;
import org.blayboy.newpipe.database.BasicDAO;

public interface HistoryDAO<T> extends BasicDAO<T> {
    T getLatestEntry();
}
