package com.lite.my.masterok.News;

import android.content.pm.ActivityInfo;
import android.os.AsyncTask;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.lite.my.masterok.R;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutionException;

public class StroimDomActivity extends AppCompatActivity {


    private ListView listView;
    private TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_statti);

        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);


        listView = (ListView) findViewById(R.id.listView);
        textView = (TextView) findViewById(R.id.textView2);

        ParseTitle parseTitle = new ParseTitle();
        parseTitle.execute();

        try {
            final HashMap<String,String> hashMap = parseTitle.get();

            final ArrayList<String> arrayList = new ArrayList<>();
            for (Map.Entry entry : hashMap.entrySet()){
                arrayList.add(entry.getKey().toString());
            }

            ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(StroimDomActivity.this
            , android.R.layout.simple_list_item_1, arrayList);

            listView.setAdapter(arrayAdapter);
            listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                    ParseText parseText = new ParseText();
                    parseText.execute(hashMap.get(arrayList.get(position)));

                    try {
                        listView.setVisibility(View.GONE);
                        textView.setText(parseText.get());
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    } catch (ExecutionException e) {
                        e.printStackTrace();
                    }
                }
            });

        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }


    }

    private static long back_pressed;
    @Override
    public void onBackPressed() {


        if (back_pressed + 2000 > System.currentTimeMillis())
            super.onBackPressed();
        else
            Toast.makeText(getBaseContext(), "Нажмите еще раз, чтобы выйти!",
                    Toast.LENGTH_SHORT).show();
        back_pressed = System.currentTimeMillis();



        listView.setVisibility(View.VISIBLE);
        //textView.setVisibility(View.INVISIBLE);
        //textView.setBackgroundColor(ContextCompat.getColor(this, R.color.witeColor));
        textView.setText(getIntent().getStringExtra(""));



    }


    class ParseText extends AsyncTask<String,Void, String>{




        @Override
        protected String doInBackground(String... params) {
            String str = "";
            try {
                Document document = Jsoup.connect(params [0]).get();
                Element element = document.select(".news-content").first();
                str = element.text();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }
    }

    class ParseTitle extends AsyncTask<Void, Void, HashMap<String,String>>{

        //@Override
        //protected void onPreExecute() {
        //    super.onPreExecute();
         //   Toast.makeText(getApplicationContext(), "Загрузка ...", Toast.LENGTH_SHORT).show();
       // }

        @Override
        protected HashMap<String, String> doInBackground(Void... voids) {
            HashMap<String,String> hashMap = new HashMap<>();

            try {
                Document document = Jsoup.connect("http://budport.com.ua/articles/category/34-vse-pro-remont").get();
                Elements elements = document.select(".news-item-wild-title");
                for (Element element : elements){
                    Element element1 = element.select("a[href]").first();
                    hashMap.put(element.text(), element1.attr("abs:href"));


                }
            } catch (IOException e) {
                e.printStackTrace();
            }

            return hashMap;
        }
    }
}
