package com.shweta.reyound.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.shweta.reyound.R;
import com.shweta.reyound.adapter.MayLikeAdapter;
import com.shweta.reyound.adapter.ShoppingBagAdapter;
import com.shweta.reyound.di.module.MayLikeModel;
import com.shweta.reyound.di.module.ShoppingBagModel;

import java.util.ArrayList;
import java.util.List;

public class BasketActivity extends AppCompatActivity {

    Button btnCheck;
    Intent intent;
    TextView txtPromo;
    LinearLayout ll_Promo;
    ImageView backbtn;
    RecyclerView rv_shopping_item;

    //Shopping Items
    ShoppingBagAdapter shoppingBagAdapter;
    List<ShoppingBagModel> shoppingBagModelList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_basket);

        btnCheck = findViewById(R.id.Checkout);
        ll_Promo = findViewById(R.id.ll_Promo);
        txtPromo = findViewById(R.id.txtApply);
        backbtn = findViewById(R.id.back_btn);
        rv_shopping_item = findViewById(R.id.rv_shopping_items);

        backbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });


        btnCheck.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(getApplicationContext(), ProceedPayment.class);
                startActivity(intent);
            }
        });
        txtPromo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ll_Promo.isShown();
                ll_Promo.setVisibility(View.VISIBLE);

            }
        });

        //shopping bag item
        RecyclerView.LayoutManager shopping_bag_manager = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);
        rv_shopping_item.setLayoutManager(shopping_bag_manager);
        shoppingBagAdapter = new ShoppingBagAdapter(this, shoppingBagModelList);
        rv_shopping_item.setItemAnimator(new DefaultItemAnimator());
        rv_shopping_item.setAdapter(shoppingBagAdapter);
        shoppingBagList();
    }

    private void shoppingBagList() {
        shoppingBagModelList.add(new ShoppingBagModel(R.drawable.wom3, "ALLEN SOLLY","Solid Polyster Cotton Mandarins Formal Wear Shirt","₹1,359","₹1,699","20% Off"));
        shoppingBagModelList.add(new ShoppingBagModel(R.drawable.jeans6, "FRATINI","Regular Fit Regular Length Jeans","₹699","₹999","30% Off"));
        shoppingBagModelList.add(new ShoppingBagModel(R.drawable.wom9, "AND","Solid U-Neck Polyster Womens Regular Dress","₹999","₹1,999","50% Off"));
        shoppingBagModelList.add(new ShoppingBagModel(R.drawable.wfoot, "PUMA","Synthetic Leather Regular Alip On Women Slide-Black","₹1,399","₹2,799","50% Off"));

    }
}