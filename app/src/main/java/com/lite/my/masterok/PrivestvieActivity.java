package com.lite.my.masterok;

import android.app.Activity;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.os.Handler;
import android.view.WindowManager;

public class PrivestvieActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_privet);




        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
//        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent i = new Intent(PrivestvieActivity.this, Start_Activity.class);
                startActivity(i);
                finish();
            }
        }, 2*500);
    }




    @Override
    public void onBackPressed() {
        // do something on back.

        android.os.Process.killProcess(android.os.Process.myPid());
    }


}
