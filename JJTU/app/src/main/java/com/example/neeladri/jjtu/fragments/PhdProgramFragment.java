package com.example.neeladri.jjtu.fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.neeladri.jjtu.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class PhdProgramFragment extends Fragment {


    public PhdProgramFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_phd_program, container, false);
    }

}
