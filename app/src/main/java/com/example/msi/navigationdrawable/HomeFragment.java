package com.example.msi.navigationdrawable;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by msi on 6/1/2018.
 */

public  class HomeFragment extends Fragment {


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle savedInstanceState)
    {
        return inflater.inflate(R.layout.fragment_home,viewGroup,false);
    }
}
