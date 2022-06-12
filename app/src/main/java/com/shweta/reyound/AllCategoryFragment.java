package com.shweta.reyound;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import com.shweta.reyound.activity.AccesoriesActivity;
import com.shweta.reyound.activity.KidsActivity;
import com.shweta.reyound.activity.MenActivity2;
import com.shweta.reyound.activity.OrderHistoryActivity;
import com.shweta.reyound.activity.WomenActivity2;

public class AllCategoryFragment extends Fragment {

    Intent intent;
    LinearLayout ll_Category_Men, ll_Category_Women, ll_Category_Kids, ll_Category_Accesories;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_all_category, container, false);

        final LinearLayout ll_Category_Men = (LinearLayout) v.findViewById(R.id.ll_Category_Men);
        final LinearLayout ll_Category_Women = (LinearLayout) v.findViewById(R.id.ll_Category_Women);
        final LinearLayout ll_Category_Kids = (LinearLayout) v.findViewById(R.id.ll_Category_Kids);
        final LinearLayout ll_Category_Accesories = (LinearLayout) v.findViewById(R.id.ll_Category_Accesories);

        ll_Category_Men.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(getActivity(), MenActivity2.class);
                startActivity(intent);
            }
        });

        ll_Category_Women.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(getActivity(), WomenActivity2.class);
                startActivity(intent);
            }
        });

        ll_Category_Kids.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(getActivity(), KidsActivity.class);
                startActivity(intent);
            }
        });

        ll_Category_Accesories.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(getActivity(), AccesoriesActivity.class);
                startActivity(intent);
            }
        });


        return v;
    }
}