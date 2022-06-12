package com.shweta.reyound.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Toast;

import com.shweta.reyound.R;
import com.shweta.reyound.adapter.AccessoryAdapter;
import com.shweta.reyound.adapter.Women2Adapter;

public class AccesoriesActivity extends AppCompatActivity {

    Intent intent;
    LinearLayout ll_bag, ll_BackPack, ll_Dufflebags,ll_Slingbags,ll_Trolleys,ll_Wallets,ll_Handbags,ll_Belts,ll_Cap;
    ImageView backbtn;

    GridView grid;
    static final String[] web = {
            "Laggages",
            "Clutches & wallets",
            "Women Bags",
            "Men Bags",
            "Office Bags",
            "Sports Bag",
    } ;
    static final int[] imageId = {
            R.drawable.luggege,
            R.drawable.clutches,
            R.drawable.wbag,
            R.drawable.mbag,
            R.drawable.mwbag,
            R.drawable.sports_bag,
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_accesories);

        ll_bag = findViewById(R.id.ll_bag);
        ll_BackPack = findViewById(R.id.ll_BackPack);
        ll_Dufflebags = findViewById(R.id.ll_Dufflebags);
        ll_Slingbags = findViewById(R.id.ll_Slingbags);
        ll_Trolleys = findViewById(R.id.ll_Trolleys);
        ll_Wallets = findViewById(R.id.ll_Wallets);
        ll_Handbags = findViewById(R.id.ll_Handbags);
        ll_Belts = findViewById(R.id.ll_Belts);
        ll_Cap = findViewById(R.id.ll_Cap);

        backbtn = findViewById(R.id.back_btn);

        backbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        ll_bag.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (ll_BackPack.isShown() && ll_Dufflebags.isShown() && ll_Slingbags.isShown() && ll_Trolleys.isShown()) {

                    ll_BackPack.setVisibility(View.GONE);
                    ll_Dufflebags.setVisibility(View.GONE);
                    ll_Slingbags.setVisibility(View.GONE);
                    ll_Trolleys.setVisibility(View.GONE);

                } else {
                    ll_BackPack.setVisibility(View.VISIBLE);
                    ll_Dufflebags.setVisibility(View.VISIBLE);
                    ll_Slingbags.setVisibility(View.VISIBLE);
                    ll_Trolleys.setVisibility(View.VISIBLE);

                }
            }
        });

        ll_Wallets.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (ll_Handbags.isShown() && ll_Belts.isShown() && ll_Cap.isShown()) {

                    ll_Handbags.setVisibility(View.GONE);
                    ll_Belts.setVisibility(View.GONE);
                    ll_Cap.setVisibility(View.GONE);

                } else {
                    ll_Handbags.setVisibility(View.VISIBLE);
                    ll_Belts.setVisibility(View.VISIBLE);
                    ll_Cap.setVisibility(View.VISIBLE);
                }
            }
        });

        AccessoryAdapter adapter = new AccessoryAdapter(AccesoriesActivity.this, web, imageId);
        grid=(GridView)findViewById(R.id.grid);
        grid.setAdapter(adapter);
        grid.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {
                Toast.makeText(AccesoriesActivity.this, "You Clicked at " +web[+ position], Toast.LENGTH_SHORT).show();

            }
        });

    }
}