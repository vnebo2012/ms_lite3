package com.lite.my.masterok.News;

import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.Parcelable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import com.lite.my.masterok.R;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class StroimDomActivity extends AppCompatActivity {

    private String MY_LOG = "myLog";
    private List<Recipe> mListRecipe = new ArrayList<>();
    private ParsAllRecipe mCatTask;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_logo);

        mCatTask = new ParsAllRecipe();
        mCatTask.execute();
    }
    class ParsAllRecipe extends AsyncTask<Void, Void, Void> {

        @Override
        protected Void doInBackground(Void... voids) {

            String urlHome = "http://budport.com.ua/articles/category/34-vse-pro-remont";

            try {

                Document document = Jsoup.connect(urlHome).get();
                Elements els = document.select("div[class=news-wrapper ]");
                Elements pages = els.select("div[class=pagination]>a");
                Element page = pages.get(pages.size()-2);
                int count = Integer.parseInt(page.text());
                for (int i = 1; i <= count; i++){

                    String url = "http://budport.com.ua/articles/category/34-vse-pro-remont?page=" + i;
                    itemRecipe(url);
                }


            } catch (IOException e) {
                e.printStackTrace();
            }

            return null;
        }

        @Override
        protected void onPostExecute(Void aVoid) {
            super.onPostExecute(aVoid);

            Intent intent = new Intent(StroimDomActivity.this, ListRecipeActivity.class);
            intent.putParcelableArrayListExtra("recipe", (ArrayList<? extends Parcelable>) mListRecipe);
            startActivity(intent);

            finish();
        }

        private void itemRecipe (String url) {




            try {
                String imgRecipe, nameRecipe, linkRecipe;
                Document document = Jsoup.connect(url).get();
                //Elements elements = document.select("div[class=news-item-wild-left]" );
                Elements elements = document.select(".news-item-wild-left");

                for (Element element : elements){
                    imgRecipe  = "http://budport.com.ua" + element.select("img").attr("src");

                    nameRecipe = element.select("img").attr("alt");
                    //nameRecipe = element.select("div[class=news-item-wild-title] > a").text();

                    linkRecipe = element.select("div[class=news-item-wild-left] > a").attr("href");

                    Log.d(MY_LOG, imgRecipe+ " "+nameRecipe+" "+" "+ linkRecipe);

                    mListRecipe.add(new Recipe(imgRecipe, nameRecipe, linkRecipe));
                }

            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
    @Override
    public void onBackPressed() {

        mCatTask.cancel(true);
        Intent a = new Intent(this,MenuNewsActivity.class);
        a.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(a);
    }
}

