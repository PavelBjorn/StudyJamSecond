package com.fedor.pavel.stadyjamsecond;

import android.app.Application;
import android.graphics.Bitmap;

import com.nostra13.universalimageloader.core.DisplayImageOptions;
import com.nostra13.universalimageloader.core.ImageLoader;
import com.nostra13.universalimageloader.core.ImageLoaderConfiguration;
import com.nostra13.universalimageloader.core.assist.ImageScaleType;


public class App extends Application {

    public static final int MEMORY_CACHE_SIZE = 4 * 1024 * 1024;

    @Override
    public void onCreate() {
        super.onCreate();
        configureImageLoader();
    }

    public void configureImageLoader() {

        ImageLoaderConfiguration config = new ImageLoaderConfiguration.Builder(this)
                .memoryCacheSize(MEMORY_CACHE_SIZE)
                .defaultDisplayImageOptions(displayImageOptionsForGv())
                .build();

        ImageLoader.getInstance().init(config);

    }

    public static DisplayImageOptions displayImageOptionsForGv() {

        return new DisplayImageOptions.Builder()
                .cacheInMemory(true)
                .cacheOnDisk(false)
                .imageScaleType(ImageScaleType.IN_SAMPLE_POWER_OF_2)
                .bitmapConfig(Bitmap.Config.RGB_565)
                .build();

    }
}
