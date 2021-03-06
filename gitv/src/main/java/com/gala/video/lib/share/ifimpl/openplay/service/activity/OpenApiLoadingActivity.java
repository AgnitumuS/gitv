package com.gala.video.lib.share.ifimpl.openplay.service.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.gala.video.lib.framework.core.utils.LogUtils;
import com.gala.video.lib.share.R;

public class OpenApiLoadingActivity extends Activity {
    private final String TAG = "openplay/service/OpenApiLoadingActivity";
    private ImageView mLoadingLogoImage;
    private RelativeLayout mRelativeLayout;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.share_external_loading_page_activity);
        this.mRelativeLayout = (RelativeLayout) findViewById(R.id.share_loading_bg);
        this.mLoadingLogoImage = (ImageView) findViewById(R.id.share_progressbar_logo_image_id);
        LogUtils.d("openplay/service/OpenApiLoadingActivity", "onCreate--- ");
    }

    protected void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        setIntent(intent);
        LogUtils.d("openplay/service/OpenApiLoadingActivity", "onNewIntent--- ");
    }

    protected void onResume() {
        super.onResume();
        LogUtils.d("openplay/service/OpenApiLoadingActivity", "onResume---startAnimationDrawable--- ");
    }

    protected void onStop() {
        super.onStop();
        LogUtils.d("openplay/service/OpenApiLoadingActivity", "onStop---clearAnimation--- ");
    }

    protected void onDestroy() {
        super.onDestroy();
        LogUtils.d("openplay/service/OpenApiLoadingActivity", "LoadingActivity---onDestroy() ");
    }
}
