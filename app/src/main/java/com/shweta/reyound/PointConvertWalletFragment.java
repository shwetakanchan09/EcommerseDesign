package com.shweta.reyound;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.shweta.reyound.activity.AddressBookActivity;
import com.shweta.reyound.activity.ViewHistoryActivity;

public class PointConvertWalletFragment extends Fragment {

    Intent intent;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_point_convert_wallet, container, false);

        final TextView txt_view_history = (TextView) v.findViewById(R.id.txt_view_history);

        txt_view_history.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(getActivity(), ViewHistoryActivity.class);
                startActivity(intent);

            }
        });
        return v;
    }
}