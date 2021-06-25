// Generated code from Icepick. Do not modify!
package org.blayboy.newpipe.local.feed;
import android.os.Bundle;
import icepick.Bundler;
import icepick.Injector.Helper;
import icepick.Injector.Object;

import java.util.Map;
import java.util.HashMap;

public class FeedFragment$$Icepick<T extends FeedFragment> extends org.blayboy.newpipe.fragments.BaseStateFragment$$Icepick<T> {

  private final static Map<String, Bundler<?>> BUNDLERS = new HashMap<String, Bundler<?>>();
  static {
      
  }

  private final static Helper H = new Helper("org.blayboy.newpipe.local.feed.FeedFragment$$Icepick.", BUNDLERS);

  public void restore(T target, Bundle state) {
    if (state == null) return;
    target.listState = H.getParcelable(state, "listState");
    super.restore(target, state);
  }

  public void save(T target, Bundle state) {
    super.save(target, state);
    H.putParcelable(state, "listState", target.listState);
  }
}