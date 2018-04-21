package com.lite.my.masterok.News;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.CardView;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.lite.my.masterok.R;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.List;

public class ListRecipeActivity extends AppCompatActivity {

    private RecyclerView mRecyclerView;

    View.OnClickListener mOnClickListener;



    private String MY_LOG = "myLog";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_recipe);

        mRecyclerView = findViewById(R.id.rv);

        ArrayList<Recipe> mListRecipe = getIntent().getParcelableArrayListExtra("recipe");
        //Log.d(MY_LOG, String.valueOf(mListRecipe.size()));

        GridLayoutManager manager;
        if (getResources().getConfiguration().orientation == Configuration.ORIENTATION_LANDSCAPE){

            manager = new GridLayoutManager(this, 2);
        }else {
            manager = new GridLayoutManager(this,1);
        }

        mRecyclerView.setLayoutManager(manager);
        RVAdapter adapter = new RVAdapter(mListRecipe);
        mRecyclerView.setAdapter(adapter);


    }

    public class RVAdapter extends RecyclerView.Adapter<RVAdapter.RecipeViewHolder>{

        List<Recipe> mRecipes;
        public RVAdapter(List<Recipe> recipes){ mRecipes = recipes;


        }

        @NonNull
        @Override
        public RecipeViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

            View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.card_view, parent, false);

            RecipeViewHolder recipeViewHolder = new RecipeViewHolder(v);
            final View.OnClickListener mOnClickListener = new View.OnClickListener() {


                @Override
                public void onClick(View view) {

                    int itemPosition = mRecyclerView.getChildLayoutPosition(view);

                    Intent intentPageRecipe = new Intent(ListRecipeActivity. this, FullRecipeActivity.class);
                    intentPageRecipe.putExtra("page", mRecipes.get(itemPosition).getmLinkPageRecipe());
                    intentPageRecipe.putExtra("name", mRecipes.get(itemPosition).getmNameRecipe());
                    intentPageRecipe.putExtra("image", mRecipes.get(itemPosition).getmLinkImage());

                    startActivity(intentPageRecipe);
                }
            };

            v.setOnClickListener(mOnClickListener);
            return recipeViewHolder;
        }

        @Override
        public void onBindViewHolder(@NonNull RecipeViewHolder holder, int position) {

            holder.recipeName.setText(mRecipes.get(position).getmNameRecipe());
            holder.recipePageLink.setText(mRecipes.get(position).getmLinkPageRecipe());

            Picasso.get()
                    .load(mRecipes.get(position).getmLinkImage())
                    .fit().centerCrop()
                    .into(holder.recipePhoto);

        }

        @Override
        public int getItemCount() {
            return mRecipes.size();
        }


        public class RecipeViewHolder extends RecyclerView.ViewHolder {

            CardView cv;
            ImageView recipePhoto;
            TextView recipeName, recipePageLink;


            public RecipeViewHolder(View itemView) {
                super(itemView);
                cv = itemView.findViewById(R.id.cv);
                recipePhoto = itemView.findViewById(R.id.imageRecipe);
                recipeName = itemView.findViewById(R.id.nameRecipe);
                recipePageLink = itemView.findViewById(R.id.linkPageRecipe);

            }
        }
    }
}
