package com.lite.my.masterok.News;

import android.os.Parcel;
import android.os.Parcelable;

public class Recipe implements Parcelable {

    private String mLinkImage; // Ссылка на картинку
    private String mNameRecipe;// Название рецепта
    private String mLinkPageRecipe;// ссылка на страницу рецепта

    public Recipe(String mLinkImage, String mNameRecipe, String mLinkPageRecipe) {
        this.mLinkImage = mLinkImage;
        this.mNameRecipe = mNameRecipe;
        this.mLinkPageRecipe = mLinkPageRecipe;
    }

    protected Recipe(Parcel in) {

        String[] data = new String[3];
        in.readStringArray(data);

        mLinkImage = data [0];
        mNameRecipe = data [1];
        mLinkPageRecipe = data [2];
    }

    public static final Creator<Recipe> CREATOR = new Creator<Recipe>() {
        @Override
        public Recipe createFromParcel(Parcel in) {
            return new Recipe(in);
        }

        @Override
        public Recipe[] newArray(int size) {
            return new Recipe[size];
        }
    };

    public String getmLinkImage() {
        return mLinkImage;
    }

    public void setmLinkImage(String mLinkImage) {
        this.mLinkImage = mLinkImage;
    }

    public String getmNameRecipe() {
        return mNameRecipe;
    }

    public void setmNameRecipe(String mNameRecipe) {
        this.mNameRecipe = mNameRecipe;
    }

    public String getmLinkPageRecipe() {
        return mLinkPageRecipe;
    }

    public void setmLinkPageRecipe(String mLinkPageRecipe) {
        this.mLinkPageRecipe = mLinkPageRecipe;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {

        parcel.writeStringArray(new String[] {mLinkImage, mNameRecipe, mLinkPageRecipe});
    }


}
