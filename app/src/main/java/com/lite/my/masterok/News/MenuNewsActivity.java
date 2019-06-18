package com.lite.my.masterok.News;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.net.ConnectivityManager;
import android.os.Bundle;
import android.os.Vibrator;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageButton;
import android.widget.TextView;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.InterstitialAd;
import com.lite.my.masterok.R;
import com.lite.my.masterok.Start_Activity;

import java.util.Timer;
import java.util.TimerTask;

public class MenuNewsActivity extends AppCompatActivity {


    //AdView mAdView;

    InterstitialAd mInterstitialAd;
    ImageButton mNewGameButton;

    private static int SPLASH_TIME_OUT = 5000;
    static Context context4;
    Timer t = new Timer();
    static Intent intent;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_news);

        ///Animation anim11 = AnimationUtils.loadAnimation(
        //        getApplicationContext(), R.anim.sms_anim);
       // final LinearLayout button11 = findViewById(R.id.liner);
       // button11.startAnimation(anim11);

        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
       // mAdView = (AdView) findViewById(R.id.adView2);
       // AdRequest adRequest = new AdRequest.Builder().build();
       // mAdView.loadAd(adRequest);

        mInterstitialAd = new InterstitialAd(this);
        //mInterstitialAd.setAdUnitId("");
        mInterstitialAd.setAdUnitId("ca-app-pub-4882550262749386/7088298282");

        mInterstitialAd.setAdListener(new AdListener() {
            @Override
            public void onAdClosed() {
                t.cancel();
            }
        });
        requestNewInterstitial();
        t.scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run() {
                runOnUiThread(new Runnable() {
                    @Override
                    public void run() {
                        t.cancel();
                        ConnectivityManager icheck = (ConnectivityManager) getSystemService(Context.CONNECTIVITY_SERVICE);
                        boolean mob = icheck.getActiveNetworkInfo() != null;
                        if(mob) {
                            if (mInterstitialAd.isLoaded()) {
                                mInterstitialAd.show();
                            } else {
                                beginPlayingGame();
                            }
                        } else {
                        }
                    }
                });
            }
        }, SPLASH_TIME_OUT, SPLASH_TIME_OUT);

    }



    public void onClickNewInovation(View view) {
        Intent a = new Intent(this,NewInoMaterialActivity.class);
        a.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(a);
        long mills = 15L;
        Vibrator vibrator = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);
        vibrator.vibrate(mills);

        Animation anim1 = AnimationUtils.loadAnimation(
                getApplicationContext(), R.anim.sms_anim);
        final TextView button1 = findViewById(R.id.textViewN1);
        button1.startAnimation(anim1);
    }

    public void onClickEkoStroyka(View view) {
        Intent a = new Intent(this,EkoStroykaActivity.class);
        a.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(a);
        long mills = 15L;
        Vibrator vibrator = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);
        vibrator.vibrate(mills);

        Animation anim2 = AnimationUtils.loadAnimation(
                getApplicationContext(), R.anim.sms_anim);
        final TextView button2 = findViewById(R.id.textViewN2);
        button2.startAnimation(anim2);
    }

    public void onClickStroimDom(View view) {
        Intent a = new Intent(this,StroimDomActivity.class);
        a.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(a);
        long mills = 15L;
        Vibrator vibrator = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);
        vibrator.vibrate(mills);

        Animation anim3 = AnimationUtils.loadAnimation(
                getApplicationContext(), R.anim.sms_anim);
        final TextView button3 = findViewById(R.id.textViewN3);
        button3.startAnimation(anim3);
    }

    public void onClickInoStroy(View view) {
        Intent a = new Intent(this,InoStroykaActivity.class);
        a.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(a);
        long mills = 15L;
        Vibrator vibrator = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);
        vibrator.vibrate(mills);

        Animation anim4 = AnimationUtils.loadAnimation(
                getApplicationContext(), R.anim.sms_anim);
        final TextView button4 = findViewById(R.id.textViewN4);
        button4.startAnimation(anim4);
    }

    public void onClickEnergo(View view) {
        Intent a = new Intent(this,EnergoEfektActivity.class);
        a.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(a);
        long mills = 15L;
        Vibrator vibrator = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);
        vibrator.vibrate(mills);

        Animation anim5 = AnimationUtils.loadAnimation(
                getApplicationContext(), R.anim.sms_anim);
        final TextView button5 = findViewById(R.id.textViewN5);
        button5.startAnimation(anim5);
    }


    public void onClickSteni(View view) {
        Intent a = new Intent(this,SteniActivity.class);
        a.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(a);
        long mills = 15L;
        Vibrator vibrator = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);
        vibrator.vibrate(mills);

        Animation anim7 = AnimationUtils.loadAnimation(
                getApplicationContext(), R.anim.sms_anim);
        final TextView button7 = findViewById(R.id.textViewN7);
        button7.startAnimation(anim7);
    }

    /*public void onClickNews(View view) {
        Intent a = new Intent(this,NewsActivity.class);
        a.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(a);
        long mills = 15L;
        Vibrator vibrator = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);
        vibrator.vibrate(mills);

        Animation anim6 = AnimationUtils.loadAnimation(
                getApplicationContext(), R.anim.sms_anim);
        final TextView button6 = findViewById(R.id.textViewN5);
        button6.startAnimation(anim6);
    }*/
    private void requestNewInterstitial() {

        AdRequest adRequest = new AdRequest.Builder()

                .addTestDevice("SEE_YOUR_LOGCAT_TO_GET_YOUR_DEVICE_ID")

                .build();
        mInterstitialAd.loadAd(adRequest);
    }
    private void beginPlayingGame() {
        // Play for a while, then display the New Game Button
    }
    @Override
    public void onBackPressed() {

        t.cancel();
        Intent a = new Intent(this, Start_Activity.class);
        a.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(a);
    }

}
