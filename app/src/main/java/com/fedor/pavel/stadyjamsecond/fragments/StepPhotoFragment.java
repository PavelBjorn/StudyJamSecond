package com.fedor.pavel.stadyjamsecond.fragments;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.fedor.pavel.stadyjamsecond.R;
import com.fedor.pavel.stadyjamsecond.models.StepModel;
import com.nostra13.universalimageloader.core.ImageLoader;

public class StepPhotoFragment extends Fragment {


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.item_vp_photos, container, false);

        ImageView imvPhoto = (ImageView) view.findViewById(R.id.view_pager_item_imv_photo);

        ImageLoader.getInstance().displayImage(getArguments().getString(StepModel.PHOTO_URL_KEY)
                , imvPhoto);

        return view;
    }
}
