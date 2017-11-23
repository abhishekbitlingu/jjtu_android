package com.example.neeladri.jjtu.adapters;

import android.content.Context;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.neeladri.jjtu.R;
import com.example.neeladri.jjtu.dataModels.ContactUsModel;

import java.util.ArrayList;

public class ContactUsListAdapter extends RecyclerView.Adapter{
    private ArrayList<ContactUsModel> mContactModelList;
    private Context mContext;

    public ContactUsListAdapter(Context context, ArrayList<ContactUsModel> contactUsModels) {
        this.mContext = context;
        this.mContactModelList = contactUsModels;
    }

    @Override
    public ContactUsListAdapter.ContactUsListViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.contact_us_item_view, parent, false);
        return new ContactUsListAdapter.ContactUsListViewHolder(v);
    }

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        ContactUsListAdapter.ContactUsListViewHolder vh = (ContactUsListAdapter.ContactUsListViewHolder) holder;
        final ContactUsModel contactUsModel = mContactModelList.get(position);
        vh.mImage.setImageResource(contactUsModel.getContactImageResId());
        vh.mName.setText(contactUsModel.getContactName());
        vh.mDesignation.setText(contactUsModel.getDesignation());
        vh.mLocation.setText(contactUsModel.getLocation());
    }

    @Override
    public int getItemCount() {
        return mContactModelList.size();
    }

    public class ContactUsListViewHolder extends RecyclerView.ViewHolder {
        ImageView mImage;
        TextView mName;
        TextView mDesignation;
        TextView mLocation;

        public ContactUsListViewHolder(View itemView) {
            super(itemView);
            mImage = itemView.findViewById(R.id.contact_image);
            mName = itemView.findViewById(R.id.contact_name);
            mDesignation = itemView.findViewById(R.id.contact_designation);
            mLocation = itemView.findViewById(R.id.contact_location);
        }
    }
}