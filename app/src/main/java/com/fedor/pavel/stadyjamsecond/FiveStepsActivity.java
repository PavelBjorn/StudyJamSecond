package com.fedor.pavel.stadyjamsecond;

import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.widget.TextView;

import com.fedor.pavel.stadyjamsecond.adapters.ViewPagerPhotoAdapter;
import com.fedor.pavel.stadyjamsecond.models.StepModel;
import com.viewpagerindicator.CirclePageIndicator;
import com.viewpagerindicator.PageIndicator;

import java.util.ArrayList;

public class FiveStepsActivity extends AppCompatActivity implements ViewPager.OnPageChangeListener {

    private ViewPager mVpPhotos;
    private CirclePageIndicator mPageIndicator;
    private ViewPagerPhotoAdapter mAdapter;
    private TextView mTvTile, mTvDescription;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_five_steps);
        mAdapter = new ViewPagerPhotoAdapter(getSupportFragmentManager(), createSteps());
        findTextFields();
        prepareViewPager();
        preparePageIndicator();

    }

    private void preparePageIndicator() {
        mPageIndicator = (CirclePageIndicator) findViewById(R.id.activity_five_steps_indicator);
        if (mPageIndicator != null) {
            mPageIndicator.setViewPager(mVpPhotos);
        }
    }

    private void prepareViewPager() {
        mVpPhotos = (ViewPager) findViewById(R.id.activity_five_steps_vpPhoto);
        if (mVpPhotos != null) {
            mVpPhotos.setAdapter(mAdapter);
            mVpPhotos.addOnPageChangeListener(this);
        }
    }

    private void findTextFields() {
        mTvTile = (TextView) findViewById(R.id.activity_five_steps_tv_title);
        mTvTile.setText(mAdapter.getTitle(0));
        mTvDescription = (TextView) findViewById(R.id.activity_five_steps_description);
        mTvDescription.setText(mAdapter.getDescription(0));
    }

    private ArrayList<StepModel> createSteps() {
        ArrayList<StepModel> steps = new ArrayList<>();
        String[] stepsTitles = getResources().getStringArray(R.array.stepsTitles);
        String[] stepsPhotosURL = getResources().getStringArray(R.array.stepsPhotosUrl);
        String[] stepsDescriptions = getResources().getStringArray(R.array.stepsDescriptions);

        for (int i = 0; i < stepsTitles.length; i++) {
            steps.add(new StepModel(stepsTitles[i], stepsPhotosURL[i], stepsDescriptions[i]));
        }
        return steps;
    }


    @Override
    public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

    }

    @Override
    public void onPageSelected(int position) {
        mTvTile.setText(mAdapter.getTitle(position));
        mTvDescription.setText(mAdapter.getDescription(position));
    }

    @Override
    public void onPageScrollStateChanged(int state) {

    }
}
