package com.example.neeladri.jjtu.adapters;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.example.neeladri.jjtu.R;
import com.example.neeladri.jjtu.activities.WebViewActivity;
import com.example.neeladri.jjtu.dataModels.FollowUsModel;

import java.util.ArrayList;

public class FollowUsStaggeredGridAdapter extends RecyclerView.Adapter {
    private static final String ARG_URL = "url";
    private ArrayList<FollowUsModel> mFollowUsModelList;
    private Context mContext;

    public FollowUsStaggeredGridAdapter(Context context, ArrayList<FollowUsModel> followUsModels) {
        this.mContext = context;
        this.mFollowUsModelList = followUsModels;
    }

    @Override
    public StaggeredViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.staggered_grid_item, parent, false);
        return new StaggeredViewHolder(v);
    }

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        StaggeredViewHolder vh = (StaggeredViewHolder) holder;
        final FollowUsModel followUsModel = mFollowUsModelList.get(position);
        vh.image.setImageResource(followUsModel.getDrawableResId());
        vh.image.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(mContext, WebViewActivity.class);
                intent.putExtra(ARG_URL, followUsModel.getUrl());
                mContext.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return mFollowUsModelList.size();
    }

    public class StaggeredViewHolder extends RecyclerView.ViewHolder {
        ImageView image;

        public StaggeredViewHolder(View itemView) {
            super(itemView);
            image = (ImageView) itemView.findViewById(R.id.follow_us_social_logo_image);
        }
    }
}