package org.blayboy.newpipe.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.Nullable;

import org.blayboy.newpipe.BaseFragment;
import org.blayboy.newpipe.BaseFragment;
import org.blayboy.newpipe.R;

public class BlankFragment extends BaseFragment {
    @Nullable
    @Override
    public View onCreateView(final LayoutInflater inflater, @Nullable final ViewGroup container,
                             final Bundle savedInstanceState) {
        setTitle("BlayTube");
        return inflater.inflate(R.layout.fragment_blank, container, false);
    }

    @Override
    public void setUserVisibleHint(final boolean isVisibleToUser) {
        super.setUserVisibleHint(isVisibleToUser);
        setTitle("BlayTube");
    }
}
