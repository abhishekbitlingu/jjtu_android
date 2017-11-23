package com.example.neeladri.jjtu.dataModels;

import android.support.annotation.DrawableRes;

public class ContactUsModel {
    @DrawableRes
    private int mContactImageResId;
    private String mContactName;
    private String mDesignation;
    private String mLocation;
    private String mPhone;
    private String mEmail;

    public ContactUsModel(int contactImageResId, String contactName,
                          String designation, String location, String phone, String email) {
        this.mContactImageResId = contactImageResId;
        this.mContactName = contactName;
        this.mDesignation = designation;
        this.mLocation = location;
        this.mPhone = phone;
        this.mEmail = email;
    }

    public int getContactImageResId() {
        return mContactImageResId;
    }

    public void setContactImageResId(int contactImageResId) {
        this.mContactImageResId = contactImageResId;
    }

    public String getContactName() {
        return mContactName;
    }

    public void setContactName(String contactName) {
        this.mContactName = contactName;
    }

    public String getDesignation() {
        return mDesignation;
    }

    public void setDesignation(String designation) {
        this.mDesignation = designation;
    }

    public String getLocation() {
        return mLocation;
    }

    public void setLocation(String location) {
        this.mLocation = location;
    }

    public String getPhone() {
        return mPhone;
    }

    public void setPhone(String phone) {
        this.mPhone = phone;
    }

    public String getEmail() {
        return mEmail;
    }

    public void setEmail(String email) {
        this.mEmail = email;
    }
}