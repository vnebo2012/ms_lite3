package com.lite.my.masterok;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.Vibrator;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class PoiskActivity extends AppCompatActivity {
    Context context5;

    private AutoCompleteTextView mAutoCompleteTextView;
    private String[] mCats =
            {"Арматура",
            "Бетон",
            "Цемент",
            "Песок",
            "Пиломатериалы",
            "Металочерепица",
            "Металобаза",
            "Щебень",
            "Гравий",
            "Клей для обоев",
            "Керамзит",
            "Камень",
            "Камень",
            "Кирпич",
            "Кабели, провода, автоматы",
            "Сантехническое оборудование",
            "Отопительное оборудование",
            "Металлопластиковые трубы",
            "Паркетная доска",
            "Натяжные потолки",
            "Подвесные потолки",
            "Шлакоблоки",
            "Газобетонные блоки",
            "Железобетонные изделия",
            "Стройматериалы из древесины",
            "Лакокрасочные материалы",
            "Известь гашёная",
            "Венецианские штукатурки",
            "Портландцемент",
            "Известь негашёная",
            "Бетонные смеси",
            "Клей плиточный",
            "Грунтовки",
            "Штукатурки гипсовые",
            "Песок"
            };

    private List<String> mList;
    private ArrayAdapter<String> mAutoCompleteAdapter;
    private TextView mAutoListTextView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_poisk);

        mAutoCompleteTextView = (AutoCompleteTextView) findViewById(R.id.autoCompleteTextView);
        prepareList();

        mAutoCompleteAdapter = new ArrayAdapter<>(PoiskActivity.this,
                android.R.layout.simple_dropdown_item_1line, mList);

        mAutoCompleteTextView.setAdapter(mAutoCompleteAdapter);

        /////mAutoListTextView = (TextView) findViewById(R.id.textViewAutoList);

    }
    public void onClickSbros(View view) {

        final AutoCompleteTextView bill83 = findViewById(R.id.autoCompleteTextView);



        bill83.setText("");

        long mills = 45L;
        Vibrator vibrator = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);
        vibrator.vibrate(mills);
    }

    public void onClickPoisk(View view) {

        String newAdd = mAutoCompleteTextView.getText().toString();

        if (!mList.contains(newAdd)) {
            mList.add(newAdd);

            // update the autocomplete words
            mAutoCompleteAdapter = new ArrayAdapter<>(
                    PoiskActivity.this,
                    android.R.layout.simple_dropdown_item_1line, mList);

            mAutoCompleteTextView.setAdapter(mAutoCompleteAdapter);
        }

        // display the words in mList for your reference
        String s = "";
        for (int i = 0; i < mList.size(); i++) {
            s += mList.get(i) + "\n";
        }
        //////////mAutoListTextView.setText(s);
        long mills11 = 45L;
        Vibrator vibrator11 = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);
        vibrator11.vibrate(mills11);

        ConnectivityManager cm = (ConnectivityManager) getSystemService(Context.CONNECTIVITY_SERVICE);
        NetworkInfo wifiInfo = cm.getNetworkInfo(ConnectivityManager.TYPE_WIFI);
        if (wifiInfo != null && wifiInfo.isConnected())
        {

            Intent intent = getPackageManager().getLaunchIntentForPackage("com.google.android.apps.maps");
            if (intent != null) {

                AutoCompleteTextView aetText28 = findViewById(R.id.autoCompleteTextView);
                String num1 = new String(aetText28.getText().toString());
                String w28 = num1;
                Uri gmmIntentUri = Uri.parse("https://www.google.com.ua/maps/search/"+w28+" рядом");
                Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
                mapIntent.setPackage("com.google.android.apps.maps");
                startActivity(mapIntent);

            } else {

                // Bring user to the market or let them choose an app?
                intent = new Intent(Intent.ACTION_VIEW);
                intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                intent.setData(Uri.parse("market://details?id=" + "com.google.android.apps.maps"));
                startActivity(intent);
            }

        } else {

            context5 = PoiskActivity.this;


            String title = getString(R.string.no_wi_fi);
            //String message = String.valueOf(R.string.v_pro_xot);
            String button1String = getString(R.string.prodolgit);
            String button2String = getString(R.string.nazad);

            AlertDialog.Builder ad;

            ad = new AlertDialog.Builder(context5);
            ad.setTitle(title);  // заголовок
            //ad.setMessage(message); // сообщение
            ad.setPositiveButton(button1String, new DialogInterface.OnClickListener() {
                public void onClick(DialogInterface dialog, int arg1) {

                    Intent intent = getPackageManager().getLaunchIntentForPackage("com.google.android.apps.maps");
                    if (intent != null) {


                        AutoCompleteTextView aetText28 = findViewById(R.id.autoCompleteTextView);
                        String num1 = new String(aetText28.getText().toString());
                        String w28 = num1;
                        Uri gmmIntentUri = Uri.parse("https://www.google.com.ua/maps/search/"+w28+" рядом");
                        Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
                        mapIntent.setPackage("com.google.android.apps.maps");
                        startActivity(mapIntent);

                    } else {



                        // Bring user to the market or let them choose an app?
                        intent = new Intent(Intent.ACTION_VIEW);
                        intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                        intent.setData(Uri.parse("market://details?id=" + "com.google.android.apps.maps"));
                        startActivity(intent);

                    }
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
        }
    }

    private void prepareList() {
        // подготовим список для автозаполнения
        mList = new ArrayList<>();
        for (String mCat : mCats) {
            mList.add(mCat);
        }
    }

    /*public void onClick(View view) {
        String newAdd = mAutoCompleteTextView.getText().toString();

        if (!mList.contains(newAdd)) {
            mList.add(newAdd);

            // update the autocomplete words
            mAutoCompleteAdapter = new ArrayAdapter<>(
                    PoiskActivity.this,
                    android.R.layout.simple_dropdown_item_1line, mList);

            mAutoCompleteTextView.setAdapter(mAutoCompleteAdapter);
        }

        // display the words in mList for your reference
        String s = "";
        for (int i = 0; i < mList.size(); i++) {
            s += mList.get(i) + "\n";
        }
        mAutoListTextView.setText(s);
    }*/
}
