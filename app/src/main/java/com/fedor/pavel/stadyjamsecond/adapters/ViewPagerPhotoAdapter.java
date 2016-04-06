package com.fedor.pavel.stadyjamsecond.adapters;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;


import com.fedor.pavel.stadyjamsecond.fragments.StepPhotoFragment;
import com.fedor.pavel.stadyjamsecond.models.StepModel;

import java.util.List;


public class ViewPagerPhotoAdapter extends FragmentStatePagerAdapter {

    private List<StepModel> steps;

    public String getTitle(int position) {
        return steps.get(position).getmTitle();
    }

    public String getDescription(int position) {
        return steps.get(position).getmDescription();
    }

    public ViewPagerPhotoAdapter(FragmentManager fm, List<StepModel> steps) {
        super(fm);
        this.steps = steps;
    }

    @Override
    public Fragment getItem(int position) {
        StepPhotoFragment fragment = new StepPhotoFragment();
        Bundle photoUri = new Bundle();
        photoUri.putString(StepModel.PHOTO_URL_KEY, steps.get(position).getmPhotoUrl());
        fragment.setArguments(photoUri);
        return fragment;
    }

    @Override
    public int getCount() {
        return steps.size();
    }


}
