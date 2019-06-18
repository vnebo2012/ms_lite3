package com.lite.my.masterok.Chat;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.lite.my.masterok.R;

import java.util.ArrayList;

public class DataAdapter extends RecyclerView.Adapter<ViewHolder> {

    ArrayList<String> massages;
    LayoutInflater inflater;


    public DataAdapter(Context context, ArrayList<String> massages) {
        this.massages = massages;
        this.inflater = LayoutInflater.from(context);
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = inflater.inflate(R.layout.item_massege, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {




        String mas = massages.get(position);
        //String nam = massages.get(position);
        holder.massege.setText(mas);


        //holder.name.setText(nam);
        //holder.name.setText(nam);
        //Date cal = Calendar.getInstance().getTime();
       /// String dt = cal.toLocaleString();
       // String gt = massages.get(position);
       // holder.data.setText(dt);



    }

    @Override
    public int getItemCount() {
        return massages.size();
    }
}
