package com.example.neeladri.jjtu.fragments;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.neeladri.jjtu.R;
import com.example.neeladri.jjtu.adapters.FollowUsStaggeredGridAdapter;
import com.example.neeladri.jjtu.dataModels.FollowUsModel;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * A simple {@link Fragment} subclass.
 */
public class FollowUsFragment extends Fragment {


    private ArrayList<FollowUsModel> mFollowUsModelList = new ArrayList<>();

    public FollowUsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_follow_us, container, false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        RecyclerView recyclerView = view.findViewById(R.id.follow_us_staggered_recyclerView);
        // set a StaggeredGridLayoutManager with 3 number of columns and vertical orientation
        mFollowUsModelList.add(new FollowUsModel(R.drawable.facebook_logo,
                "https://m.facebook.com/JJTUniversityRajasthan"));
        mFollowUsModelList.add(new FollowUsModel(R.drawable.linkedin_logo,
                "https://www.linkedin.com/start/view-full-profile?" +
                        "_ed=0_2QRPKH1mG1-fMPauPuTcqPwHCRvxdZQHPRCdbYu5G36nEJMQGTBoV1jAB2FVRWlFQOIkhSWhrgJmeo7-hKh-nVEcRqGDTFUZBRVbL4HnJy" +
                        "_&trk=public_profile_ac-vf"));
        mFollowUsModelList.add(new FollowUsModel(R.drawable.youtube_logo,
                "https://m.youtube.com/channel/UCc4nCBsBrwzZOroliIY0e2A"));
        mFollowUsModelList.add(new FollowUsModel(R.drawable.twitter_logo,
                "https://mobile.twitter.com/officialjjtu"));
        StaggeredGridLayoutManager staggeredGridLayoutManager =
                new StaggeredGridLayoutManager(2, LinearLayoutManager.VERTICAL);
        recyclerView.setLayoutManager(staggeredGridLayoutManager); // set LayoutManager to RecyclerView
        //  call the constructor of CustomAdapter to send the reference and data to Adapter
        FollowUsStaggeredGridAdapter adapter = new FollowUsStaggeredGridAdapter(getContext(), mFollowUsModelList);
        recyclerView.setAdapter(adapter); // set the Adapter to RecyclerView

    }
}
