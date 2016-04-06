package com.fedor.pavel.stadyjamsecond.models;


public class StepModel {

    private String mTitle;
    private String mPhotoUrl;
    private String mDescription;

    public static final String PHOTO_URL_KEY = "mPhotoUrl";

    public StepModel() {
    }

    public StepModel(String mTitle, String mPhotoUrl, String mDescription) {
        this.mTitle = mTitle;
        this.mPhotoUrl = mPhotoUrl;
        this.mDescription = mDescription;
    }

    public String getmTitle() {
        return mTitle;
    }

    public void setmTitle(String mTitle) {
        this.mTitle = mTitle;
    }

    public String getmPhotoUrl() {
        return mPhotoUrl;
    }

    public void setmPhotoUrl(String mPhotoUrl) {
        this.mPhotoUrl = mPhotoUrl;
    }

    public String getmDescription() {
        return mDescription;
    }

    public void setmDescription(String mDescription) {
        this.mDescription = mDescription;
    }
}
