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
import com.shweta.reyound.adapter.MenAdapter2;

public class MenActivity2 extends AppCompatActivity {

    Intent intent;
    LinearLayout ll_MTopw,ll_Mtshirt,ll_Casulal,ll_McShirt,ll_Fshirts,ll_MKurta,ll_Bottom_Wear,ll_Trousers,ll_MJeans,ll_Trackpants,ll_MShorts,ll_mFoot,ll_SportSheos,ll_McasualShoes,ll_mSandle,ll_mFlip,ll_Inner,ll_Brief,ll_Boxer,ll_Vests,ll_NightSuits,ll_Grooming,ll_Deo,ll_Perfumes,ll_PCare;
    ImageView backbtn;

    GridView grid;
    static final String[] web = {
            "Ethic Wear",
            "Bottom Wear",
            "Western Wear",
            "Foot Wear",
            "Night Wear",
            "Sports Wear",
            "Grooming",
            "Fragrances",
            "Fashion Accessories",
            "Formal Wear",
            "Fancy Mask",
            "Winter Care",

    } ;
    static final int[] imageId = {
            R.drawable.methic,
            R.drawable.bottom,
            R.drawable.mwestern,
            R.drawable.mfoot,
            R.drawable.mnight,
            R.drawable.msports,
            R.drawable.groom,
            R.drawable.fragrance1,
            R.drawable.mfashion,
            R.drawable.mformal,
            R.drawable.maskm,
            R.drawable.mwinter,
    };



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_men2);

        ll_Casulal = findViewById(R.id.ll_MFormal);
        ll_MTopw = findViewById(R.id.ll_MTopw);
        ll_Mtshirt = findViewById(R.id.ll_Mtshirt);
        ll_McShirt = findViewById(R.id.ll_McShirt);
        ll_Fshirts = findViewById(R.id.ll_Fshirts);
        ll_MKurta = findViewById(R.id.ll_MKurta);
        ll_Bottom_Wear = findViewById(R.id.ll_Bottom_Wear);
        ll_Trousers = findViewById(R.id.ll_Trousers);
        ll_MJeans = findViewById(R.id.ll_MJeans);
        ll_Trackpants = findViewById(R.id.ll_Trackpants);
        ll_MShorts = findViewById(R.id.ll_MShorts);
        ll_mFoot = findViewById(R.id.ll_mFoot);
        ll_SportSheos = findViewById(R.id.ll_SportSheos);
        ll_McasualShoes = findViewById(R.id.ll_McasualShoes);
        ll_mSandle = findViewById(R.id.ll_mSandle);
        ll_mFlip = findViewById(R.id.ll_mFlip);
        ll_Inner = findViewById(R.id.ll_Inner);
        ll_Brief = findViewById(R.id.ll_Brief);
        ll_Boxer = findViewById(R.id.ll_Boxer);
        ll_Vests = findViewById(R.id.ll_Vests);
        ll_NightSuits = findViewById(R.id.ll_NightSuits);
        ll_Grooming = findViewById(R.id.ll_Grooming);
        ll_Deo = findViewById(R.id.ll_Deo);
        ll_Perfumes = findViewById(R.id.ll_Perfumes);
        ll_PCare = findViewById(R.id.ll_PCare);
        backbtn = findViewById(R.id.back_btn);

        backbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });


        ll_Mtshirt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(getApplicationContext(), MenActivity.class);
                startActivity(intent);
            }
        });

        ll_McShirt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(getApplicationContext(), CasualActivity.class);
                startActivity(intent);
            }
        });

        ll_Fshirts.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(getApplicationContext(), FormalActivity.class);
                startActivity(intent);
            }
        });

        ll_MKurta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(getApplicationContext(), KurtaActivity.class);
                startActivity(intent);
            }
        });

        ll_MJeans.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(getApplicationContext(), JeansActivity.class);
                startActivity(intent);
            }
        });

        ll_Trousers.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(getApplicationContext(), TrousersActivity.class);
                startActivity(intent);
            }
        });

        ll_Trackpants.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(getApplicationContext(), TrackActivity.class);
                startActivity(intent);
            }
        });

        ll_MShorts.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(getApplicationContext(), ShortActivity.class);
                startActivity(intent);
            }
        });


        ll_MTopw.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (ll_Mtshirt.isShown() && ll_McShirt.isShown() && ll_Fshirts.isShown() && ll_MKurta.isShown()) {

                    ll_Mtshirt.setVisibility(View.GONE);
                    ll_McShirt.setVisibility(View.GONE);
                    ll_Fshirts.setVisibility(View.GONE);
                    ll_MKurta.setVisibility(View.GONE);

                } else {

                    ll_Mtshirt.setVisibility(View.VISIBLE);
                    ll_McShirt.setVisibility(View.VISIBLE);
                    ll_Fshirts.setVisibility(View.VISIBLE);
                    ll_MKurta.setVisibility(View.VISIBLE);

                }

            }
        });

        ll_Bottom_Wear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (ll_MJeans.isShown() && ll_Trousers.isShown() && ll_Trackpants.isShown() && ll_MShorts.isShown()) {

                    ll_MJeans.setVisibility(View.GONE);
                    ll_Trousers.setVisibility(View.GONE);
                    ll_Trackpants.setVisibility(View.GONE);
                    ll_MShorts.setVisibility(View.GONE);

                } else {

                    ll_MJeans.setVisibility(View.VISIBLE);
                    ll_Trousers.setVisibility(View.VISIBLE);
                    ll_Trackpants.setVisibility(View.VISIBLE);
                    ll_MShorts.setVisibility(View.VISIBLE);

                }

            }
        });

        ll_mFoot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (ll_SportSheos.isShown() && ll_McasualShoes.isShown() && ll_Casulal.isShown() && ll_mSandle.isShown() && ll_mFlip.isShown()) {

                    ll_SportSheos.setVisibility(View.GONE);
                    ll_McasualShoes.setVisibility(View.GONE);
                    ll_Casulal.setVisibility(View.GONE);
                    ll_mSandle.setVisibility(View.GONE);
                    ll_mFlip.setVisibility(View.GONE);


                } else {

                    ll_SportSheos.setVisibility(View.VISIBLE);
                    ll_McasualShoes.setVisibility(View.VISIBLE);
                    ll_Casulal.setVisibility(View.VISIBLE);
                    ll_mSandle.setVisibility(View.VISIBLE);
                    ll_mFlip.setVisibility(View.VISIBLE);

                }

            }
        });

        ll_Inner.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (ll_Brief.isShown() && ll_Vests.isShown() && ll_Boxer.isShown() && ll_NightSuits.isShown()) {

                    ll_Brief.setVisibility(View.GONE);
                    ll_Vests.setVisibility(View.GONE);
                    ll_Boxer.setVisibility(View.GONE);
                    ll_NightSuits.setVisibility(View.GONE);

                } else {
                    ll_Brief.setVisibility(View.VISIBLE);
                    ll_Vests.setVisibility(View.VISIBLE);
                    ll_Boxer.setVisibility(View.VISIBLE);
                    ll_NightSuits.setVisibility(View.VISIBLE);

                }

            }
        });


        ll_Grooming.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (ll_Deo.isShown() && ll_Perfumes.isShown() && ll_PCare.isShown()) {

                    ll_Deo.setVisibility(View.GONE);
                    ll_Perfumes.setVisibility(View.GONE);
                    ll_PCare.setVisibility(View.GONE);

                } else {

                    ll_Deo.setVisibility(View.VISIBLE);
                    ll_Perfumes.setVisibility(View.VISIBLE);
                    ll_PCare.setVisibility(View.VISIBLE);

                }

            }
        });

        MenAdapter2 adapter = new MenAdapter2(MenActivity2.this, web, imageId);
        grid=(GridView)findViewById(R.id.grid);
        grid.setAdapter(adapter);
        grid.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {
                Toast.makeText(MenActivity2.this, "You Clicked at " +web[+ position], Toast.LENGTH_SHORT).show();

            }
        });
    }
}