package com.shweta.reyound.adapter;

import android.content.Context;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.shweta.reyound.CashBackPointsFragment;
import com.shweta.reyound.CashBackWonFragment;
import com.shweta.reyound.EarnCoinFragment;
import com.shweta.reyound.PointConvertWalletFragment;
import com.shweta.reyound.RewardFragment;
import com.shweta.reyound.UseCoinFragment;

public class CashBackAdapter extends FragmentPagerAdapter {
    Context context;
    int totalTabs;
    public CashBackAdapter(Context c, FragmentManager fm, int totalTabs) {
        super(fm);
        context = c;
        this.totalTabs = totalTabs;
    }
    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                CashBackWonFragment cashBackWonFragment = new CashBackWonFragment();
                return cashBackWonFragment;
            case 1:
                CashBackPointsFragment cashBackPointsFragment = new CashBackPointsFragment();
                return cashBackPointsFragment;
            case 2:
                PointConvertWalletFragment pointConvertWalletFragment = new PointConvertWalletFragment();
                return pointConvertWalletFragment;
            default:
                return null;
        }
    }
    @Override
    public int getCount() {
        return totalTabs;
    }
}
