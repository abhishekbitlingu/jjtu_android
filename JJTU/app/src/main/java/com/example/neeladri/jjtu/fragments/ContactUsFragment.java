package com.example.neeladri.jjtu.fragments;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.neeladri.jjtu.R;
import com.example.neeladri.jjtu.adapters.ContactUsListAdapter;
import com.example.neeladri.jjtu.dataModels.ContactUsModel;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class ContactUsFragment extends Fragment {
    private ArrayList<ContactUsModel> mContactsList = new ArrayList<>();
    private RecyclerView mRecyclerView;
    private RecyclerView.Adapter mAdapter;


    public ContactUsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_contact_us, container, false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        mRecyclerView = view.findViewById(R.id.contact_us_recycler_view);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        mRecyclerView.setItemAnimator(new DefaultItemAnimator());
        prepareContactData();
        mAdapter = new ContactUsListAdapter(getContext(), mContactsList);
        mRecyclerView.setAdapter(mAdapter);
    }

    private void prepareContactData() {
        ContactUsModel model = new ContactUsModel(R.drawable.rakhee_kelaskar, "Dr. Rakhee P Kelaskar",
                "Dean, Research-Coordinator", "Mumbai, Maharashtra", "09820870624",
                "merakhi@gmail.com");
        mContactsList.add(model);
        model = new ContactUsModel(R.drawable.p_gopinath, "P Gopinath",
                "PS To Chancellor", "Jhunjhunu, Rajasthan", "09819695239",
                "patochancellor@jjtu.ac.in");
        mContactsList.add(model);
        model = new ContactUsModel(R.drawable.purnima_deshpande, "Dr. Purnima Deshpandey",
                "Research-Coordinator", "Mumbai, Maharashtra", "09820870624",
                "merakhi@gmail.com");
        mContactsList.add(model);
        model = new ContactUsModel(R.drawable.anju_singh, "Dr. Anju Singh",
                "coordinator", "Jhunjhunu, Rajasthan", "09323973505",
                "dr.anju@jjtu.ac.in");
        mContactsList.add(model);
        model = new ContactUsModel(R.drawable.ajit_kaswan, "Mr. Ajit Kaswan",
                "Research Department", "Jhunjhunu, Rajasthan", "08104883420",
                "phd@jjtu.ac.in");
        mContactsList.add(model);
        model = new ContactUsModel(R.drawable.ajit_kaswan, "Mr. Tabrez Khan",
                "Technical Assistant", "Mumbai, Maharashtra", "09769136568",
                "khantabrez92@gmail.com");
        mContactsList.add(model);
    }
}
