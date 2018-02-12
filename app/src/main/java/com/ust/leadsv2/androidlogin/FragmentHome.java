package com.ust.leadsv2.androidlogin;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by jessi on 2/12/2018.
 */

public class FragmentHome extends Fragment {

    View view;
    public FragmentHome() {
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.home_fragment,container,false);
        return view;
    }
}
