package com.shweta.reyound.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.shweta.reyound.R;
import com.shweta.reyound.adapter.ProductAdapter;
import com.shweta.reyound.di.module.ProductModel;

import java.util.ArrayList;
import java.util.List;

public class Product_List_Activity extends AppCompatActivity {

    Intent intent;

    RecyclerView rv_new_arrival;

    //productlist
    ProductAdapter productAdapter;
    List<ProductModel> productModelList=new ArrayList<>();

    Context mContext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_product_list);

        rv_new_arrival = findViewById(R.id.rv_new_arrival);


        RecyclerView.LayoutManager product_manager = new GridLayoutManager(mContext,2);
        rv_new_arrival.setLayoutManager(product_manager);
        productAdapter = new ProductAdapter(mContext, productModelList);
        rv_new_arrival.setItemAnimator(new DefaultItemAnimator());
        rv_new_arrival.setAdapter(productAdapter);


        productList();

    }

    private void productList() {
        productModelList.add(new ProductModel(R.drawable.wom5,"Reyound","\u20B9 999","\u20B9 599","50% OFF","Printed Square Neck Polyester\n Womens Regular Dress"));
        productModelList.add(new ProductModel(R.drawable.wom9,"Reyound","\u20B9 999","\u20B9 599","40% OFF","Printed Square Neck Polyester\n Womens Regular Dress"));
        productModelList.add(new ProductModel(R.drawable.men10,"Reyound","\u20B9 1999","\u20B9 799","20% OFF","Printed Square Neck Polyester \nWomens Regular Dress"));
        productModelList.add(new ProductModel(R.drawable.wom4,"Reyound","\u20B9 2999","\u20B9 999","20% OFF","Printed Square Neck Polyester \nWomens Regular Dress"));
        productModelList.add(new ProductModel(R.drawable.men13,"Reyound","\u20B9 799","\u20B9 299","40% OFF","Printed Square Neck Polyester \nWomens Regular Dress"));
        productModelList.add(new ProductModel(R.drawable.men14,"Reyound","\u20B9 999","\u20B9 599","50% OFF","Printed Square Neck Polyester \nWomens Regular Dress"));
        productModelList.add(new ProductModel(R.drawable.men15,"Reyound","\u20B9 1999","\u20B9 799","50% OFF","Printed Square Neck Polyester\n Womens Regular Dress"));
        productModelList.add(new ProductModel(R.drawable.men9,"Reyound","\u20B9 699","\u20B9 499","20% OFF","Printed Square Neck Polyester\n Womens Regular Dress"));
        productModelList.add(new ProductModel(R.drawable.diapering,"Reyound","\u20B9 199","\u20B9 899","60% OFF","Printed Square Neck Polyester\n Womens Regular Dress"));
        productModelList.add(new ProductModel(R.drawable.baby,"Reyound","\u20B9 1599","\u20B9 999","70% OFF","Printed Square Neck Polyester\n Womens Regular Dress"));
    }
}