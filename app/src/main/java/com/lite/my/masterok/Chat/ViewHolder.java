package com.lite.my.masterok.Chat;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.lite.my.masterok.R;

public class ViewHolder extends RecyclerView.ViewHolder {

    TextView massege;
    TextView name;
    TextView data;

    public ViewHolder(View itemView) {
        super(itemView);

        massege = itemView.findViewById(R.id.masseg_item);
        //name = itemView.findViewById(R.id.name);
        //data = itemView.findViewById(R.id.data);
    }
}
