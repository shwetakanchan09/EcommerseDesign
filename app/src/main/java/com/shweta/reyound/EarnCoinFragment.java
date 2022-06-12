package com.shweta.reyound;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.shweta.reyound.adapter.BonusPointAdapter;
import com.shweta.reyound.adapter.HomeCategoryAdapter;
import com.shweta.reyound.di.module.BonusPointModel;
import com.shweta.reyound.di.module.HomeData;

import java.util.ArrayList;

public class EarnCoinFragment extends Fragment {

    Intent intent;
    Context mContext;
    private ArrayList<BonusPointModel> bonusPointModelArrayList;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_earn_coin, container, false);

        final RecyclerView bonus_point = (RecyclerView) v.findViewById(R.id.rv_bonus_coin);

        bonusPointModelArrayList = new ArrayList<>();
        bonusPointModelArrayList.add(new BonusPointModel("Women's Footwear", R.drawable.wfoot));
        bonusPointModelArrayList.add(new BonusPointModel("Buy Now and Pay Later!", R.drawable.shop_now));
        bonusPointModelArrayList.add(new BonusPointModel("Men's Footwear", R.drawable.mfoot));
        bonusPointModelArrayList.add(new BonusPointModel("Kid's Footwear", R.drawable.foot1));


        BonusPointAdapter adapter = new BonusPointAdapter(bonusPointModelArrayList, getContext());
        GridLayoutManager layoutManager = new GridLayoutManager(getContext(), 2);
        bonus_point.setLayoutManager(layoutManager);
       bonus_point.setAdapter(adapter);
        return v;
    }
}