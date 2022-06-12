package com.shweta.reyound.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.tabs.TabLayout;
import com.shweta.reyound.R;
import com.shweta.reyound.adapter.CashBackAdapter;
import com.shweta.reyound.adapter.RewardAdapter;

public class CashBackActivity extends AppCompatActivity {

    TabLayout tabLayout;
    ViewPager viewPager;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cashback);

        tabLayout = findViewById(R.id.tabLayout1);
        viewPager = findViewById(R.id.viewPager1);

        tabLayout.addTab(tabLayout.newTab().setText("Cashback\n Won"));
        tabLayout.addTab(tabLayout.newTab().setText("Reyound\n Points"));
        tabLayout.addTab(tabLayout.newTab().setText("Point Convert\n to wallet"));
        tabLayout.setTabGravity(TabLayout.GRAVITY_FILL);
        final CashBackAdapter adapter = new CashBackAdapter(this,getSupportFragmentManager(),
                tabLayout.getTabCount());
        viewPager.setAdapter(adapter);
        viewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout));
        tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                viewPager.setCurrentItem(tab.getPosition());
            }
            @Override
            public void onTabUnselected(TabLayout.Tab tab) {
            }
            @Override
            public void onTabReselected(TabLayout.Tab tab) {
            }
        });
    }
}