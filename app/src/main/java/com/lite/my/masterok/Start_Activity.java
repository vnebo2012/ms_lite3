package com.lite.my.masterok;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ActivityInfo;
import android.hardware.Camera;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.Bundle;
import android.os.Vibrator;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.PopupMenu;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

import com.lite.my.masterok.Chat.ChatActivity;
import com.lite.my.masterok.Lumex.LumexActivity;
import com.lite.my.masterok.News.MenuNewsActivity;


public class Start_Activity extends AppCompatActivity {


    final Context context2 = this;
    boolean flag = true;
    Context context;
    private Switch mSwitch;
    private Camera camera;
    Context context5;
    Context context6;
    Context context7;

    final String MY_SETTINGS2 = "saved_text_oc2";



    final String MY_SETTINGS = "saved_text_stg100011";

    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {


        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {

                case R.id.na1:

                    ConnectivityManager icheck = (ConnectivityManager) getSystemService(Context.CONNECTIVITY_SERVICE);
                    boolean mob = icheck.getActiveNetworkInfo() != null;
                    if(mob) {

                        Intent intent21 = getPackageManager().getLaunchIntentForPackage("mobi.appplus.calculator.plus");
                        if (intent21 != null) {
                            // We found the activity now start the activity
                            intent21.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                            startActivity(intent21);
                        } else {

                            long mills = 15L;
                            Vibrator vibrator = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);
                            vibrator.vibrate(mills);
                            Intent intent = getPackageManager().getLaunchIntentForPackage("com.google.android.calculator");
                            if (intent != null) {
                                // We found the activity now start the activity
                                intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                                startActivity(intent);

                            } else {

                                Intent intent2 = getPackageManager().getLaunchIntentForPackage("mobi.appplus.calculator.plus");
                                if (intent2 != null) {
                                    // We found the activity now start the activity
                                    intent2.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                                    startActivity(intent2);
                                } else {

                                    // Bring user to the market or let them choose an app?
                                    intent = new Intent(Intent.ACTION_VIEW);
                                    intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                                    intent.setData(Uri.parse("market://details?id=" + "mobi.appplus.calculator.plus"));
                                    startActivity(intent);
                                }
                            }

                        }

                    } else {

                        Toast toast = Toast.makeText(getApplicationContext(),
                                "Отсутствует интернет!", Toast.LENGTH_SHORT);

                        toast.show();

                    }

                    return true;

                case R.id.na2:

                    Intent a = new Intent(Start_Activity.this,PoiskActivity.class);
                    a.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                    startActivity(a);

                    long mills4 = 45L;
                    Vibrator vibrator44 = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);
                    vibrator44.vibrate(mills4);

                    return true;
                case R.id.na3:
                    long mills13 = 45L;
                    Vibrator vibrator13 = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);
                    vibrator13.vibrate(mills13);

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
                        Toast.makeText(getApplicationContext(), "error", Toast.LENGTH_SHORT).show();


                    }

                   /* ConnectivityManager icheck3 = (ConnectivityManager) getSystemService(Context.CONNECTIVITY_SERVICE);
                    boolean mob3 = icheck3.getActiveNetworkInfo() != null;
                    if(mob3) {

                        Intent a = new Intent(Start_Activity.this,ChatActivity.class);
                        a.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                        startActivity(a);


                    } else {

                        Toast toast = Toast.makeText(getApplicationContext(),
                                "Отсутствует интернет!", Toast.LENGTH_SHORT);

                        toast.show();

                    }*/


                    return true;

            }
            return false;
        }
    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);





        BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);

        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);

        SharedPreferences sp = getSharedPreferences(MY_SETTINGS,
                Context.MODE_PRIVATE);
        // проверяем, первый ли раз открывается программа
        boolean hasVisited = sp.getBoolean("hasVisited_stg100011", false);

        if (!hasVisited) {

            LayoutInflater li = LayoutInflater.from(context2);
            View promptsView = li.inflate(R.layout.activity_hellp2, null);
            AlertDialog.Builder mDialogBuilder = new AlertDialog.Builder(context2);
            mDialogBuilder.setView(promptsView);

            mDialogBuilder
                    .setCancelable(false)
                    .setPositiveButton("Ok",
                            new DialogInterface.OnClickListener() {
                                public void onClick(DialogInterface dialog,int id) {

                                }
                            });
            AlertDialog alertDialog = mDialogBuilder.create();
            alertDialog.show();


            long mills = 15L;
            Vibrator vibrator = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);
            vibrator.vibrate(mills);

            // выводим нужную активность
            // напр.
            //Intent intent = new Intent(this, Main2Activity.class);
            // startActivity(intent);

            SharedPreferences.Editor e = sp.edit();
            e.putBoolean("hasVisited_stg100011", true);
            e.commit(); // не забудьте подтвердить изменения
        }



       // mAdView = (AdView) findViewById(R.id.adView);
        //AdRequest adRequest = new AdRequest.Builder().build();
       // mAdView.loadAd(adRequest);
        //Button button = (Button) findViewById(R.id.button21);
        //Button button2 = (Button) findViewById(R.id.button210);
        //Button button3 = (Button) findViewById(R.id.button400);
        ImageButton button4 = (ImageButton) findViewById(R.id.button2412);
        ImageButton button = (ImageButton) findViewById(R.id.button2413);
        ImageButton button2 = (ImageButton) findViewById(R.id.button2414);
        ImageButton button5 = (ImageButton) findViewById(R.id.button4010);
        ImageButton button3 = (ImageButton) findViewById(R.id.button400);
        ImageButton button6 = (ImageButton) findViewById(R.id.button407);
        ImageButton button7 = (ImageButton) findViewById(R.id.button4071);
        ImageButton button8 = (ImageButton) findViewById(R.id.button3000);
        ImageButton button9 = (ImageButton) findViewById(R.id.imageButton11);
        ImageButton button10 = (ImageButton) findViewById(R.id.button24121);
        ImageButton button11 = (ImageButton) findViewById(R.id.imageButton322222);
        TextView textView = (TextView) findViewById(R.id.textView);


        button.setOnClickListener(viewClickListener);
        button2.setOnClickListener(viewClickListener2);
        button3.setOnClickListener(viewClickListener3);
        button4.setOnClickListener(viewClickListener4);
        button5.setOnClickListener(viewClickListener5);
        button6.setOnClickListener(viewClickListener6);
        button7.setOnClickListener(viewClickListener7);
        button8.setOnClickListener(viewClickListener8);
        button9.setOnClickListener(viewClickListener9);
        button10.setOnClickListener(viewClickListener10);
        button11.setOnClickListener(viewClickListener11);

    }



    /*@Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }*/

    @SuppressWarnings("StatementWithEmptyBody")

    /*public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

         if (id == R.id.market) {

            long mills = 15L;
            Vibrator vibrator = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);
            vibrator.vibrate(mills);

            Intent intent = new Intent(Intent.ACTION_VIEW);
            intent.setData(Uri.parse("https://play.google.com/store/apps/developer?id=Dastory+Studio"));
            startActivity(intent);




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


         } } else if (id == R.id.napisat){

             Intent a = new Intent(this,PlusActivity.class);
             a.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
             startActivity(a);

         } else if (id == R.id.pro){

             Intent intent = new Intent(Intent.ACTION_VIEW);
             intent.setData(Uri.parse("market://details?id=com.my.masterok.masterokpro"));
             startActivity(intent);

         } else if (id == R.id.infi){

             Intent a = new Intent(this,HellpActivity.class);
             a.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
             startActivity(a);

    }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }*/

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

    public void onClickLumex(View view) {
        Intent a = new Intent(this,LumexActivity.class);
        a.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(a);
        long mills = 15L;
        Vibrator vibrator = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);
        vibrator.vibrate(mills);

    }

    public void onClickArmstrong(View view) {
        Intent a = new Intent(this,ArmstrongActivity.class);
        a.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(a);
        long mills = 15L;
        Vibrator vibrator = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);
        vibrator.vibrate(mills);

    }

    public void onClickGspC111(View view) {
        Intent a = new Intent(this,GspC111Activity.class);
        a.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(a);
        long mills = 15L;
        Vibrator vibrator = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);
        vibrator.vibrate(mills);

    }

    public void onClickArmatura(View view) {
        Intent a = new Intent(this,ArmaturaActivity.class);
        a.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(a);
        long mills = 15L;
        Vibrator vibrator = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);
        vibrator.vibrate(mills);

    }



    public void onClickLesnica(View view) {
        Intent a = new Intent(this,Lesnica_Activity.class);
        a.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(a);
        long mills = 15L;
        Vibrator vibrator = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);
        vibrator.vibrate(mills);
    }

    public void onClickGipsokarton_213(View view) {
        Intent a = new Intent(this,Gipsokarton_P_213_Activity.class);
        a.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(a);
        long mills = 15L;
        Vibrator vibrator = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);
        vibrator.vibrate(mills);
    }


    public void onClickPen(View view) {
        Intent a = new Intent(this,Penoplast_Activity.class);
        a.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(a);
        long mills = 15L;
        Vibrator vibrator = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);
        vibrator.vibrate(mills);
    }



    public void onClickKirpish(View view) {
        Intent a = new Intent(this,KirpishActivity.class);
        a.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(a);
        long mills = 15L;
        Vibrator vibrator = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);
        vibrator.vibrate(mills);
    }

    public void onClickLes(View view) {
        Intent a = new Intent(this,Les_Activity.class);
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
        Intent a = new Intent(this,Armopoyas_Activity.class);
        a.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(a);
        long mills = 15L;
        Vibrator vibrator = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);
        vibrator.vibrate(mills);
    }
    public void onClickSt1(View view) {
        Intent a = new Intent(this,St_cementnaya_a_b_Activity.class);
        a.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(a);
        long mills = 15L;
        Vibrator vibrator = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);
        vibrator.vibrate(mills);
    }

    public void onClickObSepik(View view) {
        Intent a = new Intent(this,Ob_Septik_Activity.class);
        a.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(a);
        long mills = 15L;
        Vibrator vibrator = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);
        vibrator.vibrate(mills);
    }

    public void onClickKr1(View view) {
        Intent a = new Intent(this,Dvuskat_Activity.class);
        a.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(a);
        long mills = 15L;
        Vibrator vibrator = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);
        vibrator.vibrate(mills);
    }

public void onClickRadiators(View view) {
        Intent a = new Intent(this,Radiators_Activity.class);
        a.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(a);
        long mills = 15L;
        Vibrator vibrator = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);
        vibrator.vibrate(mills);
    }

    public void onClickPena(View view) {
        Intent a = new Intent(this,Pena_A_Activity.class);
        a.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(a);
        long mills = 15L;
        Vibrator vibrator = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);
        vibrator.vibrate(mills);
    }

    public void onClick_Demontag_Steni(View view) {
        Intent a = new Intent(this,Demontag_steni_Activity.class);
        a.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(a);
        long mills = 15L;
        Vibrator vibrator = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);
        vibrator.vibrate(mills);
    }

    public void onClick_Ves(View view) {
        Intent a = new Intent(this,Ves_Activity.class);
        a.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(a);
        long mills = 15L;
        Vibrator vibrator = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);
        vibrator.vibrate(mills);
    }

    public void onClick_Lesa(View view) {
        Intent a = new Intent(this,LesaActivity.class);
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
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        if (id == R.id.market) {

            long mills = 15L;
            Vibrator vibrator = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);
            vibrator.vibrate(mills);

            Intent intent = new Intent(Intent.ACTION_VIEW);
            intent.setData(Uri.parse("https://play.google.com/store/apps/developer?id=Dastory+Studio"));
            startActivity(intent);


        } else if (id == R.id.news){

            Intent a = new Intent(this,MenuNewsActivity.class);
            a.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
            startActivity(a);

        } else if (id == R.id.you_tube){

            Intent intent21 = new Intent(Intent.ACTION_VIEW);
            intent21.setData(Uri.parse("https://www.youtube.com/user/Letivnebo/videos?view_as=subscriber"));
            startActivity(intent21);

        } else if (id == R.id.pro1){

            ConnectivityManager icheck = (ConnectivityManager) getSystemService(Context.CONNECTIVITY_SERVICE);
            boolean mob = icheck.getActiveNetworkInfo() != null;
            if(mob) {

                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("market://details?id=com.my.masterok.masterokpro"));
                startActivity(intent);

            } else {

                Toast toast = Toast.makeText(getApplicationContext(),
                        "Отсутствует интернет!", Toast.LENGTH_SHORT);

                toast.show();}
        } else if (id == R.id.chat){

            ConnectivityManager icheck3 = (ConnectivityManager) getSystemService(Context.CONNECTIVITY_SERVICE);
            boolean mob3 = icheck3.getActiveNetworkInfo() != null;
            if(mob3) {

                Intent a = new Intent(Start_Activity.this,ChatActivity.class);
                a.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(a);


            } else {

                Toast toast = Toast.makeText(getApplicationContext(),
                        "Отсутствует интернет!", Toast.LENGTH_SHORT);

                toast.show();




        }} else if (id == R.id.infi){

            Intent a = new Intent(this,HellpActivity.class);
            a.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
            startActivity(a);

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
                                Intent intent = new Intent(Start_Activity.this, St_cementnaya_a_b_Activity.class);
                                startActivity(intent);
                                long mills = 15L;
                                Vibrator vibrator = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);
                                vibrator.vibrate(mills);
                                return true;

                            case R.id.menu6:
                                //пол
                                Intent intent2 = new Intent(Start_Activity.this, St_cementnaya_s_Activity.class);
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

    View.OnClickListener viewClickListener6 = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            long mills = 15L;
            Vibrator vibrator = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);
            vibrator.vibrate(mills);


            showPopupMenu6(v);
        }
    };

    private void showPopupMenu6(View v2) {
        PopupMenu popupMenu = new PopupMenu(this, v2);
        popupMenu.inflate(R.menu.popupmenu7); // Для Android 4.0
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

                            case R.id.menu10:
                                //пол
                                Intent intent = new Intent(Start_Activity.this, Gipsokarton_P_213_Activity.class);
                                startActivity(intent);
                                long mills = 15L;
                                Vibrator vibrator = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);
                                vibrator.vibrate(mills);
                                return true;

                            case R.id.menu11:
                                //пол
                                Intent intent2 = new Intent(Start_Activity.this, Gipsokarton_lite_Activity.class);
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

    View.OnClickListener viewClickListener7 = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            long mills = 15L;
            Vibrator vibrator = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);
            vibrator.vibrate(mills);


            showPopupMenu7(v);
        }
    };

    private void showPopupMenu7(View v2) {
        PopupMenu popupMenu = new PopupMenu(this, v2);
        popupMenu.inflate(R.menu.popupmenu8); // Для Android 4.0
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

                            case R.id.menu12:
                                //пол
                                Intent intent = new Intent(Start_Activity.this, Ob_Septik_Activity.class);
                                startActivity(intent);
                                long mills = 15L;
                                Vibrator vibrator = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);
                                vibrator.vibrate(mills);
                                return true;

                            case R.id.menu13:
                                //пол
                                Intent intent2 = new Intent(Start_Activity.this, Septik_krug_kirpish_Activity.class);
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

    View.OnClickListener viewClickListener8 = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            long mills = 15L;
            Vibrator vibrator = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);
            vibrator.vibrate(mills);


            showPopupMenu8(v);
        }
    };

    private void showPopupMenu8(View v2) {
        PopupMenu popupMenu = new PopupMenu(this, v2);
        popupMenu.inflate(R.menu.popupmenu9); // Для Android 4.0
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

                            case R.id.menu14:
                                //пол
                                Intent intent = new Intent(Start_Activity.this, Demontag_steni_Activity.class);
                                startActivity(intent);
                                long mills = 15L;
                                Vibrator vibrator = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);
                                vibrator.vibrate(mills);
                                return true;

                            case R.id.menu15:
                                //пол
                                Intent intent2 = new Intent(Start_Activity.this, Demontag_potolki_Activity.class);
                                startActivity(intent2);
                                long mills2 = 15L;
                                Vibrator vibrator2 = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);
                                vibrator2.vibrate(mills2);
                                return true;

                            case R.id.menu16:
                                //пол
                                Intent intent3 = new Intent(Start_Activity.this, Demontag_pola_Activity.class);
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

    View.OnClickListener viewClickListener9 = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            long mills = 15L;
            Vibrator vibrator = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);
            vibrator.vibrate(mills);


            showPopupMenu9(v);
        }
    };

    private void showPopupMenu9(View v2) {
        PopupMenu popupMenu = new PopupMenu(this, v2);
        popupMenu.inflate(R.menu.popupmenu10); // Для Android 4.0
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

                            case R.id.menu17:
                                //пол
                                Intent intent = new Intent(Start_Activity.this, Dvuskat_Activity.class);
                                startActivity(intent);
                                long mills = 15L;
                                Vibrator vibrator = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);
                                vibrator.vibrate(mills);
                                return true;

                            case R.id.menu18:
                                //пол
                                Intent intent2 = new Intent(Start_Activity.this, Obrewotka_Veranda_Activity.class);
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

    View.OnClickListener viewClickListener10 = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            long mills = 15L;
            Vibrator vibrator = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);
            vibrator.vibrate(mills);


            showPopupMenu10(v);
        }
    };

    private void showPopupMenu10(View v2) {
        PopupMenu popupMenu = new PopupMenu(this, v2);
        popupMenu.inflate(R.menu.popupmenu11); // Для Android 4.0
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

                            case R.id.menu19:
                                //пол
                                Intent intent = new Intent(Start_Activity.this, Elektro_Activity.class);
                                startActivity(intent);
                                long mills = 15L;
                                Vibrator vibrator = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);
                                vibrator.vibrate(mills);
                                return true;

                            case R.id.menu20:
                                //пол
                                Intent intent2 = new Intent(Start_Activity.this, Elektro_tablica_Activity.class);
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

    View.OnClickListener viewClickListener11 = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            long mills = 15L;
            Vibrator vibrator = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);
            vibrator.vibrate(mills);
            showPopupMenu11(v);
        }
    };

    private void showPopupMenu11(View v2) {
        PopupMenu popupMenu = new PopupMenu(this, v2);
        popupMenu.inflate(R.menu.popupmenu12); // Для Android 4.0
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

                            case R.id.menu21:
                                //пол
                                Intent intent = new Intent(Start_Activity.this, Les_Activity.class);
                                startActivity(intent);
                                long mills = 15L;
                                Vibrator vibrator = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);
                                vibrator.vibrate(mills);
                                return true;

                            case R.id.menu22:
                                //пол
                                Intent intent2 = new Intent(Start_Activity.this, Balka2_Activity.class);
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

    /*@Override
    public void onBackPressed() {




            SharedPreferences sp = getSharedPreferences(MY_SETTINGS2,
                    Context.MODE_PRIVATE);
            boolean hasVisited = sp.getBoolean("hasVisited_oc2", false);

            if (!hasVisited) {

                context6 = Start_Activity.this;
                String title = "Вам нравится приложение?";
                String message = "Оцените его в Google Play ))";
                String button1String = "Да";
                String button2String = "Нет";
                AlertDialog.Builder ad;

                ad = new AlertDialog.Builder(context6);
                ad.setTitle(title);  // заголовок
                ad.setMessage(message); // сообщение
                ad.setPositiveButton(button1String, new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int arg1) {

                        Intent intent = new Intent(Intent.ACTION_VIEW);
                        intent.setData(Uri.parse("https://play.google.com/store/apps/details?id=com.lite.my.masterok"));
                        startActivity(intent);
                    }
                });
                ad.setNegativeButton(button2String, new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int arg1) {

                    }
                });
                ad.setCancelable(true);
                ad.setOnCancelListener(new DialogInterface.OnCancelListener() {
                    public void onCancel(DialogInterface dialog) {
                        // Toast.makeText(context5, "Вы ничего не выбрали",
                        //    Toast.LENGTH_LONG).show();
                    }
                });

                ad.show();
            }else {

                super.onBackPressed();}


            long mills = 15L;
            Vibrator vibrator = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);
            vibrator.vibrate(mills);

            // выводим нужную активность
            // напр.
            //Intent intent = new Intent(this, Main2Activity.class);
            // startActivity(intent);

            SharedPreferences.Editor e = sp.edit();
            e.putBoolean("hasVisited_oc2", true);
            e.commit(); // не забудьте подтвердить изменения

            */





}











