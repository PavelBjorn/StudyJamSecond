package com.fedor.pavel.stadyjamsecond;

import android.content.Intent;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageView;

import com.nostra13.universalimageloader.core.ImageLoader;

public class TitleActivity extends AppCompatActivity {

    public static final String LOGO_URL = "assets://logo.png";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_title);

        ImageView imvLogo = (ImageView) findViewById(R.id.activity_title_imvLogo);
        if (imvLogo != null) {
            ImageLoader.getInstance().displayImage(LOGO_URL, imvLogo);
        }

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fabStart = (FloatingActionButton) findViewById(R.id.fab_start);
        if (fabStart != null) {
            fabStart.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    startActivity(new Intent(TitleActivity.this, FiveStepsActivity.class));
                }
            });
        }
    }
}
