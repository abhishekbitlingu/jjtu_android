package com.example.neeladri.jjtu.dataModels;

import android.support.annotation.DrawableRes;

public class FollowUsModel {
    public FollowUsModel() {
        // default constructor
    }

    public FollowUsModel(int mDrawableResId, String mUrl) {
        this.mDrawableResId = mDrawableResId;
        this.mUrl = mUrl;
    }

    @DrawableRes
    private int mDrawableResId;
    private String mUrl;

    @DrawableRes
    public int getDrawableResId() {
        return mDrawableResId;
    }

    public void setDrawableResId(int drawableResId) {
        this.mDrawableResId = drawableResId;
    }

    public String getUrl() {
        return mUrl;
    }

    public void setUrl(String url) {
        this.mUrl = url;
    }
}