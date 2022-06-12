package com.shweta.reyound;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import com.shweta.reyound.activity.CoinBalanceActivity;
import com.shweta.reyound.activity.CreditRewardActivity;
import com.shweta.reyound.activity.HelpActivity;
import com.shweta.reyound.activity.MyVouchers;

public class RewardFragment extends Fragment {

    Intent intent;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v =  inflater.inflate(R.layout.fragment_reward, container, false);

         final LinearLayout ll_pointsHistory = (LinearLayout) v.findViewById(R.id.ll_pointsHistory);
        final LinearLayout ll_VoucherHistory = (LinearLayout) v.findViewById(R.id.ll_VoucherHistory);
        final LinearLayout ll_MyReward = (LinearLayout) v.findViewById(R.id.ll_MyReward);


        ll_MyReward.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                intent = new Intent(getActivity(), CreditRewardActivity.class);
                startActivity(intent);
            }
        });


        ll_pointsHistory.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {

                 intent = new Intent(getActivity(), CoinBalanceActivity.class);
                 startActivity(intent);
             }
         });

        ll_VoucherHistory.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                intent = new Intent(getActivity(), MyVouchers.class);
                startActivity(intent);
            }
        });
        return v;
    }
}