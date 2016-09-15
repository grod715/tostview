package com.example.rodriguez.tostview.adatadores;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.rodriguez.tostview.R;
import com.example.rodriguez.tostview.modelos.Item_sup;

import java.util.ArrayList;

/**
 * Created by Rodriguez on 13/09/2016.
 */

public class adapter_int extends RecyclerView.Adapter<adapter_int.ViewHolder> {

    public static class ViewHolder extends RecyclerView.ViewHolder {
        ImageView img;
        TextView text1;
        TextView text2;

        public ViewHolder(View itemView) {
            super(itemView);

            /* edit
            img
            text1
            text2
            */

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Toast.makeText(v.getContext(),"TOST SEND", Toast.LENGTH_SHORT).show();
                }
            });
        }
    }
    ArrayList<Item_sup> list_sup;
    public adapter_int() {
        super();
        list_sup = new ArrayList<Item_sup>();
        list_sup.add(new Item_sup("Free friday pizza","sup1"));
        list_sup.add(new Item_sup("Free friday pizza","sup2"));
        list_sup.add(new Item_sup("Free friday pizza","sup2"));
        list_sup.add(new Item_sup("Free friday pizza","sup2"));
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_int, parent, false);
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        final Item_sup item = list_sup.get(position);

    }

    @Override
    public int getItemCount() {
        return (null != list_sup ? list_sup.size() : 0);
    }
}

