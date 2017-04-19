package com.lite.my.masterok;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.net.Uri;
import android.os.Vibrator;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.NavigationView;
import android.support.design.widget.Snackbar;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.PopupMenu;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;


public class Start_Activity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {

   // private AdView mAdView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar7);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                long mills = 15L;
                Vibrator vibrator = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);
                vibrator.vibrate(mills);
                final Intent intent = new Intent(Intent.ACTION_SEND);
                intent.setType("text/plain");
                String textToSend="https://play.google.com/store/apps/details?id=com.lite.my.masterok";
                intent.putExtra(Intent.EXTRA_TEXT, textToSend);
                try
                {
                    startActivity(Intent.createChooser(intent, "Поделится приложением"));
                }
                catch (android.content.ActivityNotFoundException ex)
                {
                    Toast.makeText(getApplicationContext(), "Some error", Toast.LENGTH_SHORT).show();
                }

            }
        });

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);

        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);


        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);



       // mAdView = (AdView) findViewById(R.id.adView);
        //AdRequest adRequest = new AdRequest.Builder().build();
       // mAdView.loadAd(adRequest);
        Button button = (Button) findViewById(R.id.button21);
        Button button2 = (Button) findViewById(R.id.button210);
        Button button3 = (Button) findViewById(R.id.button400);
        Button button4 = (Button) findViewById(R.id.button2412);
        Button button5 = (Button) findViewById(R.id.button4010);
        TextView textView = (TextView) findViewById(R.id.textView);


        button.setOnClickListener(viewClickListener);
        button2.setOnClickListener(viewClickListener2);
        button3.setOnClickListener(viewClickListener3);
        button4.setOnClickListener(viewClickListener4);
        button5.setOnClickListener(viewClickListener5);
//        textView.setOnClickListener(viewClickListener);



    }



    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @SuppressWarnings("StatementWithEmptyBody")

    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.you_tube) {

            long mills = 15L;
            Vibrator vibrator = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);
            vibrator.vibrate(mills);

            Intent intent = new Intent(Intent.ACTION_VIEW);
            intent.setData(Uri.parse("https://www.youtube.com/channel/UCevOw6a0SiaFm-TGHcogQEg"));
            startActivity(intent);


        } else if (id == R.id.market) {

            long mills = 15L;
            Vibrator vibrator = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);
            vibrator.vibrate(mills);

            Intent intent = new Intent(Intent.ACTION_VIEW);
            intent.setData(Uri.parse("https://play.google.com/store/apps/developer?id=Dastory+Studio"));
            startActivity(intent);


        } else if (id == R.id.pogertva) {

            long mills = 15L;
            Vibrator vibrator = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);
            vibrator.vibrate(mills);

            Intent a = new Intent(this,WebMoneyActivity.class);
            a.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
            startActivity(a);

        } else if (id == R.id.podelica) {

            long mills = 15L;
            Vibrator vibrator = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);
            vibrator.vibrate(mills);
            final Intent intent = new Intent(Intent.ACTION_SEND);
            intent.setType("text/plain");
            String textToSend="https://play.google.com/store/apps/details?id=com.lite.my.masterok";
            intent.putExtra(Intent.EXTRA_TEXT, textToSend);
            try
            {
                startActivity(Intent.createChooser(intent, "Поделится приложением"));
            }
            catch (android.content.ActivityNotFoundException ex)
            {
                Toast.makeText(getApplicationContext(), "Some error", Toast.LENGTH_SHORT).show();
            }

        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }

   /* @Override
    protected void onResume() {
        super.onResume();
        mAdView.resume();
    }

    @Override
    protected void onPause() {
        mAdView.pause();

        super.onPause();

    }

    @Override
    protected void onDestroy() {

        mAdView.destroy();
        super.onDestroy();
    }*/

    public void onClickElektro(View view) {
        Intent a = new Intent(this,Elektro_Activity.class);
        a.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(a);
        long mills = 15L;
        Vibrator vibrator = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);
        vibrator.vibrate(mills);
    }

    public void onClickKirpish(View view) {
        Intent a = new Intent(this,MainActivity.class);
        a.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(a);
        long mills = 15L;
        Vibrator vibrator = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);
        vibrator.vibrate(mills);
    }
    public void onClickBloki(View view) {
        Intent a = new Intent(this,BlokiActivity.class);
        a.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(a);
        long mills = 15L;
        Vibrator vibrator = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);
        vibrator.vibrate(mills);
    }
    public void onClickPlitka(View view) {
        Intent a = new Intent(this,Pol_Freza_stena_Activity.class);
        a.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(a);
        long mills = 15L;
        Vibrator vibrator = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);
        vibrator.vibrate(mills);
    }


    public void onClickFun8(View view) {
        Intent a = new Intent(this,Fun8Activity.class);
        a.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(a);
        long mills = 15L;
        Vibrator vibrator = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);
        vibrator.vibrate(mills);
    }
    public void onClickSt1(View view) {
        Intent a = new Intent(this,St1_Activity.class);
        a.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(a);
        long mills = 15L;
        Vibrator vibrator = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);
        vibrator.vibrate(mills);
    }

    public void onClick_M(View view) {
        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse("https://play.google.com/store/apps/developer?id=Dastory+Studio"));
        startActivity(intent);
        long mills = 15L;
        Vibrator vibrator = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);
        vibrator.vibrate(mills);
    }









    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }



    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id == R.id.action_settings) {

            Intent a = new Intent(this,HellpActivity.class);
            a.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
            startActivity(a);
            return true;

        } else if (id == R.id.action_settings4) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }









    View.OnClickListener viewClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            long mills = 15L;
            Vibrator vibrator = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);
            vibrator.vibrate(mills);


            showPopupMenu(v);
        }
    };

    private void showPopupMenu(View v) {
        PopupMenu popupMenu = new PopupMenu(this, v);
        popupMenu.inflate(R.menu.popupmenu); // Для Android 4.0
        // для версии Android 3.0 нужно использовать длинный вариант
        // popupMenu.getMenuInflater().inflate(R.menu.popupmenu,
        // popupMenu.getMenu());

        popupMenu
                .setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {

                    @Override
                    public boolean onMenuItemClick(MenuItem item) {
                        // Toast.makeText(PopupMenuDemoActivity.this,
                        // item.toString(), Toast.LENGTH_LONG).show();
                        // return true;
                        switch (item.getItemId()) {

                            case R.id.menu1:
                                //пол
                                Intent intent = new Intent(Start_Activity.this, Pol_Activity.class);
                                startActivity(intent);
                                long mills = 15L;
                                Vibrator vibrator = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);
                                vibrator.vibrate(mills);
                                return true;

                            case R.id.menu2:
                                //пол
                                Intent intent2 = new Intent(Start_Activity.this, Pol_Stena_Activity.class);
                                startActivity(intent2);
                                long mills2 = 15L;
                                Vibrator vibrator2 = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);
                                vibrator2.vibrate(mills2);

                                return true;

                            case R.id.menu3:
                                //пол
                                Intent intent3 = new Intent(Start_Activity.this, Pol_Freza_stena_Activity.class);
                                startActivity(intent3);
                                long mills3 = 15L;
                                Vibrator vibrator3 = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);
                                vibrator3.vibrate(mills3);



                                return true;
                            default:
                                return false;
                        }
                    }
                });







        popupMenu.setOnDismissListener(new PopupMenu.OnDismissListener() {

            @Override
            public void onDismiss(PopupMenu menu) {
                //Toast.makeText(getApplicationContext(), "onDismiss",
                       // Toast.LENGTH_SHORT).show();
            }
        });
        popupMenu.show();
    }

    View.OnClickListener viewClickListener2 = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            long mills = 15L;
            Vibrator vibrator = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);
            vibrator.vibrate(mills);


            showPopupMenu2(v);
        }
    };

    private void showPopupMenu2(View v2) {
        PopupMenu popupMenu = new PopupMenu(this, v2);
        popupMenu.inflate(R.menu.popupmenu2); // Для Android 4.0
        // для версии Android 3.0 нужно использовать длинный вариант
        // popupMenu.getMenuInflater().inflate(R.menu.popupmenu,
        // popupMenu.getMenu());

        popupMenu
                .setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {

                    @Override
                    public boolean onMenuItemClick(MenuItem item) {
                        // Toast.makeText(PopupMenuDemoActivity.this,
                        // item.toString(), Toast.LENGTH_LONG).show();
                        // return true;
                        switch (item.getItemId()) {

                            case R.id.menu7:
                                //пол
                                Intent intent = new Intent(Start_Activity.this, St1_Activity.class);
                                startActivity(intent);
                                long mills = 15L;
                                Vibrator vibrator = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);
                                vibrator.vibrate(mills);
                                return true;

                            case R.id.menu6:
                                //пол
                                Intent intent2 = new Intent(Start_Activity.this, St2_Activity.class);
                                startActivity(intent2);
                                long mills2 = 15L;
                                Vibrator vibrator2 = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);
                                vibrator2.vibrate(mills2);

                                return true;
                            case R.id.menu8:
                                //пол
                                Intent intent3 = new Intent(Start_Activity.this, Samo_S_Activity.class);
                                startActivity(intent3);
                                long mills3 = 15L;
                                Vibrator vibrator3 = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);
                                vibrator3.vibrate(mills3);

                                return true;
                            case R.id.menu9:
                                //пол
                                Intent intent4 = new Intent(Start_Activity.this, Samo_A_B_Activity.class);
                                startActivity(intent4);
                                long mills4 = 15L;
                                Vibrator vibrator4 = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);
                                vibrator4.vibrate(mills4);

                                return true;


                            default:
                                return false;
                        }
                    }
                });

        popupMenu.setOnDismissListener(new PopupMenu.OnDismissListener() {

            @Override
            public void onDismiss(PopupMenu menu) {
                //Toast.makeText(getApplicationContext(), "onDismiss",
                // Toast.LENGTH_SHORT).show();
            }
        });
        popupMenu.show();
    }


    View.OnClickListener viewClickListener3 = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            long mills = 15L;
            Vibrator vibrator = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);
            vibrator.vibrate(mills);


            showPopupMenu3(v);
        }
    };

    private void showPopupMenu3(View v2) {
        PopupMenu popupMenu = new PopupMenu(this, v2);
        popupMenu.inflate(R.menu.popupmenu4); // Для Android 4.0
        // для версии Android 3.0 нужно использовать длинный вариант
        // popupMenu.getMenuInflater().inflate(R.menu.popupmenu,
        // popupMenu.getMenu());

        popupMenu
                .setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {

                    @Override
                    public boolean onMenuItemClick(MenuItem item) {
                        // Toast.makeText(PopupMenuDemoActivity.this,
                        // item.toString(), Toast.LENGTH_LONG).show();
                        // return true;
                        switch (item.getItemId()) {

                            case R.id.menu2:
                                //пол
                                Intent intent = new Intent(Start_Activity.this, Shpaklevka_S_Activity.class);
                                startActivity(intent);
                                long mills = 15L;
                                Vibrator vibrator = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);
                                vibrator.vibrate(mills);
                                return true;

                            case R.id.menu3:
                                //пол
                                Intent intent2 = new Intent(Start_Activity.this, Shpaklevka_A_B_Activity.class);
                                startActivity(intent2);
                                long mills2 = 15L;
                                Vibrator vibrator2 = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);
                                vibrator2.vibrate(mills2);

                                return true;



                            default:
                                return false;
                        }
                    }
                });

        popupMenu.setOnDismissListener(new PopupMenu.OnDismissListener() {

            @Override
            public void onDismiss(PopupMenu menu) {
                //Toast.makeText(getApplicationContext(), "onDismiss",
                // Toast.LENGTH_SHORT).show();
            }
        });
        popupMenu.show();
    }

    View.OnClickListener viewClickListener4 = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            long mills = 15L;
            Vibrator vibrator = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);
            vibrator.vibrate(mills);


            showPopupMenu4(v);
        }
    };

    private void showPopupMenu4(View v2) {
        PopupMenu popupMenu = new PopupMenu(this, v2);
        popupMenu.inflate(R.menu.popupmenu5); // Для Android 4.0
        // для версии Android 3.0 нужно использовать длинный вариант
        // popupMenu.getMenuInflater().inflate(R.menu.popupmenu,
        // popupMenu.getMenu());

        popupMenu
                .setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {

                    @Override
                    public boolean onMenuItemClick(MenuItem item) {
                        // Toast.makeText(PopupMenuDemoActivity.this,
                        // item.toString(), Toast.LENGTH_LONG).show();
                        // return true;
                        switch (item.getItemId()) {

                            case R.id.menu6:
                                //пол
                                Intent intent = new Intent(Start_Activity.this, Plita1Activity.class);
                                startActivity(intent);
                                long mills = 15L;
                                Vibrator vibrator = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);
                                vibrator.vibrate(mills);
                                return true;

                            case R.id.menu7:
                                //пол
                                Intent intent2 = new Intent(Start_Activity.this, Plita2Activity.class);
                                startActivity(intent2);
                                long mills2 = 15L;
                                Vibrator vibrator2 = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);
                                vibrator2.vibrate(mills2);

                                return true;



                            default:
                                return false;
                        }
                    }
                });

        popupMenu.setOnDismissListener(new PopupMenu.OnDismissListener() {

            @Override
            public void onDismiss(PopupMenu menu) {
                //Toast.makeText(getApplicationContext(), "onDismiss",
                // Toast.LENGTH_SHORT).show();
            }
        });
        popupMenu.show();
    }






    View.OnClickListener viewClickListener5 = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            long mills = 15L;
            Vibrator vibrator = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);
            vibrator.vibrate(mills);


            showPopupMenu5(v);
        }
    };

    private void showPopupMenu5(View v2) {
        PopupMenu popupMenu = new PopupMenu(this, v2);
        popupMenu.inflate(R.menu.popupmenu6); // Для Android 4.0
        // для версии Android 3.0 нужно использовать длинный вариант
        // popupMenu.getMenuInflater().inflate(R.menu.popupmenu,
        // popupMenu.getMenu());

        popupMenu
                .setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {

                    @Override
                    public boolean onMenuItemClick(MenuItem item) {
                        // Toast.makeText(PopupMenuDemoActivity.this,
                        // item.toString(), Toast.LENGTH_LONG).show();
                        // return true;
                        switch (item.getItemId()) {

                            case R.id.menu8:
                                //пол
                                Intent intent = new Intent(Start_Activity.this, Kraska_S_Activity.class);
                                startActivity(intent);
                                long mills = 15L;
                                Vibrator vibrator = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);
                                vibrator.vibrate(mills);
                                return true;

                            case R.id.menu9:
                                //пол
                                Intent intent2 = new Intent(Start_Activity.this, Kraska_S_2_Activity.class);
                                startActivity(intent2);
                                long mills2 = 15L;
                               Vibrator vibrator2 = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);
                                vibrator2.vibrate(mills2);

                                return true;



                            default:
                                return false;
                        }
                    }
                });

        popupMenu.setOnDismissListener(new PopupMenu.OnDismissListener() {

            @Override
            public void onDismiss(PopupMenu menu) {
                //Toast.makeText(getApplicationContext(), "onDismiss",
                // Toast.LENGTH_SHORT).show();
            }
        });
        popupMenu.show();
    }

    public void onClick2222(View view) {
        Intent a = new Intent(this,Kraska_S_Activity.class);
        a.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(a);
    }


        }











