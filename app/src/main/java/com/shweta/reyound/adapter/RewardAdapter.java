package com.shweta.reyound.adapter;

import android.content.Context;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.shweta.reyound.EarnCoinFragment;
import com.shweta.reyound.RewardFragment;
import com.shweta.reyound.UseCoinFragment;

public class RewardAdapter extends FragmentPagerAdapter {
    Context context;
    int totalTabs;
    public RewardAdapter(Context c, FragmentManager fm, int totalTabs) {
        super(fm);
        context = c;
        this.totalTabs = totalTabs;
    }
    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                UseCoinFragment useCoinFragment = new UseCoinFragment();
                return useCoinFragment;
            case 1:
                EarnCoinFragment earnCoinFragment = new EarnCoinFragment();
                return earnCoinFragment;
            case 2:
                RewardFragment rewardFragment = new RewardFragment();
                return rewardFragment;
            default:
                return null;
        }
    }
    @Override
    public int getCount() {
        return totalTabs;
    }
}
