package com.shweta.reyound;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

import com.shweta.reyound.activity.Offer_Detail_Activity;
import com.shweta.reyound.adapter.GiftCardAdapter;
import com.shweta.reyound.adapter.HomeDecoreAdapter;
import com.shweta.reyound.adapter.NewArrivalAdapter;
import com.shweta.reyound.adapter.TrendingCouponAdapter;
import com.shweta.reyound.adapter.UseCoinAdapter;
import com.shweta.reyound.di.module.CouponPointModel;
import com.shweta.reyound.di.module.GiftCardModel;
import com.shweta.reyound.di.module.HomeDecorModel;
import com.shweta.reyound.di.module.UsePointModel;

import java.util.ArrayList;
import java.util.List;

public class UseCoinFragment extends Fragment {

    Intent intent;
    Context mContext;
    RelativeLayout reward_for_party;

    // Points
    UseCoinAdapter useCoinAdapter;
    List<UsePointModel> usePointModelList = new ArrayList<>();

    // Coupon Points
    TrendingCouponAdapter trendingCouponAdapter;
    List<CouponPointModel> couponPointModelArrayList = new ArrayList<>();

    // GiftCard
    GiftCardAdapter giftCardAdapter;
    List<GiftCardModel> giftCardModelList = new ArrayList<>();

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View v = inflater.inflate(R.layout.fragment_use_coin, container, false);

        mContext = getActivity();
        final RecyclerView rv_home_decor_list = (RecyclerView) v.findViewById(R.id.rv_home_decor_list);
        final RecyclerView rv_trending_coupon_list = (RecyclerView) v.findViewById(R.id.rv_trending_coupon_list);
        final RecyclerView rv_gift_card_list = (RecyclerView) v.findViewById(R.id.rv_gift_card_list);
        final RelativeLayout reward_for_party = (RelativeLayout) v.findViewById(R.id.reward_for_party);
        final ConstraintLayout cl_point_transfer = (ConstraintLayout) v.findViewById(R.id.cl_point_transfer);
        final LinearLayout full_screen = (LinearLayout) v.findViewById(R.id.ll_full_page) ;

        /*cl_point_transfer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(mContext, PointConvertWalletFragment.class);
                mContext.startActivity(i);
            }
        });*/


       full_screen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(mContext, Offer_Detail_Activity.class);
                mContext.startActivity(i);
            }
        });

        RecyclerView.LayoutManager usePoint_manager = new LinearLayoutManager(mContext, LinearLayoutManager.HORIZONTAL, false);
        rv_home_decor_list.setLayoutManager(usePoint_manager);
        useCoinAdapter = new UseCoinAdapter(mContext, usePointModelList);
        rv_home_decor_list.setItemAnimator(new DefaultItemAnimator());
        rv_home_decor_list.setAdapter(useCoinAdapter);
        usePointList();

        RecyclerView.LayoutManager couponPoint_manager = new LinearLayoutManager(mContext, LinearLayoutManager.HORIZONTAL, false);
        rv_trending_coupon_list.setLayoutManager(couponPoint_manager);
        trendingCouponAdapter = new TrendingCouponAdapter(mContext, couponPointModelArrayList);
        rv_trending_coupon_list.setItemAnimator(new DefaultItemAnimator());
        rv_trending_coupon_list.setAdapter(trendingCouponAdapter);
        couponPointList();

        RecyclerView.LayoutManager giftCard_manager = new LinearLayoutManager(mContext, LinearLayoutManager.HORIZONTAL, false);
        rv_gift_card_list.setLayoutManager(giftCard_manager);
        giftCardAdapter = new GiftCardAdapter(mContext, giftCardModelList);
        rv_gift_card_list.setItemAnimator(new DefaultItemAnimator());
        rv_gift_card_list.setAdapter(giftCardAdapter);
        giftCardList();

        return v;
    }

    private void usePointList() {
        usePointModelList.add(new UsePointModel(R.drawable.gift, R.drawable.coin, "Reyounf Gift Card\nworth Rs.2500 OFF", "Use", "2500"));
        usePointModelList.add(new UsePointModel(R.drawable.arya, R.drawable.coin, "Disney+Hotstar\n12 Months Pack", "From", "1"));
        usePointModelList.add(new UsePointModel(R.drawable.headphone, R.drawable.coin, "Get a complimentory Leaf Earphones", "From", "1"));
        usePointModelList.add(new UsePointModel(R.drawable.zomato, R.drawable.coin, "3 Month Subscription of \nZomato Pro Worth 399", "Use", "50"));
        usePointModelList.add(new UsePointModel(R.drawable.momsco, R.drawable.coin, "Moms Co Flat 600 Off \n On purchase above 1500 ", "Use", "70"));
        usePointModelList.add(new UsePointModel(R.drawable.meal, R.drawable.coin, "Flat Rs.499 OFF", "Use", "100"));
        usePointModelList.add(new UsePointModel(R.drawable.icecream, R.drawable.coin, "Natural's Family Pack\nworth Rs.900 OFF", "Use", "200"));
        usePointModelList.add(new UsePointModel(R.drawable.himalaya, R.drawable.coin, "flat Rs.200 OFF", "Use", "70"));

    }

    private void couponPointList() {
        couponPointModelArrayList.add(new CouponPointModel(R.drawable.sofa1, R.drawable.coin, "Kitchen Essential", "Use", "30", "Extra 75 Off on\nKitchen Essentials"));
        couponPointModelArrayList.add(new CouponPointModel(R.drawable.saree1, R.drawable.coin, "severy bestseller", "Use", "30", "Extra 75 Off on\nSelected"));
        couponPointModelArrayList.add(new CouponPointModel(R.drawable.men1, R.drawable.coin, "Men;s Fashion", "Use", "25", "Extra 50 Off on\nKselected"));
        couponPointModelArrayList.add(new CouponPointModel(R.drawable.wom3, R.drawable.coin, "Women's Salwar", "Use", "25", "Extra 50 Off on\nselected"));
        couponPointModelArrayList.add(new CouponPointModel(R.drawable.wbag, R.drawable.coin, "Luvi Hand bag", "Use", "50", "Extra 100 Off on\nLavie Brand"));


    }

    private void giftCardList() {
        giftCardModelList.add(new GiftCardModel("Reyound Gift Card Upto ₹200 OFF","₹2500"));
        giftCardModelList.add(new GiftCardModel("Reyound Gift Card Upto ₹100 OFF","₹1999"));
        giftCardModelList.add(new GiftCardModel("Reyound Gift Card Upto ₹75 OFF","₹1499"));
        giftCardModelList.add(new GiftCardModel("Reyound Gift Card Upto ₹50 OFF","₹999"));
        giftCardModelList.add(new GiftCardModel("Reyound Gift Card Upto ₹25 OFF","₹499"));
        giftCardModelList.add(new GiftCardModel("Reyound Gift Card Upto ₹15 OFF","₹199"));
        giftCardModelList.add(new GiftCardModel("Reyound Gift Card Upto ₹10 OFF","₹99"));

    }

}
