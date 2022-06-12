package com.shweta.reyound.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

import com.shweta.reyound.R;

public class LevelActivity extends AppCompatActivity {

    LinearLayout ll_Silver_level,ll_Gold_level,ll_Platinum_level;
    LinearLayout ll_silver_detail,ll_gold_detail,ll_Platinum_detail;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_level);

        ll_Silver_level = findViewById(R.id.ll_Silver_level);
        ll_Gold_level = findViewById(R.id.ll_Gold_level);
        ll_Platinum_level = findViewById(R.id.ll_Platinum_level);
        ll_silver_detail = findViewById(R.id.silver_detail);
        ll_gold_detail = findViewById(R.id.gold_detail);
        ll_Platinum_detail = findViewById(R.id.platinum_detail);

        ll_Silver_level.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                    ll_silver_detail.setVisibility(View.VISIBLE);
                    ll_gold_detail.setVisibility(View.INVISIBLE);
                   ll_Platinum_detail.setVisibility(View.INVISIBLE);
                }
        });

        ll_Gold_level.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                    ll_gold_detail.setVisibility(View.VISIBLE);

                    ll_silver_detail.setVisibility(View.INVISIBLE);
                    ll_Platinum_detail.setVisibility(View.INVISIBLE);
                }
        });

        ll_Platinum_level.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                    ll_Platinum_detail.setVisibility(View.VISIBLE);
                    ll_gold_detail.setVisibility(View.INVISIBLE);
                    ll_silver_detail.setVisibility(View.INVISIBLE);
            }
        });


    }
}