package com.shweta.reyound.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Toast;

import com.shweta.reyound.R;
import com.shweta.reyound.adapter.KidsAdapter;
import com.shweta.reyound.adapter.KidsBabyAdapter;
import com.shweta.reyound.adapter.SkinAdapter;

import java.util.ArrayList;
import java.util.Arrays;

public class KidsActivity extends AppCompatActivity {

    Intent intent;
    LinearLayout ll_bclothing,ll_tshirt,ll_Ethnic,ll_Shirts,ll_set,ll_Jeans,ll_Shorts,ll_bfootwar,ll_Shoes,ll_Sandals,ll_Flip,ll_gclothing,ll_Dresses,ll_gtshirts,ll_Sets,ll_gethnic,ll_Skirts,ll_gjeans,ll_gfootwar,ll_Heel,ll_gFlip,ll_gSandal,ll_gShoes;

   /* private RecyclerView recyclerView;
    RecyclerView.LayoutManager layoutManager;
    KidsAdapter kidsAdapter;
    ImageView backbtn;*/

   // int []arr = {R.drawable.kids4,R.drawable.kids5,R.drawable.kids2,R.drawable.kids6,R.drawable.sevenoff,R.drawable.sixoff,R.drawable.fifoff,R.drawable.fourtoff,R.drawable.thirtyoff,R.drawable.tweoff,};
   GridView grid;
    static final String[] web = {
            "GIRLS FASHION",
            "FOOTWEAR",
            "FASHION ACCESSORIES",
            "DIAPERING",
            "BATH AND SKIN CARE",
            "FEEDING AND NURSING",
            "BABY GEAR",
            "BABY NURSARY",
            "HEALTH AND SAFETY",
            "TOYS AND BOOKS",
            "BIRTHDAY AND GIFTS",
            "MOMS AND MATERNITY",

    } ;
    static final int[] imageId = {
            R.drawable.fashion3,
            R.drawable.foot1,
            R.drawable.fashion1,
            R.drawable.diapering,
            R.drawable.bath2,
            R.drawable.feeding,
            R.drawable.gear,
            R.drawable.nursary,
            R.drawable.health,
            R.drawable.toys1,
            R.drawable.birthday,
            R.drawable.materneety,
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kids);

      ll_bclothing= findViewById(R.id.ll_bclothing);
        ll_tshirt= findViewById(R.id.ll_tshirt);
       ll_Ethnic= findViewById(R.id.ll_Ethnic);
         ll_Shirts= findViewById(R.id.ll_Shirts);
        ll_set= findViewById(R.id.ll_set);
         ll_Jeans= findViewById(R.id.ll_Jeans);
         ll_Shorts= findViewById(R.id.ll_Shorts1);
         ll_bfootwar= findViewById(R.id.ll_bfootwar);
         ll_Shoes= findViewById(R.id.ll_Shoes);
         ll_Sandals= findViewById(R.id.ll_Sandals);
         ll_Flip= findViewById(R.id.ll_Flip);
         ll_gclothing= findViewById(R.id.ll_gclothing);
         ll_Dresses= findViewById(R.id.ll_Dresses);
         ll_gtshirts= findViewById(R.id.ll_gtshirts);
         ll_Sets= findViewById(R.id.ll_Sets);
         ll_gethnic= findViewById(R.id.ll_gethnic);
         ll_Skirts= findViewById(R.id.ll_Skirts);
         ll_gjeans= findViewById(R.id.drawer_layout);
         ll_gfootwar= findViewById(R.id.ll_gfootwar);
         ll_Heel= findViewById(R.id.ll_Heel);
         ll_gFlip = findViewById(R.id.ll_gFlip);
         ll_gSandal= findViewById(R.id.ll_gSandal);
         ll_gShoes= findViewById(R.id.ll_gShoes);
        //backbtn = findViewById(R.id.back_btn);

       /* backbtn = findViewById(R.id.back_btn);

        backbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
*/

        KidsBabyAdapter adapter = new KidsBabyAdapter(KidsActivity.this, web, imageId);
        grid=(GridView)findViewById(R.id.grid);
        grid.setAdapter(adapter);
        grid.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {
                Toast.makeText(KidsActivity.this, "You Clicked at " +web[+ position], Toast.LENGTH_SHORT).show();

            }
        });

       /* backbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
*/

        ll_bclothing.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 if ( ll_tshirt.isShown() && ll_Ethnic.isShown() && ll_Shirts.isShown() && ll_set.isShown() && ll_Jeans.isShown() && ll_Shorts.isShown()) {

                     ll_tshirt.setVisibility(View.GONE);
                     ll_Ethnic.setVisibility(View.GONE);
                     ll_Shirts.setVisibility(View.GONE);
                     ll_set.setVisibility(View.GONE);
                     ll_Jeans.setVisibility(View.GONE);
                     ll_Shorts.setVisibility(View.GONE);

                 }else {
                     ll_tshirt.setVisibility(View.VISIBLE);
                     ll_Ethnic.setVisibility(View.VISIBLE);
                     ll_Shirts.setVisibility(View.VISIBLE);
                     ll_set.setVisibility(View.VISIBLE);
                     ll_Jeans.setVisibility(View.VISIBLE);
                     ll_Shorts.setVisibility(View.VISIBLE);
                 }

             }
         });

         ll_bfootwar.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {

                 if (ll_Shoes.isShown() && ll_Sandals.isShown() && ll_Flip.isShown()) {

                     ll_Shoes.setVisibility(View.GONE);
                     ll_Sandals.setVisibility(View.GONE);
                     ll_Flip.setVisibility(View.GONE);


                 } else {
                     ll_Shoes.setVisibility(View.VISIBLE);
                     ll_Sandals.setVisibility(View.VISIBLE);
                     ll_Flip.setVisibility(View.VISIBLE);


                 }
             }
         });

         ll_gclothing.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {

                 if (ll_Dresses.isShown() && ll_gtshirts.isShown() && ll_Sets.isShown() && ll_gethnic.isShown() && ll_Skirts.isShown() && ll_Jeans.isShown()) {

                     ll_Dresses.setVisibility(View.GONE);
                     ll_gtshirts.setVisibility(View.GONE);
                     ll_Sets.setVisibility(View.GONE);
                     ll_gethnic.setVisibility(View.GONE);
                     ll_Skirts.setVisibility(View.GONE);
                     ll_Jeans.setVisibility(View.GONE);

                 } else {
                     ll_Dresses.setVisibility(View.VISIBLE);
                     ll_gtshirts.setVisibility(View.VISIBLE);
                     ll_Sets.setVisibility(View.VISIBLE);
                     ll_gethnic.setVisibility(View.VISIBLE);
                     ll_Skirts.setVisibility(View.VISIBLE);
                     ll_Jeans.setVisibility(View.VISIBLE);
                 }
             }
         });

         ll_gfootwar.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 if (ll_Heel.isShown() && ll_gFlip.isShown() && ll_gSandal.isShown() && ll_gShoes.isShown()) {

                     ll_Heel.setVisibility(View.GONE);
                     ll_gFlip.setVisibility(View.GONE);
                     ll_gSandal.setVisibility(View.GONE);
                     ll_gShoes.setVisibility(View.GONE);

                 } else {
                     ll_Heel.setVisibility(View.VISIBLE);
                     ll_gFlip.setVisibility(View.VISIBLE);
                     ll_gSandal.setVisibility(View.VISIBLE);
                     ll_gShoes.setVisibility(View.VISIBLE);

                 }
             }
         });

      /*  recyclerView = findViewById(R.id.Recycler);
        layoutManager = new GridLayoutManager(this, 2);
        recyclerView.setLayoutManager(layoutManager);
        kidsAdapter = new KidsAdapter(arr);

        recyclerView.setAdapter(kidsAdapter);
        recyclerView.setHasFixedSize(true);*/



           }
}