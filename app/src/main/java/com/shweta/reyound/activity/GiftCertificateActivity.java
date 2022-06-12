package com.shweta.reyound.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.shweta.reyound.R;
import com.shweta.reyound.adapter.GiftAmountAdapter;
import com.shweta.reyound.adapter.HomeCategoriesAdapter;
import com.shweta.reyound.adapter.NewArrivalAdapter;
import com.shweta.reyound.di.module.GiftAmountModel;
import com.shweta.reyound.di.module.NewArrivalModel;
import com.shweta.reyound.di.module.ShoppingBagModel;

import java.util.ArrayList;
import java.util.List;

public class GiftCertificateActivity extends AppCompatActivity {

    RecyclerView rv_gift_amount;

    //gift amount
    GiftAmountAdapter giftAmountAdapter;
    List<GiftAmountModel> newGiftAmountModelList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gift_certificate);

        rv_gift_amount = findViewById(R.id.rv_gift);


        //gift amount recyclerview
        RecyclerView.LayoutManager giftAmount_manager = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false);
        rv_gift_amount.setLayoutManager(giftAmount_manager);
        giftAmountAdapter = new GiftAmountAdapter(this, newGiftAmountModelList);
        rv_gift_amount.setItemAnimator(new DefaultItemAnimator());
        rv_gift_amount.setAdapter(giftAmountAdapter);

        giftAmountList();

    }
    private void giftAmountList() {
        newGiftAmountModelList.add(new GiftAmountModel("500"));
        newGiftAmountModelList.add(new GiftAmountModel("1000"));
        newGiftAmountModelList.add(new GiftAmountModel("1500"));
        newGiftAmountModelList.add(new GiftAmountModel("2000"));


    }

    }