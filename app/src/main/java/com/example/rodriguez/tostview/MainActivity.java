package com.example.rodriguez.tostview;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;

import com.example.rodriguez.tostview.adatadores.*;
import com.example.rodriguez.tostview.modelos.*;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<Item_sup> List_sup;
    ArrayList<Item_med> List_med;
    ArrayList<Item_inf> List_inf;
    private Toolbar toolbar;

    private void intanciar(){

        List_sup = new ArrayList<Item_sup>();
        List_med = new ArrayList<Item_med>();
        List_inf = new ArrayList<Item_inf>();

    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Inicalizar las listas.
        intanciar();

        /*
        toolbar = (Toolbar) findViewById(R.id.toolbar);

        if (toolbar != null) {
            setSupportActionBar(toolbar);
            toolbar.setTitle("TOST");
        }*/

        RecyclerView rv_sup = (RecyclerView) findViewById(R.id.rv_sup);
        rv_sup.setHasFixedSize(true);
        adapter_sup adapter = new adapter_sup();
        rv_sup.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false));
        rv_sup.setAdapter(adapter);

        RecyclerView rv_int = (RecyclerView) findViewById(R.id.rv_int);
        rv_int.setHasFixedSize(true);
        adapter_int adapter2 = new adapter_int();
        rv_int.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false));
        rv_int.setAdapter(adapter2);

        RecyclerView rv_inf = (RecyclerView) findViewById(R.id.rv_inf);
        rv_inf.setHasFixedSize(true);
        adapter_inf adapter3 = new adapter_inf();
        rv_inf.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false));
        rv_inf.setAdapter(adapter3);



    }
}
