package com.lite.my.masterok;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ActivityInfo;
import android.net.Uri;
import android.os.Bundle;
import android.os.Vibrator;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.InterstitialAd;

import java.util.Locale;
import java.util.Timer;

public class Armopoyas_Activity extends AppCompatActivity {


    Button etText;
    Button etText2;
    Button etText3;
    Button etText4;
    Button etText5;
    Button etText6;
    Button etText7;
    Button etText8;
    Button etText9;
    Button etText10;
    Button etText11;
    Button etText12;
    Button etText13;
    Button etText14;
    Button etText15;
    Button etText16;
    Button etText17;
    Button etText18;
    Button etText19;
    Button etText20;
    Button etText21;
    Button etText22;

    Button etText23;
    Button etText24;
    Button etText25;
    Button etText26;
    Button etText27;
    Button etText28;
    Button etText29;
    Button etText30;
    Button etText31;
    Button etText32;
    Button etText33;
    Button etText34;
    Button etText35;
    Button etText36;
    Button etText37;
    Button etText38;
    Button etText39;
    Button etText40;
    Button etText41;
    Button etText42;
    Button etText43;
    Button etText44;
    Button etText45;

    Button etText46;
    Button etText47;
    Button etText48;
    Button etText49;
    Button etText50;
    Button etText51;

    //Арматура
    Button etText52;
    Button etText53;
    Button etText54;
    Button etText55;

    Button etText56;
    Button etText57;
    Button etText58;
    Button etText59;

    Button etText60;
    Button etText61;
    Button etText62;
    Button etText63;
    Button etText64;
    Button etText65;

    Button etText66;
    Button etText67;
    Button etText68;

    Button etText69;
    Button etText70;
    Button etText71;
    Button etText72;

    Button etText73;
    Button etText74;

    Button etText75;
    Button etText76;

    Button etText77;
    Button etText78;

    Button etText79;
    Button etText80;
    Button etText81;
    Button etText82;

    TextView etText83;
    TextView etText84;
    TextView etText85;
    TextView etText86;
    TextView etText87;
    TextView etText88;
    TextView etText89;



    Button btnSave, btnLoad;


    SharedPreferences sPref;
    SharedPreferences sPref2;
    SharedPreferences sPref3;

    final String SAVED_TEXT = "saved_text";
    final String SAVED_TEXT2 = "saved_text2";
    final String SAVED_TEXT3 = "saved_text3";
    final String SAVED_TEXT4 = "saved_text4";
    final String SAVED_TEXT5 = "saved_text5";
    final String SAVED_TEXT6 = "saved_text6";
    final String SAVED_TEXT7 = "saved_text7";
    final String SAVED_TEXT8 = "saved_text8";
    final String SAVED_TEXT9 = "saved_text9";
    final String SAVED_TEXT10 = "saved_text10";
    final String SAVED_TEXT11 = "saved_text11";
    final String SAVED_TEXT12 = "saved_text12";
    final String SAVED_TEXT13 = "saved_text13";
    final String SAVED_TEXT14 = "saved_text14";
    final String SAVED_TEXT15 = "saved_text15";
    final String SAVED_TEXT16 = "saved_text16";
    final String SAVED_TEXT17 = "saved_text17";
    final String SAVED_TEXT18 = "saved_text18";
    final String SAVED_TEXT19 = "saved_text19";
    final String SAVED_TEXT20 = "saved_text20";
    final String SAVED_TEXT21 = "saved_text21";
    final String SAVED_TEXT22 = "saved_text22";

    final String SAVED_TEXT23 = "saved_text23";
    final String SAVED_TEXT24 = "saved_text24";
    final String SAVED_TEXT25 = "saved_text25";
    final String SAVED_TEXT26 = "saved_text26";
    final String SAVED_TEXT27 = "saved_text27";
    final String SAVED_TEXT28 = "saved_text28";
    final String SAVED_TEXT29 = "saved_text29";
    final String SAVED_TEXT30 = "saved_text30";
    final String SAVED_TEXT31 = "saved_text31";
    final String SAVED_TEXT32 = "saved_text32";
    final String SAVED_TEXT33 = "saved_text33";
    final String SAVED_TEXT34 = "saved_text34";

    final String SAVED_TEXT35 = "saved_text35";
    final String SAVED_TEXT36 = "saved_text36";
    final String SAVED_TEXT37 = "saved_text37";
    final String SAVED_TEXT38 = "saved_text38";
    final String SAVED_TEXT39 = "saved_text39";
    final String SAVED_TEXT40 = "saved_text40";
    final String SAVED_TEXT41 = "saved_text41";
    final String SAVED_TEXT42 = "saved_text42";
    final String SAVED_TEXT43 = "saved_text43";
    final String SAVED_TEXT44 = "saved_text44";
    final String SAVED_TEXT45 = "saved_text45";
    final String SAVED_TEXT46 = "saved_text46";
    final String SAVED_TEXT47 = "saved_text47";
    final String SAVED_TEXT48 = "saved_text48";
    final String SAVED_TEXT49 = "saved_text49";
    final String SAVED_TEXT50 = "saved_text50";
    final String SAVED_TEXT51 = "saved_text51";

    final String SAVED_TEXT52 = "saved_text52";
    final String SAVED_TEXT53 = "saved_text53";
    final String SAVED_TEXT54 = "saved_text54";
    final String SAVED_TEXT55 = "saved_text55";
    final String SAVED_TEXT56 = "saved_text56";
    final String SAVED_TEXT57 = "saved_text57";
    final String SAVED_TEXT58 = "saved_text58";
    final String SAVED_TEXT59 = "saved_text59";
    final String SAVED_TEXT60 = "saved_text60";
    final String SAVED_TEXT61 = "saved_text61";
    final String SAVED_TEXT62 = "saved_text62";
    final String SAVED_TEXT63 = "saved_text63";
    final String SAVED_TEXT64 = "saved_text64";
    final String SAVED_TEXT65 = "saved_text65";
    final String SAVED_TEXT66 = "saved_text66";
    final String SAVED_TEXT67 = "saved_text67";
    final String SAVED_TEXT68 = "saved_text68";

    final String SAVED_TEXT69 = "saved_text69";
    final String SAVED_TEXT70 = "saved_text70";
    final String SAVED_TEXT71 = "saved_text71";
    final String SAVED_TEXT72 = "saved_text72";

    final String SAVED_TEXT73 = "saved_text73";
    final String SAVED_TEXT74 = "saved_text74";

    final String SAVED_TEXT79 = "saved_text79";
    final String SAVED_TEXT80 = "saved_text80";
    final String SAVED_TEXT81 = "saved_text81";
    final String SAVED_TEXT82 = "saved_text82";

    final String SAVED_TEXT83 = "saved_text83";
    final String SAVED_TEXT84 = "saved_text84";
    final String SAVED_TEXT85 = "saved_text85";
    final String SAVED_TEXT86 = "saved_text86";
    final String SAVED_TEXT87 = "saved_text87";
    final String SAVED_TEXT88 = "saved_text88";
    final String SAVED_TEXT89 = "saved_text89";



    final Context context2 = this;
    boolean flag = true;
    Context context;
    ScrollView myScroll;

    private TextView wir_1;
    private TextView wir_2;
    private TextView wir_3;
    private TextView wir_4;
    private TextView wir_5;
    private TextView wir_6;

    private TextView wir_7;
    private TextView wir_8;
    private TextView wir_9;
    private TextView wir_10;
    private TextView wir_11;
    private TextView wir_12;


    //region секция private Button btn1 - btn51;
    private Button btn1;
    private Button btn2;
    private Button btn3;
    private Button btn4;
    private Button btn5;
    private Button btn6;
    private Button btn7;
    private Button btn8;
    private Button btn9;
    private Button btn10;
    private Button btn11;

    private Button btn12;
    private Button btn13;
    private Button btn14;
    private Button btn15;
    private Button btn16;
    private Button btn17;
    private Button btn18;
    private Button btn19;
    private Button btn20;
    private Button btn21;
    private Button btn22;

    private Button btn23;
    private Button btn24;
    private Button btn25;
    private Button btn26;
    private Button btn27;
    private Button btn28;
    private Button btn29;
    private Button btn30;
    private Button btn31;
    private Button btn32;
    private Button btn33;

    private Button btn34;
    private Button btn35;
    private Button btn36;
    private Button btn37;
    private Button btn38;
    private Button btn39;

    private Button btn40;
    private Button btn41;
    private Button btn42;
    private Button btn43;
    private Button btn44;
    private Button btn45;

    private Button btn46;
    private Button btn47;
    private Button btn48;
    private Button btn49;
    private Button btn50;
    private Button btn51;

    private Button btn52;
    private Button btn53;
    private Button btn54;
    private Button btn55;

    private Button btn56;
    private Button btn57;
    private Button btn58;
    private Button btn59;

    private Button btn60;
    private Button btn61;
    private Button btn62;
    private Button btn63;
    private Button btn64;
    private Button btn65;

    private Button btn66;
    private Button btn67;
    private Button btn68;

    private Button btn69;
    private Button btn70;
    private Button btn71;
    private Button btn72;

    private Button btn73;
    private Button btn74;

    private Button btn77;
    private Button btn78;

    private Button btn79;
    private Button btn80;
    private Button btn81;
    private Button btn82;






    //endregion

    //region секция private Button aetText1 - aetText51;
    private Button aetText1;
    private Button aetText2;
    private Button aetText3;
    private Button aetText4;
    private Button aetText5;
    private Button aetText6;
    private Button aetText7;
    private Button aetText8;
    private Button aetText9;
    private Button aetText10;
    private Button aetText11;

    private Button aetText12;
    private Button aetText13;
    private Button aetText14;
    private Button aetText15;
    private Button aetText16;
    private Button aetText17;
    private Button aetText18;
    private Button aetText19;
    private Button aetText20;
    private Button aetText21;
    private Button aetText22;

    private Button aetText23;
    private Button aetText24;
    private Button aetText25;
    private Button aetText26;
    private Button aetText27;
    private Button aetText28;
    private Button aetText29;
    private Button aetText30;
    private Button aetText31;
    private Button aetText32;
    private Button aetText33;

    private Button aetText34;
    private Button aetText35;
    private Button aetText36;
    private Button aetText37;
    private Button aetText38;
    private Button aetText39;

    private Button aetText40;
    private Button aetText41;
    private Button aetText42;
    private Button aetText43;
    private Button aetText44;
    private Button aetText45;

    private Button aetText46;
    private Button aetText47;
    private Button aetText48;
    private Button aetText49;
    private Button aetText50;
    private Button aetText51;

    private Button aetText52;
    private Button aetText53;
    private Button aetText54;
    private Button aetText55;

    private Button aetText56;
    private Button aetText57;
    private Button aetText58;
    private Button aetText59;

    private Button aetText60;
    private Button aetText61;
    private Button aetText62;
    private Button aetText63;
    private Button aetText64;
    private Button aetText65;

    private Button aetText66;
    private Button aetText67;
    private Button aetText68;

    private Button aetText69;
    private Button aetText70;
    private Button aetText71;
    private Button aetText72;

    private Button aetText73;
    private Button aetText74;

    private Button aetText77;
    private Button aetText78;

    private Button aetText79;
    private Button aetText80;
    private Button aetText81;
    private Button aetText82;




//endregion


    //region секция Button button101 - button101;
    Button button101;
    Button button102;
    Button button103;
    Button button104;
    Button button105;
    Button button106;
    Button button107;
    Button button108;
    Button button109;
    Button button110;
    Button button111;

    Button button112;
    Button button113;
    Button button114;
    Button button115;
    Button button116;
    Button button117;
    Button button118;
    Button button119;
    Button button120;
    Button button121;
    Button button122;

    Button button123;
    Button button124;
    Button button125;
    Button button126;
    Button button127;
    Button button128;
    Button button129;
    Button button130;
    Button button131;
    Button button132;
    Button button133;

    Button button134;
    Button button135;
    Button button136;
    Button button137;
    Button button138;
    Button button139;

    Button button140;
    Button button141;
    Button button142;
    Button button143;
    Button button144;
    Button button145;

    Button button146;
    Button button147;
    Button button148;
    Button button149;
    Button button150;
    Button button151;


    Button button152;
    Button button153;
    Button button154;
    Button button155;

    Button button156;
    Button button157;
    Button button158;
    Button button159;

    Button button160;
    Button button161;
    Button button162;
    Button button163;
    Button button164;
    Button button165;

    Button button166;
    Button button167;
    Button button168;

    Button button169;
    Button button170;
    Button button171;
    Button button172;

    Button button173;
    Button button174;

    Button button175;
    Button button176;

    Button button177;
    Button button178;

    Button button179;
    Button button180;
    Button button181;
    Button button182;





    //endregion

    //region секция private TextView final_text - final_text51;
    private TextView final_text;
    private TextView final_text2;
    private TextView final_text3;
    private TextView final_text4;
    private TextView final_text5;
    private TextView final_text6;
    private TextView final_text7;
    private TextView final_text8;
    private TextView final_text9;
    private TextView final_text10;
    private TextView final_text11;

    private TextView final_text12;
    private TextView final_text13;
    private TextView final_text14;
    private TextView final_text15;
    private TextView final_text16;
    private TextView final_text17;
    private TextView final_text18;
    private TextView final_text19;
    private TextView final_text20;
    private TextView final_text21;
    private TextView final_text22;

    private TextView final_text23;
    private TextView final_text24;
    private TextView final_text25;
    private TextView final_text26;
    private TextView final_text27;
    private TextView final_text28;
    private TextView final_text29;
    private TextView final_text30;
    private TextView final_text31;
    private TextView final_text32;
    private TextView final_text33;

    private TextView final_text34;
    private TextView final_text35;
    private TextView final_text36;
    private TextView final_text37;
    private TextView final_text38;
    private TextView final_text39;

    private TextView final_text40;
    private TextView final_text41;
    private TextView final_text42;
    private TextView final_text43;
    private TextView final_text44;
    private TextView final_text45;

    private TextView final_text46;
    private TextView final_text47;
    private TextView final_text48;
    private TextView final_text49;
    private TextView final_text50;
    private TextView final_text51;

    private TextView final_text52;
    private TextView final_text53;
    private TextView final_text54;
    private TextView final_text55;

    private TextView final_text56;
    private TextView final_text57;
    private TextView final_text58;
    private TextView final_text59;

    private TextView final_text60;
    private TextView final_text61;
    private TextView final_text62;
    private TextView final_text63;
    private TextView final_text64;
    private TextView final_text65;

    private TextView final_text66;
    private TextView final_text67;
    private TextView final_text68;

    private TextView final_text69;
    private TextView final_text70;
    private TextView final_text71;
    private TextView final_text72;

    private TextView final_text73;
    private TextView final_text74;

    private TextView final_text75;
    private TextView final_text76;

    private TextView final_text77;
    private TextView final_text78;

    private TextView final_text79;
    private TextView final_text80;
    private TextView final_text81;
    private TextView final_text82;

    private TextView final_text83;
    private TextView final_text84;
    private TextView final_text85;
    private TextView final_text86;
    private TextView final_text87;
    private TextView final_text88;
    private TextView final_text89;

    ImageView imageView;
    ImageView imageView1;


    InterstitialAd mInterstitialAd;
    ImageButton mNewGameButton;

    private static int SPLASH_TIME_OUT = 5000;
    static Context context4;
    Timer t = new Timer();
    static Intent intent;

    private AdView mAdView;





    //endregion

    /**
     * Called when the activity is first created.
     */

    final String MY_SETTINGS = "saved_text_fun8";



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_armopojas);

        mAdView = findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);







        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);

        imageView = (ImageView) findViewById(R.id.imageView23);

        Toolbar my_toolbar = (Toolbar)findViewById(R.id.my_toolbar);
        setSupportActionBar(my_toolbar);




        SharedPreferences sp = getSharedPreferences(MY_SETTINGS,
                Context.MODE_PRIVATE);
        // проверяем, первый ли раз открывается программа
        boolean hasVisited = sp.getBoolean("hasVisitedPerim", false);

        if (!hasVisited) {

            LayoutInflater li = LayoutInflater.from(context2);
            View promptsView = li.inflate(R.layout.prompt2, null);
            AlertDialog.Builder mDialogBuilder = new AlertDialog.Builder(context2);
            mDialogBuilder.setView(promptsView);


            final TextView bill1 = (TextView) findViewById(R.id.button10);
            final TextView bill2 = (TextView) findViewById(R.id.button2);
            final TextView bill3 = (TextView) findViewById(R.id.button);
            final TextView bill4 = (TextView) findViewById(R.id.button3);
            final TextView bill5 = (TextView) findViewById(R.id.button5);
            final TextView bill6 = (TextView) findViewById(R.id.button6);
            final TextView bill7 = (TextView) findViewById(R.id.button7);
            final TextView bill8 = (TextView) findViewById(R.id.button38);
            final TextView bill9 = (TextView) findViewById(R.id.button40);
            final TextView bill10 = (TextView) findViewById(R.id.button39);
            final TextView bill11 = (TextView) findViewById(R.id.button8);



            final TextView bill23 = (TextView) findViewById(R.id.button97);
            final TextView bill24 = (TextView) findViewById(R.id.button98);
            final TextView bill25 = (TextView) findViewById(R.id.button99);
            final TextView bill26 = (TextView) findViewById(R.id.button100);
            final TextView bill27 = (TextView) findViewById(R.id.button101);
            final TextView bill28 = (TextView) findViewById(R.id.button102);
            final TextView bill29 = (TextView) findViewById(R.id.button103);
            final TextView bill30 = (TextView) findViewById(R.id.button104);
            final TextView bill31 = (TextView) findViewById(R.id.button105);
            final TextView bill32 = (TextView) findViewById(R.id.button11);
            final TextView bill33 = (TextView) findViewById(R.id.button12);

            final TextView bill34 = (TextView) findViewById(R.id.button52);
            final TextView bill35 = (TextView) findViewById(R.id.button53);
            final TextView bill36 = (TextView) findViewById(R.id.button54);
            final TextView bill37 = (TextView) findViewById(R.id.button55);
            final TextView bill38 = (TextView) findViewById(R.id.button59);
            final TextView bill39 = (TextView) findViewById(R.id.button60);

            final TextView bill40 = (TextView) findViewById(R.id.button61);
            final TextView bill41 = (TextView) findViewById(R.id.button62);
            final TextView bill42 = (TextView) findViewById(R.id.button63);
            final TextView bill43 = (TextView) findViewById(R.id.button64);
            final TextView bill44 = (TextView) findViewById(R.id.button65);
            final TextView bill45 = (TextView) findViewById(R.id.button66);

            final TextView bill46 = (TextView) findViewById(R.id.button70);
            final TextView bill47 = (TextView) findViewById(R.id.button71);
            final TextView bill48 = (TextView) findViewById(R.id.button72);
            final TextView bill49 = (TextView) findViewById(R.id.button73);
            final TextView bill50 = (TextView) findViewById(R.id.button74);
            final TextView bill51 = (TextView) findViewById(R.id.button75);


            final TextView bill52 = (TextView) findViewById(R.id.button15);
            final TextView bill53 = (TextView) findViewById(R.id.button16);
            final TextView bill54 = (TextView) findViewById(R.id.button17);
            final TextView bill55 = (TextView) findViewById(R.id.button18);

            final TextView bill56 = (TextView) findViewById(R.id.button21);
            final TextView bill57 = (TextView) findViewById(R.id.button22);
            final TextView bill58 = (TextView) findViewById(R.id.button23);
            final TextView bill59 = (TextView) findViewById(R.id.button24);

            final TextView bill60 = (TextView) findViewById(R.id.button27);
            final TextView bill61 = (TextView) findViewById(R.id.button28);
            final TextView bill62 = (TextView) findViewById(R.id.button29);
            final TextView bill63 = (TextView) findViewById(R.id.button30);
            final TextView bill64 = (TextView) findViewById(R.id.button31);
            final TextView bill65 = (TextView) findViewById(R.id.button32);

            final TextView bill66 = (TextView) findViewById(R.id.button19);
            final TextView bill67 = (TextView) findViewById(R.id.button20);
            final TextView bill68 = (TextView) findViewById(R.id.button25);

            final TextView bill69 = (TextView) findViewById(R.id.button41);
            final TextView bill70 = (TextView) findViewById(R.id.button42);
            final TextView bill71 = (TextView) findViewById(R.id.button43);
            final TextView bill72 = (TextView) findViewById(R.id.button44);

            final TextView bill73 = (TextView) findViewById(R.id.button45);
            final TextView bill74 = (TextView) findViewById(R.id.button46);

            final TextView bill79 = (TextView) findViewById(R.id.button26);
            final TextView bill80 = (TextView) findViewById(R.id.button33);
            final TextView bill81 = (TextView) findViewById(R.id.button34);
            final TextView bill82 = (TextView) findViewById(R.id.button35);

            final TextView bill83 = (TextView) findViewById(R.id.textView14);
            final TextView bill84 = (TextView) findViewById(R.id.textView20);
            final TextView bill85 = (TextView) findViewById(R.id.textView43);
            final TextView bill86 = (TextView) findViewById(R.id.textView24);
            final TextView bill87 = (TextView) findViewById(R.id.textView39);
            final TextView bill88 = (TextView) findViewById(R.id.textView37);
            final TextView bill89 = (TextView) findViewById(R.id.textView28);

            etText83 = (TextView) findViewById(R.id.textView14);
            etText84 = (TextView) findViewById(R.id.textView20);
            etText85 = (TextView) findViewById(R.id.textView43);
            etText86 = (TextView) findViewById(R.id.textView24);
            etText87 = (TextView) findViewById(R.id.textView39);
            etText88 = (TextView) findViewById(R.id.textView37);
            etText89 = (TextView) findViewById(R.id.textView28);

            //final TextView bill75 = (TextView) findViewById(R.id.button36);
            //final TextView bill76 = (TextView) findViewById(R.id.button37);




            mDialogBuilder
                    .setCancelable(false)
                    .setPositiveButton("OK",
                            new DialogInterface.OnClickListener() {
                                public void onClick(DialogInterface dialog,int id) {


                                    bill1.setText(32 + "");
                                    bill2.setText(36 + "");
                                    bill3.setText(40 + "");
                                    bill4.setText(44 + "");
                                    bill5.setText(48 + "");
                                    bill6.setText(54 + "");
                                    bill7.setText(58 + "");
                                    bill8.setText(62 + "");
                                    bill9.setText(66 + "");
                                    bill10.setText(70 + "");
                                    bill11.setText(74 + "");


                                    //////////
                                    //bill23.setText(0 + "");

                                   // bill33.setText(13 + "");

                                    bill34.setText(0 + "");
                                    bill35.setText(12 + "");
                                    bill36.setText(25 + "");
                                    bill37.setText(30 + "");
                                    bill38.setText(50 + "");
                                    bill39.setText(100 + "");

                                    bill40.setText(0 + "");
                                    bill41.setText(12 + "");
                                    bill42.setText(25 + "");
                                    bill43.setText(30 + "");
                                    bill44.setText(50 + "");
                                    bill45.setText(100 + "");

                                    bill46.setText(0 + "");
                                    bill47.setText(400 + "");
                                    bill48.setText(500 + "");
                                    bill49.setText(550 + "");
                                    bill50.setText(600 + "");
                                    bill51.setText(700 + "");


                                    bill52.setText(10 + "");
                                    bill53.setText(12 + "");
                                    bill54.setText(14 + "");
                                    bill55.setText(16 + "");

                                    bill56.setText(8 + "");
                                    bill57.setText(10 + "");
                                    bill58.setText(12 + "");
                                    bill59.setText(14 + "");

                                    bill60.setText(15 + "");
                                    bill61.setText(20 + "");
                                    bill62.setText(25 + "");
                                    bill63.setText(30 + "");
                                    bill64.setText(40 + "");
                                    bill65.setText(50 + "");

                                    bill66.setText(8 + "");
                                    bill67.setText(10 + "");
                                    bill68.setText(15 + "");

                                    bill69.setText(2 + "");
                                    bill70.setText(4 + "");
                                    bill71.setText(6 + "");
                                    bill72.setText(8 + "");

                                    bill73.setText(18 + "");
                                    bill74.setText(20 + "");

                                    bill79.setText(2 + "");
                                    bill80.setText(5 + "");
                                    bill81.setText(10 + "");
                                    bill82.setText(15 + "");

                                    bill83.setText(00.00 + "");
                                    bill84.setText(00.00 + "");
                                    bill85.setText(00.00 + "");
                                    bill86.setText(00.00 + "");
                                    bill87.setText(00.00 + "");
                                    bill88.setText(00.00 + "");
                                    bill89.setText(00.00 + "");



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
            e.putBoolean("hasVisitedPerim", true);
            e.commit(); // не забудьте подтвердить изменения
        }



        etText = (Button) findViewById(R.id.button10);
        etText2 = (Button) findViewById(R.id.button2);
        etText3 = (Button) findViewById(R.id.button);
        etText4 = (Button) findViewById(R.id.button3);
        etText5 = (Button) findViewById(R.id.button5);
        etText6 = (Button) findViewById(R.id.button6);
        etText7 = (Button) findViewById(R.id.button7);
        etText8 = (Button) findViewById(R.id.button38);
        etText9 = (Button) findViewById(R.id.button40);
        etText10 = (Button) findViewById(R.id.button39);
        etText11 = (Button) findViewById(R.id.button8);



        etText23 = (Button) findViewById(R.id.button97);
        etText24 = (Button) findViewById(R.id.button98);
        etText25 = (Button) findViewById(R.id.button99);
        etText26 = (Button) findViewById(R.id.button100);
        etText27 = (Button) findViewById(R.id.button101);
        etText28 = (Button) findViewById(R.id.button102);
        etText29 = (Button) findViewById(R.id.button103);
        etText30 = (Button) findViewById(R.id.button104);
        etText31 = (Button) findViewById(R.id.button105);
        etText32 = (Button) findViewById(R.id.button11);
        etText33 = (Button) findViewById(R.id.button12);

        etText34 = (Button) findViewById(R.id.button52);
        etText35 = (Button) findViewById(R.id.button53);
        etText36 = (Button) findViewById(R.id.button54);
        etText37 = (Button) findViewById(R.id.button55);
        etText38 = (Button) findViewById(R.id.button59);
        etText39 = (Button) findViewById(R.id.button60);

        etText40 = (Button) findViewById(R.id.button61);
        etText41 = (Button) findViewById(R.id.button62);
        etText42 = (Button) findViewById(R.id.button63);
        etText43 = (Button) findViewById(R.id.button64);
        etText44 = (Button) findViewById(R.id.button65);
        etText45 = (Button) findViewById(R.id.button66);

        etText46 = (Button) findViewById(R.id.button70);
        etText47 = (Button) findViewById(R.id.button71);
        etText48 = (Button) findViewById(R.id.button72);
        etText49 = (Button) findViewById(R.id.button73);
        etText50 = (Button) findViewById(R.id.button74);
        etText51 = (Button) findViewById(R.id.button75);


        etText52 = (Button) findViewById(R.id.button15);
        etText53 = (Button) findViewById(R.id.button16);
        etText54 = (Button) findViewById(R.id.button17);
        etText55 = (Button) findViewById(R.id.button18);

        etText56 = (Button) findViewById(R.id.button21);
        etText57 = (Button) findViewById(R.id.button22);
        etText58 = (Button) findViewById(R.id.button23);
        etText59 = (Button) findViewById(R.id.button24);

        etText60 = (Button) findViewById(R.id.button27);
        etText61 = (Button) findViewById(R.id.button28);
        etText62 = (Button) findViewById(R.id.button29);
        etText63 = (Button) findViewById(R.id.button30);
        etText64 = (Button) findViewById(R.id.button31);
        etText65 = (Button) findViewById(R.id.button32);

        etText66 = (Button) findViewById(R.id.button19);
        etText67 = (Button) findViewById(R.id.button20);
        etText68 = (Button) findViewById(R.id.button25);

        etText69 = (Button) findViewById(R.id.button41);
        etText70 = (Button) findViewById(R.id.button42);
        etText71 = (Button) findViewById(R.id.button43);
        etText72 = (Button) findViewById(R.id.button44);

        etText73 = (Button) findViewById(R.id.button45);
        etText74 = (Button) findViewById(R.id.button46);

        etText77 = (Button) findViewById(R.id.button36);
        etText78 = (Button) findViewById(R.id.button37);

        etText79 = (Button) findViewById(R.id.button26);
        etText80 = (Button) findViewById(R.id.button33);
        etText81 = (Button) findViewById(R.id.button34);
        etText82 = (Button) findViewById(R.id.button35);

        etText83 = (TextView) findViewById(R.id.textView14);
        etText84 = (TextView) findViewById(R.id.textView20);
        etText85 = (TextView) findViewById(R.id.textView43);
        etText86 = (TextView) findViewById(R.id.textView24);
        etText87 = (TextView) findViewById(R.id.textView39);
        etText88 = (TextView) findViewById(R.id.textView37);
        etText89 = (TextView) findViewById(R.id.textView28);




        loadText();
        loadText2();
        loadText3();
        loadText4();
        loadText5();
        loadText6();
        loadText7();
        loadText8();
        loadText9();
        loadText10();
        loadText11();

        loadText34();
        loadText35();
        loadText36();
        loadText37();
        loadText38();
        loadText39();
        loadText40();
        loadText41();
        loadText42();
        loadText43();
        loadText44();
        loadText45();
        loadText46();
        loadText47();
        loadText48();
        loadText49();
        loadText50();
        loadText51();


        loadText52();
        loadText53();
        loadText54();
        loadText55();

        loadText56();
        loadText57();
        loadText58();
        loadText59();

        loadText60();
        loadText61();
        loadText62();
        loadText63();
        loadText64();
        loadText65();

        loadText66();
        loadText67();
        loadText68();

        loadText69();
        loadText70();
        loadText71();
        loadText72();

        loadText73();
        loadText74();

        loadText79();
        loadText80();
        loadText81();
        loadText82();

        loadText83();
        loadText84();
        loadText85();
        loadText86();
        loadText87();
        loadText88();
        loadText89();



//Ряды кнопок (по Алерт Диалогу)

        //region секция 1 (button101 = (Button) findViewById(R.id.button10);)
        button101 = (Button) findViewById(R.id.button10);
        final_text = (TextView) findViewById(R.id.button10);
        button101.setOnLongClickListener(new View.OnLongClickListener() {

                                             @Override
                                             public boolean onLongClick(View arg0) {
                                                 LayoutInflater li = LayoutInflater.from(context2);
                                                 final View promptsView = li.inflate(R.layout.prompt, null);
                                                 AlertDialog.Builder mDialogBuilder = new AlertDialog.Builder(context2);
                                                 mDialogBuilder.setView(promptsView);

                                                 final EditText userInput = (EditText) promptsView.findViewById(R.id.editText2);

                                                 mDialogBuilder
                                                         .setCancelable(false)
                                                         .setPositiveButton("OK",
                                                                 new DialogInterface.OnClickListener() {
                                                                     public void onClick(DialogInterface dialog, int id) {

                                                                         //final EditText etNum55 = (EditText) findViewById(R.id.editText2);
                                                                         final EditText userInput = (EditText) promptsView.findViewById(R.id.editText2);
                                                                         if (userInput.getText().length() == 0)
                                                                         {
                                                                             dialog.cancel();
                                                                         }else
                                                                         {
                                                                             final_text.setText(userInput.getText());
                                                                         }}
                                                                 })
                                                         .setNegativeButton("Отмена",
                                                                 new DialogInterface.OnClickListener() {
                                                                     public void onClick(DialogInterface dialog, int id) {
                                                                         dialog.cancel();
                                                                     }
                                                                 });
                                                 AlertDialog alertDialog = mDialogBuilder.create();
                                                 alertDialog.show();
                                                 return false;
                                             }
                                         }
        );
        button102 = (Button) findViewById(R.id.button2);
        final_text2 = (TextView) findViewById(R.id.button2);
        button102.setOnLongClickListener(new View.OnLongClickListener() {

                                             @Override
                                             public boolean onLongClick(View arg0) {
                                                 LayoutInflater li = LayoutInflater.from(context2);
                                                 final View promptsView = li.inflate(R.layout.prompt, null);
                                                 AlertDialog.Builder mDialogBuilder = new AlertDialog.Builder(context2);
                                                 mDialogBuilder.setView(promptsView);

                                                 final EditText userInput = (EditText) promptsView.findViewById(R.id.editText2);

                                                 mDialogBuilder
                                                         .setCancelable(false)
                                                         .setPositiveButton("OK",
                                                                 new DialogInterface.OnClickListener() {
                                                                     public void onClick(DialogInterface dialog, int id) {

                                                                         //final EditText etNum55 = (EditText) findViewById(R.id.editText2);
                                                                         final EditText userInput = (EditText) promptsView.findViewById(R.id.editText2);
                                                                         if (userInput.getText().length() == 0)
                                                                         {
                                                                             dialog.cancel();
                                                                         }else
                                                                         {
                                                                             final_text2.setText(userInput.getText());
                                                                         }}
                                                                 })
                                                         .setNegativeButton("Отмена",
                                                                 new DialogInterface.OnClickListener() {
                                                                     public void onClick(DialogInterface dialog, int id) {
                                                                         dialog.cancel();
                                                                     }
                                                                 });
                                                 AlertDialog alertDialog = mDialogBuilder.create();
                                                 alertDialog.show();
                                                 return false;
                                             }
                                         }
        );
        button103 = (Button) findViewById(R.id.button);
        final_text3 = (TextView) findViewById(R.id.button);
        button103.setOnLongClickListener(new View.OnLongClickListener() {

                                             @Override
                                             public boolean onLongClick(View arg0) {
                                                 LayoutInflater li = LayoutInflater.from(context2);
                                                 final View promptsView = li.inflate(R.layout.prompt, null);
                                                 AlertDialog.Builder mDialogBuilder = new AlertDialog.Builder(context2);
                                                 mDialogBuilder.setView(promptsView);

                                                 final EditText userInput = (EditText) promptsView.findViewById(R.id.editText2);

                                                 mDialogBuilder
                                                         .setCancelable(false)
                                                         .setPositiveButton("OK",
                                                                 new DialogInterface.OnClickListener() {
                                                                     public void onClick(DialogInterface dialog, int id) {

                                                                         //final EditText etNum55 = (EditText) findViewById(R.id.editText2);
                                                                         final EditText userInput = (EditText) promptsView.findViewById(R.id.editText2);
                                                                         if (userInput.getText().length() == 0)
                                                                         {
                                                                             dialog.cancel();
                                                                         }else
                                                                         {
                                                                             final_text3.setText(userInput.getText());
                                                                         }}
                                                                 })
                                                         .setNegativeButton("Отмена",
                                                                 new DialogInterface.OnClickListener() {
                                                                     public void onClick(DialogInterface dialog, int id) {
                                                                         dialog.cancel();
                                                                     }
                                                                 });
                                                 AlertDialog alertDialog = mDialogBuilder.create();
                                                 alertDialog.show();
                                                 return false;
                                             }
                                         }
        );
        button104 = (Button) findViewById(R.id.button3);
        final_text4 = (TextView) findViewById(R.id.button3);
        button104.setOnLongClickListener(new View.OnLongClickListener() {

                                             @Override
                                             public boolean onLongClick(View arg0) {
                                                 LayoutInflater li = LayoutInflater.from(context2);
                                                 final View promptsView = li.inflate(R.layout.prompt, null);
                                                 AlertDialog.Builder mDialogBuilder = new AlertDialog.Builder(context2);
                                                 mDialogBuilder.setView(promptsView);

                                                 final EditText userInput = (EditText) promptsView.findViewById(R.id.editText2);

                                                 mDialogBuilder
                                                         .setCancelable(false)
                                                         .setPositiveButton("OK",
                                                                 new DialogInterface.OnClickListener() {
                                                                     public void onClick(DialogInterface dialog, int id) {

                                                                         //final EditText etNum55 = (EditText) findViewById(R.id.editText2);
                                                                         final EditText userInput = (EditText) promptsView.findViewById(R.id.editText2);
                                                                         if (userInput.getText().length() == 0)
                                                                         {
                                                                             dialog.cancel();
                                                                         }else
                                                                         {
                                                                             final_text4.setText(userInput.getText());
                                                                         }}
                                                                 })
                                                         .setNegativeButton("Отмена",
                                                                 new DialogInterface.OnClickListener() {
                                                                     public void onClick(DialogInterface dialog, int id) {
                                                                         dialog.cancel();
                                                                     }
                                                                 });
                                                 AlertDialog alertDialog = mDialogBuilder.create();
                                                 alertDialog.show();
                                                 return false;
                                             }
                                         }
        );
        button105 = (Button) findViewById(R.id.button5);
        final_text5 = (TextView) findViewById(R.id.button5);
        button105.setOnLongClickListener(new View.OnLongClickListener() {

                                             @Override
                                             public boolean onLongClick(View arg0) {
                                                 LayoutInflater li = LayoutInflater.from(context2);
                                                 final View promptsView = li.inflate(R.layout.prompt, null);
                                                 AlertDialog.Builder mDialogBuilder = new AlertDialog.Builder(context2);
                                                 mDialogBuilder.setView(promptsView);

                                                 final EditText userInput = (EditText) promptsView.findViewById(R.id.editText2);

                                                 mDialogBuilder
                                                         .setCancelable(false)
                                                         .setPositiveButton("OK",
                                                                 new DialogInterface.OnClickListener() {
                                                                     public void onClick(DialogInterface dialog, int id) {

                                                                         //final EditText etNum55 = (EditText) findViewById(R.id.editText2);
                                                                         final EditText userInput = (EditText) promptsView.findViewById(R.id.editText2);
                                                                         if (userInput.getText().length() == 0)
                                                                         {
                                                                             dialog.cancel();
                                                                         }else
                                                                         {
                                                                             final_text5.setText(userInput.getText());
                                                                         }}
                                                                 })
                                                         .setNegativeButton("Отмена",
                                                                 new DialogInterface.OnClickListener() {
                                                                     public void onClick(DialogInterface dialog, int id) {
                                                                         dialog.cancel();
                                                                     }
                                                                 });
                                                 AlertDialog alertDialog = mDialogBuilder.create();
                                                 alertDialog.show();
                                                 return false;
                                             }
                                         }
        );
        button106 = (Button) findViewById(R.id.button6);
        final_text6 = (TextView) findViewById(R.id.button6);
        button106.setOnLongClickListener(new View.OnLongClickListener() {

                                             @Override
                                             public boolean onLongClick(View arg0) {
                                                 LayoutInflater li = LayoutInflater.from(context2);
                                                 final View promptsView = li.inflate(R.layout.prompt, null);
                                                 AlertDialog.Builder mDialogBuilder = new AlertDialog.Builder(context2);
                                                 mDialogBuilder.setView(promptsView);

                                                 final EditText userInput = (EditText) promptsView.findViewById(R.id.editText2);

                                                 mDialogBuilder
                                                         .setCancelable(false)
                                                         .setPositiveButton("OK",
                                                                 new DialogInterface.OnClickListener() {
                                                                     public void onClick(DialogInterface dialog, int id) {

                                                                         //final EditText etNum55 = (EditText) findViewById(R.id.editText2);
                                                                         final EditText userInput = (EditText) promptsView.findViewById(R.id.editText2);
                                                                         if (userInput.getText().length() == 0)
                                                                         {
                                                                             dialog.cancel();
                                                                         }else
                                                                         {
                                                                             final_text6.setText(userInput.getText());
                                                                         }}
                                                                 })
                                                         .setNegativeButton("Отмена",
                                                                 new DialogInterface.OnClickListener() {
                                                                     public void onClick(DialogInterface dialog, int id) {
                                                                         dialog.cancel();
                                                                     }
                                                                 });
                                                 AlertDialog alertDialog = mDialogBuilder.create();
                                                 alertDialog.show();
                                                 return false;
                                             }
                                         }
        );
        button107 = (Button) findViewById(R.id.button7);
        final_text7 = (TextView) findViewById(R.id.button7);
        button107.setOnLongClickListener(new View.OnLongClickListener() {

                                             @Override
                                             public boolean onLongClick(View arg0) {
                                                 LayoutInflater li = LayoutInflater.from(context2);
                                                 final View promptsView = li.inflate(R.layout.prompt, null);
                                                 AlertDialog.Builder mDialogBuilder = new AlertDialog.Builder(context2);
                                                 mDialogBuilder.setView(promptsView);

                                                 final EditText userInput = (EditText) promptsView.findViewById(R.id.editText2);

                                                 mDialogBuilder
                                                         .setCancelable(false)
                                                         .setPositiveButton("OK",
                                                                 new DialogInterface.OnClickListener() {
                                                                     public void onClick(DialogInterface dialog, int id) {

                                                                         //final EditText etNum55 = (EditText) findViewById(R.id.editText2);
                                                                         final EditText userInput = (EditText) promptsView.findViewById(R.id.editText2);
                                                                         if (userInput.getText().length() == 0)
                                                                         {
                                                                             dialog.cancel();
                                                                         }else
                                                                         {
                                                                             final_text7.setText(userInput.getText());
                                                                         }}
                                                                 })
                                                         .setNegativeButton("Отмена",
                                                                 new DialogInterface.OnClickListener() {
                                                                     public void onClick(DialogInterface dialog, int id) {
                                                                         dialog.cancel();
                                                                     }
                                                                 });
                                                 AlertDialog alertDialog = mDialogBuilder.create();
                                                 alertDialog.show();
                                                 return false;
                                             }
                                         }
        );
        button108 = (Button) findViewById(R.id.button38);
        final_text8 = (TextView) findViewById(R.id.button38);
        button108.setOnLongClickListener(new View.OnLongClickListener() {

                                             @Override
                                             public boolean onLongClick(View arg0) {
                                                 LayoutInflater li = LayoutInflater.from(context2);
                                                 final View promptsView = li.inflate(R.layout.prompt, null);
                                                 AlertDialog.Builder mDialogBuilder = new AlertDialog.Builder(context2);
                                                 mDialogBuilder.setView(promptsView);

                                                 final EditText userInput = (EditText) promptsView.findViewById(R.id.editText2);

                                                 mDialogBuilder
                                                         .setCancelable(false)
                                                         .setPositiveButton("OK",
                                                                 new DialogInterface.OnClickListener() {
                                                                     public void onClick(DialogInterface dialog, int id) {

                                                                         //final EditText etNum55 = (EditText) findViewById(R.id.editText2);
                                                                         final EditText userInput = (EditText) promptsView.findViewById(R.id.editText2);
                                                                         if (userInput.getText().length() == 0)
                                                                         {
                                                                             dialog.cancel();
                                                                         }else
                                                                         {
                                                                             final_text8.setText(userInput.getText());
                                                                         }}
                                                                 })
                                                         .setNegativeButton("Отмена",
                                                                 new DialogInterface.OnClickListener() {
                                                                     public void onClick(DialogInterface dialog, int id) {
                                                                         dialog.cancel();
                                                                     }
                                                                 });
                                                 AlertDialog alertDialog = mDialogBuilder.create();
                                                 alertDialog.show();
                                                 return false;
                                             }
                                         }
        );
        button109 = (Button) findViewById(R.id.button40);
        final_text9 = (TextView) findViewById(R.id.button40);
        button109.setOnLongClickListener(new View.OnLongClickListener() {

                                             @Override
                                             public boolean onLongClick(View arg0) {
                                                 LayoutInflater li = LayoutInflater.from(context2);
                                                 final View promptsView = li.inflate(R.layout.prompt, null);
                                                 AlertDialog.Builder mDialogBuilder = new AlertDialog.Builder(context2);
                                                 mDialogBuilder.setView(promptsView);

                                                 final EditText userInput = (EditText) promptsView.findViewById(R.id.editText2);

                                                 mDialogBuilder
                                                         .setCancelable(false)
                                                         .setPositiveButton("OK",
                                                                 new DialogInterface.OnClickListener() {
                                                                     public void onClick(DialogInterface dialog, int id) {

                                                                         //final EditText etNum55 = (EditText) findViewById(R.id.editText2);
                                                                         final EditText userInput = (EditText) promptsView.findViewById(R.id.editText2);
                                                                         if (userInput.getText().length() == 0)
                                                                         {
                                                                             dialog.cancel();
                                                                         }else
                                                                         {
                                                                             final_text9.setText(userInput.getText());
                                                                         }}
                                                                 })
                                                         .setNegativeButton("Отмена",
                                                                 new DialogInterface.OnClickListener() {
                                                                     public void onClick(DialogInterface dialog, int id) {
                                                                         dialog.cancel();
                                                                     }
                                                                 });
                                                 AlertDialog alertDialog = mDialogBuilder.create();
                                                 alertDialog.show();
                                                 return false;
                                             }
                                         }
        );
        button110 = (Button) findViewById(R.id.button39);
        final_text10 = (TextView) findViewById(R.id.button39);
        button110.setOnLongClickListener(new View.OnLongClickListener() {

                                             @Override
                                             public boolean onLongClick(View arg0) {
                                                 LayoutInflater li = LayoutInflater.from(context2);
                                                 final View promptsView = li.inflate(R.layout.prompt, null);
                                                 AlertDialog.Builder mDialogBuilder = new AlertDialog.Builder(context2);
                                                 mDialogBuilder.setView(promptsView);

                                                 final EditText userInput = (EditText) promptsView.findViewById(R.id.editText2);

                                                 mDialogBuilder
                                                         .setCancelable(false)
                                                         .setPositiveButton("OK",
                                                                 new DialogInterface.OnClickListener() {
                                                                     public void onClick(DialogInterface dialog, int id) {

                                                                         //final EditText etNum55 = (EditText) findViewById(R.id.editText2);
                                                                         final EditText userInput = (EditText) promptsView.findViewById(R.id.editText2);
                                                                         if (userInput.getText().length() == 0)
                                                                         {
                                                                             dialog.cancel();
                                                                         }else
                                                                         {
                                                                             final_text10.setText(userInput.getText());
                                                                         }}
                                                                 })
                                                         .setNegativeButton("Отмена",
                                                                 new DialogInterface.OnClickListener() {
                                                                     public void onClick(DialogInterface dialog, int id) {
                                                                         dialog.cancel();
                                                                     }
                                                                 });
                                                 AlertDialog alertDialog = mDialogBuilder.create();
                                                 alertDialog.show();
                                                 return false;
                                             }
                                         }
        );
        button111 = (Button) findViewById(R.id.button8);
        final_text11 = (TextView) findViewById(R.id.button8);
        button111.setOnLongClickListener(new View.OnLongClickListener() {

                                             @Override
                                             public boolean onLongClick(View arg0) {
                                                 LayoutInflater li = LayoutInflater.from(context2);
                                                 final View promptsView = li.inflate(R.layout.prompt, null);
                                                 AlertDialog.Builder mDialogBuilder = new AlertDialog.Builder(context2);
                                                 mDialogBuilder.setView(promptsView);

                                                 final EditText userInput = (EditText) promptsView.findViewById(R.id.editText2);

                                                 mDialogBuilder
                                                         .setCancelable(false)
                                                         .setPositiveButton("OK",
                                                                 new DialogInterface.OnClickListener() {
                                                                     public void onClick(DialogInterface dialog, int id) {

                                                                         //final EditText etNum55 = (EditText) findViewById(R.id.editText2);
                                                                         final EditText userInput = (EditText) promptsView.findViewById(R.id.editText2);
                                                                         if (userInput.getText().length() == 0)
                                                                         {
                                                                             dialog.cancel();
                                                                         }else
                                                                         {
                                                                             final_text11.setText(userInput.getText());
                                                                         }}
                                                                 })
                                                         .setNegativeButton("Отмена",
                                                                 new DialogInterface.OnClickListener() {
                                                                     public void onClick(DialogInterface dialog, int id) {
                                                                         dialog.cancel();
                                                                     }
                                                                 });
                                                 AlertDialog alertDialog = mDialogBuilder.create();
                                                 alertDialog.show();
                                                 return false;
                                             }
                                         }
        );

        //endregion






        //region секция 4

        button134 = (Button) findViewById(R.id.button52);
        final_text34 = (TextView) findViewById(R.id.button52);
        button134.setOnLongClickListener(new View.OnLongClickListener() {
                                             //region button124
                                             @Override
                                             public boolean onLongClick(View arg0) {
                                                 LayoutInflater li = LayoutInflater.from(context2);
                                                 final View promptsView = li.inflate(R.layout.prompt, null);
                                                 AlertDialog.Builder mDialogBuilder = new AlertDialog.Builder(context2);
                                                 mDialogBuilder.setView(promptsView);

                                                 final EditText userInput = (EditText) promptsView.findViewById(R.id.editText2);

                                                 mDialogBuilder
                                                         .setCancelable(false)
                                                         .setPositiveButton("OK",
                                                                 new DialogInterface.OnClickListener() {
                                                                     public void onClick(DialogInterface dialog, int id) {

                                                                         //final EditText etNum55 = (EditText) findViewById(R.id.editText2);
                                                                         final EditText userInput = (EditText) promptsView.findViewById(R.id.editText2);
                                                                         if (userInput.getText().length() == 0)
                                                                         {
                                                                             dialog.cancel();
                                                                         }else
                                                                         {
                                                                             final_text34.setText(userInput.getText());
                                                                         }}
                                                                 })
                                                         .setNegativeButton("Отмена",
                                                                 new DialogInterface.OnClickListener() {
                                                                     public void onClick(DialogInterface dialog, int id) {
                                                                         dialog.cancel();
                                                                     }
                                                                 });
                                                 AlertDialog alertDialog = mDialogBuilder.create();
                                                 alertDialog.show();
                                                 return false;
                                             }
                                         }
        );

        button135 = (Button) findViewById(R.id.button53);
        final_text35 = (TextView) findViewById(R.id.button53);
        button135.setOnLongClickListener(new View.OnLongClickListener() {
                                             //region button124
                                             @Override
                                             public boolean onLongClick(View arg0) {
                                                 LayoutInflater li = LayoutInflater.from(context2);
                                                 final View promptsView = li.inflate(R.layout.prompt, null);
                                                 AlertDialog.Builder mDialogBuilder = new AlertDialog.Builder(context2);
                                                 mDialogBuilder.setView(promptsView);

                                                 final EditText userInput = (EditText) promptsView.findViewById(R.id.editText2);

                                                 mDialogBuilder
                                                         .setCancelable(false)
                                                         .setPositiveButton("OK",
                                                                 new DialogInterface.OnClickListener() {
                                                                     public void onClick(DialogInterface dialog, int id) {

                                                                         //final EditText etNum55 = (EditText) findViewById(R.id.editText2);
                                                                         final EditText userInput = (EditText) promptsView.findViewById(R.id.editText2);
                                                                         if (userInput.getText().length() == 0)
                                                                         {
                                                                             dialog.cancel();
                                                                         }else
                                                                         {
                                                                             final_text35.setText(userInput.getText());
                                                                         }}
                                                                 })
                                                         .setNegativeButton("Отмена",
                                                                 new DialogInterface.OnClickListener() {
                                                                     public void onClick(DialogInterface dialog, int id) {
                                                                         dialog.cancel();
                                                                     }
                                                                 });
                                                 AlertDialog alertDialog = mDialogBuilder.create();
                                                 alertDialog.show();
                                                 return false;
                                             }
                                         }
        );

        //endregion

        button136 = (Button) findViewById(R.id.button54);
        final_text36 = (TextView) findViewById(R.id.button54);
        button136.setOnLongClickListener(new View.OnLongClickListener() {
                                             //region button114
                                             @Override
                                             public boolean onLongClick(View arg0) {
                                                 LayoutInflater li = LayoutInflater.from(context2);
                                                 final View promptsView = li.inflate(R.layout.prompt, null);
                                                 AlertDialog.Builder mDialogBuilder = new AlertDialog.Builder(context2);
                                                 mDialogBuilder.setView(promptsView);

                                                 final EditText userInput = (EditText) promptsView.findViewById(R.id.editText2);

                                                 mDialogBuilder
                                                         .setCancelable(false)
                                                         .setPositiveButton("OK",
                                                                 new DialogInterface.OnClickListener() {
                                                                     public void onClick(DialogInterface dialog, int id) {

                                                                         //final EditText etNum55 = (EditText) findViewById(R.id.editText2);
                                                                         final EditText userInput = (EditText) promptsView.findViewById(R.id.editText2);
                                                                         if (userInput.getText().length() == 0)
                                                                         {
                                                                             dialog.cancel();
                                                                         }else
                                                                         {
                                                                             final_text36.setText(userInput.getText());
                                                                         }}
                                                                 })
                                                         .setNegativeButton("Отмена",
                                                                 new DialogInterface.OnClickListener() {
                                                                     public void onClick(DialogInterface dialog, int id) {
                                                                         dialog.cancel();
                                                                     }
                                                                 });
                                                 AlertDialog alertDialog = mDialogBuilder.create();
                                                 alertDialog.show();
                                                 return false;
                                             }
                                         }
        );

        //endregion

        button137 = (Button) findViewById(R.id.button55);
        final_text37 = (TextView) findViewById(R.id.button55);
        button137.setOnLongClickListener(new View.OnLongClickListener() {
                                             //region button126
                                             @Override
                                             public boolean onLongClick(View arg0) {
                                                 LayoutInflater li = LayoutInflater.from(context2);
                                                 final View promptsView = li.inflate(R.layout.prompt, null);
                                                 AlertDialog.Builder mDialogBuilder = new AlertDialog.Builder(context2);
                                                 mDialogBuilder.setView(promptsView);

                                                 final EditText userInput = (EditText) promptsView.findViewById(R.id.editText2);

                                                 mDialogBuilder
                                                         .setCancelable(false)
                                                         .setPositiveButton("OK",
                                                                 new DialogInterface.OnClickListener() {
                                                                     public void onClick(DialogInterface dialog, int id) {

                                                                         //final EditText etNum55 = (EditText) findViewById(R.id.editText2);
                                                                         final EditText userInput = (EditText) promptsView.findViewById(R.id.editText2);
                                                                         if (userInput.getText().length() == 0)
                                                                         {
                                                                             dialog.cancel();
                                                                         }else
                                                                         {
                                                                             final_text37.setText(userInput.getText());
                                                                         }}
                                                                 })
                                                         .setNegativeButton("Отмена",
                                                                 new DialogInterface.OnClickListener() {
                                                                     public void onClick(DialogInterface dialog, int id) {
                                                                         dialog.cancel();
                                                                     }
                                                                 });
                                                 AlertDialog alertDialog = mDialogBuilder.create();
                                                 alertDialog.show();
                                                 return false;
                                             }
                                         }
        );

        //endregion

        button138 = (Button) findViewById(R.id.button59);
        final_text38 = (TextView) findViewById(R.id.button59);
        button138.setOnLongClickListener(new View.OnLongClickListener() {
                                             //region button127
                                             @Override
                                             public boolean onLongClick(View arg0) {
                                                 LayoutInflater li = LayoutInflater.from(context2);
                                                 final View promptsView = li.inflate(R.layout.prompt, null);
                                                 AlertDialog.Builder mDialogBuilder = new AlertDialog.Builder(context2);
                                                 mDialogBuilder.setView(promptsView);

                                                 final EditText userInput = (EditText) promptsView.findViewById(R.id.editText2);

                                                 mDialogBuilder
                                                         .setCancelable(false)
                                                         .setPositiveButton("OK",
                                                                 new DialogInterface.OnClickListener() {
                                                                     public void onClick(DialogInterface dialog, int id) {

                                                                         //final EditText etNum55 = (EditText) findViewById(R.id.editText2);
                                                                         final EditText userInput = (EditText) promptsView.findViewById(R.id.editText2);
                                                                         if (userInput.getText().length() == 0)
                                                                         {
                                                                             dialog.cancel();
                                                                         }else
                                                                         {
                                                                             final_text38.setText(userInput.getText());
                                                                         }}
                                                                 })
                                                         .setNegativeButton("Отмена",
                                                                 new DialogInterface.OnClickListener() {
                                                                     public void onClick(DialogInterface dialog, int id) {
                                                                         dialog.cancel();
                                                                     }
                                                                 });
                                                 AlertDialog alertDialog = mDialogBuilder.create();
                                                 alertDialog.show();
                                                 return false;
                                             }
                                         }
        );

        //endregion

        button139 = (Button) findViewById(R.id.button60);
        final_text39 = (TextView) findViewById(R.id.button60);
        button139.setOnLongClickListener(new View.OnLongClickListener() {
                                             //region button128
                                             @Override
                                             public boolean onLongClick(View arg0) {
                                                 LayoutInflater li = LayoutInflater.from(context2);
                                                 final View promptsView = li.inflate(R.layout.prompt, null);
                                                 AlertDialog.Builder mDialogBuilder = new AlertDialog.Builder(context2);
                                                 mDialogBuilder.setView(promptsView);

                                                 final EditText userInput = (EditText) promptsView.findViewById(R.id.editText2);

                                                 mDialogBuilder
                                                         .setCancelable(false)
                                                         .setPositiveButton("OK",
                                                                 new DialogInterface.OnClickListener() {
                                                                     public void onClick(DialogInterface dialog, int id) {

                                                                         //final EditText etNum55 = (EditText) findViewById(R.id.editText2);
                                                                         final EditText userInput = (EditText) promptsView.findViewById(R.id.editText2);
                                                                         if (userInput.getText().length() == 0)
                                                                         {
                                                                             dialog.cancel();
                                                                         }else
                                                                         {
                                                                             final_text39.setText(userInput.getText());
                                                                         }}
                                                                 })
                                                         .setNegativeButton("Отмена",
                                                                 new DialogInterface.OnClickListener() {
                                                                     public void onClick(DialogInterface dialog, int id) {
                                                                         dialog.cancel();
                                                                     }
                                                                 });
                                                 AlertDialog alertDialog = mDialogBuilder.create();
                                                 alertDialog.show();
                                                 return false;
                                             }
                                         }
        );

        //endregion


        //endregion

        //region секция 5
        button140 = (Button) findViewById(R.id.button61);
        final_text40 = (TextView) findViewById(R.id.button61);
        button140.setOnLongClickListener(new View.OnLongClickListener() {
                                             //region button123
                                             @Override
                                             public boolean onLongClick(View arg0) {
                                                 LayoutInflater li = LayoutInflater.from(context2);
                                                 final View promptsView = li.inflate(R.layout.prompt, null);
                                                 AlertDialog.Builder mDialogBuilder = new AlertDialog.Builder(context2);
                                                 mDialogBuilder.setView(promptsView);

                                                 final EditText userInput = (EditText) promptsView.findViewById(R.id.editText2);

                                                 mDialogBuilder
                                                         .setCancelable(false)
                                                         .setPositiveButton("OK",
                                                                 new DialogInterface.OnClickListener() {
                                                                     public void onClick(DialogInterface dialog, int id) {

                                                                         //final EditText etNum55 = (EditText) findViewById(R.id.editText2);
                                                                         final EditText userInput = (EditText) promptsView.findViewById(R.id.editText2);
                                                                         if (userInput.getText().length() == 0)
                                                                         {dialog.cancel();
                                                                         }else
                                                                         {
                                                                             final_text40.setText(userInput.getText());
                                                                         }}
                                                                 })
                                                         .setNegativeButton("Отмена",
                                                                 new DialogInterface.OnClickListener() {
                                                                     public void onClick(DialogInterface dialog, int id) {
                                                                         dialog.cancel();
                                                                     }
                                                                 });
                                                 AlertDialog alertDialog = mDialogBuilder.create();
                                                 alertDialog.show();
                                                 return false;
                                             }
                                         }
        );

        //endregion

        button141 = (Button) findViewById(R.id.button62);
        final_text41 = (TextView) findViewById(R.id.button62);
        button141.setOnLongClickListener(new View.OnLongClickListener() {
                                             //region button124
                                             @Override
                                             public boolean onLongClick(View arg0) {
                                                 LayoutInflater li = LayoutInflater.from(context2);
                                                 final View promptsView = li.inflate(R.layout.prompt, null);
                                                 AlertDialog.Builder mDialogBuilder = new AlertDialog.Builder(context2);
                                                 mDialogBuilder.setView(promptsView);

                                                 final EditText userInput = (EditText) promptsView.findViewById(R.id.editText2);

                                                 mDialogBuilder
                                                         .setCancelable(false)
                                                         .setPositiveButton("OK",
                                                                 new DialogInterface.OnClickListener() {
                                                                     public void onClick(DialogInterface dialog, int id) {

                                                                         //final EditText etNum55 = (EditText) findViewById(R.id.editText2);
                                                                         final EditText userInput = (EditText) promptsView.findViewById(R.id.editText2);
                                                                         if (userInput.getText().length() == 0)
                                                                         {
                                                                             dialog.cancel();
                                                                         }else
                                                                         {
                                                                             final_text41.setText(userInput.getText());
                                                                         }}
                                                                 })
                                                         .setNegativeButton("Отмена",
                                                                 new DialogInterface.OnClickListener() {
                                                                     public void onClick(DialogInterface dialog, int id) {
                                                                         dialog.cancel();
                                                                     }
                                                                 });
                                                 AlertDialog alertDialog = mDialogBuilder.create();
                                                 alertDialog.show();
                                                 return false;
                                             }
                                         }
        );

        //endregion

        button142 = (Button) findViewById(R.id.button63);
        final_text42 = (TextView) findViewById(R.id.button63);
        button142.setOnLongClickListener(new View.OnLongClickListener() {
                                             //region button114
                                             @Override
                                             public boolean onLongClick(View arg0) {
                                                 LayoutInflater li = LayoutInflater.from(context2);
                                                 final View promptsView = li.inflate(R.layout.prompt, null);
                                                 AlertDialog.Builder mDialogBuilder = new AlertDialog.Builder(context2);
                                                 mDialogBuilder.setView(promptsView);

                                                 final EditText userInput = (EditText) promptsView.findViewById(R.id.editText2);

                                                 mDialogBuilder
                                                         .setCancelable(false)
                                                         .setPositiveButton("OK",
                                                                 new DialogInterface.OnClickListener() {
                                                                     public void onClick(DialogInterface dialog, int id) {

                                                                         //final EditText etNum55 = (EditText) findViewById(R.id.editText2);
                                                                         final EditText userInput = (EditText) promptsView.findViewById(R.id.editText2);
                                                                         if (userInput.getText().length() == 0)
                                                                         {
                                                                             dialog.cancel();
                                                                         }else
                                                                         {
                                                                             final_text42.setText(userInput.getText());
                                                                         }}
                                                                 })
                                                         .setNegativeButton("Отмена",
                                                                 new DialogInterface.OnClickListener() {
                                                                     public void onClick(DialogInterface dialog, int id) {
                                                                         dialog.cancel();
                                                                     }
                                                                 });
                                                 AlertDialog alertDialog = mDialogBuilder.create();
                                                 alertDialog.show();
                                                 return false;
                                             }
                                         }
        );

        //endregion

        button143 = (Button) findViewById(R.id.button64);
        final_text43 = (TextView) findViewById(R.id.button64);
        button143.setOnLongClickListener(new View.OnLongClickListener() {
                                             //region button126
                                             @Override
                                             public boolean onLongClick(View arg0) {
                                                 LayoutInflater li = LayoutInflater.from(context2);
                                                 final View promptsView = li.inflate(R.layout.prompt, null);
                                                 AlertDialog.Builder mDialogBuilder = new AlertDialog.Builder(context2);
                                                 mDialogBuilder.setView(promptsView);

                                                 final EditText userInput = (EditText) promptsView.findViewById(R.id.editText2);

                                                 mDialogBuilder
                                                         .setCancelable(false)
                                                         .setPositiveButton("OK",
                                                                 new DialogInterface.OnClickListener() {
                                                                     public void onClick(DialogInterface dialog, int id) {

                                                                         //final EditText etNum55 = (EditText) findViewById(R.id.editText2);
                                                                         final EditText userInput = (EditText) promptsView.findViewById(R.id.editText2);
                                                                         if (userInput.getText().length() == 0)
                                                                         {
                                                                             dialog.cancel();
                                                                         }else
                                                                         {
                                                                             final_text43.setText(userInput.getText());
                                                                         }}
                                                                 })
                                                         .setNegativeButton("Отмена",
                                                                 new DialogInterface.OnClickListener() {
                                                                     public void onClick(DialogInterface dialog, int id) {
                                                                         dialog.cancel();
                                                                     }
                                                                 });
                                                 AlertDialog alertDialog = mDialogBuilder.create();
                                                 alertDialog.show();
                                                 return false;
                                             }
                                         }
        );

        //endregion

        button144 = (Button) findViewById(R.id.button65);
        final_text44 = (TextView) findViewById(R.id.button65);
        button144.setOnLongClickListener(new View.OnLongClickListener() {
                                             //region button127
                                             @Override
                                             public boolean onLongClick(View arg0) {
                                                 LayoutInflater li = LayoutInflater.from(context2);
                                                 final View promptsView = li.inflate(R.layout.prompt, null);
                                                 AlertDialog.Builder mDialogBuilder = new AlertDialog.Builder(context2);
                                                 mDialogBuilder.setView(promptsView);

                                                 final EditText userInput = (EditText) promptsView.findViewById(R.id.editText2);

                                                 mDialogBuilder
                                                         .setCancelable(false)
                                                         .setPositiveButton("OK",
                                                                 new DialogInterface.OnClickListener() {
                                                                     public void onClick(DialogInterface dialog, int id) {

                                                                         //final EditText etNum55 = (EditText) findViewById(R.id.editText2);
                                                                         final EditText userInput = (EditText) promptsView.findViewById(R.id.editText2);
                                                                         if (userInput.getText().length() == 0)
                                                                         {
                                                                             dialog.cancel();
                                                                         }else
                                                                         {
                                                                             final_text44.setText(userInput.getText());
                                                                         }}
                                                                 })
                                                         .setNegativeButton("Отмена",
                                                                 new DialogInterface.OnClickListener() {
                                                                     public void onClick(DialogInterface dialog, int id) {
                                                                         dialog.cancel();
                                                                     }
                                                                 });
                                                 AlertDialog alertDialog = mDialogBuilder.create();
                                                 alertDialog.show();
                                                 return false;
                                             }
                                         }
        );

        //endregion

        button145 = (Button) findViewById(R.id.button66);
        final_text45 = (TextView) findViewById(R.id.button66);
        button145.setOnLongClickListener(new View.OnLongClickListener() {
                                             //region button128
                                             @Override
                                             public boolean onLongClick(View arg0) {
                                                 LayoutInflater li = LayoutInflater.from(context2);
                                                 final View promptsView = li.inflate(R.layout.prompt, null);
                                                 AlertDialog.Builder mDialogBuilder = new AlertDialog.Builder(context2);
                                                 mDialogBuilder.setView(promptsView);

                                                 final EditText userInput = (EditText) promptsView.findViewById(R.id.editText2);

                                                 mDialogBuilder
                                                         .setCancelable(false)
                                                         .setPositiveButton("OK",
                                                                 new DialogInterface.OnClickListener() {
                                                                     public void onClick(DialogInterface dialog, int id) {

                                                                         //final EditText etNum55 = (EditText) findViewById(R.id.editText2);
                                                                         final EditText userInput = (EditText) promptsView.findViewById(R.id.editText2);
                                                                         if (userInput.getText().length() == 0)
                                                                         {
                                                                             dialog.cancel();
                                                                         }else
                                                                         {
                                                                             final_text45.setText(userInput.getText());
                                                                         }}
                                                                 })
                                                         .setNegativeButton("Отмена",
                                                                 new DialogInterface.OnClickListener() {
                                                                     public void onClick(DialogInterface dialog, int id) {
                                                                         dialog.cancel();
                                                                     }
                                                                 });
                                                 AlertDialog alertDialog = mDialogBuilder.create();
                                                 alertDialog.show();
                                                 return false;
                                             }
                                         }
        );

        //endregion


        //endregion

        //region секция 6
        button146 = (Button) findViewById(R.id.button70);
        final_text46 = (TextView) findViewById(R.id.button70);
        button146.setOnLongClickListener(new View.OnLongClickListener() {
                                             //region button123
                                             @Override
                                             public boolean onLongClick(View arg0) {
                                                 LayoutInflater li = LayoutInflater.from(context2);
                                                 final View promptsView = li.inflate(R.layout.prompt3, null);
                                                 AlertDialog.Builder mDialogBuilder = new AlertDialog.Builder(context2);
                                                 mDialogBuilder.setView(promptsView);

                                                 final EditText userInput = (EditText) promptsView.findViewById(R.id.editText2);

                                                 mDialogBuilder
                                                         .setCancelable(false)
                                                         .setPositiveButton("OK",
                                                                 new DialogInterface.OnClickListener() {
                                                                     public void onClick(DialogInterface dialog, int id) {

                                                                         //final EditText etNum55 = (EditText) findViewById(R.id.editText2);
                                                                         final EditText userInput = (EditText) promptsView.findViewById(R.id.editText2);
                                                                         if (userInput.getText().length() == 0)
                                                                         {
                                                                             dialog.cancel();
                                                                         }else
                                                                         {
                                                                             final_text46.setText(userInput.getText());
                                                                         }}
                                                                 })
                                                         .setNegativeButton("Отмена",
                                                                 new DialogInterface.OnClickListener() {
                                                                     public void onClick(DialogInterface dialog, int id) {
                                                                         dialog.cancel();
                                                                     }
                                                                 });
                                                 AlertDialog alertDialog = mDialogBuilder.create();
                                                 alertDialog.show();
                                                 return false;
                                             }
                                         }
        );

        //endregion

        button147 = (Button) findViewById(R.id.button71);
        final_text47 = (TextView) findViewById(R.id.button71);
        button147.setOnLongClickListener(new View.OnLongClickListener() {
                                             //region button124
                                             @Override
                                             public boolean onLongClick(View arg0) {
                                                 LayoutInflater li = LayoutInflater.from(context2);
                                                 final View promptsView = li.inflate(R.layout.prompt3, null);
                                                 AlertDialog.Builder mDialogBuilder = new AlertDialog.Builder(context2);
                                                 mDialogBuilder.setView(promptsView);

                                                 final EditText userInput = (EditText) promptsView.findViewById(R.id.editText2);

                                                 mDialogBuilder
                                                         .setCancelable(false)
                                                         .setPositiveButton("OK",
                                                                 new DialogInterface.OnClickListener() {
                                                                     public void onClick(DialogInterface dialog, int id) {

                                                                         //final EditText etNum55 = (EditText) findViewById(R.id.editText2);
                                                                         final EditText userInput = (EditText) promptsView.findViewById(R.id.editText2);
                                                                         if (userInput.getText().length() == 0)
                                                                         {
                                                                             dialog.cancel();
                                                                         }else
                                                                         {
                                                                             final_text47.setText(userInput.getText());
                                                                         }}
                                                                 })
                                                         .setNegativeButton("Отмена",
                                                                 new DialogInterface.OnClickListener() {
                                                                     public void onClick(DialogInterface dialog, int id) {
                                                                         dialog.cancel();
                                                                     }
                                                                 });
                                                 AlertDialog alertDialog = mDialogBuilder.create();
                                                 alertDialog.show();
                                                 return false;
                                             }
                                         }
        );

        //endregion

        button148 = (Button) findViewById(R.id.button72);
        final_text48 = (TextView) findViewById(R.id.button72);
        button148.setOnLongClickListener(new View.OnLongClickListener() {
                                             //region button114
                                             @Override
                                             public boolean onLongClick(View arg0) {
                                                 LayoutInflater li = LayoutInflater.from(context2);
                                                 final View promptsView = li.inflate(R.layout.prompt3, null);
                                                 AlertDialog.Builder mDialogBuilder = new AlertDialog.Builder(context2);
                                                 mDialogBuilder.setView(promptsView);

                                                 final EditText userInput = (EditText) promptsView.findViewById(R.id.editText2);

                                                 mDialogBuilder
                                                         .setCancelable(false)
                                                         .setPositiveButton("OK",
                                                                 new DialogInterface.OnClickListener() {
                                                                     public void onClick(DialogInterface dialog, int id) {

                                                                         //final EditText etNum55 = (EditText) findViewById(R.id.editText2);
                                                                         final EditText userInput = (EditText) promptsView.findViewById(R.id.editText2);
                                                                         if (userInput.getText().length() == 0)
                                                                         {
                                                                             dialog.cancel();
                                                                         }else
                                                                         {
                                                                             final_text48.setText(userInput.getText());
                                                                         }}
                                                                 })
                                                         .setNegativeButton("Отмена",
                                                                 new DialogInterface.OnClickListener() {
                                                                     public void onClick(DialogInterface dialog, int id) {
                                                                         dialog.cancel();
                                                                     }
                                                                 });
                                                 AlertDialog alertDialog = mDialogBuilder.create();
                                                 alertDialog.show();
                                                 return false;
                                             }
                                         }
        );

        //endregion

        button149 = (Button) findViewById(R.id.button73);
        final_text49 = (TextView) findViewById(R.id.button73);
        button149.setOnLongClickListener(new View.OnLongClickListener() {
                                             //region button126
                                             @Override
                                             public boolean onLongClick(View arg0) {
                                                 LayoutInflater li = LayoutInflater.from(context2);
                                                 final View promptsView = li.inflate(R.layout.prompt3, null);
                                                 AlertDialog.Builder mDialogBuilder = new AlertDialog.Builder(context2);
                                                 mDialogBuilder.setView(promptsView);

                                                 final EditText userInput = (EditText) promptsView.findViewById(R.id.editText2);

                                                 mDialogBuilder
                                                         .setCancelable(false)
                                                         .setPositiveButton("OK",
                                                                 new DialogInterface.OnClickListener() {
                                                                     public void onClick(DialogInterface dialog, int id) {

                                                                         //final EditText etNum55 = (EditText) findViewById(R.id.editText2);
                                                                         final EditText userInput = (EditText) promptsView.findViewById(R.id.editText2);
                                                                         if (userInput.getText().length() == 0)
                                                                         {
                                                                             dialog.cancel();
                                                                         }else
                                                                         {
                                                                             final_text49.setText(userInput.getText());
                                                                         }}
                                                                 })
                                                         .setNegativeButton("Отмена",
                                                                 new DialogInterface.OnClickListener() {
                                                                     public void onClick(DialogInterface dialog, int id) {
                                                                         dialog.cancel();
                                                                     }
                                                                 });
                                                 AlertDialog alertDialog = mDialogBuilder.create();
                                                 alertDialog.show();
                                                 return false;
                                             }
                                         }
        );

        //endregion

        button150 = (Button) findViewById(R.id.button74);
        final_text50 = (TextView) findViewById(R.id.button74);
        button150.setOnLongClickListener(new View.OnLongClickListener() {
                                             //region button127
                                             @Override
                                             public boolean onLongClick(View arg0) {
                                                 LayoutInflater li = LayoutInflater.from(context2);
                                                 final View promptsView = li.inflate(R.layout.prompt3, null);
                                                 AlertDialog.Builder mDialogBuilder = new AlertDialog.Builder(context2);
                                                 mDialogBuilder.setView(promptsView);

                                                 final EditText userInput = (EditText) promptsView.findViewById(R.id.editText2);

                                                 mDialogBuilder
                                                         .setCancelable(false)
                                                         .setPositiveButton("OK",
                                                                 new DialogInterface.OnClickListener() {
                                                                     public void onClick(DialogInterface dialog, int id) {

                                                                         //final EditText etNum55 = (EditText) findViewById(R.id.editText2);
                                                                         final EditText userInput = (EditText) promptsView.findViewById(R.id.editText2);
                                                                         if (userInput.getText().length() == 0)
                                                                         {
                                                                             dialog.cancel();
                                                                         }else
                                                                         {
                                                                             final_text50.setText(userInput.getText());
                                                                         }}
                                                                 })
                                                         .setNegativeButton("Отмена",
                                                                 new DialogInterface.OnClickListener() {
                                                                     public void onClick(DialogInterface dialog, int id) {
                                                                         dialog.cancel();
                                                                     }
                                                                 });
                                                 AlertDialog alertDialog = mDialogBuilder.create();
                                                 alertDialog.show();
                                                 return false;
                                             }
                                         }
        );

        //endregion

        button151 = (Button) findViewById(R.id.button75);
        final_text51 = (TextView) findViewById(R.id.button75);
        button151.setOnLongClickListener(new View.OnLongClickListener() {
                                             //region button128
                                             @Override
                                             public boolean onLongClick(View arg0) {
                                                 LayoutInflater li = LayoutInflater.from(context2);
                                                 final View promptsView = li.inflate(R.layout.prompt3, null);
                                                 AlertDialog.Builder mDialogBuilder = new AlertDialog.Builder(context2);
                                                 mDialogBuilder.setView(promptsView);

                                                 final EditText userInput = (EditText) promptsView.findViewById(R.id.editText2);

                                                 mDialogBuilder
                                                         .setCancelable(false)
                                                         .setPositiveButton("OK",
                                                                 new DialogInterface.OnClickListener() {
                                                                     public void onClick(DialogInterface dialog, int id) {

                                                                         //final EditText etNum55 = (EditText) findViewById(R.id.editText2);
                                                                         final EditText userInput = (EditText) promptsView.findViewById(R.id.editText2);
                                                                         if (userInput.getText().length() == 0)
                                                                         {
                                                                             dialog.cancel();
                                                                         }else
                                                                         {
                                                                             final_text51.setText(userInput.getText());
                                                                         }}
                                                                 })
                                                         .setNegativeButton("Отмена",
                                                                 new DialogInterface.OnClickListener() {
                                                                     public void onClick(DialogInterface dialog, int id) {
                                                                         dialog.cancel();
                                                                     }
                                                                 });
                                                 AlertDialog alertDialog = mDialogBuilder.create();
                                                 alertDialog.show();
                                                 return false;
                                             }
                                         }
        );

        //endregion


        //endregion


        //region секция 7


        button152 = (Button) findViewById(R.id.button15);
        final_text52 = (TextView) findViewById(R.id.button15);
        button152.setOnLongClickListener(new View.OnLongClickListener() {
                                             //region button123
                                             @Override
                                             public boolean onLongClick(View arg0) {
                                                 LayoutInflater li = LayoutInflater.from(context2);
                                                 final View promptsView = li.inflate(R.layout.prompt5, null);
                                                 AlertDialog.Builder mDialogBuilder = new AlertDialog.Builder(context2);
                                                 mDialogBuilder.setView(promptsView);

                                                 //final EditText userInput = (EditText) promptsView.findViewById(R.id.editText2);

                                                 mDialogBuilder
                                                         .setCancelable(false)
                                                         .setPositiveButton("OK",
                                                                 new DialogInterface.OnClickListener() {
                                                                     public void onClick(DialogInterface dialog, int id) {
                                                                     }
                                                                 });

                                                 AlertDialog alertDialog = mDialogBuilder.create();
                                                 alertDialog.show();
                                                 return false;
                                             }
                                         }
        );

        //endregion

        button153 = (Button) findViewById(R.id.button16);
        final_text53 = (TextView) findViewById(R.id.button16);
        button153.setOnLongClickListener(new View.OnLongClickListener() {
                                             //region button124
                                             @Override
                                             public boolean onLongClick(View arg0) {
                                                 LayoutInflater li = LayoutInflater.from(context2);
                                                 final View promptsView = li.inflate(R.layout.prompt5, null);
                                                 AlertDialog.Builder mDialogBuilder = new AlertDialog.Builder(context2);
                                                 mDialogBuilder.setView(promptsView);

                                                 //final EditText userInput = (EditText) promptsView.findViewById(R.id.editText2);

                                                 mDialogBuilder
                                                         .setCancelable(false)
                                                         .setPositiveButton("OK",
                                                                 new DialogInterface.OnClickListener() {
                                                                     public void onClick(DialogInterface dialog, int id) {
                                                                     }
                                                                 });

                                                 AlertDialog alertDialog = mDialogBuilder.create();
                                                 alertDialog.show();
                                                 return false;
                                             }
                                         }
        );

        //endregion

        button154 = (Button) findViewById(R.id.button17);
        final_text54 = (TextView) findViewById(R.id.button17);
        button154.setOnLongClickListener(new View.OnLongClickListener() {
                                             //region button114
                                             @Override
                                             public boolean onLongClick(View arg0) {
                                                 LayoutInflater li = LayoutInflater.from(context2);
                                                 final View promptsView = li.inflate(R.layout.prompt5, null);
                                                 AlertDialog.Builder mDialogBuilder = new AlertDialog.Builder(context2);
                                                 mDialogBuilder.setView(promptsView);

                                                 //final EditText userInput = (EditText) promptsView.findViewById(R.id.editText2);

                                                 mDialogBuilder
                                                         .setCancelable(false)
                                                         .setPositiveButton("OK",
                                                                 new DialogInterface.OnClickListener() {
                                                                     public void onClick(DialogInterface dialog, int id) {
                                                                     }
                                                                 });

                                                 AlertDialog alertDialog = mDialogBuilder.create();
                                                 alertDialog.show();
                                                 return false;
                                             }
                                         }
        );

        //endregion

        button155 = (Button) findViewById(R.id.button18);
        final_text55 = (TextView) findViewById(R.id.button18);
        button155.setOnLongClickListener(new View.OnLongClickListener() {
                                             //region button126
                                             @Override
                                             public boolean onLongClick(View arg0) {
                                                 LayoutInflater li = LayoutInflater.from(context2);
                                                 final View promptsView = li.inflate(R.layout.prompt5, null);
                                                 AlertDialog.Builder mDialogBuilder = new AlertDialog.Builder(context2);
                                                 mDialogBuilder.setView(promptsView);

                                                 //final EditText userInput = (EditText) promptsView.findViewById(R.id.editText2);

                                                 mDialogBuilder
                                                         .setCancelable(false)
                                                         .setPositiveButton("OK",
                                                                 new DialogInterface.OnClickListener() {
                                                                     public void onClick(DialogInterface dialog, int id) {
                                                                     }
                                                                 });

                                                 AlertDialog alertDialog = mDialogBuilder.create();
                                                 alertDialog.show();
                                                 return false;
                                             }
                                         }
        );

        //endregion




        //endregion

        //region секция 8
        button158 = (Button) findViewById(R.id.button23);
        final_text58 = (TextView) findViewById(R.id.button23);
        button158.setOnLongClickListener(new View.OnLongClickListener() {
                                             //region button123
                                             @Override
                                             public boolean onLongClick(View arg0) {
                                                 LayoutInflater li = LayoutInflater.from(context2);
                                                 final View promptsView = li.inflate(R.layout.prompt5, null);
                                                 AlertDialog.Builder mDialogBuilder = new AlertDialog.Builder(context2);
                                                 mDialogBuilder.setView(promptsView);

                                                 //final EditText userInput = (EditText) promptsView.findViewById(R.id.editText2);

                                                 mDialogBuilder
                                                         .setCancelable(false)
                                                         .setPositiveButton("OK",
                                                                 new DialogInterface.OnClickListener() {
                                                                     public void onClick(DialogInterface dialog, int id) {
                                                                     }
                                                                 });

                                                 AlertDialog alertDialog = mDialogBuilder.create();
                                                 alertDialog.show();
                                                 return false;
                                             }
                                         }
        );

        //endregion

        button159 = (Button) findViewById(R.id.button24);
        final_text59 = (TextView) findViewById(R.id.button24);
        button159.setOnLongClickListener(new View.OnLongClickListener() {
                                             //region button124
                                             @Override
                                             public boolean onLongClick(View arg0) {
                                                 LayoutInflater li = LayoutInflater.from(context2);
                                                 final View promptsView = li.inflate(R.layout.prompt5, null);
                                                 AlertDialog.Builder mDialogBuilder = new AlertDialog.Builder(context2);
                                                 mDialogBuilder.setView(promptsView);

                                                 //final EditText userInput = (EditText) promptsView.findViewById(R.id.editText2);

                                                 mDialogBuilder
                                                         .setCancelable(false)
                                                         .setPositiveButton("OK",
                                                                 new DialogInterface.OnClickListener() {
                                                                     public void onClick(DialogInterface dialog, int id) {
                                                                     }
                                                                 });

                                                 AlertDialog alertDialog = mDialogBuilder.create();
                                                 alertDialog.show();
                                                 return false;
                                             }
                                         }
        );

        //endregion

        button160 = (Button) findViewById(R.id.button27);
        final_text60 = (TextView) findViewById(R.id.button27);
        button160.setOnLongClickListener(new View.OnLongClickListener() {
                                             //region button114
                                             @Override
                                             public boolean onLongClick(View arg0) {
                                                 LayoutInflater li = LayoutInflater.from(context2);
                                                 final View promptsView = li.inflate(R.layout.prompt4, null);
                                                 AlertDialog.Builder mDialogBuilder = new AlertDialog.Builder(context2);
                                                 mDialogBuilder.setView(promptsView);

                                                 final EditText userInput = (EditText) promptsView.findViewById(R.id.editText2);

                                                 mDialogBuilder
                                                         .setCancelable(false)
                                                         .setPositiveButton("OK",
                                                                 new DialogInterface.OnClickListener() {
                                                                     public void onClick(DialogInterface dialog, int id) {

                                                                         //final EditText etNum55 = (EditText) findViewById(R.id.editText2);
                                                                         final EditText userInput = (EditText) promptsView.findViewById(R.id.editText2);
                                                                         if (userInput.getText().length() == 0)
                                                                         {
                                                                             dialog.cancel();
                                                                         }else
                                                                         {
                                                                             final_text60.setText(userInput.getText());
                                                                         }}
                                                                 })
                                                         .setNegativeButton("Отмена",
                                                                 new DialogInterface.OnClickListener() {
                                                                     public void onClick(DialogInterface dialog, int id) {
                                                                         dialog.cancel();
                                                                     }
                                                                 });
                                                 AlertDialog alertDialog = mDialogBuilder.create();
                                                 alertDialog.show();
                                                 return false;
                                             }
                                         }
        );

        //endregion

        button161 = (Button) findViewById(R.id.button28);
        final_text61 = (TextView) findViewById(R.id.button28);
        button161.setOnLongClickListener(new View.OnLongClickListener() {
                                             //region button126
                                             @Override
                                             public boolean onLongClick(View arg0) {
                                                 LayoutInflater li = LayoutInflater.from(context2);
                                                 final View promptsView = li.inflate(R.layout.prompt4, null);
                                                 AlertDialog.Builder mDialogBuilder = new AlertDialog.Builder(context2);
                                                 mDialogBuilder.setView(promptsView);

                                                 final EditText userInput = (EditText) promptsView.findViewById(R.id.editText2);

                                                 mDialogBuilder
                                                         .setCancelable(false)
                                                         .setPositiveButton("OK",
                                                                 new DialogInterface.OnClickListener() {
                                                                     public void onClick(DialogInterface dialog, int id) {

                                                                         //final EditText etNum55 = (EditText) findViewById(R.id.editText2);
                                                                         final EditText userInput = (EditText) promptsView.findViewById(R.id.editText2);
                                                                         if (userInput.getText().length() == 0)
                                                                         {
                                                                             dialog.cancel();
                                                                         }else
                                                                         {
                                                                             final_text61.setText(userInput.getText());
                                                                         }}
                                                                 })
                                                         .setNegativeButton("Отмена",
                                                                 new DialogInterface.OnClickListener() {
                                                                     public void onClick(DialogInterface dialog, int id) {
                                                                         dialog.cancel();
                                                                     }
                                                                 });
                                                 AlertDialog alertDialog = mDialogBuilder.create();
                                                 alertDialog.show();
                                                 return false;
                                             }
                                         }
        );

        //endregion

        button162 = (Button) findViewById(R.id.button29);
        final_text62 = (TextView) findViewById(R.id.button29);
        button162.setOnLongClickListener(new View.OnLongClickListener() {
                                             //region button127
                                             @Override
                                             public boolean onLongClick(View arg0) {
                                                 LayoutInflater li = LayoutInflater.from(context2);
                                                 final View promptsView = li.inflate(R.layout.prompt4, null);
                                                 AlertDialog.Builder mDialogBuilder = new AlertDialog.Builder(context2);
                                                 mDialogBuilder.setView(promptsView);

                                                 final EditText userInput = (EditText) promptsView.findViewById(R.id.editText2);

                                                 mDialogBuilder
                                                         .setCancelable(false)
                                                         .setPositiveButton("OK",
                                                                 new DialogInterface.OnClickListener() {
                                                                     public void onClick(DialogInterface dialog, int id) {

                                                                         //final EditText etNum55 = (EditText) findViewById(R.id.editText2);
                                                                         final EditText userInput = (EditText) promptsView.findViewById(R.id.editText2);
                                                                         if (userInput.getText().length() == 0)
                                                                         {
                                                                             dialog.cancel();
                                                                         }else
                                                                         {
                                                                             final_text62.setText(userInput.getText());
                                                                         }}
                                                                 })
                                                         .setNegativeButton("Отмена",
                                                                 new DialogInterface.OnClickListener() {
                                                                     public void onClick(DialogInterface dialog, int id) {
                                                                         dialog.cancel();
                                                                     }
                                                                 });
                                                 AlertDialog alertDialog = mDialogBuilder.create();
                                                 alertDialog.show();
                                                 return false;
                                             }
                                         }
        );

        //endregion

        button163 = (Button) findViewById(R.id.button30);
        final_text63 = (TextView) findViewById(R.id.button30);
        button163.setOnLongClickListener(new View.OnLongClickListener() {
                                             //region button128
                                             @Override
                                             public boolean onLongClick(View arg0) {
                                                 LayoutInflater li = LayoutInflater.from(context2);
                                                 final View promptsView = li.inflate(R.layout.prompt4, null);
                                                 AlertDialog.Builder mDialogBuilder = new AlertDialog.Builder(context2);
                                                 mDialogBuilder.setView(promptsView);

                                                 final EditText userInput = (EditText) promptsView.findViewById(R.id.editText2);

                                                 mDialogBuilder
                                                         .setCancelable(false)
                                                         .setPositiveButton("OK",
                                                                 new DialogInterface.OnClickListener() {
                                                                     public void onClick(DialogInterface dialog, int id) {

                                                                         //final EditText etNum55 = (EditText) findViewById(R.id.editText2);
                                                                         final EditText userInput = (EditText) promptsView.findViewById(R.id.editText2);
                                                                         if (userInput.getText().length() == 0)
                                                                         {
                                                                             dialog.cancel();
                                                                         }else
                                                                         {
                                                                             final_text63.setText(userInput.getText());
                                                                         }}
                                                                 })
                                                         .setNegativeButton("Отмена",
                                                                 new DialogInterface.OnClickListener() {
                                                                     public void onClick(DialogInterface dialog, int id) {
                                                                         dialog.cancel();
                                                                     }
                                                                 });
                                                 AlertDialog alertDialog = mDialogBuilder.create();
                                                 alertDialog.show();
                                                 return false;
                                             }
                                         }
        );

        //endregion


        //endregion

        //region секция 9
        button164 = (Button) findViewById(R.id.button31);
        final_text64 = (TextView) findViewById(R.id.button31);
        button164.setOnLongClickListener(new View.OnLongClickListener() {
                                             //region button123
                                             @Override
                                             public boolean onLongClick(View arg0) {
                                                 LayoutInflater li = LayoutInflater.from(context2);
                                                 final View promptsView = li.inflate(R.layout.prompt4, null);
                                                 AlertDialog.Builder mDialogBuilder = new AlertDialog.Builder(context2);
                                                 mDialogBuilder.setView(promptsView);

                                                 final EditText userInput = (EditText) promptsView.findViewById(R.id.editText2);

                                                 mDialogBuilder
                                                         .setCancelable(false)
                                                         .setPositiveButton("OK",
                                                                 new DialogInterface.OnClickListener() {
                                                                     public void onClick(DialogInterface dialog, int id) {

                                                                         //final EditText etNum55 = (EditText) findViewById(R.id.editText2);
                                                                         final EditText userInput = (EditText) promptsView.findViewById(R.id.editText2);
                                                                         if (userInput.getText().length() == 0)
                                                                         {
                                                                             dialog.cancel();
                                                                         }else
                                                                         {
                                                                             final_text64.setText(userInput.getText());
                                                                         }}
                                                                 })
                                                         .setNegativeButton("Отмена",
                                                                 new DialogInterface.OnClickListener() {
                                                                     public void onClick(DialogInterface dialog, int id) {
                                                                         dialog.cancel();
                                                                     }
                                                                 });
                                                 AlertDialog alertDialog = mDialogBuilder.create();
                                                 alertDialog.show();
                                                 return false;
                                             }
                                         }
        );

        //endregion

        button165 = (Button) findViewById(R.id.button32);
        final_text65 = (TextView) findViewById(R.id.button32);
        button165.setOnLongClickListener(new View.OnLongClickListener() {
                                             //region button124
                                             @Override
                                             public boolean onLongClick(View arg0) {
                                                 LayoutInflater li = LayoutInflater.from(context2);
                                                 final View promptsView = li.inflate(R.layout.prompt4, null);
                                                 AlertDialog.Builder mDialogBuilder = new AlertDialog.Builder(context2);
                                                 mDialogBuilder.setView(promptsView);

                                                 final EditText userInput = (EditText) promptsView.findViewById(R.id.editText2);

                                                 mDialogBuilder
                                                         .setCancelable(false)
                                                         .setPositiveButton("OK",
                                                                 new DialogInterface.OnClickListener() {
                                                                     public void onClick(DialogInterface dialog, int id) {

                                                                         //final EditText etNum55 = (EditText) findViewById(R.id.editText2);
                                                                         final EditText userInput = (EditText) promptsView.findViewById(R.id.editText2);
                                                                         if (userInput.getText().length() == 0)
                                                                         {
                                                                             dialog.cancel();
                                                                         }else
                                                                         {
                                                                             final_text65.setText(userInput.getText());
                                                                         }}
                                                                 })
                                                         .setNegativeButton("Отмена",
                                                                 new DialogInterface.OnClickListener() {
                                                                     public void onClick(DialogInterface dialog, int id) {
                                                                         dialog.cancel();
                                                                     }
                                                                 });
                                                 AlertDialog alertDialog = mDialogBuilder.create();
                                                 alertDialog.show();
                                                 return false;
                                             }
                                         }
        );

        //endregion

        button166 = (Button) findViewById(R.id.button19);
        final_text66 = (TextView) findViewById(R.id.button19);
        button166.setOnLongClickListener(new View.OnLongClickListener() {
                                             //region button114
                                             @Override
                                             public boolean onLongClick(View arg0) {
                                                 LayoutInflater li = LayoutInflater.from(context2);
                                                 final View promptsView = li.inflate(R.layout.prompt3, null);
                                                 AlertDialog.Builder mDialogBuilder = new AlertDialog.Builder(context2);
                                                 mDialogBuilder.setView(promptsView);

                                                 final EditText userInput = (EditText) promptsView.findViewById(R.id.editText2);

                                                 mDialogBuilder
                                                         .setCancelable(false)
                                                         .setPositiveButton("OK",
                                                                 new DialogInterface.OnClickListener() {
                                                                     public void onClick(DialogInterface dialog, int id) {

                                                                         //final EditText etNum55 = (EditText) findViewById(R.id.editText2);
                                                                         final EditText userInput = (EditText) promptsView.findViewById(R.id.editText2);
                                                                         if (userInput.getText().length() == 0)
                                                                         {
                                                                             dialog.cancel();
                                                                         }else
                                                                         {
                                                                             final_text66.setText(userInput.getText());
                                                                         }}
                                                                 })
                                                         .setNegativeButton("Отмена",
                                                                 new DialogInterface.OnClickListener() {
                                                                     public void onClick(DialogInterface dialog, int id) {
                                                                         dialog.cancel();
                                                                     }
                                                                 });
                                                 AlertDialog alertDialog = mDialogBuilder.create();
                                                 alertDialog.show();
                                                 return false;
                                             }
                                         }
        );

        //endregion

        button167 = (Button) findViewById(R.id.button20);
        final_text67 = (TextView) findViewById(R.id.button20);
        button167.setOnLongClickListener(new View.OnLongClickListener() {
                                             //region button126
                                             @Override
                                             public boolean onLongClick(View arg0) {
                                                 LayoutInflater li = LayoutInflater.from(context2);
                                                 final View promptsView = li.inflate(R.layout.prompt3, null);
                                                 AlertDialog.Builder mDialogBuilder = new AlertDialog.Builder(context2);
                                                 mDialogBuilder.setView(promptsView);

                                                 final EditText userInput = (EditText) promptsView.findViewById(R.id.editText2);

                                                 mDialogBuilder
                                                         .setCancelable(false)
                                                         .setPositiveButton("OK",
                                                                 new DialogInterface.OnClickListener() {
                                                                     public void onClick(DialogInterface dialog, int id) {

                                                                         //final EditText etNum55 = (EditText) findViewById(R.id.editText2);
                                                                         final EditText userInput = (EditText) promptsView.findViewById(R.id.editText2);
                                                                         if (userInput.getText().length() == 0)
                                                                         {
                                                                             dialog.cancel();
                                                                         }else
                                                                         {
                                                                             final_text67.setText(userInput.getText());
                                                                         }}
                                                                 })
                                                         .setNegativeButton("Отмена",
                                                                 new DialogInterface.OnClickListener() {
                                                                     public void onClick(DialogInterface dialog, int id) {
                                                                         dialog.cancel();
                                                                     }
                                                                 });
                                                 AlertDialog alertDialog = mDialogBuilder.create();
                                                 alertDialog.show();
                                                 return false;
                                             }
                                         }
        );

        //endregion

        button168 = (Button) findViewById(R.id.button25);
        final_text68 = (TextView) findViewById(R.id.button25);
        button168.setOnLongClickListener(new View.OnLongClickListener() {
                                             //region button127
                                             @Override
                                             public boolean onLongClick(View arg0) {
                                                 LayoutInflater li = LayoutInflater.from(context2);
                                                 final View promptsView = li.inflate(R.layout.prompt3, null);
                                                 AlertDialog.Builder mDialogBuilder = new AlertDialog.Builder(context2);
                                                 mDialogBuilder.setView(promptsView);

                                                 final EditText userInput = (EditText) promptsView.findViewById(R.id.editText2);

                                                 mDialogBuilder
                                                         .setCancelable(false)
                                                         .setPositiveButton("OK",
                                                                 new DialogInterface.OnClickListener() {
                                                                     public void onClick(DialogInterface dialog, int id) {

                                                                         //final EditText etNum55 = (EditText) findViewById(R.id.editText2);
                                                                         final EditText userInput = (EditText) promptsView.findViewById(R.id.editText2);
                                                                         if (userInput.getText().length() == 0)
                                                                         {
                                                                             dialog.cancel();
                                                                         }else
                                                                         {
                                                                             final_text68.setText(userInput.getText());
                                                                         }}
                                                                 })
                                                         .setNegativeButton("Отмена",
                                                                 new DialogInterface.OnClickListener() {
                                                                     public void onClick(DialogInterface dialog, int id) {
                                                                         dialog.cancel();
                                                                     }
                                                                 });
                                                 AlertDialog alertDialog = mDialogBuilder.create();
                                                 alertDialog.show();
                                                 return false;
                                             }
                                         }
        );

        //endregion


        //endregion

        //region секция 10
        button169 = (Button) findViewById(R.id.button41);
        final_text69 = (TextView) findViewById(R.id.button41);
        button169.setOnLongClickListener(new View.OnLongClickListener() {
                                             //region button123
                                             @Override
                                             public boolean onLongClick(View arg0) {
                                                 LayoutInflater li = LayoutInflater.from(context2);
                                                 final View promptsView = li.inflate(R.layout.prompt6, null);
                                                 AlertDialog.Builder mDialogBuilder = new AlertDialog.Builder(context2);
                                                 mDialogBuilder.setView(promptsView);

                                                 //final EditText userInput = (EditText) promptsView.findViewById(R.id.editText2);

                                                 mDialogBuilder
                                                         .setCancelable(false)
                                                         .setPositiveButton("OK",
                                                                 new DialogInterface.OnClickListener() {
                                                                     public void onClick(DialogInterface dialog, int id) {
                                                                     }
                                                                 });

                                                 AlertDialog alertDialog = mDialogBuilder.create();
                                                 alertDialog.show();
                                                 return false;
                                             }
                                         }
        );


        //endregion

        button170 = (Button) findViewById(R.id.button42);
        final_text70 = (TextView) findViewById(R.id.button42);
        button170.setOnLongClickListener(new View.OnLongClickListener() {
                                             //region button124
                                             @Override
                                             public boolean onLongClick(View arg0) {
                                                 LayoutInflater li = LayoutInflater.from(context2);
                                                 final View promptsView = li.inflate(R.layout.prompt6, null);
                                                 AlertDialog.Builder mDialogBuilder = new AlertDialog.Builder(context2);
                                                 mDialogBuilder.setView(promptsView);

                                                 //final EditText userInput = (EditText) promptsView.findViewById(R.id.editText2);

                                                 mDialogBuilder
                                                         .setCancelable(false)
                                                         .setPositiveButton("OK",
                                                                 new DialogInterface.OnClickListener() {
                                                                     public void onClick(DialogInterface dialog, int id) {
                                                                     }
                                                                 });

                                                 AlertDialog alertDialog = mDialogBuilder.create();
                                                 alertDialog.show();
                                                 return false;
                                             }
                                         }
        );
        //endregion

        button171 = (Button) findViewById(R.id.button43);
        final_text71 = (TextView) findViewById(R.id.button43);
        button171.setOnLongClickListener(new View.OnLongClickListener() {
                                             //region button114
                                             @Override
                                             public boolean onLongClick(View arg0) {
                                                 LayoutInflater li = LayoutInflater.from(context2);
                                                 final View promptsView = li.inflate(R.layout.prompt6, null);
                                                 AlertDialog.Builder mDialogBuilder = new AlertDialog.Builder(context2);
                                                 mDialogBuilder.setView(promptsView);

                                                 //final EditText userInput = (EditText) promptsView.findViewById(R.id.editText2);

                                                 mDialogBuilder
                                                         .setCancelable(false)
                                                         .setPositiveButton("OK",
                                                                 new DialogInterface.OnClickListener() {
                                                                     public void onClick(DialogInterface dialog, int id) {
                                                                     }
                                                                 });

                                                 AlertDialog alertDialog = mDialogBuilder.create();
                                                 alertDialog.show();
                                                 return false;
                                             }
                                         }
        );
        //endregion

        button172 = (Button) findViewById(R.id.button44);
        final_text72 = (TextView) findViewById(R.id.button44);
        button172.setOnLongClickListener(new View.OnLongClickListener() {
                                             //region button126
                                             @Override
                                             public boolean onLongClick(View arg0) {
                                                 LayoutInflater li = LayoutInflater.from(context2);
                                                 final View promptsView = li.inflate(R.layout.prompt6, null);
                                                 AlertDialog.Builder mDialogBuilder = new AlertDialog.Builder(context2);
                                                 mDialogBuilder.setView(promptsView);

                                                 //final EditText userInput = (EditText) promptsView.findViewById(R.id.editText2);

                                                 mDialogBuilder
                                                         .setCancelable(false)
                                                         .setPositiveButton("OK",
                                                                 new DialogInterface.OnClickListener() {
                                                                     public void onClick(DialogInterface dialog, int id) {
                                                                     }
                                                                 });

                                                 AlertDialog alertDialog = mDialogBuilder.create();
                                                 alertDialog.show();
                                                 return false;
                                             }
                                         }
        );

        //endregion
        button173 = (Button) findViewById(R.id.button45);
        final_text73 = (TextView) findViewById(R.id.button45);
        button173.setOnLongClickListener(new View.OnLongClickListener() {
                                             //region button114
                                             @Override
                                             public boolean onLongClick(View arg0) {
                                                 LayoutInflater li = LayoutInflater.from(context2);
                                                 final View promptsView = li.inflate(R.layout.prompt5, null);
                                                 AlertDialog.Builder mDialogBuilder = new AlertDialog.Builder(context2);
                                                 mDialogBuilder.setView(promptsView);

                                                 //final EditText userInput = (EditText) promptsView.findViewById(R.id.editText2);

                                                 mDialogBuilder
                                                         .setCancelable(false)
                                                         .setPositiveButton("OK",
                                                                 new DialogInterface.OnClickListener() {
                                                                     public void onClick(DialogInterface dialog, int id) {
                                                                     }
                                                                 });

                                                 AlertDialog alertDialog = mDialogBuilder.create();
                                                 alertDialog.show();
                                                 return false;
                                             }
                                         }
        );

        //endregion

        button174 = (Button) findViewById(R.id.button46);
        final_text74 = (TextView) findViewById(R.id.button46);
        button174.setOnLongClickListener(new View.OnLongClickListener() {
                                             //region button126
                                             @Override
                                             public boolean onLongClick(View arg0) {
                                                 LayoutInflater li = LayoutInflater.from(context2);
                                                 final View promptsView = li.inflate(R.layout.prompt5, null);
                                                 AlertDialog.Builder mDialogBuilder = new AlertDialog.Builder(context2);
                                                 mDialogBuilder.setView(promptsView);

                                                 //final EditText userInput = (EditText) promptsView.findViewById(R.id.editText2);

                                                 mDialogBuilder
                                                         .setCancelable(false)
                                                         .setPositiveButton("OK",
                                                                 new DialogInterface.OnClickListener() {
                                                                     public void onClick(DialogInterface dialog, int id) {
                                                                     }
                                                                 });

                                                 AlertDialog alertDialog = mDialogBuilder.create();
                                                 alertDialog.show();
                                                 return false;
                                             }
                                         }
        );

        //endregion


        //endregion
        button175 = (Button) findViewById(R.id.button21);
        final_text75 = (TextView) findViewById(R.id.button21);
        button175.setOnLongClickListener(new View.OnLongClickListener() {
                                             //region button114
                                             @Override
                                             public boolean onLongClick(View arg0) {
                                                 LayoutInflater li = LayoutInflater.from(context2);
                                                 final View promptsView = li.inflate(R.layout.prompt5, null);
                                                 AlertDialog.Builder mDialogBuilder = new AlertDialog.Builder(context2);
                                                 mDialogBuilder.setView(promptsView);

                                                 //final EditText userInput = (EditText) promptsView.findViewById(R.id.editText2);

                                                 mDialogBuilder
                                                         .setCancelable(false)
                                                         .setPositiveButton("OK",
                                                                 new DialogInterface.OnClickListener() {
                                                                     public void onClick(DialogInterface dialog, int id) {
                                                                     }
                                                                 });

                                                 AlertDialog alertDialog = mDialogBuilder.create();
                                                 alertDialog.show();
                                                 return false;
                                             }
                                         }
        );

        //endregion

        button176 = (Button) findViewById(R.id.button22);
        final_text76 = (TextView) findViewById(R.id.button22);
        button176.setOnLongClickListener(new View.OnLongClickListener() {
                                             //region button126
                                             @Override
                                             public boolean onLongClick(View arg0) {
                                                 LayoutInflater li = LayoutInflater.from(context2);
                                                 final View promptsView = li.inflate(R.layout.prompt5, null);
                                                 AlertDialog.Builder mDialogBuilder = new AlertDialog.Builder(context2);
                                                 mDialogBuilder.setView(promptsView);

                                                 //final EditText userInput = (EditText) promptsView.findViewById(R.id.editText2);

                                                 mDialogBuilder
                                                         .setCancelable(false)
                                                         .setPositiveButton("OK",
                                                                 new DialogInterface.OnClickListener() {
                                                                     public void onClick(DialogInterface dialog, int id) {
                                                                     }
                                                                 });

                                                 AlertDialog alertDialog = mDialogBuilder.create();
                                                 alertDialog.show();
                                                 return false;
                                             }
                                         }
        );

        //endregion

        button177 = (Button) findViewById(R.id.button36);
        final_text77 = (TextView) findViewById(R.id.button36);
        button177.setOnLongClickListener(new View.OnLongClickListener() {
                                             //region button123
                                             @Override
                                             public boolean onLongClick(View arg0) {
                                                 LayoutInflater li = LayoutInflater.from(context2);
                                                 final View promptsView = li.inflate(R.layout.prompt6, null);
                                                 AlertDialog.Builder mDialogBuilder = new AlertDialog.Builder(context2);
                                                 mDialogBuilder.setView(promptsView);

                                                 //final EditText userInput = (EditText) promptsView.findViewById(R.id.editText2);

                                                 mDialogBuilder
                                                         .setCancelable(false)
                                                         .setPositiveButton("OK",
                                                                 new DialogInterface.OnClickListener() {
                                                                     public void onClick(DialogInterface dialog, int id) {
                                                                     }
                                                                 });

                                                 AlertDialog alertDialog = mDialogBuilder.create();
                                                 alertDialog.show();
                                                 return false;
                                             }
                                         }
        );


        //endregion

        button178 = (Button) findViewById(R.id.button37);
        final_text78 = (TextView) findViewById(R.id.button37);
        button178.setOnLongClickListener(new View.OnLongClickListener() {
                                             //region button124
                                             @Override
                                             public boolean onLongClick(View arg0) {
                                                 LayoutInflater li = LayoutInflater.from(context2);
                                                 final View promptsView = li.inflate(R.layout.prompt6, null);
                                                 AlertDialog.Builder mDialogBuilder = new AlertDialog.Builder(context2);
                                                 mDialogBuilder.setView(promptsView);

                                                 //final EditText userInput = (EditText) promptsView.findViewById(R.id.editText2);

                                                 mDialogBuilder
                                                         .setCancelable(false)
                                                         .setPositiveButton("OK",
                                                                 new DialogInterface.OnClickListener() {
                                                                     public void onClick(DialogInterface dialog, int id) {
                                                                     }
                                                                 });

                                                 AlertDialog alertDialog = mDialogBuilder.create();
                                                 alertDialog.show();
                                                 return false;
                                             }
                                         }
        );
        //endregion

        imageView1 = (ImageView) findViewById(R.id.imageView24);
        imageView1.setOnClickListener(new View.OnClickListener() {
                                          //region button124
                                          @Override
                                          public void onClick(View arg0) {
                                              LayoutInflater li = LayoutInflater.from(context2);
                                              final View promptsView = li.inflate(R.layout.prompt7, null);
                                              AlertDialog.Builder mDialogBuilder = new AlertDialog.Builder(context2);
                                              mDialogBuilder.setView(promptsView);

                                              //final EditText userInput = (EditText) promptsView.findViewById(R.id.editText2);

                                              mDialogBuilder
                                                      .setCancelable(false)
                                                      .setPositiveButton("OK",
                                                              new DialogInterface.OnClickListener() {
                                                                  public void onClick(DialogInterface dialog, int id) {
                                                                  }
                                                              });

                                              AlertDialog alertDialog = mDialogBuilder.create();
                                              alertDialog.show();
                                              return;
                                          }
                                      }
        );
        //endregion


        //endregion

        //region секция 12 button 26. 33. 34. 35


        button179 = (Button) findViewById(R.id.button26);
        final_text79 = (TextView) findViewById(R.id.button26);
        button179.setOnLongClickListener(new View.OnLongClickListener() {
                                             //region button112
                                             @Override
                                             public boolean onLongClick(View arg0) {
                                                 LayoutInflater li = LayoutInflater.from(context2);
                                                 final View promptsView = li.inflate(R.layout.prompt, null);
                                                 AlertDialog.Builder mDialogBuilder = new AlertDialog.Builder(context2);
                                                 mDialogBuilder.setView(promptsView);

                                                 final EditText userInput = (EditText) promptsView.findViewById(R.id.editText2);

                                                 mDialogBuilder
                                                         .setCancelable(false)
                                                         .setPositiveButton("OK",
                                                                 new DialogInterface.OnClickListener() {
                                                                     public void onClick(DialogInterface dialog, int id) {

                                                                         //final EditText etNum55 = (EditText) findViewById(R.id.editText2);
                                                                         final EditText userInput = (EditText) promptsView.findViewById(R.id.editText2);
                                                                         if (userInput.getText().length() == 0)
                                                                         {
                                                                             dialog.cancel();
                                                                         }else
                                                                         {
                                                                             final_text79.setText(userInput.getText());
                                                                         }}
                                                                 })
                                                         .setNegativeButton("Отмена",
                                                                 new DialogInterface.OnClickListener() {
                                                                     public void onClick(DialogInterface dialog, int id) {
                                                                         dialog.cancel();
                                                                     }
                                                                 });
                                                 AlertDialog alertDialog = mDialogBuilder.create();
                                                 alertDialog.show();
                                                 return false;
                                             }
                                         }
        );

        //endregion

        button180 = (Button) findViewById(R.id.button33);
        final_text80 = (TextView) findViewById(R.id.button33);
        button180.setOnLongClickListener(new View.OnLongClickListener() {
                                             //region button113
                                             @Override
                                             public boolean onLongClick(View arg0) {
                                                 LayoutInflater li = LayoutInflater.from(context2);
                                                 final View promptsView = li.inflate(R.layout.prompt, null);
                                                 AlertDialog.Builder mDialogBuilder = new AlertDialog.Builder(context2);
                                                 mDialogBuilder.setView(promptsView);

                                                 final EditText userInput = (EditText) promptsView.findViewById(R.id.editText2);

                                                 mDialogBuilder
                                                         .setCancelable(false)
                                                         .setPositiveButton("OK",
                                                                 new DialogInterface.OnClickListener() {
                                                                     public void onClick(DialogInterface dialog, int id) {

                                                                         //final EditText etNum55 = (EditText) findViewById(R.id.editText2);
                                                                         final EditText userInput = (EditText) promptsView.findViewById(R.id.editText2);
                                                                         if (userInput.getText().length() == 0)
                                                                         {
                                                                             dialog.cancel();
                                                                         }else
                                                                         {
                                                                             final_text80.setText(userInput.getText());
                                                                         }}
                                                                 })
                                                         .setNegativeButton("Отмена",
                                                                 new DialogInterface.OnClickListener() {
                                                                     public void onClick(DialogInterface dialog, int id) {
                                                                         dialog.cancel();
                                                                     }
                                                                 });
                                                 AlertDialog alertDialog = mDialogBuilder.create();
                                                 alertDialog.show();
                                                 return false;
                                             }
                                         }
        );

        //endregion

        button181 = (Button) findViewById(R.id.button34);
        final_text81 = (TextView) findViewById(R.id.button34);
        button181.setOnLongClickListener(new View.OnLongClickListener() {
                                             //region button114
                                             @Override
                                             public boolean onLongClick(View arg0) {
                                                 LayoutInflater li = LayoutInflater.from(context2);
                                                 final View promptsView = li.inflate(R.layout.prompt, null);
                                                 AlertDialog.Builder mDialogBuilder = new AlertDialog.Builder(context2);
                                                 mDialogBuilder.setView(promptsView);

                                                 final EditText userInput = (EditText) promptsView.findViewById(R.id.editText2);

                                                 mDialogBuilder
                                                         .setCancelable(false)
                                                         .setPositiveButton("OK",
                                                                 new DialogInterface.OnClickListener() {
                                                                     public void onClick(DialogInterface dialog, int id) {

                                                                         //final EditText etNum55 = (EditText) findViewById(R.id.editText2);
                                                                         final EditText userInput = (EditText) promptsView.findViewById(R.id.editText2);
                                                                         if (userInput.getText().length() == 0)
                                                                         {
                                                                             dialog.cancel();
                                                                         }else
                                                                         {
                                                                             final_text81.setText(userInput.getText());
                                                                         }}
                                                                 })
                                                         .setNegativeButton("Отмена",
                                                                 new DialogInterface.OnClickListener() {
                                                                     public void onClick(DialogInterface dialog, int id) {
                                                                         dialog.cancel();
                                                                     }
                                                                 });
                                                 AlertDialog alertDialog = mDialogBuilder.create();
                                                 alertDialog.show();
                                                 return false;
                                             }
                                         }
        );

        //endregion

        button182 = (Button) findViewById(R.id.button35);
        final_text82 = (TextView) findViewById(R.id.button35);
        button182.setOnLongClickListener(new View.OnLongClickListener() {
                                             //region button113
                                             @Override
                                             public boolean onLongClick(View arg0) {
                                                 LayoutInflater li = LayoutInflater.from(context2);
                                                 final View promptsView = li.inflate(R.layout.prompt, null);
                                                 AlertDialog.Builder mDialogBuilder = new AlertDialog.Builder(context2);
                                                 mDialogBuilder.setView(promptsView);

                                                 final EditText userInput = (EditText) promptsView.findViewById(R.id.editText2);

                                                 mDialogBuilder
                                                         .setCancelable(false)
                                                         .setPositiveButton("OK",
                                                                 new DialogInterface.OnClickListener() {
                                                                     public void onClick(DialogInterface dialog, int id) {

                                                                         //final EditText etNum55 = (EditText) findViewById(R.id.editText2);
                                                                         final EditText userInput = (EditText) promptsView.findViewById(R.id.editText2);
                                                                         if (userInput.getText().length() == 0)
                                                                         {
                                                                             dialog.cancel();
                                                                         }else
                                                                         {
                                                                             final_text15.setText(userInput.getText());
                                                                         }}
                                                                 })
                                                         .setNegativeButton("Отмена",
                                                                 new DialogInterface.OnClickListener() {
                                                                     public void onClick(DialogInterface dialog, int id) {
                                                                         dialog.cancel();
                                                                     }
                                                                 });
                                                 AlertDialog alertDialog = mDialogBuilder.create();
                                                 alertDialog.show();
                                                 return false;
                                             }
                                         }
        );

        //endregion




        //endregion




//endregion


        // &&&&&&&

//region секция - для копирования
        //endregion - для копирования

        //region секция btn1-btn11
        btn1 = (Button) findViewById(R.id.button10);
        btn2 = (Button) findViewById(R.id.button2);
        btn3 = (Button) findViewById(R.id.button);
        btn4 = (Button) findViewById(R.id.button3);
        btn5 = (Button) findViewById(R.id.button5);
        btn6 = (Button) findViewById(R.id.button6);
        btn7 = (Button) findViewById(R.id.button7);
        btn8 = (Button) findViewById(R.id.button38);
        btn9 = (Button) findViewById(R.id.button40);
        btn10 = (Button) findViewById(R.id.button39);
        btn11 = (Button) findViewById(R.id.button8);
        //endregion

        //region секция btn23-btn33
        btn23 = (Button) findViewById(R.id.button97);
        btn24 = (Button) findViewById(R.id.button98);
        btn25 = (Button) findViewById(R.id.button99);
        btn26 = (Button) findViewById(R.id.button100);
        btn27 = (Button) findViewById(R.id.button101);
        btn28 = (Button) findViewById(R.id.button102);
        btn29 = (Button) findViewById(R.id.button103);
        btn30 = (Button) findViewById(R.id.button104);
        btn31 = (Button) findViewById(R.id.button105);
        btn32 = (Button) findViewById(R.id.button11);
        btn33 = (Button) findViewById(R.id.button12);
        //endregion

        //region секция btn34-btn51
        btn34 = (Button) findViewById(R.id.button52);
        btn35 = (Button) findViewById(R.id.button53);
        btn36 = (Button) findViewById(R.id.button54);
        btn37 = (Button) findViewById(R.id.button55);
        btn38 = (Button) findViewById(R.id.button59);
        btn39 = (Button) findViewById(R.id.button60);

        btn40 = (Button) findViewById(R.id.button61);
        btn41 = (Button) findViewById(R.id.button62);
        btn42 = (Button) findViewById(R.id.button63);
        btn43 = (Button) findViewById(R.id.button64);
        btn44 = (Button) findViewById(R.id.button65);
        btn45 = (Button) findViewById(R.id.button66);

        btn46 = (Button) findViewById(R.id.button70);
        btn47 = (Button) findViewById(R.id.button71);
        btn48 = (Button) findViewById(R.id.button72);
        btn49 = (Button) findViewById(R.id.button73);
        btn50 = (Button) findViewById(R.id.button74);
        btn51 = (Button) findViewById(R.id.button75);
        //endregion

        //region секция btn52-btn82
        btn52 = (Button) findViewById(R.id.button15);
        btn53 = (Button) findViewById(R.id.button16);
        btn54 = (Button) findViewById(R.id.button17);
        btn55 = (Button) findViewById(R.id.button18);

        btn56 = (Button) findViewById(R.id.button21);
        btn57 = (Button) findViewById(R.id.button22);
        btn58 = (Button) findViewById(R.id.button23);
        btn59 = (Button) findViewById(R.id.button24);

        btn60 = (Button) findViewById(R.id.button27);
        btn61 = (Button) findViewById(R.id.button28);
        btn62 = (Button) findViewById(R.id.button29);
        btn63 = (Button) findViewById(R.id.button30);
        btn64 = (Button) findViewById(R.id.button31);
        btn65 = (Button) findViewById(R.id.button32);

        btn66 = (Button) findViewById(R.id.button19);
        btn67 = (Button) findViewById(R.id.button20);
        btn68 = (Button) findViewById(R.id.button25);

        btn69 = (Button) findViewById(R.id.button41);
        btn70 = (Button) findViewById(R.id.button42);
        btn71 = (Button) findViewById(R.id.button43);
        btn72 = (Button) findViewById(R.id.button44);

        btn73 = (Button) findViewById(R.id.button45);
        btn74 = (Button) findViewById(R.id.button46);

        btn77 = (Button) findViewById(R.id.button36);
        btn78 = (Button) findViewById(R.id.button37);

        btn79 = (Button) findViewById(R.id.button26);
        btn80 = (Button) findViewById(R.id.button33);
        btn81 = (Button) findViewById(R.id.button34);
        btn82 = (Button) findViewById(R.id.button35);


        //endregion


        //region секция wir_1-wir_10
        wir_1 = (TextView) findViewById(R.id.textViewWir);
       // wir_2 = (TextView) findViewById(R.id.textViewWir2);
        wir_3 = (TextView) findViewById(R.id.textViewWir3);
        wir_4 = (TextView) findViewById(R.id.textViewWir4);
        wir_5 = (TextView) findViewById(R.id.textViewWir5);
        wir_6 = (TextView) findViewById(R.id.textViewWir6);

        wir_7 = (TextView) findViewById(R.id.textViewWir7);
        wir_8 = (TextView) findViewById(R.id.textViewWir8);
        wir_9 = (TextView) findViewById(R.id.textViewWir9);
        wir_10 = (TextView) findViewById(R.id.textViewWir10);
        wir_11 = (TextView) findViewById(R.id.textViewWir11);
        wir_12 = (TextView) findViewById(R.id.textViewWir12);




        //endregion


        View.OnClickListener btnClk = new View.OnClickListener() {

            @Override
            public void onClick(View v) {


                long mills = 15L;
                Vibrator vibrator = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);
                vibrator.vibrate(mills);

                final TextView bill = (TextView) findViewById(R.id.button8);
                if (bill.getText().length() == 0)
                {
                    Toast toast = Toast.makeText(getApplicationContext(),
                            "Заполнение пустых ячеек", Toast.LENGTH_LONG);

                    toast.show();

                    final TextView bill1 = (TextView) findViewById(R.id.button10);
                    final TextView bill2 = (TextView) findViewById(R.id.button2);
                    final TextView bill3 = (TextView) findViewById(R.id.button);
                    final TextView bill4 = (TextView) findViewById(R.id.button3);
                    final TextView bill5 = (TextView) findViewById(R.id.button5);
                    final TextView bill6 = (TextView) findViewById(R.id.button6);
                    final TextView bill7 = (TextView) findViewById(R.id.button7);
                    final TextView bill8 = (TextView) findViewById(R.id.button38);
                    final TextView bill9 = (TextView) findViewById(R.id.button40);
                    final TextView bill10 = (TextView) findViewById(R.id.button39);
                    final TextView bill11 = (TextView) findViewById(R.id.button8);



                    final TextView bill23 = (TextView) findViewById(R.id.button97);
                    final TextView bill24 = (TextView) findViewById(R.id.button98);
                    final TextView bill25 = (TextView) findViewById(R.id.button99);
                    final TextView bill26 = (TextView) findViewById(R.id.button100);
                    final TextView bill27 = (TextView) findViewById(R.id.button101);
                    final TextView bill28 = (TextView) findViewById(R.id.button102);
                    final TextView bill29 = (TextView) findViewById(R.id.button103);
                    final TextView bill30 = (TextView) findViewById(R.id.button104);
                    final TextView bill31 = (TextView) findViewById(R.id.button105);
                    final TextView bill32 = (TextView) findViewById(R.id.button11);
                    final TextView bill33 = (TextView) findViewById(R.id.button12);

                    final TextView bill34 = (TextView) findViewById(R.id.button52);
                    final TextView bill35 = (TextView) findViewById(R.id.button53);
                    final TextView bill36 = (TextView) findViewById(R.id.button54);
                    final TextView bill37 = (TextView) findViewById(R.id.button55);
                    final TextView bill38 = (TextView) findViewById(R.id.button59);
                    final TextView bill39 = (TextView) findViewById(R.id.button60);

                    final TextView bill40 = (TextView) findViewById(R.id.button61);
                    final TextView bill41 = (TextView) findViewById(R.id.button62);
                    final TextView bill42 = (TextView) findViewById(R.id.button63);
                    final TextView bill43 = (TextView) findViewById(R.id.button64);
                    final TextView bill44 = (TextView) findViewById(R.id.button65);
                    final TextView bill45 = (TextView) findViewById(R.id.button66);

                    final TextView bill46 = (TextView) findViewById(R.id.button70);
                    final TextView bill47 = (TextView) findViewById(R.id.button71);
                    final TextView bill48 = (TextView) findViewById(R.id.button72);
                    final TextView bill49 = (TextView) findViewById(R.id.button73);
                    final TextView bill50 = (TextView) findViewById(R.id.button74);
                    final TextView bill51 = (TextView) findViewById(R.id.button75);


                    final TextView bill52 = (TextView) findViewById(R.id.button15);
                    final TextView bill53 = (TextView) findViewById(R.id.button16);
                    final TextView bill54 = (TextView) findViewById(R.id.button17);
                    final TextView bill55 = (TextView) findViewById(R.id.button18);

                    final TextView bill56 = (TextView) findViewById(R.id.button21);
                    final TextView bill57 = (TextView) findViewById(R.id.button22);
                    final TextView bill58 = (TextView) findViewById(R.id.button23);
                    final TextView bill59 = (TextView) findViewById(R.id.button24);

                    final TextView bill60 = (TextView) findViewById(R.id.button27);
                    final TextView bill61 = (TextView) findViewById(R.id.button28);
                    final TextView bill62 = (TextView) findViewById(R.id.button29);
                    final TextView bill63 = (TextView) findViewById(R.id.button30);
                    final TextView bill64 = (TextView) findViewById(R.id.button31);
                    final TextView bill65 = (TextView) findViewById(R.id.button32);

                    final TextView bill66 = (TextView) findViewById(R.id.button19);
                    final TextView bill67 = (TextView) findViewById(R.id.button20);
                    final TextView bill68 = (TextView) findViewById(R.id.button25);

                    final TextView bill69 = (TextView) findViewById(R.id.button41);
                    final TextView bill70 = (TextView) findViewById(R.id.button42);
                    final TextView bill71 = (TextView) findViewById(R.id.button43);
                    final TextView bill72 = (TextView) findViewById(R.id.button44);

                    final TextView bill73 = (TextView) findViewById(R.id.button45);
                    final TextView bill74 = (TextView) findViewById(R.id.button46);

                    final TextView bill79 = (TextView) findViewById(R.id.button26);
                    final TextView bill80 = (TextView) findViewById(R.id.button33);
                    final TextView bill81 = (TextView) findViewById(R.id.button34);
                    final TextView bill82 = (TextView) findViewById(R.id.button35);

                    final TextView bill83 = (TextView) findViewById(R.id.textView14);
                    final TextView bill84 = (TextView) findViewById(R.id.textView20);
                    final TextView bill85 = (TextView) findViewById(R.id.textView43);
                    final TextView bill86 = (TextView) findViewById(R.id.textView24);
                    final TextView bill87 = (TextView) findViewById(R.id.textView39);
                    final TextView bill88 = (TextView) findViewById(R.id.textView37);
                    final TextView bill89 = (TextView) findViewById(R.id.textView28);

                    etText83 = (TextView) findViewById(R.id.textView14);
                    etText84 = (TextView) findViewById(R.id.textView20);
                    etText85 = (TextView) findViewById(R.id.textView43);
                    etText86 = (TextView) findViewById(R.id.textView24);
                    etText87 = (TextView) findViewById(R.id.textView39);
                    etText88 = (TextView) findViewById(R.id.textView37);
                    etText89 = (TextView) findViewById(R.id.textView28);

                    //final TextView bill75 = (TextView) findViewById(R.id.button36);
                    //final TextView bill76 = (TextView) findViewById(R.id.button37);







                    bill1.setText(32 + "");
                    bill2.setText(36 + "");
                    bill3.setText(40 + "");
                    bill4.setText(44 + "");
                    bill5.setText(48 + "");
                    bill6.setText(54 + "");
                    bill7.setText(58 + "");
                    bill8.setText(62 + "");
                    bill9.setText(66 + "");
                    bill10.setText(70 + "");
                    bill11.setText(74 + "");


                    //////////
                    //bill23.setText(0 + "");

                    // bill33.setText(13 + "");

                    bill34.setText(0 + "");
                    bill35.setText(12 + "");
                    bill36.setText(25 + "");
                    bill37.setText(30 + "");
                    bill38.setText(50 + "");
                    bill39.setText(100 + "");

                    bill40.setText(0 + "");
                    bill41.setText(12 + "");
                    bill42.setText(25 + "");
                    bill43.setText(30 + "");
                    bill44.setText(50 + "");
                    bill45.setText(100 + "");

                    bill46.setText(0 + "");
                    bill47.setText(400 + "");
                    bill48.setText(500 + "");
                    bill49.setText(550 + "");
                    bill50.setText(600 + "");
                    bill51.setText(700 + "");


                    bill52.setText(10 + "");
                    bill53.setText(12 + "");
                    bill54.setText(14 + "");
                    bill55.setText(16 + "");

                    bill56.setText(8 + "");
                    bill57.setText(10 + "");
                    bill58.setText(12 + "");
                    bill59.setText(14 + "");

                    bill60.setText(15 + "");
                    bill61.setText(20 + "");
                    bill62.setText(25 + "");
                    bill63.setText(30 + "");
                    bill64.setText(40 + "");
                    bill65.setText(50 + "");

                    bill66.setText(8 + "");
                    bill67.setText(10 + "");
                    bill68.setText(15 + "");

                    bill69.setText(2 + "");
                    bill70.setText(4 + "");
                    bill71.setText(6 + "");
                    bill72.setText(8 + "");

                    bill73.setText(18 + "");
                    bill74.setText(20 + "");

                    bill79.setText(2 + "");
                    bill80.setText(5 + "");
                    bill81.setText(10 + "");
                    bill82.setText(15 + "");

                    bill83.setText(00.00 + "");
                    bill84.setText(00.00 + "");
                    bill85.setText(00.00 + "");
                    bill86.setText(00.00 + "");
                    bill87.setText(00.00 + "");
                    bill88.setText(00.00 + "");
                    bill89.setText(00.00 + "");




                }else
                {



                switch (v.getId()) {


                    //region секция 1.1 (case R.id.button10:)
                    case R.id.button10:
                        TextView textView001 = (TextView) findViewById(R.id.textViewWir);
                        aetText1 = (Button) findViewById(R.id.button10);
                        float num001 = Float.parseFloat(aetText1.getText().toString());
                        float w = (float) num001;
                        textView001.setText(String.format(Locale.US, "%.2f", w) + "");
                        Animation anim1 = AnimationUtils.loadAnimation(
                                  getApplicationContext(), R.anim.sms_anim);
                          final Button button1 = (Button) findViewById(R.id.button10);
                           button1.startAnimation(anim1);
                        break;

                    case R.id.button2:
                        TextView textView002 = (TextView) findViewById(R.id.textViewWir);
                        aetText2 = (Button) findViewById(R.id.button2);
                        float num002 = Float.parseFloat(aetText2.getText().toString());
                        float w2 = (float) num002;
                        textView002.setText(String.format(Locale.US, "%.2f", w2) + "");
                         Animation anim2 = AnimationUtils.loadAnimation(
                                 getApplicationContext(), R.anim.sms_anim);
                          final Button button2 = (Button) findViewById(R.id.button2);
                         button2.startAnimation(anim2);
                        break;

                    case R.id.button:
                        TextView textView003 = (TextView) findViewById(R.id.textViewWir);
                        aetText3 = (Button) findViewById(R.id.button);
                        float num003 = Float.parseFloat(aetText3.getText().toString());
                        float w3 = (float) num003;
                        textView003.setText(String.format(Locale.US, "%.2f", w3) + "");
                         Animation anim3 = AnimationUtils.loadAnimation(
                                  getApplicationContext(), R.anim.sms_anim);
                          final Button button3 = (Button) findViewById(R.id.button);
                           button3.startAnimation(anim3);
                        break;


                    case R.id.button3:
                        TextView textView004 = (TextView) findViewById(R.id.textViewWir);
                        aetText4 = (Button) findViewById(R.id.button3);
                        float num004 = Float.parseFloat(aetText4.getText().toString());
                        float w4 = (float) num004;
                        textView004.setText(String.format(Locale.US, "%.2f", w4) + "");
                          Animation anim4 = AnimationUtils.loadAnimation(
                                   getApplicationContext(), R.anim.sms_anim);
                           final Button button4 = (Button) findViewById(R.id.button3);
                           button4.startAnimation(anim4);
                        break;


                    case R.id.button5:
                        TextView textView005 = (TextView) findViewById(R.id.textViewWir);
                        aetText5 = (Button) findViewById(R.id.button5);
                        float num005 = Float.parseFloat(aetText5.getText().toString());
                        float w5 = (float) num005;
                        textView005.setText(String.format(Locale.US, "%.2f", w5) + "");
                         Animation anim5 = AnimationUtils.loadAnimation(
                                  getApplicationContext(), R.anim.sms_anim);
                          final Button button5 = (Button) findViewById(R.id.button5);
                           button5.startAnimation(anim5);
                        break;


                    case R.id.button6:
                        TextView textView006 = (TextView) findViewById(R.id.textViewWir);
                        aetText6 = (Button) findViewById(R.id.button6);
                        float num006 = Float.parseFloat(aetText6.getText().toString());
                        float w6 = (float) num006;
                        textView006.setText(String.format(Locale.US, "%.2f", w6) + "");
                         Animation anim6 = AnimationUtils.loadAnimation(
                                 getApplicationContext(), R.anim.sms_anim);
                          final Button button6 = (Button) findViewById(R.id.button6);
                          button6.startAnimation(anim6);
                        break;


                    case R.id.button7:
                        TextView textView007 = (TextView) findViewById(R.id.textViewWir);
                        aetText7 = (Button) findViewById(R.id.button7);
                        float num007 = Float.parseFloat(aetText7.getText().toString());
                        float w7 = (float) num007;
                        textView007.setText(String.format(Locale.US, "%.2f", w7) + "");
                        Animation anim7 = AnimationUtils.loadAnimation(
                                 getApplicationContext(), R.anim.sms_anim);
                          final Button button7 = (Button) findViewById(R.id.button7);
                           button7.startAnimation(anim7);
                        break;


                    case R.id.button38:
                        TextView textView008 = (TextView) findViewById(R.id.textViewWir);
                        aetText8 = (Button) findViewById(R.id.button38);
                        float num008 = Float.parseFloat(aetText8.getText().toString());
                        float w8 = (float) num008;
                        textView008.setText(String.format(Locale.US, "%.2f", w8) + "");
                           Animation anim8 = AnimationUtils.loadAnimation(
                                   getApplicationContext(), R.anim.sms_anim);
                           final Button button8 = (Button) findViewById(R.id.button38);
                          button8.startAnimation(anim8);
                        break;


                    case R.id.button40:
                        TextView textView009 = (TextView) findViewById(R.id.textViewWir);
                        aetText9 = (Button) findViewById(R.id.button40);
                        float num009 = Float.parseFloat(aetText9.getText().toString());
                        float w9 = (float) num009;
                        textView009.setText(String.format(Locale.US, "%.2f", w9) + "");
                         Animation anim9 = AnimationUtils.loadAnimation(
                                 getApplicationContext(), R.anim.sms_anim);
                         final Button button9 = (Button) findViewById(R.id.button40);
                          button9.startAnimation(anim9);
                        break;


                    case R.id.button39:
                        TextView textView010 = (TextView) findViewById(R.id.textViewWir);
                        aetText10 = (Button) findViewById(R.id.button39);
                        float num010 = Float.parseFloat(aetText10.getText().toString());
                        float w10 = (float) num010;
                        textView010.setText(String.format(Locale.US, "%.2f", w10) + "");
                          Animation anim10 = AnimationUtils.loadAnimation(
                                   getApplicationContext(), R.anim.sms_anim);
                           final Button button10 = (Button) findViewById(R.id.button39);
                           button10.startAnimation(anim10);
                        break;

                    case R.id.button8:
                        TextView textView011 = (TextView) findViewById(R.id.textViewWir);
                        aetText11 = (Button) findViewById(R.id.button8);
                        float num011 = Float.parseFloat(aetText11.getText().toString());
                        float w11 = (float) num011;
                        textView011.setText(String.format(Locale.US, "%.2f", w11) + "");
                          Animation anim11 = AnimationUtils.loadAnimation(
                                   getApplicationContext(), R.anim.sms_anim);
                           final Button button11 = (Button) findViewById(R.id.button8);
                            button11.startAnimation(anim11);
                        break;

                    //endregion



                    //region секция 3.1
                    case R.id.button97:
                        TextView textView023 = (TextView) findViewById(R.id.textViewWir2);
                        aetText23 = (Button) findViewById(R.id.button97);
                        float num023 = Float.parseFloat(aetText23.getText().toString());
                        float w23 = (float) num023;
                        textView023.setText(String.format(Locale.US, "%.2f", w23) + "");
                        Animation anim12 = AnimationUtils.loadAnimation(
                                getApplicationContext(), R.anim.sms_anim);
                        final Button button12 = (Button) findViewById(R.id.button97);
                        button12.startAnimation(anim12);
                        break;

                    case R.id.button98:
                        TextView textView024 = (TextView) findViewById(R.id.textViewWir2);
                        aetText24 = (Button) findViewById(R.id.button98);
                        float num024 = Float.parseFloat(aetText24.getText().toString());
                        float w24 = (float) num024;
                        textView024.setText(String.format(Locale.US, "%.2f", w24) + "");
                        Animation anim13 = AnimationUtils.loadAnimation(
                                getApplicationContext(), R.anim.sms_anim);
                        final Button button13 = (Button) findViewById(R.id.button98);
                        button13.startAnimation(anim13);
                        break;

                    case R.id.button99:
                        TextView textView025 = (TextView) findViewById(R.id.textViewWir2);
                        aetText25 = (Button) findViewById(R.id.button99);
                        float num025 = Float.parseFloat(aetText25.getText().toString());
                        float w25 = (float) num025;
                        textView025.setText(String.format(Locale.US, "%.2f", w25) + "");
                        Animation anim14 = AnimationUtils.loadAnimation(
                                getApplicationContext(), R.anim.sms_anim);
                        final Button button14 = (Button) findViewById(R.id.button99);
                        button14.startAnimation(anim14);
                        break;


                    case R.id.button100:
                        TextView textView026 = (TextView) findViewById(R.id.textViewWir2);
                        aetText26 = (Button) findViewById(R.id.button100);
                        float num026 = Float.parseFloat(aetText26.getText().toString());
                        float w26 = (float) num026;
                        textView026.setText(String.format(Locale.US, "%.2f", w26) + "");

                        Animation anim15 = AnimationUtils.loadAnimation(
                                getApplicationContext(), R.anim.sms_anim);
                        final Button button15 = (Button) findViewById(R.id.button100);
                        button15.startAnimation(anim15);
                        break;


                    case R.id.button101:
                        TextView textView027 = (TextView) findViewById(R.id.textViewWir2);
                        aetText27 = (Button) findViewById(R.id.button101);
                        float num027 = Float.parseFloat(aetText27.getText().toString());
                        float w27 = (float) num027;
                        textView027.setText(String.format(Locale.US, "%.2f", w27) + "");

                        Animation anim16 = AnimationUtils.loadAnimation(
                                getApplicationContext(), R.anim.sms_anim);
                        final Button button16 = (Button) findViewById(R.id.button101);
                        button16.startAnimation(anim16);
                        break;


                    case R.id.button102:
                        TextView textView028 = (TextView) findViewById(R.id.textViewWir2);
                        aetText28 = (Button) findViewById(R.id.button102);
                        float num028 = Float.parseFloat(aetText28.getText().toString());
                        float w28 = (float) num028;
                        textView028.setText(String.format(Locale.US, "%.2f", w28) + "");

                        Animation anim17 = AnimationUtils.loadAnimation(
                                getApplicationContext(), R.anim.sms_anim);
                        final Button button17 = (Button) findViewById(R.id.button102);
                        button17.startAnimation(anim17);
                        break;


                    case R.id.button103:
                        TextView textView029 = (TextView) findViewById(R.id.textViewWir2);
                        aetText29 = (Button) findViewById(R.id.button103);
                        float num029 = Float.parseFloat(aetText29.getText().toString());
                        float w29 = (float) num029;
                        textView029.setText(String.format(Locale.US, "%.2f", w29) + "");

                        Animation anim18 = AnimationUtils.loadAnimation(
                                getApplicationContext(), R.anim.sms_anim);
                        final Button button18 = (Button) findViewById(R.id.button103);
                        button18.startAnimation(anim18);
                        break;


                    case R.id.button104:
                        TextView textView030 = (TextView) findViewById(R.id.textViewWir2);
                        aetText30 = (Button) findViewById(R.id.button104);
                        float num030 = Float.parseFloat(aetText30.getText().toString());
                        float w30 = (float) num030;
                        textView030.setText(String.format(Locale.US, "%.2f", w30) + "");
                        Animation anim19 = AnimationUtils.loadAnimation(
                                getApplicationContext(), R.anim.sms_anim);
                        final Button button19 = (Button) findViewById(R.id.button104);
                        button19.startAnimation(anim19);
                        break;


                    case R.id.button105:
                        TextView textView031 = (TextView) findViewById(R.id.textViewWir2);
                        aetText31 = (Button) findViewById(R.id.button105);
                        float num031 = Float.parseFloat(aetText31.getText().toString());
                        float w31 = (float) num031;
                        textView031.setText(String.format(Locale.US, "%.2f", w31) + "");
                        Animation anim20 = AnimationUtils.loadAnimation(
                                getApplicationContext(), R.anim.sms_anim);
                        final Button button20 = (Button) findViewById(R.id.button105);
                        button20.startAnimation(anim20);
                        break;


                    case R.id.button11:
                        TextView textView032 = (TextView) findViewById(R.id.textViewWir2);
                        aetText32 = (Button) findViewById(R.id.button11);
                        float num032 = Float.parseFloat(aetText32.getText().toString());
                        float w32 = (float) num032;
                        textView032.setText(String.format(Locale.US, "%.2f", w32) + "");

                        Animation anim21 = AnimationUtils.loadAnimation(
                                getApplicationContext(), R.anim.sms_anim);
                        final Button button21 = (Button) findViewById(R.id.button11);
                        button21.startAnimation(anim21);
                        break;

                    case R.id.button12:
                        TextView textView033 = (TextView) findViewById(R.id.textViewWir2);
                        aetText33 = (Button) findViewById(R.id.button12);
                        float num033 = Float.parseFloat(aetText33.getText().toString());
                        float w33 = (float) num033;
                        textView033.setText(String.format(Locale.US, "%.2f", w33) + "");

                        Animation anim22 = AnimationUtils.loadAnimation(
                                getApplicationContext(), R.anim.sms_anim);
                        final Button button22 = (Button) findViewById(R.id.button12);
                        button22.startAnimation(anim22);
                        break;
                    //endregion


                    //region секция 4.1
                    case R.id.button52:
                        TextView textView034 = (TextView) findViewById(R.id.textViewWir4);
                        aetText34 = (Button) findViewById(R.id.button52);
                        float num034 = Float.parseFloat(aetText34.getText().toString());
                        float w34 = (float) num034;
                        textView034.setText(String.format(Locale.US, "%.2f", w34) + "");
                        Animation anim141 = AnimationUtils.loadAnimation(
                                getApplicationContext(), R.anim.sms_anim);
                        final Button button141 = (Button) findViewById(R.id.button52);
                        button141.startAnimation(anim141);
                        break;

                    case R.id.button53:
                        TextView textView035 = (TextView) findViewById(R.id.textViewWir4);
                        aetText35 = (Button) findViewById(R.id.button53);
                        float num035 = Float.parseFloat(aetText35.getText().toString());
                        float w35 = (float) num035;
                        textView035.setText(String.format(Locale.US, "%.2f", w35) + "");
                        Animation anim142 = AnimationUtils.loadAnimation(
                                getApplicationContext(), R.anim.sms_anim);
                        final Button button142 = (Button) findViewById(R.id.button53);
                        button142.startAnimation(anim142);
                        break;

                    case R.id.button54:
                        TextView textView036 = (TextView) findViewById(R.id.textViewWir4);
                        aetText36 = (Button) findViewById(R.id.button54);
                        float num036 = Float.parseFloat(aetText36.getText().toString());
                        float w36 = (float) num036;
                        textView036.setText(String.format(Locale.US, "%.2f", w36) + "");
                        Animation anim143 = AnimationUtils.loadAnimation(
                                getApplicationContext(), R.anim.sms_anim);
                        final Button button143 = (Button) findViewById(R.id.button54);
                        button143.startAnimation(anim143);
                        break;


                    case R.id.button55:
                        TextView textView037 = (TextView) findViewById(R.id.textViewWir4);
                        aetText37 = (Button) findViewById(R.id.button55);
                        float num037 = Float.parseFloat(aetText37.getText().toString());
                        float w37 = (float) num037;
                        textView037.setText(String.format(Locale.US, "%.2f", w37) + "");
                        Animation anim144 = AnimationUtils.loadAnimation(
                                getApplicationContext(), R.anim.sms_anim);
                        final Button button144 = (Button) findViewById(R.id.button55);
                        button144.startAnimation(anim144);
                        break;


                    case R.id.button59:
                        TextView textView038 = (TextView) findViewById(R.id.textViewWir4);
                        aetText38 = (Button) findViewById(R.id.button59);
                        float num038 = Float.parseFloat(aetText38.getText().toString());
                        float w38 = (float) num038;
                        textView038.setText(String.format(Locale.US, "%.2f", w38) + "");
                        Animation anim145 = AnimationUtils.loadAnimation(
                                getApplicationContext(), R.anim.sms_anim);
                        final Button button145 = (Button) findViewById(R.id.button59);
                        button145.startAnimation(anim145);
                        break;


                    case R.id.button60:
                        TextView textView039 = (TextView) findViewById(R.id.textViewWir4);
                        aetText39 = (Button) findViewById(R.id.button60);
                        float num039 = Float.parseFloat(aetText39.getText().toString());
                        float w39 = (float) num039;
                        textView039.setText(String.format(Locale.US, "%.2f", w39) + "");
                        Animation anim146 = AnimationUtils.loadAnimation(
                                getApplicationContext(), R.anim.sms_anim);
                        final Button button146 = (Button) findViewById(R.id.button60);
                        button146.startAnimation(anim146);
                        break;




                    //endregion

                    //region секция 5.1
                    case R.id.button61:
                        TextView textView040 = (TextView) findViewById(R.id.textViewWir5);
                        aetText40 = (Button) findViewById(R.id.button61);
                        float num040 = Float.parseFloat(aetText40.getText().toString());
                        float w40 = (float) num040;
                        textView040.setText(String.format(Locale.US, "%.2f", w40) + "");

                        Animation anim23 = AnimationUtils.loadAnimation(
                                getApplicationContext(), R.anim.sms_anim);
                        final Button button23 = (Button) findViewById(R.id.button61);
                        button23.startAnimation(anim23);
                        break;

                    case R.id.button62:
                        TextView textView041 = (TextView) findViewById(R.id.textViewWir5);
                        aetText41 = (Button) findViewById(R.id.button62);
                        float num041 = Float.parseFloat(aetText41.getText().toString());
                        float w41 = (float) num041;
                        textView041.setText(String.format(Locale.US, "%.2f", w41) + "");

                        Animation anim24 = AnimationUtils.loadAnimation(
                                getApplicationContext(), R.anim.sms_anim);
                        final Button button24 = (Button) findViewById(R.id.button62);
                        button24.startAnimation(anim24);
                        break;

                    case R.id.button63:
                        TextView textView042 = (TextView) findViewById(R.id.textViewWir5);
                        aetText42 = (Button) findViewById(R.id.button63);
                        float num042 = Float.parseFloat(aetText42.getText().toString());
                        float w42 = (float) num042;
                        textView042.setText(String.format(Locale.US, "%.2f", w42) + "");

                        Animation anim25 = AnimationUtils.loadAnimation(
                                getApplicationContext(), R.anim.sms_anim);
                        final Button button25 = (Button) findViewById(R.id.button63);
                        button25.startAnimation(anim25);
                        break;


                    case R.id.button64:
                        TextView textView043 = (TextView) findViewById(R.id.textViewWir5);
                        aetText43 = (Button) findViewById(R.id.button64);
                        float num043 = Float.parseFloat(aetText43.getText().toString());
                        float w43 = (float) num043;
                        textView043.setText(String.format(Locale.US, "%.2f", w43) + "");

                        Animation anim26 = AnimationUtils.loadAnimation(
                                getApplicationContext(), R.anim.sms_anim);
                        final Button button26 = (Button) findViewById(R.id.button64);
                        button26.startAnimation(anim26);
                        break;


                    case R.id.button65:
                        TextView textView044 = (TextView) findViewById(R.id.textViewWir5);
                        aetText44 = (Button) findViewById(R.id.button65);
                        float num044 = Float.parseFloat(aetText44.getText().toString());
                        float w44 = (float) num044;
                        textView044.setText(String.format(Locale.US, "%.2f", w44) + "");

                        Animation anim27 = AnimationUtils.loadAnimation(
                                getApplicationContext(), R.anim.sms_anim);
                        final Button button27 = (Button) findViewById(R.id.button65);
                        button27.startAnimation(anim27);
                        break;


                    case R.id.button66:
                        TextView textView045 = (TextView) findViewById(R.id.textViewWir5);
                        aetText45 = (Button) findViewById(R.id.button66);
                        float num045 = Float.parseFloat(aetText45.getText().toString());
                        float w45 = (float) num045;
                        textView045.setText(String.format(Locale.US, "%.2f", w45) + "");

                        Animation anim28 = AnimationUtils.loadAnimation(
                                getApplicationContext(), R.anim.sms_anim);
                        final Button button28 = (Button) findViewById(R.id.button66);
                        button28.startAnimation(anim28);
                        break;

                    //endregion

                    //region секция 6.1
                    case R.id.button70:
                        TextView textView046 = (TextView) findViewById(R.id.textViewWir6);
                        aetText46 = (Button) findViewById(R.id.button70);
                        float num046 = Float.parseFloat(aetText46.getText().toString());
                        float w46 = (float) num046;
                        textView046.setText(String.format(Locale.US, "%.2f", w46) + "");

                        Animation anim297 = AnimationUtils.loadAnimation(
                                getApplicationContext(), R.anim.sms_anim);
                        final Button button297 = (Button) findViewById(R.id.button70);
                        button297.startAnimation(anim297);
                        break;

                    case R.id.button71:
                        TextView textView047 = (TextView) findViewById(R.id.textViewWir6);
                        aetText47 = (Button) findViewById(R.id.button71);
                        float num047 = Float.parseFloat(aetText47.getText().toString());
                        float w47 = (float) num047;
                        textView047.setText(String.format(Locale.US, "%.2f", w47) + "");

                        Animation anim307 = AnimationUtils.loadAnimation(
                                getApplicationContext(), R.anim.sms_anim);
                        final Button button307 = (Button) findViewById(R.id.button71);
                        button307.startAnimation(anim307);
                        break;

                    case R.id.button72:
                        TextView textView048 = (TextView) findViewById(R.id.textViewWir6);
                        aetText48 = (Button) findViewById(R.id.button72);
                        float num048 = Float.parseFloat(aetText48.getText().toString());
                        float w48 = (float) num048;
                        textView048.setText(String.format(Locale.US, "%.2f", w48) + "");

                        Animation anim317 = AnimationUtils.loadAnimation(
                                getApplicationContext(), R.anim.sms_anim);
                        final Button button317 = (Button) findViewById(R.id.button72);
                        button317.startAnimation(anim317);
                        break;


                    case R.id.button73:
                        TextView textView049 = (TextView) findViewById(R.id.textViewWir6);
                        aetText49 = (Button) findViewById(R.id.button73);
                        float num049 = Float.parseFloat(aetText49.getText().toString());
                        float w49 = (float) num049;
                        textView049.setText(String.format(Locale.US, "%.2f", w49) + "");

                        Animation anim327 = AnimationUtils.loadAnimation(
                                getApplicationContext(), R.anim.sms_anim);
                        final Button button327 = (Button) findViewById(R.id.button73);
                        button327.startAnimation(anim327);
                        break;


                    case R.id.button74:
                        TextView textView050 = (TextView) findViewById(R.id.textViewWir6);
                        aetText50 = (Button) findViewById(R.id.button74);
                        float num050 = Float.parseFloat(aetText50.getText().toString());
                        float w50 = (float) num050;
                        textView050.setText(String.format(Locale.US, "%.2f", w50) + "");

                        Animation anim337 = AnimationUtils.loadAnimation(
                                getApplicationContext(), R.anim.sms_anim);
                        final Button button337 = (Button) findViewById(R.id.button74);
                        button337.startAnimation(anim337);
                        break;


                    case R.id.button75:
                        TextView textView051 = (TextView) findViewById(R.id.textViewWir6);
                        aetText51 = (Button) findViewById(R.id.button75);
                        float num051 = Float.parseFloat(aetText51.getText().toString());
                        float w51 = (float) num051;
                        textView051.setText(String.format(Locale.US, "%.2f", w51) + "");

                        Animation anim347 = AnimationUtils.loadAnimation(
                                getApplicationContext(), R.anim.sms_anim);
                        final Button button347 = (Button) findViewById(R.id.button75);
                        button347.startAnimation(anim347);
                        break;
                    //endregion

                    //region секция 7.1
                    case R.id.button15:
                        TextView textView052 = (TextView) findViewById(R.id.textViewWir7);
                        aetText52 = (Button) findViewById(R.id.button15);
                        float num052 = Float.parseFloat(aetText52.getText().toString());
                        float w52 = (float) num052;
                        textView052.setText(String.format(Locale.US, "%.0f", w52) + "");

                        Animation anim357 = AnimationUtils.loadAnimation(
                                getApplicationContext(), R.anim.sms_anim);
                        final Button button357 = (Button) findViewById(R.id.button15);
                        button357.startAnimation(anim357);
                        break;

                    case R.id.button16:
                        TextView textView053 = (TextView) findViewById(R.id.textViewWir7);
                        aetText53 = (Button) findViewById(R.id.button16);
                        float num053 = Float.parseFloat(aetText53.getText().toString());
                        float w53 = (float) num053;
                        textView053.setText(String.format(Locale.US, "%.0f", w53) + "");

                        Animation anim367 = AnimationUtils.loadAnimation(
                                getApplicationContext(), R.anim.sms_anim);
                        final Button button367 = (Button) findViewById(R.id.button16);
                        button367.startAnimation(anim367);
                        break;

                    case R.id.button17:
                        TextView textView054 = (TextView) findViewById(R.id.textViewWir7);
                        aetText54 = (Button) findViewById(R.id.button17);
                        float num054 = Float.parseFloat(aetText54.getText().toString());
                        float w54 = (float) num054;
                        textView054.setText(String.format(Locale.US, "%.0f", w54) + "");

                        Animation anim377 = AnimationUtils.loadAnimation(
                                getApplicationContext(), R.anim.sms_anim);
                        final Button button377 = (Button) findViewById(R.id.button17);
                        button377.startAnimation(anim377);
                        break;


                    case R.id.button18:
                        TextView textView055 = (TextView) findViewById(R.id.textViewWir7);
                        aetText55 = (Button) findViewById(R.id.button18);
                        float num055 = Float.parseFloat(aetText55.getText().toString());
                        float w55 = (float) num055;
                        textView055.setText(String.format(Locale.US, "%.0f", w55) + "");

                        Animation anim387 = AnimationUtils.loadAnimation(
                                getApplicationContext(), R.anim.sms_anim);
                        final Button button387 = (Button) findViewById(R.id.button18);
                        button387.startAnimation(anim387);
                        break;

                    //endregion

                    //region секция 8.1
                    case R.id.button21:
                        TextView textView056 = (TextView) findViewById(R.id.textViewWir8);
                        aetText56 = (Button) findViewById(R.id.button21);
                        float num056 = Float.parseFloat(aetText56.getText().toString());
                        float w56 = (float) num056;
                        textView056.setText(String.format(Locale.US, "%.0f", w56) + "");
                        Animation anim210 = AnimationUtils.loadAnimation(
                                getApplicationContext(), R.anim.sms_anim);
                        final Button button210 = (Button) findViewById(R.id.button21);
                        button210.startAnimation(anim210);
                        break;

                    case R.id.button22:
                        TextView textView057 = (TextView) findViewById(R.id.textViewWir8);
                        aetText57 = (Button) findViewById(R.id.button22);
                        float num057 = Float.parseFloat(aetText57.getText().toString());
                        float w57 = (float) num057;
                        textView057.setText(String.format(Locale.US, "%.0f", w57) + "");
                        Animation anim211 = AnimationUtils.loadAnimation(
                                getApplicationContext(), R.anim.sms_anim);
                        final Button button211 = (Button) findViewById(R.id.button22);
                        button211.startAnimation(anim211);
                        break;

                    case R.id.button23:
                        TextView textView058 = (TextView) findViewById(R.id.textViewWir8);
                        aetText58 = (Button) findViewById(R.id.button23);
                        float num058 = Float.parseFloat(aetText58.getText().toString());
                        float w58 = (float) num058;
                        textView058.setText(String.format(Locale.US, "%.0f", w58) + "");
                        Animation anim222 = AnimationUtils.loadAnimation(
                                getApplicationContext(), R.anim.sms_anim);
                        final Button button222 = (Button) findViewById(R.id.button23);
                        button222.startAnimation(anim222);
                        break;


                    case R.id.button24:
                        TextView textView059 = (TextView) findViewById(R.id.textViewWir8);
                        aetText59 = (Button) findViewById(R.id.button24);
                        float num059 = Float.parseFloat(aetText59.getText().toString());
                        float w59 = (float) num059;
                        textView059.setText(String.format(Locale.US, "%.0f", w59) + "");
                        Animation anim223 = AnimationUtils.loadAnimation(
                                getApplicationContext(), R.anim.sms_anim);
                        final Button button223 = (Button) findViewById(R.id.button24);
                        button223.startAnimation(anim223);
                        break;


                    //endregion

                    //region секция 9.1
                    case R.id.button27:
                        TextView textView060 = (TextView) findViewById(R.id.textViewWir9);
                        aetText60 = (Button) findViewById(R.id.button27);
                        float num060 = Float.parseFloat(aetText60.getText().toString());
                        float w60 = (float) num060;
                        textView060.setText(String.format(Locale.US, "%.0f", w60) + "");

                        Animation anim39 = AnimationUtils.loadAnimation(
                                getApplicationContext(), R.anim.sms_anim);
                        final Button button39 = (Button) findViewById(R.id.button27);
                        button39.startAnimation(anim39);
                        break;

                    case R.id.button28:
                        TextView textView061 = (TextView) findViewById(R.id.textViewWir9);
                        aetText61 = (Button) findViewById(R.id.button28);
                        float num061 = Float.parseFloat(aetText61.getText().toString());
                        float w61 = (float) num061;
                        textView061.setText(String.format(Locale.US, "%.0f", w61) + "");

                        Animation anim40 = AnimationUtils.loadAnimation(
                                getApplicationContext(), R.anim.sms_anim);
                        final Button button40 = (Button) findViewById(R.id.button28);
                        button40.startAnimation(anim40);
                        break;

                    case R.id.button29:
                        TextView textView062 = (TextView) findViewById(R.id.textViewWir9);
                        aetText62 = (Button) findViewById(R.id.button29);
                        float num062 = Float.parseFloat(aetText62.getText().toString());
                        float w62 = (float) num062;
                        textView062.setText(String.format(Locale.US, "%.0f", w62) + "");

                        Animation anim41 = AnimationUtils.loadAnimation(
                                getApplicationContext(), R.anim.sms_anim);
                        final Button button41 = (Button) findViewById(R.id.button29);
                        button41.startAnimation(anim41);
                        break;


                    case R.id.button30:
                        TextView textView063 = (TextView) findViewById(R.id.textViewWir9);
                        aetText63 = (Button) findViewById(R.id.button30);
                        float num063 = Float.parseFloat(aetText63.getText().toString());
                        float w63 = (float) num063;
                        textView063.setText(String.format(Locale.US, "%.0f", w63) + "");

                        Animation anim42 = AnimationUtils.loadAnimation(
                                getApplicationContext(), R.anim.sms_anim);
                        final Button button42 = (Button) findViewById(R.id.button30);
                        button42.startAnimation(anim42);
                        break;


                    case R.id.button31:
                        TextView textView064 = (TextView) findViewById(R.id.textViewWir9);
                        aetText64 = (Button) findViewById(R.id.button31);
                        float num064 = Float.parseFloat(aetText64.getText().toString());
                        float w64 = (float) num064;
                        textView064.setText(String.format(Locale.US, "%.0f", w64) + "");

                        Animation anim43 = AnimationUtils.loadAnimation(
                                getApplicationContext(), R.anim.sms_anim);
                        final Button button43 = (Button) findViewById(R.id.button31);
                        button43.startAnimation(anim43);
                        break;


                    case R.id.button32:
                        TextView textView065 = (TextView) findViewById(R.id.textViewWir9);
                        aetText65 = (Button) findViewById(R.id.button32);
                        float num065 = Float.parseFloat(aetText65.getText().toString());
                        float w65 = (float) num065;
                        textView065.setText(String.format(Locale.US, "%.0f", w65) + "");

                        Animation anim44 = AnimationUtils.loadAnimation(
                                getApplicationContext(), R.anim.sms_anim);
                        final Button button44 = (Button) findViewById(R.id.button32);
                        button44.startAnimation(anim44);
                        break;

                    //endregion

                    //region секция 10.1
                    case R.id.button19:
                        TextView textView066 = (TextView) findViewById(R.id.textViewWir10);
                        aetText66 = (Button) findViewById(R.id.button19);
                        float num066 = Float.parseFloat(aetText66.getText().toString());
                        float w66 = (float) num066;
                        textView066.setText(String.format(Locale.US, "%.2f", w66) + "");
                        Animation anim450 = AnimationUtils.loadAnimation(
                                getApplicationContext(), R.anim.sms_anim);
                        final Button button450 = (Button) findViewById(R.id.button19);
                        button450.startAnimation(anim450);
                        break;

                    case R.id.button20:
                        TextView textView067 = (TextView) findViewById(R.id.textViewWir10);
                        aetText67 = (Button) findViewById(R.id.button20);
                        float num067 = Float.parseFloat(aetText67.getText().toString());
                        float w67 = (float) num067;
                        textView067.setText(String.format(Locale.US, "%.2f", w67) + "");
                        Animation anim460 = AnimationUtils.loadAnimation(
                                getApplicationContext(), R.anim.sms_anim);
                        final Button button460 = (Button) findViewById(R.id.button20);
                        button460.startAnimation(anim460);
                        break;

                    case R.id.button25:
                        TextView textView068 = (TextView) findViewById(R.id.textViewWir10);
                        aetText68 = (Button) findViewById(R.id.button25);
                        float num068 = Float.parseFloat(aetText68.getText().toString());
                        float w68 = (float) num068;
                        textView068.setText(String.format(Locale.US, "%.2f", w68) + "");
                        Animation anim470 = AnimationUtils.loadAnimation(
                                getApplicationContext(), R.anim.sms_anim);
                        final Button button470 = (Button) findViewById(R.id.button25);
                        button470.startAnimation(anim470);
                        break;



                    //endregion

                    //region секция 11.1
                    case R.id.button41:
                        TextView textView069 = (TextView) findViewById(R.id.textViewWir11);
                        aetText69 = (Button) findViewById(R.id.button41);
                        float num069 = Float.parseFloat(aetText69.getText().toString());
                        float w69 = (float) num069;
                        textView069.setText(String.format(Locale.US, "%.0f", w69) + "");
                        imageView.setImageResource(R.drawable.rad2);
                        Animation anim48 = AnimationUtils.loadAnimation(
                                getApplicationContext(), R.anim.sms_anim);
                        final Button button48 = (Button) findViewById(R.id.button41);
                        button48.startAnimation(anim48);
                        break;

                    case R.id.button42:
                        TextView textView070 = (TextView) findViewById(R.id.textViewWir11);
                        aetText70 = (Button) findViewById(R.id.button42);
                        float num070 = Float.parseFloat(aetText70.getText().toString());
                        float w70 = (float) num070;
                        textView070.setText(String.format(Locale.US, "%.0f", w70) + "");
                        imageView.setImageResource(R.drawable.rad4);
                        Animation anim420 = AnimationUtils.loadAnimation(
                                getApplicationContext(), R.anim.sms_anim);
                        final Button button420 = (Button) findViewById(R.id.button42);
                        button420.startAnimation(anim420);
                        break;

                    case R.id.button43:
                        TextView textView071 = (TextView) findViewById(R.id.textViewWir11);
                        aetText71 = (Button) findViewById(R.id.button43);
                        float num071 = Float.parseFloat(aetText71.getText().toString());
                        float w71 = (float) num071;
                        textView071.setText(String.format(Locale.US, "%.0f", w71) + "");
                        imageView.setImageResource(R.drawable.rad6);
                        Animation anim430 = AnimationUtils.loadAnimation(
                                getApplicationContext(), R.anim.sms_anim);
                        final Button button430 = (Button) findViewById(R.id.button43);
                        button430.startAnimation(anim430);
                        break;

                    case R.id.button44:
                        TextView textView072 = (TextView) findViewById(R.id.textViewWir11);
                        aetText72 = (Button) findViewById(R.id.button44);
                        float num072 = Float.parseFloat(aetText72.getText().toString());
                        float w72 = (float) num072;
                        textView072.setText(String.format(Locale.US, "%.0f", w72) + "");
                        imageView.setImageResource(R.drawable.rad8);
                        Animation anim440 = AnimationUtils.loadAnimation(
                                getApplicationContext(), R.anim.sms_anim);
                        final Button button440 = (Button) findViewById(R.id.button44);
                        button440.startAnimation(anim440);
                        break;

                    case R.id.button45:
                        TextView textView073 = (TextView) findViewById(R.id.textViewWir7);
                        aetText73 = (Button) findViewById(R.id.button45);
                        float num073 = Float.parseFloat(aetText73.getText().toString());
                        float w73 = (float) num073;
                        textView073.setText(String.format(Locale.US, "%.0f", w73) + "");
                        Animation anim45 = AnimationUtils.loadAnimation(
                                getApplicationContext(), R.anim.sms_anim);
                        final Button button45 = (Button) findViewById(R.id.button45);
                        button45.startAnimation(anim45);
                        break;

                    case R.id.button46:
                        TextView textView074 = (TextView) findViewById(R.id.textViewWir7);
                        aetText74 = (Button) findViewById(R.id.button46);
                        float num074 = Float.parseFloat(aetText74.getText().toString());
                        float w74 = (float) num074;
                        textView074.setText(String.format(Locale.US, "%.0f", w74) + "");
                        Animation anim46 = AnimationUtils.loadAnimation(
                                getApplicationContext(), R.anim.sms_anim);
                        final Button button46 = (Button) findViewById(R.id.button46);
                        button46.startAnimation(anim46);
                        break;

                    case R.id.button36:
                        TextView textView077 = (TextView) findViewById(R.id.textViewWir11);
                        aetText77 = (Button) findViewById(R.id.button36);
                        float num077 = Float.parseFloat(aetText77.getText().toString());
                        float w77 = (float) num077;
                        textView077.setText(String.format(Locale.US, "%.0f", w77) + "");
                        imageView.setImageResource(R.drawable.rad3);
                        Animation anim360 = AnimationUtils.loadAnimation(
                                getApplicationContext(), R.anim.sms_anim);
                        final Button button360 = (Button) findViewById(R.id.button36);
                        button360.startAnimation(anim360);
                        break;

                    case R.id.button37:
                        TextView textView078 = (TextView) findViewById(R.id.textViewWir11);
                        aetText78 = (Button) findViewById(R.id.button37);
                        float num078 = Float.parseFloat(aetText78.getText().toString());
                        float w78 = (float) num078;
                        textView078.setText(String.format(Locale.US, "%.0f", w78) + "");
                        imageView.setImageResource(R.drawable.rad10);
                        Animation anim370 = AnimationUtils.loadAnimation(
                                getApplicationContext(), R.anim.sms_anim);
                        final Button button370 = (Button) findViewById(R.id.button37);
                        button370.startAnimation(anim370);
                        break;



                    //endregion

                    //region секция button 12.1 - 26. 33. 34. 35.
                    case R.id.button26:
                        TextView textView079 = (TextView) findViewById(R.id.textViewWir12);
                        aetText79 = (Button) findViewById(R.id.button26);
                        float num079 = Float.parseFloat(aetText79.getText().toString());
                        float w79 = (float) num079;
                        textView079.setText(String.format(Locale.US, "%.0f", w79) + "");

                        Animation anim55 = AnimationUtils.loadAnimation(
                                getApplicationContext(), R.anim.sms_anim);
                        final Button button55 = (Button) findViewById(R.id.button26);
                        button55.startAnimation(anim55);

                        break;

                    case R.id.button33:
                        TextView textView080 = (TextView) findViewById(R.id.textViewWir12);
                        aetText80 = (Button) findViewById(R.id.button33);
                        float num080 = Float.parseFloat(aetText80.getText().toString());
                        float w80 = (float) num080;
                        textView080.setText(String.format(Locale.US, "%.0f", w80) + "");

                        Animation anim56 = AnimationUtils.loadAnimation(
                                getApplicationContext(), R.anim.sms_anim);
                        final Button button56 = (Button) findViewById(R.id.button33);
                        button56.startAnimation(anim56);
                        break;

                    case R.id.button34:
                        TextView textView081 = (TextView) findViewById(R.id.textViewWir12);
                        aetText81 = (Button) findViewById(R.id.button34);
                        float num081 = Float.parseFloat(aetText81.getText().toString());
                        float w81 = (float) num081;
                        textView081.setText(String.format(Locale.US, "%.0f", w81) + "");

                        Animation anim57 = AnimationUtils.loadAnimation(
                                getApplicationContext(), R.anim.sms_anim);
                        final Button button57 = (Button) findViewById(R.id.button34);
                        button57.startAnimation(anim57);
                        break;

                    case R.id.button35:
                        TextView textView082 = (TextView) findViewById(R.id.textViewWir12);
                        aetText82 = (Button) findViewById(R.id.button35);
                        float num082 = Float.parseFloat(aetText82.getText().toString());
                        float w82 = (float) num082;
                        textView082.setText(String.format(Locale.US, "%.0f", w82) + "");
                        //imageView.setImageResource(R.drawable.rad8);

                        Animation anim58 = AnimationUtils.loadAnimation(
                                getApplicationContext(), R.anim.sms_anim);
                        final Button button58 = (Button) findViewById(R.id.button35);
                        button58.startAnimation(anim58);
                        break;





                    //endregion



                    //&&&&&&

                    default:
                }
            }}
        };

        //region секция (btn1.setOnClickListener(btnClk);)
        btn1.setOnClickListener(btnClk);
        btn2.setOnClickListener(btnClk);
        btn3.setOnClickListener(btnClk);
        btn4.setOnClickListener(btnClk);
        btn5.setOnClickListener(btnClk);
        btn6.setOnClickListener(btnClk);
        btn7.setOnClickListener(btnClk);
        btn8.setOnClickListener(btnClk);
        btn9.setOnClickListener(btnClk);
        btn10.setOnClickListener(btnClk);
        btn11.setOnClickListener(btnClk);





        btn34.setOnClickListener(btnClk);
        btn35.setOnClickListener(btnClk);
        btn36.setOnClickListener(btnClk);
        btn37.setOnClickListener(btnClk);
        btn38.setOnClickListener(btnClk);
        btn39.setOnClickListener(btnClk);

        btn40.setOnClickListener(btnClk);
        btn41.setOnClickListener(btnClk);
        btn42.setOnClickListener(btnClk);
        btn43.setOnClickListener(btnClk);
        btn44.setOnClickListener(btnClk);
        btn45.setOnClickListener(btnClk);

        btn46.setOnClickListener(btnClk);
        btn47.setOnClickListener(btnClk);
        btn48.setOnClickListener(btnClk);
        btn49.setOnClickListener(btnClk);
        btn50.setOnClickListener(btnClk);
        btn51.setOnClickListener(btnClk);


        btn52.setOnClickListener(btnClk);
        btn53.setOnClickListener(btnClk);
        btn54.setOnClickListener(btnClk);
        btn55.setOnClickListener(btnClk);

        btn56.setOnClickListener(btnClk);
        btn57.setOnClickListener(btnClk);
        btn58.setOnClickListener(btnClk);
        btn59.setOnClickListener(btnClk);

        btn60.setOnClickListener(btnClk);
        btn61.setOnClickListener(btnClk);
        btn62.setOnClickListener(btnClk);
        btn63.setOnClickListener(btnClk);
        btn64.setOnClickListener(btnClk);
        btn65.setOnClickListener(btnClk);

        btn66.setOnClickListener(btnClk);
        btn67.setOnClickListener(btnClk);
        btn68.setOnClickListener(btnClk);

        btn69.setOnClickListener(btnClk);
        btn70.setOnClickListener(btnClk);
        btn71.setOnClickListener(btnClk);
        btn72.setOnClickListener(btnClk);

        btn73.setOnClickListener(btnClk);
        btn74.setOnClickListener(btnClk);

        //btn75.setOnClickListener(btnClk);
       // btn76.setOnClickListener(btnClk);

        btn77.setOnClickListener(btnClk);
        btn78.setOnClickListener(btnClk);

        btn79.setOnClickListener(btnClk);
        btn80.setOnClickListener(btnClk);
        btn81.setOnClickListener(btnClk);
        btn82.setOnClickListener(btnClk);



        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar8);
        setSupportActionBar(toolbar);

        FloatingActionButton fab2 = (FloatingActionButton) findViewById(R.id.fab);
        fab2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                long mills = 15L;
                Vibrator vibrator = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);
                vibrator.vibrate(mills);

                Animation anim1 = AnimationUtils.loadAnimation(
                        getApplicationContext(), R.anim.sms_anim2);
                final FloatingActionButton button1111 = (FloatingActionButton) findViewById(R.id.fab);
                button1111.startAnimation(anim1);

                TextView aetText1;
                TextView aetText2;
                TextView aetText3;
                TextView aetText4;
                TextView aetText5;
                TextView aetText6;

                TextView aetText7;
                TextView aetText8;
                TextView aetText9;
                TextView aetText10;
                TextView aetText11;
                TextView aetText12;



// Стороны
                aetText1 = (TextView) findViewById(R.id.textViewWir);
                //aetText2 = (TextView) findViewById(R.id.textViewWir2);
                //aetText3 = (TextView) findViewById(R.id.textViewWir3);
                                                         //ширина
                aetText4 = (TextView) findViewById(R.id.textViewWir4);

                                                         //глубина
                aetText5 = (TextView) findViewById(R.id.textViewWir5);

                //цена
                aetText6 = (TextView) findViewById(R.id.textViewWir6);



                aetText9 = (TextView) findViewById(R.id.textViewWir9);
                aetText10 = (TextView) findViewById(R.id.textViewWir10);

                aetText11 = (TextView) findViewById(R.id.textViewWir11);
                aetText12 = (TextView) findViewById(R.id.textViewWir12);

                float num001 = Float.parseFloat(aetText1.getText().toString());
              //  float num002 = Float.parseFloat(aetText2.getText().toString());
                //float num003 = Float.parseFloat(aetText3.getText().toString());

                float num004 = Float.parseFloat(aetText4.getText().toString());
                float num005 = Float.parseFloat(aetText5.getText().toString());

                float num006 = Float.parseFloat(aetText6.getText().toString());
                float num007 = Float.parseFloat(aetText11.getText().toString());
                float num009 = Float.parseFloat(aetText9.getText().toString());
                float num010 = Float.parseFloat(aetText10.getText().toString());
                float num012 = Float.parseFloat(aetText12.getText().toString());
///////////////////////////////////
                float w = (float) ((float) (num001 ) * ((num004 * 0.01)*(num005 * 0.01)));
                TextView textView142 = (TextView) findViewById(R.id.textView14);
                textView142.setText(String.format(Locale.US, "%.2f", w) + "");

                float t = (float) w*(num006);
                TextView textView144 = (TextView) findViewById(R.id.textView20);
                textView144.setText(String.format(Locale.US, "%.2f", t) + "");






                aetText11 = (TextView) findViewById(R.id.textViewWir11);
                aetText8 = (TextView) findViewById(R.id.textViewWir8);

                if (Float.parseFloat(aetText11.getText().toString()) == 3){



                    if (Float.parseFloat(aetText8.getText().toString()) == 8)

                {
                        // x - метров на периметр


                    float a = (float) num004 - 10;
                    float b = (float) num005 - 10;
                    float l = (float) a/2;
                    float c = (float) ((float) (b*b)+(Math.pow(l,2)));
                    float d = (float) Math.sqrt(c);
                    float p = (float) ((a) + ((d)*2));

                    float x = (float) (float) (((((num001)/num009)*p)));
                    float e = (float) 0.395 * x;
                    float r = (float) x;
                    TextView textView145 = (TextView) findViewById(R.id.textView37);
                    TextView textView146 = (TextView) findViewById(R.id.textView39);
                    textView145.setText(String.format(Locale.US, "%.2f", e) + "");
                    textView146.setText(String.format(Locale.US, "%.2f", r) + "");}

                else if (Float.parseFloat(aetText8.getText().toString()) == 10)
                {
                    float a = (float) num004 - 10;
                    float b = (float) num005 - 10;
                    float l = (float) a/2;
                    float c = (float) ((float) (b*b)+(Math.pow(l,2)));
                    float d = (float) Math.sqrt(c);
                    float p = (float) ((a) + ((d)*2));

                    float x = (float) (float) (((((num001)/num009)*p)));
                    float e = (float) 0.617 * x;
                    float r = (float) x;
                    TextView textView145 = (TextView) findViewById(R.id.textView37);
                    TextView textView146 = (TextView) findViewById(R.id.textView39);
                    textView145.setText(String.format(Locale.US, "%.2f", e) + "");
                    textView146.setText(String.format(Locale.US, "%.2f", r) + "");}


                else if (Float.parseFloat(aetText8.getText().toString()) == 12)
                {
                    float a = (float) num004 - 10;
                    float b = (float) num005 - 10;
                    float l = (float) a/2;
                    float c = (float) ((float) (b*b)+(Math.pow(l,2)));
                    float d = (float) Math.sqrt(c);
                    float p = (float) ((a) + ((d)*2));

                    float x = (float) (float) (((((num001)/num009)*p)));
                    float e = (float) 0.888 * x;
                    float r = (float) x;
                    TextView textView145 = (TextView) findViewById(R.id.textView37);
                    TextView textView146 = (TextView) findViewById(R.id.textView39);
                    textView145.setText(String.format(Locale.US, "%.2f", e) + "");
                    textView146.setText(String.format(Locale.US, "%.2f", r) + "");}

                else if (Float.parseFloat(aetText8.getText().toString()) == 14)
                {
                    float a = (float) num004 - 10;
                    float b = (float) num005 - 10;
                    float l = (float) a/2;
                    float c = (float) ((float) (b*b)+(Math.pow(l,2)));
                    float d = (float) Math.sqrt(c);
                    float p = (float) ((a) + ((d)*2));

                    float x = (float) (float) (((((num001)/num009)*p)));
                    float e = (float) 1.210 * x;
                    float r = (float) x;
                    TextView textView145 = (TextView) findViewById(R.id.textView37);
                    TextView textView146 = (TextView) findViewById(R.id.textView39);
                    textView145.setText(String.format(Locale.US, "%.2f", e) + "");
                    textView146.setText(String.format(Locale.US, "%.2f", r) + "");}}

                else if (Float.parseFloat(aetText11.getText().toString()) == 2){

                    if (Float.parseFloat(aetText8.getText().toString()) == 8)

                    {
                        // x - метров на периметр
                        float p = (float) (num005 - 10);
                        float x = (float) (float) (((((num001)/num009)*p)));
                        float e = (float) 0.395 * x;
                        float r = (float) x;
                        TextView textView145 = (TextView) findViewById(R.id.textView37);
                        TextView textView146 = (TextView) findViewById(R.id.textView39);
                        textView145.setText(String.format(Locale.US, "%.2f", e) + "");
                        textView146.setText(String.format(Locale.US, "%.2f", r) + "");}

                    else if (Float.parseFloat(aetText8.getText().toString()) == 10)
                    {
                        float p = (float) (num005 - 10);
                        float x = (float) (float) (((((num001)/num009)*p)));
                        float e = (float) 0.617 * x;
                        float r = (float) x;
                        TextView textView145 = (TextView) findViewById(R.id.textView37);
                        TextView textView146 = (TextView) findViewById(R.id.textView39);
                        textView145.setText(String.format(Locale.US, "%.2f", e) + "");
                        textView146.setText(String.format(Locale.US, "%.2f", r) + "");}


                    else if (Float.parseFloat(aetText8.getText().toString()) == 12)
                    {
                        float p = (float) (num005 - 10);
                        float x = (float) (float) (((((num001)/num009)*p)));
                        float e = (float) 0.888 * x;
                        float r = (float) x;
                        TextView textView145 = (TextView) findViewById(R.id.textView37);
                        TextView textView146 = (TextView) findViewById(R.id.textView39);
                        textView145.setText(String.format(Locale.US, "%.2f", e) + "");
                        textView146.setText(String.format(Locale.US, "%.2f", r) + "");}

                    else if (Float.parseFloat(aetText8.getText().toString()) == 14)
                    {
                        float p = (float) (num005 - 10);
                        float x = (float) (float) (((((num001)/num009)*p)));
                        float e = (float) 1.210 * x;
                        float r = (float) x;
                        TextView textView145 = (TextView) findViewById(R.id.textView37);
                        TextView textView146 = (TextView) findViewById(R.id.textView39);
                        textView145.setText(String.format(Locale.US, "%.2f", e) + "");
                        textView146.setText(String.format(Locale.US, "%.2f", r) + "");
                    }

                }

                    else if (Float.parseFloat(aetText8.getText().toString()) == 8)

                    {
                        // x - метров на периметр
                        float p = (float) (((num004 - 10) + (num005 - 10))*2);
                        float x = (float) (float) (((((num001)/num009)*p)));
                        float e = (float) 0.395 * x;
                        float r = (float) x;
                        TextView textView145 = (TextView) findViewById(R.id.textView37);
                        TextView textView146 = (TextView) findViewById(R.id.textView39);
                        textView145.setText(String.format(Locale.US, "%.2f", e) + "");
                        textView146.setText(String.format(Locale.US, "%.2f", r) + "");}

                    else if (Float.parseFloat(aetText8.getText().toString()) == 10)
                    {
                        float p = (float) (((num004 - 10) + (num005 - 10))*2);
                        float x = (float) (float) (((((num001)/num009)*p)));
                        float e = (float) 0.617 * x;
                        float r = (float) x;
                        TextView textView145 = (TextView) findViewById(R.id.textView37);
                        TextView textView146 = (TextView) findViewById(R.id.textView39);
                        textView145.setText(String.format(Locale.US, "%.2f", e) + "");
                        textView146.setText(String.format(Locale.US, "%.2f", r) + "");}


                    else if (Float.parseFloat(aetText8.getText().toString()) == 12)
                    {
                        float p = (float) (((num004 - 10) + (num005 - 10))*2);
                        float x = (float) (float) (((((num001)/num009)*p)));
                        float e = (float) 0.888 * x;
                        float r = (float) x;
                        TextView textView145 = (TextView) findViewById(R.id.textView37);
                        TextView textView146 = (TextView) findViewById(R.id.textView39);
                        textView145.setText(String.format(Locale.US, "%.2f", e) + "");
                        textView146.setText(String.format(Locale.US, "%.2f", r) + "");}

                    else if (Float.parseFloat(aetText8.getText().toString()) == 14)
                    {
                        float p = (float) (((num004 - 10) + (num005 - 10))*2);
                        float x = (float) (float) (((((num001)/num009)*p)));
                        float e = (float) 1.210 * x;
                        float r = (float) x;
                        TextView textView145 = (TextView) findViewById(R.id.textView37);
                        TextView textView146 = (TextView) findViewById(R.id.textView39);
                        textView145.setText(String.format(Locale.US, "%.2f", e) + "");
                        textView146.setText(String.format(Locale.US, "%.2f", r) + "");
                    }




                aetText7 = (TextView) findViewById(R.id.textViewWir7);
                if (Float.parseFloat(aetText7.getText().toString()) == 10)
                {
                    float e1 = (float) (((float) ((num001) * (0.617))*num007));
                    float m1 = (float) (((float) ((num001)*(num007))));
                    float e = (float) (e1+(e1*num012/100));
                    float m = (float) (m1+(m1*num012/100));

                    TextView textView145 = (TextView) findViewById(R.id.textView24);
                    TextView textView148 = (TextView) findViewById(R.id.textView43);
                    textView145.setText(String.format(Locale.US, "%.2f", e) + "");
                    textView148.setText(String.format(Locale.US, "%.2f", m) + "");}

                else if (Float.parseFloat(aetText7.getText().toString()) == 12)
                {

                    float e1 = (float) (((float) ((num001) * (0.888))*num007));
                    float m1 = (float) (((float) ((num001)*(num007))));


                    float e = (float) (e1+(e1*num012/100));
                    float m = (float) (m1+(m1*num012/100));

                    TextView textView145 = (TextView) findViewById(R.id.textView24);
                    TextView textView148 = (TextView) findViewById(R.id.textView43);
                    textView145.setText(String.format(Locale.US, "%.2f", e) + "");
                    textView148.setText(String.format(Locale.US, "%.2f", m) + "");}

                else if (Float.parseFloat(aetText7.getText().toString()) == 14)
                {

                    float e1 = (float) (((float) ((num001) * (1.210))*num007));
                    float m1 = (float) (((float) ((num001)*(num007))));


                    float e = (float) (e1+(e1*num012/100));
                    float m = (float) (m1+(m1*num012/100));

                    TextView textView145 = (TextView) findViewById(R.id.textView24);
                    TextView textView148 = (TextView) findViewById(R.id.textView43);
                    textView145.setText(String.format(Locale.US, "%.2f", e) + "");
                    textView148.setText(String.format(Locale.US, "%.2f", m) + "");}

                else if (Float.parseFloat(aetText7.getText().toString()) == 16)
                {

                    float e1 = (float) (((float) ((num001) * (1.580))*num007));
                    float m1 = (float) (((float) ((num001)*(num007))));


                    float e = (float) (e1+(e1*num012/100));
                    float m = (float) (m1+(m1*num012/100));

                    TextView textView145 = (TextView) findViewById(R.id.textView24);
                    TextView textView148 = (TextView) findViewById(R.id.textView43);
                    textView145.setText(String.format(Locale.US, "%.2f", e) + "");
                    textView148.setText(String.format(Locale.US, "%.2f", m) + "");}

                else if (Float.parseFloat(aetText7.getText().toString()) == 18)
                {

                    float e1 = (float) (((float) ((num001) * (2.000))*num007));
                    float m1 = (float) (((float) ((num001)*(num007))));


                    float e = (float) (e1+(e1*num012/100));
                    float m = (float) (m1+(m1*num012/100));

                    TextView textView145 = (TextView) findViewById(R.id.textView24);
                    TextView textView148 = (TextView) findViewById(R.id.textView43);
                    textView145.setText(String.format(Locale.US, "%.2f", e) + "");
                    textView148.setText(String.format(Locale.US, "%.2f", m) + "");}

                else if (Float.parseFloat(aetText7.getText().toString()) == 20)
                {
                    float e1 = (float) (((float) ((num001) * (2.470))*num007));
                    float m1 = (float) (((float) ((num001)*(num007))));


                    float e = (float) (e1+(e1*num012/100));
                    float m = (float) (m1+(m1*num012/100));

                    TextView textView145 = (TextView) findViewById(R.id.textView24);
                    TextView textView148 = (TextView) findViewById(R.id.textView43);
                    textView145.setText(String.format(Locale.US, "%.2f", e) + "");
                    textView148.setText(String.format(Locale.US, "%.2f", m) + "");}

                // цена арматуры

                TextView text1;
                TextView text2;

                text1 = (TextView) findViewById(R.id.textView24);
                text2 = (TextView) findViewById(R.id.textView37);
                float num01 = Float.parseFloat(text1.getText().toString());
                float num02 = Float.parseFloat(text2.getText().toString());
                float s = (float) (num02+num01)*(num010);


                TextView textView147 = (TextView) findViewById(R.id.textView28);
                textView147.setText(String.format(Locale.US, "%.2f", s) + "");




                //////////////// //Snackbar.make(view, "Подсчитано", Snackbar.LENGTH_SHORT)
                        //Snackbar.make(view, "Подсчитано", Snackbar.LENGTH_SHORT)
                       ///////////////// .setAction("Action", null).show();
            }
        });
        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {

                final TextView bill83 = (TextView) findViewById(R.id.textView14);
                final TextView bill84 = (TextView) findViewById(R.id.textView20);
                final TextView bill85 = (TextView) findViewById(R.id.textView43);
                final TextView bill86 = (TextView) findViewById(R.id.textView24);
                final TextView bill87 = (TextView) findViewById(R.id.textView39);
                final TextView bill88 = (TextView) findViewById(R.id.textView37);
                final TextView bill89 = (TextView) findViewById(R.id.textView28);

                etText83 = (TextView) findViewById(R.id.textView14);
                etText84 = (TextView) findViewById(R.id.textView20);
                etText85 = (TextView) findViewById(R.id.textView43);
                etText86 = (TextView) findViewById(R.id.textView24);
                etText87 = (TextView) findViewById(R.id.textView39);
                etText88 = (TextView) findViewById(R.id.textView37);
                etText89 = (TextView) findViewById(R.id.textView28);

                bill83.setText(00.00 + "");
                bill84.setText(00.00 + "");
                bill85.setText(00.00 + "");
                bill86.setText(00.00 + "");
                bill87.setText(00.00 + "");
                bill88.setText(00.00 + "");
                bill89.setText(00.00 + "");

                Toast toast = Toast.makeText(getApplicationContext(),
                        "Сброс", Toast.LENGTH_SHORT);

                toast.show();

                return true;
            }


            //Snackbar.make(view, "Подсчитано", Snackbar.LENGTH_SHORT)
            //Snackbar.make(view, "Подсчитано", Snackbar.LENGTH_SHORT)
            // .setAction("Action", null).show();

        });
    }



    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    /*@Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.share) {

            Intent a = new Intent(this,HellpActivity.class);
            a.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
            startActivity(a);

            //Do something
            return true;
        } else if (id == R.id.email) {

            Intent a = new Intent(this,KirpishActivity.class);
            a.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
            startActivity(a);

            //Do something
            return true;
        } else if (id == R.id.reset) {

            final TextView bill83 = (TextView) findViewById(R.id.textView14);
            final TextView bill84 = (TextView) findViewById(R.id.textView20);
            final TextView bill85 = (TextView) findViewById(R.id.textView43);
            final TextView bill86 = (TextView) findViewById(R.id.textView24);
            final TextView bill87 = (TextView) findViewById(R.id.textView39);
            final TextView bill88 = (TextView) findViewById(R.id.textView37);
            final TextView bill89 = (TextView) findViewById(R.id.textView28);

            etText83 = (TextView) findViewById(R.id.textView14);
            etText84 = (TextView) findViewById(R.id.textView20);
            etText85 = (TextView) findViewById(R.id.textView43);
            etText86 = (TextView) findViewById(R.id.textView24);
            etText87 = (TextView) findViewById(R.id.textView39);
            etText88 = (TextView) findViewById(R.id.textView37);
            etText89 = (TextView) findViewById(R.id.textView28);

            bill83.setText(00.00 + "");
            bill84.setText(00.00 + "");
            bill85.setText(00.00 + "");
            bill86.setText(00.00 + "");
            bill87.setText(00.00 + "");
            bill88.setText(00.00 + "");
            bill89.setText(00.00 + "");
            //Do something



            return true;

        }



        return super.onOptionsItemSelected(item);
    }*/


    //region сохранение данных
    void saveText() {
        sPref = getPreferences(MODE_PRIVATE);
        SharedPreferences.Editor ed = sPref.edit();
        ed.putString(SAVED_TEXT, etText.getText().toString());
        ed.commit();
        //Toast.makeText(this, "Text saved", Toast.LENGTH_SHORT).show();
    }

    void loadText() {
        sPref = getPreferences(MODE_PRIVATE);
        String savedText = sPref.getString(SAVED_TEXT, "");
        etText.setText(savedText);
        //  Toast.makeText(this, "Text loaded", Toast.LENGTH_SHORT).show();
    }

    void saveText2() {
        sPref = getPreferences(MODE_PRIVATE);
        SharedPreferences.Editor ed = sPref.edit();
        ed.putString(SAVED_TEXT2, etText2.getText().toString());
        ed.commit();
    }
    void loadText2() {
        sPref = getPreferences(MODE_PRIVATE);
        String savedText = sPref.getString(SAVED_TEXT2, "");
        etText2.setText(savedText);
    }
    void saveText3() {
        sPref = getPreferences(MODE_PRIVATE);
        SharedPreferences.Editor ed = sPref.edit();
        ed.putString(SAVED_TEXT3, etText3.getText().toString());
        ed.commit();
    }
    void loadText3() {
        sPref = getPreferences(MODE_PRIVATE);
        String savedText = sPref.getString(SAVED_TEXT3, "");
        etText3.setText(savedText);
    }
    void saveText4() {
        sPref = getPreferences(MODE_PRIVATE);
        SharedPreferences.Editor ed = sPref.edit();
        ed.putString(SAVED_TEXT4, etText4.getText().toString());
        ed.commit();
    }
    void loadText4() {
        sPref = getPreferences(MODE_PRIVATE);
        String savedText = sPref.getString(SAVED_TEXT4, "");
        etText4.setText(savedText);
    }
    void saveText5() {
        sPref = getPreferences(MODE_PRIVATE);
        SharedPreferences.Editor ed = sPref.edit();
        ed.putString(SAVED_TEXT5, etText5.getText().toString());
        ed.commit();
    }
    void loadText5() {
        sPref = getPreferences(MODE_PRIVATE);
        String savedText = sPref.getString(SAVED_TEXT5, "");
        etText5.setText(savedText);
    }
    void saveText6() {
        sPref = getPreferences(MODE_PRIVATE);
        SharedPreferences.Editor ed = sPref.edit();
        ed.putString(SAVED_TEXT6, etText6.getText().toString());
        ed.commit();
    }
    void loadText6() {
        sPref = getPreferences(MODE_PRIVATE);
        String savedText = sPref.getString(SAVED_TEXT6, "");
        etText6.setText(savedText);
    }
    void saveText7() {
        sPref = getPreferences(MODE_PRIVATE);
        SharedPreferences.Editor ed = sPref.edit();
        ed.putString(SAVED_TEXT7, etText7.getText().toString());
        ed.commit();
    }
    void loadText7() {
        sPref = getPreferences(MODE_PRIVATE);
        String savedText = sPref.getString(SAVED_TEXT7, "");
        etText7.setText(savedText);
    }
    void saveText8() {
        sPref = getPreferences(MODE_PRIVATE);
        SharedPreferences.Editor ed = sPref.edit();
        ed.putString(SAVED_TEXT8, etText8.getText().toString());
        ed.commit();
    }
    void loadText8() {
        sPref = getPreferences(MODE_PRIVATE);
        String savedText = sPref.getString(SAVED_TEXT8, "");
        etText8.setText(savedText);
    }
    void saveText9() {
        sPref = getPreferences(MODE_PRIVATE);
        SharedPreferences.Editor ed = sPref.edit();
        ed.putString(SAVED_TEXT9, etText9.getText().toString());
        ed.commit();
    }
    void loadText9() {
        sPref = getPreferences(MODE_PRIVATE);
        String savedText = sPref.getString(SAVED_TEXT9, "");
        etText9.setText(savedText);
    }
    void saveText10() {
        sPref = getPreferences(MODE_PRIVATE);
        SharedPreferences.Editor ed = sPref.edit();
        ed.putString(SAVED_TEXT10, etText10.getText().toString());
        ed.commit();
    }
    void loadText10() {
        sPref = getPreferences(MODE_PRIVATE);
        String savedText = sPref.getString(SAVED_TEXT10, "");
        etText10.setText(savedText);
    }
    void saveText11() {
        sPref2 = getPreferences(MODE_PRIVATE);
        SharedPreferences.Editor ed = sPref2.edit();
        ed.putString(SAVED_TEXT11, etText11.getText().toString());
        ed.commit();
    }
    void loadText11() {
        sPref2 = getPreferences(MODE_PRIVATE);
        String savedText = sPref2.getString(SAVED_TEXT11, "");
        etText11.setText(savedText);
    }








    void saveText34() {
        sPref = getPreferences(MODE_PRIVATE);
        SharedPreferences.Editor ed = sPref.edit();
        ed.putString(SAVED_TEXT34, etText34.getText().toString());
        ed.commit();
    }
    void loadText34() {
        sPref = getPreferences(MODE_PRIVATE);
        String savedText = sPref.getString(SAVED_TEXT34, "");
        etText34.setText(savedText);
    }

    void saveText35() {
        sPref = getPreferences(MODE_PRIVATE);
        SharedPreferences.Editor ed = sPref.edit();
        ed.putString(SAVED_TEXT35, etText35.getText().toString());
        ed.commit();
    }
    void loadText35() {
        sPref = getPreferences(MODE_PRIVATE);
        String savedText = sPref.getString(SAVED_TEXT35, "");
        etText35.setText(savedText);
    }
    void saveText36() {
        sPref = getPreferences(MODE_PRIVATE);
        SharedPreferences.Editor ed = sPref.edit();
        ed.putString(SAVED_TEXT36, etText36.getText().toString());
        ed.commit();
    }
    void loadText36() {
        sPref = getPreferences(MODE_PRIVATE);
        String savedText = sPref.getString(SAVED_TEXT36, "");
        etText36.setText(savedText);
    }
    void saveText37() {
        sPref = getPreferences(MODE_PRIVATE);
        SharedPreferences.Editor ed = sPref.edit();
        ed.putString(SAVED_TEXT37, etText37.getText().toString());
        ed.commit();
    }
    void loadText37() {
        sPref = getPreferences(MODE_PRIVATE);
        String savedText = sPref.getString(SAVED_TEXT37, "");
        etText37.setText(savedText);
    }
    void saveText38() {
        sPref = getPreferences(MODE_PRIVATE);
        SharedPreferences.Editor ed = sPref.edit();
        ed.putString(SAVED_TEXT38, etText38.getText().toString());
        ed.commit();
    }
    void loadText38() {
        sPref = getPreferences(MODE_PRIVATE);
        String savedText = sPref.getString(SAVED_TEXT38, "");
        etText38.setText(savedText);
    }
    void saveText39() {
        sPref = getPreferences(MODE_PRIVATE);
        SharedPreferences.Editor ed = sPref.edit();
        ed.putString(SAVED_TEXT39, etText39.getText().toString());
        ed.commit();
    }
    void loadText39() {
        sPref = getPreferences(MODE_PRIVATE);
        String savedText = sPref.getString(SAVED_TEXT39, "");
        etText39.setText(savedText);
    }
    void saveText40() {
        sPref = getPreferences(MODE_PRIVATE);
        SharedPreferences.Editor ed = sPref.edit();
        ed.putString(SAVED_TEXT40, etText40.getText().toString());
        ed.commit();
    }
    void loadText40() {
        sPref = getPreferences(MODE_PRIVATE);
        String savedText = sPref.getString(SAVED_TEXT40, "");
        etText40.setText(savedText);
    }
    void saveText41() {
        sPref = getPreferences(MODE_PRIVATE);
        SharedPreferences.Editor ed = sPref.edit();
        ed.putString(SAVED_TEXT41, etText41.getText().toString());
        ed.commit();
    }
    void loadText41() {
        sPref = getPreferences(MODE_PRIVATE);
        String savedText = sPref.getString(SAVED_TEXT41, "");
        etText41.setText(savedText);
    }
    void saveText42() {
        sPref = getPreferences(MODE_PRIVATE);
        SharedPreferences.Editor ed = sPref.edit();
        ed.putString(SAVED_TEXT42, etText42.getText().toString());
        ed.commit();
    }
    void loadText42() {
        sPref = getPreferences(MODE_PRIVATE);
        String savedText = sPref.getString(SAVED_TEXT42, "");
        etText42.setText(savedText);
    }
    void saveText43() {
        sPref = getPreferences(MODE_PRIVATE);
        SharedPreferences.Editor ed = sPref.edit();
        ed.putString(SAVED_TEXT43, etText43.getText().toString());
        ed.commit();
    }
    void loadText43() {
        sPref = getPreferences(MODE_PRIVATE);
        String savedText = sPref.getString(SAVED_TEXT43, "");
        etText43.setText(savedText);
    }
    void saveText44() {
        sPref = getPreferences(MODE_PRIVATE);
        SharedPreferences.Editor ed = sPref.edit();
        ed.putString(SAVED_TEXT44, etText44.getText().toString());
        ed.commit();
    }
    void loadText44() {
        sPref = getPreferences(MODE_PRIVATE);
        String savedText = sPref.getString(SAVED_TEXT44, "");
        etText44.setText(savedText);
    }
    void saveText45() {
        sPref = getPreferences(MODE_PRIVATE);
        SharedPreferences.Editor ed = sPref.edit();
        ed.putString(SAVED_TEXT45, etText45.getText().toString());
        ed.commit();
    }
    void loadText45() {
        sPref = getPreferences(MODE_PRIVATE);
        String savedText = sPref.getString(SAVED_TEXT45, "");
        etText45.setText(savedText);
    }
    void saveText46() {
        sPref = getPreferences(MODE_PRIVATE);
        SharedPreferences.Editor ed = sPref.edit();
        ed.putString(SAVED_TEXT46, etText46.getText().toString());
        ed.commit();
    }
    void loadText46() {
        sPref = getPreferences(MODE_PRIVATE);
        String savedText = sPref.getString(SAVED_TEXT46, "");
        etText46.setText(savedText);
    }
    void saveText47() {
        sPref = getPreferences(MODE_PRIVATE);
        SharedPreferences.Editor ed = sPref.edit();
        ed.putString(SAVED_TEXT47, etText47.getText().toString());
        ed.commit();
    }
    void loadText47() {
        sPref = getPreferences(MODE_PRIVATE);
        String savedText = sPref.getString(SAVED_TEXT47, "");
        etText47.setText(savedText);
    }
    void saveText48() {
        sPref = getPreferences(MODE_PRIVATE);
        SharedPreferences.Editor ed = sPref.edit();
        ed.putString(SAVED_TEXT48, etText48.getText().toString());
        ed.commit();
    }
    void loadText48() {
        sPref = getPreferences(MODE_PRIVATE);
        String savedText = sPref.getString(SAVED_TEXT48, "");
        etText48.setText(savedText);
    }
    void saveText49() {
        sPref = getPreferences(MODE_PRIVATE);
        SharedPreferences.Editor ed = sPref.edit();
        ed.putString(SAVED_TEXT49, etText49.getText().toString());
        ed.commit();
    }
    void loadText49() {
        sPref = getPreferences(MODE_PRIVATE);
        String savedText = sPref.getString(SAVED_TEXT49, "");
        etText49.setText(savedText);
    }
    void saveText50() {
        sPref = getPreferences(MODE_PRIVATE);
        SharedPreferences.Editor ed = sPref.edit();
        ed.putString(SAVED_TEXT50, etText50.getText().toString());
        ed.commit();
    }
    void loadText50() {
        sPref = getPreferences(MODE_PRIVATE);
        String savedText = sPref.getString(SAVED_TEXT50, "");
        etText50.setText(savedText);
    }
    void saveText51() {
        sPref = getPreferences(MODE_PRIVATE);
        SharedPreferences.Editor ed = sPref.edit();
        ed.putString(SAVED_TEXT51, etText51.getText().toString());
        ed.commit();
    }
    void loadText51() {
        sPref = getPreferences(MODE_PRIVATE);
        String savedText = sPref.getString(SAVED_TEXT51, "");
        etText51.setText(savedText);
    }

    //endregion

    void saveText52() {
        sPref = getPreferences(MODE_PRIVATE);
        SharedPreferences.Editor ed = sPref.edit();
        ed.putString(SAVED_TEXT52, etText52.getText().toString());
        ed.commit();
    }
    void loadText52() {
        sPref = getPreferences(MODE_PRIVATE);
        String savedText = sPref.getString(SAVED_TEXT52, "");
        etText52.setText(savedText);
    }
    void saveText53() {
        sPref = getPreferences(MODE_PRIVATE);
        SharedPreferences.Editor ed = sPref.edit();
        ed.putString(SAVED_TEXT53, etText53.getText().toString());
        ed.commit();
    }
    void loadText53() {
        sPref = getPreferences(MODE_PRIVATE);
        String savedText = sPref.getString(SAVED_TEXT53, "");
        etText53.setText(savedText);
    }
    void saveText54() {
        sPref = getPreferences(MODE_PRIVATE);
        SharedPreferences.Editor ed = sPref.edit();
        ed.putString(SAVED_TEXT54, etText54.getText().toString());
        ed.commit();
    }
    void loadText54() {
        sPref = getPreferences(MODE_PRIVATE);
        String savedText = sPref.getString(SAVED_TEXT54, "");
        etText54.setText(savedText);
    }
    void saveText55() {
        sPref = getPreferences(MODE_PRIVATE);
        SharedPreferences.Editor ed = sPref.edit();
        ed.putString(SAVED_TEXT55, etText55.getText().toString());
        ed.commit();
    }
    void loadText55() {
        sPref = getPreferences(MODE_PRIVATE);
        String savedText = sPref.getString(SAVED_TEXT55, "");
        etText55.setText(savedText);
    }
    void saveText56() {
        sPref = getPreferences(MODE_PRIVATE);
        SharedPreferences.Editor ed = sPref.edit();
        ed.putString(SAVED_TEXT56, etText56.getText().toString());
        ed.commit();
    }
    void loadText56() {
        sPref = getPreferences(MODE_PRIVATE);
        String savedText = sPref.getString(SAVED_TEXT56, "");
        etText56.setText(savedText);
    }
    void saveText57() {
        sPref = getPreferences(MODE_PRIVATE);
        SharedPreferences.Editor ed = sPref.edit();
        ed.putString(SAVED_TEXT57, etText57.getText().toString());
        ed.commit();
    }
    void loadText57() {
        sPref = getPreferences(MODE_PRIVATE);
        String savedText = sPref.getString(SAVED_TEXT57, "");
        etText57.setText(savedText);
    }
    void saveText58() {
        sPref = getPreferences(MODE_PRIVATE);
        SharedPreferences.Editor ed = sPref.edit();
        ed.putString(SAVED_TEXT58, etText58.getText().toString());
        ed.commit();
    }
    void loadText58() {
        sPref = getPreferences(MODE_PRIVATE);
        String savedText = sPref.getString(SAVED_TEXT58, "");
        etText58.setText(savedText);
    }
    void saveText59() {
        sPref = getPreferences(MODE_PRIVATE);
        SharedPreferences.Editor ed = sPref.edit();
        ed.putString(SAVED_TEXT59, etText59.getText().toString());
        ed.commit();
    }
    void loadText59() {
        sPref = getPreferences(MODE_PRIVATE);
        String savedText = sPref.getString(SAVED_TEXT59, "");
        etText59.setText(savedText);
    }
    void saveText60() {
        sPref = getPreferences(MODE_PRIVATE);
        SharedPreferences.Editor ed = sPref.edit();
        ed.putString(SAVED_TEXT60, etText60.getText().toString());
        ed.commit();
    }
    void loadText60() {
        sPref = getPreferences(MODE_PRIVATE);
        String savedText = sPref.getString(SAVED_TEXT60, "");
        etText60.setText(savedText);
    }
    void saveText61() {
        sPref = getPreferences(MODE_PRIVATE);
        SharedPreferences.Editor ed = sPref.edit();
        ed.putString(SAVED_TEXT61, etText61.getText().toString());
        ed.commit();
    }
    void loadText61() {
        sPref = getPreferences(MODE_PRIVATE);
        String savedText = sPref.getString(SAVED_TEXT61, "");
        etText61.setText(savedText);
    }
    void saveText62() {
        sPref = getPreferences(MODE_PRIVATE);
        SharedPreferences.Editor ed = sPref.edit();
        ed.putString(SAVED_TEXT62, etText62.getText().toString());
        ed.commit();
    }
    void loadText62() {
        sPref = getPreferences(MODE_PRIVATE);
        String savedText = sPref.getString(SAVED_TEXT62, "");
        etText62.setText(savedText);
    }
    void saveText63() {
        sPref = getPreferences(MODE_PRIVATE);
        SharedPreferences.Editor ed = sPref.edit();
        ed.putString(SAVED_TEXT63, etText63.getText().toString());
        ed.commit();
    }
    void loadText63() {
        sPref = getPreferences(MODE_PRIVATE);
        String savedText = sPref.getString(SAVED_TEXT63, "");
        etText63.setText(savedText);
    }
    void saveText64() {
        sPref = getPreferences(MODE_PRIVATE);
        SharedPreferences.Editor ed = sPref.edit();
        ed.putString(SAVED_TEXT64, etText64.getText().toString());
        ed.commit();
    }
    void loadText64() {
        sPref = getPreferences(MODE_PRIVATE);
        String savedText = sPref.getString(SAVED_TEXT64, "");
        etText64.setText(savedText);
    }
    void saveText65() {
        sPref = getPreferences(MODE_PRIVATE);
        SharedPreferences.Editor ed = sPref.edit();
        ed.putString(SAVED_TEXT65, etText65.getText().toString());
        ed.commit();
    }
    void loadText65() {
        sPref = getPreferences(MODE_PRIVATE);
        String savedText = sPref.getString(SAVED_TEXT65, "");
        etText65.setText(savedText);
    }
    void saveText66() {
        sPref = getPreferences(MODE_PRIVATE);
        SharedPreferences.Editor ed = sPref.edit();
        ed.putString(SAVED_TEXT66, etText66.getText().toString());
        ed.commit();
    }
    void loadText66() {
        sPref = getPreferences(MODE_PRIVATE);
        String savedText = sPref.getString(SAVED_TEXT66, "");
        etText66.setText(savedText);
    }
    void saveText67() {
        sPref = getPreferences(MODE_PRIVATE);
        SharedPreferences.Editor ed = sPref.edit();
        ed.putString(SAVED_TEXT67, etText67.getText().toString());
        ed.commit();
    }
    void loadText67() {
        sPref = getPreferences(MODE_PRIVATE);
        String savedText = sPref.getString(SAVED_TEXT67, "");
        etText67.setText(savedText);
    }
    void saveText68() {
        sPref = getPreferences(MODE_PRIVATE);
        SharedPreferences.Editor ed = sPref.edit();
        ed.putString(SAVED_TEXT68, etText68.getText().toString());
        ed.commit();
    }
    void loadText68() {
        sPref = getPreferences(MODE_PRIVATE);
        String savedText = sPref.getString(SAVED_TEXT68, "");
        etText68.setText(savedText);
    }


    void saveText69() {
        sPref = getPreferences(MODE_PRIVATE);
        SharedPreferences.Editor ed = sPref.edit();
        ed.putString(SAVED_TEXT69, etText69.getText().toString());
        ed.commit();
    }
    void loadText69() {
        sPref = getPreferences(MODE_PRIVATE);
        String savedText = sPref.getString(SAVED_TEXT69, "");
        etText69.setText(savedText);
    }
    void saveText70() {
        sPref = getPreferences(MODE_PRIVATE);
        SharedPreferences.Editor ed = sPref.edit();
        ed.putString(SAVED_TEXT70, etText70.getText().toString());
        ed.commit();
    }
    void loadText70() {
        sPref = getPreferences(MODE_PRIVATE);
        String savedText = sPref.getString(SAVED_TEXT70, "");
        etText70.setText(savedText);
    }
    void saveText71() {
        sPref = getPreferences(MODE_PRIVATE);
        SharedPreferences.Editor ed = sPref.edit();
        ed.putString(SAVED_TEXT71, etText71.getText().toString());
        ed.commit();
    }
    void loadText71() {
        sPref = getPreferences(MODE_PRIVATE);
        String savedText = sPref.getString(SAVED_TEXT71, "");
        etText71.setText(savedText);
    }
    void saveText72() {
        sPref = getPreferences(MODE_PRIVATE);
        SharedPreferences.Editor ed = sPref.edit();
        ed.putString(SAVED_TEXT72, etText72.getText().toString());
        ed.commit();
    }
    void loadText72() {
        sPref = getPreferences(MODE_PRIVATE);
        String savedText = sPref.getString(SAVED_TEXT72, "");
        etText72.setText(savedText);
    }

    void saveText73() {
        sPref = getPreferences(MODE_PRIVATE);
        SharedPreferences.Editor ed = sPref.edit();
        ed.putString(SAVED_TEXT73, etText73.getText().toString());
        ed.commit();
    }
    void loadText73() {
        sPref = getPreferences(MODE_PRIVATE);
        String savedText = sPref.getString(SAVED_TEXT73, "");
        etText73.setText(savedText);
    }
    void saveText74() {
        sPref = getPreferences(MODE_PRIVATE);
        SharedPreferences.Editor ed = sPref.edit();
        ed.putString(SAVED_TEXT74, etText74.getText().toString());
        ed.commit();
    }
    void loadText74() {
        sPref = getPreferences(MODE_PRIVATE);
        String savedText = sPref.getString(SAVED_TEXT74, "");
        etText74.setText(savedText);
    }


    void saveText79() {
        sPref = getPreferences(MODE_PRIVATE);
        SharedPreferences.Editor ed = sPref.edit();
        ed.putString(SAVED_TEXT79, etText79.getText().toString());
        ed.commit();
    }
    void loadText79() {
        sPref = getPreferences(MODE_PRIVATE);
        String savedText = sPref.getString(SAVED_TEXT79, "");
        etText79.setText(savedText);
    }
    void saveText80() {
        sPref = getPreferences(MODE_PRIVATE);
        SharedPreferences.Editor ed = sPref.edit();
        ed.putString(SAVED_TEXT80, etText80.getText().toString());
        ed.commit();
    }
    void loadText80() {
        sPref = getPreferences(MODE_PRIVATE);
        String savedText = sPref.getString(SAVED_TEXT80, "");
        etText80.setText(savedText);
    }
    void saveText81() {
        sPref = getPreferences(MODE_PRIVATE);
        SharedPreferences.Editor ed = sPref.edit();
        ed.putString(SAVED_TEXT81, etText81.getText().toString());
        ed.commit();
    }
    void loadText81() {
        sPref = getPreferences(MODE_PRIVATE);
        String savedText = sPref.getString(SAVED_TEXT81, "");
        etText81.setText(savedText);
    }
    void saveText82() {
        sPref = getPreferences(MODE_PRIVATE);
        SharedPreferences.Editor ed = sPref.edit();
        ed.putString(SAVED_TEXT82, etText82.getText().toString());
        ed.commit();
    }
    void loadText82() {
        sPref = getPreferences(MODE_PRIVATE);
        String savedText = sPref.getString(SAVED_TEXT82, "");
        etText82.setText(savedText);
    }

    // сохранение данных
    void saveText83() {
        sPref = getPreferences(MODE_PRIVATE);
        SharedPreferences.Editor ed = sPref.edit();
        ed.putString(SAVED_TEXT83, etText83.getText().toString());
        ed.commit();
    }
    void loadText83() {
        sPref = getPreferences(MODE_PRIVATE);
        String savedText = sPref.getString(SAVED_TEXT83, "");
        etText83.setText(savedText);
    }
    void saveText84() {
        sPref = getPreferences(MODE_PRIVATE);
        SharedPreferences.Editor ed = sPref.edit();
        ed.putString(SAVED_TEXT84, etText84.getText().toString());
        ed.commit();
    }
    void loadText84() {
        sPref = getPreferences(MODE_PRIVATE);
        String savedText = sPref.getString(SAVED_TEXT84, "");
        etText84.setText(savedText);
    }
    void saveText85() {
        sPref = getPreferences(MODE_PRIVATE);
        SharedPreferences.Editor ed = sPref.edit();
        ed.putString(SAVED_TEXT85, etText85.getText().toString());
        ed.commit();
    }
    void loadText85() {
        sPref = getPreferences(MODE_PRIVATE);
        String savedText = sPref.getString(SAVED_TEXT85, "");
        etText85.setText(savedText);
    }
    void saveText86() {
        sPref = getPreferences(MODE_PRIVATE);
        SharedPreferences.Editor ed = sPref.edit();
        ed.putString(SAVED_TEXT86, etText86.getText().toString());
        ed.commit();
    }
    void loadText86() {
        sPref = getPreferences(MODE_PRIVATE);
        String savedText = sPref.getString(SAVED_TEXT86, "");
        etText86.setText(savedText);
    }
    void saveText87() {
        sPref = getPreferences(MODE_PRIVATE);
        SharedPreferences.Editor ed = sPref.edit();
        ed.putString(SAVED_TEXT87, etText87.getText().toString());
        ed.commit();
    }
    void loadText87() {
        sPref = getPreferences(MODE_PRIVATE);
        String savedText = sPref.getString(SAVED_TEXT87, "");
        etText87.setText(savedText);
    }
    void saveText88() {
        sPref = getPreferences(MODE_PRIVATE);
        SharedPreferences.Editor ed = sPref.edit();
        ed.putString(SAVED_TEXT88, etText88.getText().toString());
        ed.commit();
    }
    void loadText88() {
        sPref = getPreferences(MODE_PRIVATE);
        String savedText = sPref.getString(SAVED_TEXT88, "");
        etText88.setText(savedText);
    }


    void saveText89() {
        sPref = getPreferences(MODE_PRIVATE);
        SharedPreferences.Editor ed = sPref.edit();
        ed.putString(SAVED_TEXT89, etText89.getText().toString());
        ed.commit();
    }
    void loadText89() {
        sPref = getPreferences(MODE_PRIVATE);
        String savedText = sPref.getString(SAVED_TEXT89, "");
        etText89.setText(savedText);
    }


    @Override
    protected void onDestroy() {
        super.onDestroy();
        saveText();
        saveText2();
        saveText3();
        saveText4();
        saveText5();
        saveText6();
        saveText7();
        saveText8();
        saveText9();
        saveText10();
        saveText11();
        //saveText12();
        //saveText13();
        //saveText14();
        //saveText15();
        //saveText16();
        //saveText17();
       // saveText18();
      //  saveText19();
      //  saveText20();
      //  saveText21();
      //  saveText22();


        saveText34();
        saveText35();
        saveText36();
        saveText37();
        saveText38();
        saveText39();
        saveText40();
        saveText41();
        saveText42();
        saveText43();
        saveText44();
        saveText45();
        saveText46();
        saveText47();
        saveText48();
        saveText49();
        saveText50();
        saveText51();

        saveText52();
        saveText53();
        saveText54();
        saveText55();

        saveText56();
        saveText57();
        saveText58();
        saveText59();

        saveText60();
        saveText61();
        saveText62();
        saveText63();
        saveText64();
        saveText65();

        saveText66();
        saveText67();
        saveText68();

        saveText69();
        saveText70();
        saveText71();
        saveText72();

        saveText73();
        saveText74();

        saveText79();
        saveText80();
        saveText81();
        saveText82();

        saveText83();
        saveText84();
        saveText85();
        saveText86();
        saveText87();
        saveText88();
        saveText89();

    }

    public void onClickDom(View view) {
        Intent a = new Intent(this,Start_Activity.class);
        a.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(a);
    }
    @Override
    public void onBackPressed() {

        t.cancel();
        Intent a = new Intent(this, Start_Activity.class);
        a.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(a);
    }
    //do something on back.
    public void onClick_Ca(View view) {
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

    public void onClick_dim(View view) {

        long mills = 15L;
        Vibrator vibrator = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);
        vibrator.vibrate(mills);

        Intent a = new Intent(this, Start_Activity.class);
        a.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(a);
    }

    public void onClick_Pismo(View view) {

        long mills = 15L;
        Vibrator vibrator = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);
        vibrator.vibrate(mills);

        Intent a = new Intent(this,PlusActivity.class);
        a.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(a);
    }
    public void onClick_Pod(View view) {

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
        }}

    public void onEmailClick(View v) {
        long mills = 42L;
        Vibrator vibrator = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);
        vibrator.vibrate(mills);

        //TextView r1-результат text1;

        String emailSubject = getString(R.string.armopojas1);
        String na_email = getString(R.string.na_email);

        TextView ob_wir = findViewById(R.id.textViewWir);
        TextView ob_wir2 = findViewById(R.id.textViewWir4);
        TextView ob_wir3 = findViewById(R.id.textViewWir5);
        TextView ob_wir4 = findViewById(R.id.textViewWir6);
        TextView ob_wir5 = findViewById(R.id.textViewWir11);
        TextView ob_wir11 = findViewById(R.id.textViewWir12);
        TextView ob_wir6 = findViewById(R.id.textViewWir7);
        TextView ob_wir7 = findViewById(R.id.textViewWir8);
        TextView ob_wir8 = findViewById(R.id.textViewWir9);
        TextView ob_wir10 = findViewById(R.id.textViewWir10);


        TextView rez_text1 = findViewById(R.id.textView14);
        TextView rez_text2 = findViewById(R.id.textView20);
        TextView rez_text3 = findViewById(R.id.textView43);
        TextView rez_text4 = findViewById(R.id.textView24);
        TextView rez_text5 = findViewById(R.id.textView39);
        TextView rez_text6 = findViewById(R.id.textView37);
        TextView rez_text7 = findViewById(R.id.textView28);




        String rez1 = rez_text1.getText().toString();
        String rez2 = rez_text2.getText().toString();
        String rez3 = rez_text3.getText().toString();
        String rez4 = rez_text4.getText().toString();
        String rez5 = rez_text5.getText().toString();
        String rez6 = rez_text6.getText().toString();
        String rez7 = rez_text7.getText().toString();



        String ob1 = ob_wir.getText().toString();
        String ob2 = ob_wir2.getText().toString();
        String ob3 = ob_wir3.getText().toString();
        String ob4 = ob_wir4.getText().toString();
        String ob5 = ob_wir5.getText().toString();
        String ob6 = ob_wir11.getText().toString();
        String ob7 = ob_wir6.getText().toString();
        String ob8 = ob_wir7.getText().toString();
        String ob9 = ob_wir8.getText().toString();
        String ob10 = ob_wir10.getText().toString();


        String r1 = getString(R.string.Beton);
        String r2 = getString(R.string.cena);
        String r3 = getString(R.string.armatura_m_kg);
        String r4 = getString(R.string.B_m_kg);
        String r5 = getString(R.string.cena_armaturi_vsya);


        String r10 = getString(R.string.per_arm);
        String r11 = getString(R.string.wirin_poyasa);
        String r12 = getString(R.string.vis_poyas);
        String r13 = getString(R.string.cena_betona_za_m3);
        String r14 = getString(R.string.ryadi_armaturi_a);
        String r15 = getString(R.string.naxlest);
        String r16 = getString(R.string.a_dia_prod);
        String r17 = getString(R.string.b_dia);
        String r18 = getString(R.string.wag_obv);
        String r19 = getString(R.string.cena_armaturi_za_kg);


        String ida = getString(R.string.isxod_dani);

        Intent intent = new Intent(Intent.ACTION_SEND);
        intent.putExtra(Intent.EXTRA_SUBJECT, emailSubject);
        intent.putExtra(Intent.EXTRA_TEXT, new String(

                (r1)+(rez1)+
                        "\n"+(r2)+(rez2)+
                        "\n"+(r3)+(rez3)+"/"+(rez4)+
                        "\n"+(r4)+(rez5)+"/"+(rez6)+
                        "\n"+(r5)+(rez7)+

                        "\n"+"......."+
                        "\n"+(ida)+
                        "\n"+(r10)+(ob1)+
                        "\n"+(r11)+(ob2)+
                        "\n"+(r12)+(ob3)+
                        "\n"+(r13)+(ob4)+
                        "\n"+(r14)+(ob5)+
                        "\n"+(r15)+(ob6)+
                        "\n"+(r16)+(ob7)+
                        "\n"+(r17)+(ob8)+
                        "\n"+(r18)+(ob9)+
                        "\n"+(r19)+(ob10)

        ));
        {
            intent.setType("plain/text");
        }
        startActivity(Intent.createChooser(intent, na_email));
    }


}
