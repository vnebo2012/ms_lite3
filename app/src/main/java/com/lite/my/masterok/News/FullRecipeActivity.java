package com.lite.my.masterok.News;

import android.os.AsyncTask;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;

import com.lite.my.masterok.R;
import com.squareup.picasso.Picasso;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

import java.io.IOException;
import java.util.concurrent.ExecutionException;

public class FullRecipeActivity extends AppCompatActivity {

    private String MY_LOG = "myLog";

    private TextView mNameRecipe;
    private TextView mText;
    private ImageView mImageRecipe;

    private String mLinkPageRecipe;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_full_recipe);




        mLinkPageRecipe = getIntent().getStringExtra("page");
        //Log.d(MY_LOG, mLinkPageRecipe);
        mNameRecipe = findViewById(R.id.nameRecipe);
        mImageRecipe = findViewById(R.id.imageRecipe);
        mText = findViewById(R.id.textLink);


        RecipeLoad parseText = new RecipeLoad();
        parseText.execute();

        try {
            mText.setText(parseText.get());
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }

        mNameRecipe.setText(getIntent().getStringExtra("name"));


        Picasso.get()
        .load(getIntent().getStringExtra("image"))
        .fit().centerCrop()
                .into(mImageRecipe);

        new RecipeLoad().execute();


    }

    class RecipeLoad extends AsyncTask<Void, Void, String> {


        @Override
        protected String doInBackground(Void... voids) {

            String str = "";

            try {
                Document document = Jsoup.connect(mLinkPageRecipe).get();
                Element element = document.select(".news-content").first();
                str = element.text();
                Log.d(MY_LOG, str);




            } catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }
    }
}
