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
import com.shweta.reyound.adapter.KidsBabyAdapter;
import com.shweta.reyound.adapter.Women2Adapter;

public class WomenActivity2 extends AppCompatActivity {

    Intent intent;
    LinearLayout ll_Wethnic,ll_Saree,ll_KurtaKurtis,ll_Salwar,ll_Leggings,ll_Plazzo,ll_Western_Wear,ll_dresses,ll_Top,ll_Jumpsuit,ll_Jeans1,ll_Shorts1,ll_wFoot,ll_Flat,ll_Heal,ll_Casual,ll_Sorts,ll_Formal,ll_wSandle,ll_Lingerie,ll_Bras,ll_Pantees,ll_Night,ll_Camisoles,ll_Beauty,ll_Makeup,ll_SkinCare,ll_HairCare,ll_Fragrances;
   ImageView backbtn;

    GridView grid;
    static final String[] web = {
            "Ethic Wear",
            "Saree",
            "Western Wear",
            "Foot Wear",
            "Night Wear",
            "Sports Wear",
            "Beauty Care",
            "Fragrances",
            "Fashion Accessories",
            "jewellery sets",
            "Fancy Mask",
            "Winter Care",

    } ;
    static final int[] imageId = {
            R.drawable.wethic,
            R.drawable.saree,
            R.drawable.western,
            R.drawable.wfoot,
            R.drawable.wnight,
            R.drawable.wsports,
            R.drawable.beautyw,
            R.drawable.fragrance1,
            R.drawable.wacces,
            R.drawable.jwellary,
            R.drawable.mask,
            R.drawable.winter,
    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_women2);

        ll_Wethnic = findViewById(R.id.ll_Wethnic);
        ll_Saree = findViewById(R.id.ll_Saree);
        ll_KurtaKurtis = findViewById(R.id.ll_KurtaKurtis);
        ll_Salwar = findViewById(R.id.ll_Salwar);
        ll_Leggings = findViewById(R.id.ll_Leggings);
        ll_Plazzo = findViewById(R.id.ll_Plazzo);
        ll_Western_Wear = findViewById(R.id.ll_Western_Wear);
        ll_dresses = findViewById(R.id.ll_Dresses);
        ll_Top = findViewById(R.id.ll_Top);
        ll_Jumpsuit = findViewById(R.id.ll_Jumpsuits);
        ll_Jeans1 = findViewById(R.id.ll_Jeans1);
        ll_Shorts1 = findViewById(R.id.ll_wShort);
        ll_wFoot = findViewById(R.id.ll_wFoot);
        ll_Flat = findViewById(R.id.ll_Flat);
        ll_Heal = findViewById(R.id.ll_wHeal);
        ll_Casual = findViewById(R.id.ll_Casual);
        ll_Sorts = findViewById(R.id.ll_Sorts);
        ll_Formal = findViewById(R.id.ll_Formal);
        ll_wSandle = findViewById(R.id.ll_wSandle);
        ll_Lingerie = findViewById(R.id.ll_Lingerie);
        ll_Bras = findViewById(R.id.ll_Bras);
        ll_Pantees = findViewById(R.id.ll_Pantees);
        ll_Night = findViewById(R.id.ll_Night);
        ll_Camisoles = findViewById(R.id.ll_Camisoles);
        ll_Beauty = findViewById(R.id.ll_Beauty);
        ll_Makeup = findViewById(R.id.ll_Makeup);
        ll_SkinCare = findViewById(R.id.ll_SkinCare);
        ll_HairCare = findViewById(R.id.ll_HairCare);
        ll_Fragrances = findViewById(R.id.ll_Fragrances);
        backbtn = findViewById(R.id.back_btn);

        ll_Makeup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(getApplicationContext(), MakeupActivity.class);
                startActivity(intent);
            }
        });

        ll_SkinCare.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(getApplicationContext(), SkinCareActivity.class);
                startActivity(intent);
            }
        });

        ll_HairCare.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(getApplicationContext(), HaireCareActivity.class);
                startActivity(intent);
            }
        });

        ll_Fragrances.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(getApplicationContext(), FragranceActivity.class);
                startActivity(intent);
            }
        });

        backbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });


        ll_Top.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(getApplicationContext(), WomenActivity.class);
                startActivity(intent);
            }
        });

        ll_Wethnic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (ll_Saree.isShown() && ll_KurtaKurtis.isShown() && ll_Salwar.isShown() && ll_Leggings.isShown() && ll_Plazzo.isShown()) {

                    ll_Saree.setVisibility(View.GONE);
                    ll_KurtaKurtis.setVisibility(View.GONE);
                    ll_Salwar.setVisibility(View.GONE);
                    ll_Leggings.setVisibility(View.GONE);
                    ll_Plazzo.setVisibility(View.GONE);

                } else {
                    ll_Saree.setVisibility(View.VISIBLE);
                    ll_KurtaKurtis.setVisibility(View.VISIBLE);
                    ll_Salwar.setVisibility(View.VISIBLE);
                    ll_Leggings.setVisibility(View.VISIBLE);
                    ll_Plazzo.setVisibility(View.VISIBLE);

                }

            }
        });

        ll_Wethnic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (ll_Saree.isShown() && ll_KurtaKurtis.isShown() && ll_Salwar.isShown() && ll_Leggings.isShown() && ll_Plazzo.isShown()) {

                    ll_Saree.setVisibility(View.GONE);
                    ll_KurtaKurtis.setVisibility(View.GONE);
                    ll_Salwar.setVisibility(View.GONE);
                    ll_Leggings.setVisibility(View.GONE);
                    ll_Plazzo.setVisibility(View.GONE);

                } else {
                    ll_Saree.setVisibility(View.VISIBLE);
                    ll_KurtaKurtis.setVisibility(View.VISIBLE);
                    ll_Salwar.setVisibility(View.VISIBLE);
                    ll_Leggings.setVisibility(View.VISIBLE);
                    ll_Plazzo.setVisibility(View.VISIBLE);

                }

            }
        });

        ll_Western_Wear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (ll_dresses.isShown() && ll_Top.isShown() && ll_Jumpsuit.isShown() && ll_Jeans1.isShown() && ll_Shorts1.isShown()) {

                    ll_dresses.setVisibility(View.GONE);
                    ll_Top.setVisibility(View.GONE);
                    ll_Jumpsuit.setVisibility(View.GONE);
                    ll_Jeans1.setVisibility(View.GONE);
                    ll_Shorts1.setVisibility(View.GONE);

                } else {
                    ll_dresses.setVisibility(View.VISIBLE);
                    ll_Top.setVisibility(View.VISIBLE);
                    ll_Jumpsuit.setVisibility(View.VISIBLE);
                    ll_Jeans1.setVisibility(View.VISIBLE);
                    ll_Shorts1.setVisibility(View.VISIBLE);

                }

            }
        });

        ll_wFoot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (ll_Flat.isShown() && ll_Heal.isShown() && ll_Casual.isShown() && ll_Sorts.isShown() && ll_Formal.isShown() && ll_wSandle.isShown()) {

                    ll_Flat.setVisibility(View.GONE);
                    ll_Heal.setVisibility(View.GONE);
                    ll_Casual.setVisibility(View.GONE);
                    ll_Sorts.setVisibility(View.GONE);
                    ll_Formal.setVisibility(View.GONE);
                    ll_wSandle.setVisibility(View.GONE);


                } else {
                    ll_Flat.setVisibility(View.VISIBLE);
                    ll_Heal.setVisibility(View.VISIBLE);
                    ll_Casual.setVisibility(View.VISIBLE);
                    ll_Sorts.setVisibility(View.VISIBLE);
                    ll_Formal.setVisibility(View.VISIBLE);
                    ll_wSandle.setVisibility(View.VISIBLE);


                }

            }
        });

        ll_Lingerie.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (ll_Bras.isShown() && ll_Pantees.isShown() && ll_Night.isShown() && ll_Camisoles.isShown()) {

                    ll_Bras.setVisibility(View.GONE);
                    ll_Pantees.setVisibility(View.GONE);
                    ll_Night.setVisibility(View.GONE);
                    ll_Camisoles.setVisibility(View.GONE);

                } else {
                    ll_Bras.setVisibility(View.VISIBLE);
                    ll_Pantees.setVisibility(View.VISIBLE);
                    ll_Night.setVisibility(View.VISIBLE);
                    ll_Camisoles.setVisibility(View.VISIBLE);

                }

            }
        });

        ll_Beauty.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (ll_Makeup.isShown() && ll_SkinCare.isShown() && ll_HairCare.isShown() && ll_Fragrances.isShown()) {

                    ll_Makeup.setVisibility(View.GONE);
                    ll_SkinCare.setVisibility(View.GONE);
                    ll_HairCare.setVisibility(View.GONE);
                    ll_Fragrances.setVisibility(View.GONE);

                } else {

                    ll_Makeup.setVisibility(View.VISIBLE);
                    ll_SkinCare.setVisibility(View.VISIBLE);
                    ll_HairCare.setVisibility(View.VISIBLE);
                    ll_Fragrances.setVisibility(View.VISIBLE);

                }

            }
        });

        Women2Adapter adapter = new Women2Adapter(WomenActivity2.this, web, imageId);
        grid=(GridView)findViewById(R.id.grid);
        grid.setAdapter(adapter);
        grid.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {
                Toast.makeText(WomenActivity2.this, "You Clicked at " +web[+ position], Toast.LENGTH_SHORT).show();

            }
        });

    }

    }
