package com.example.rodriguez.tostview.adatadores;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.rodriguez.tostview.R;
import com.example.rodriguez.tostview.modelos.Item_inf;
import com.example.rodriguez.tostview.modelos.Item_sup;

import java.util.ArrayList;

/**
 * Created by Rodriguez on 13/09/2016.
 */

public class adapter_inf extends RecyclerView.Adapter<adapter_inf.ViewHolder> {
    @SuppressWarnings("unused")

    public static class ViewHolder extends RecyclerView.ViewHolder {

        //elementos

        public ViewHolder(View itemView) {
            super(itemView);

            // contenido

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Toast.makeText(v.getContext(),"TOST SEND", Toast.LENGTH_SHORT).show();
                }
            });
        }
    }
    ArrayList<Item_inf> list_inf;
    public adapter_inf() {
        super();
        list_inf = new ArrayList<Item_inf>();
        list_inf.add(new Item_inf());
        list_inf.add(new Item_inf());
        list_inf.add(new Item_inf());

    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_inf, parent, false);
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        final Item_inf item = list_inf.get(position);
        //elementos del holder
    }

    @Override
    public int getItemCount() {
        return (null != list_inf ? list_inf.size() : 0);
    }
}

