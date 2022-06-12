package com.shweta.reyound.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.Spinner;

import com.shweta.reyound.R;
import com.shweta.reyound.adapter.CreditedCoinAdapter;
import com.shweta.reyound.di.module.CreditedCoinModel;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CoinBalanceActivity extends AppCompatActivity {

    ImageView backbtn;
    Spinner spinner;
    String[] FootBallPlayers = new String[]{ "Life Time", "Monthly", "Yearly"};

    private RecyclerView coin_history;
    private ArrayList<CreditedCoinModel> creditedCoinModelArrayList;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_coin_balance);

        spinner = findViewById(R.id.spinner);
        backbtn = findViewById(R.id.back_btn);
        coin_history = findViewById(R.id.rv_coin_history);

        backbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });


        // here we have created new array list and added data to it.
        creditedCoinModelArrayList = new ArrayList<>();
        creditedCoinModelArrayList.add(new CreditedCoinModel("Womens Kurtha", "Credited on 01 Jan 2022","+ 05"));
        creditedCoinModelArrayList.add(new CreditedCoinModel("Makeup Kit", "Credited on 06 Jan 2022","+ 10"));
        creditedCoinModelArrayList.add(new CreditedCoinModel("Diaper Essential", "Credited on 01 Jan 2022","+ 07"));
        creditedCoinModelArrayList.add(new CreditedCoinModel("Mens Kurtha", "Credited on 09 Jan 2022","+ 07"));
        creditedCoinModelArrayList.add(new CreditedCoinModel("Sofa Set", "Credited on 12 Jan 2022","+ 15"));
        creditedCoinModelArrayList.add(new CreditedCoinModel("Jwellary set", "Credited on 15 Jan 2022","+ 03"));
        creditedCoinModelArrayList.add(new CreditedCoinModel("Unisex Perfume", "Credited on 18 Jan 2022","+ 02"));
        creditedCoinModelArrayList.add(new CreditedCoinModel("Men's Shoes", "Credited on 18 Jan 2022","+ 07"));
        creditedCoinModelArrayList.add(new CreditedCoinModel("Paithani Saree", "Credited on 26 Jan 2022","+ 09"));
        creditedCoinModelArrayList.add(new CreditedCoinModel("Absolute Lakme Lipstic and compact", "Credited on 31 Jan 2022","+ 10"));
        creditedCoinModelArrayList.add(new CreditedCoinModel("Womens Kurtha", "Credited on 31 Jan 2022","+ 02"));
        creditedCoinModelArrayList.add(new CreditedCoinModel("Jeans", "Credited on 01 Feb 2022","+ 05"));
        creditedCoinModelArrayList.add(new CreditedCoinModel("Mask", "Credited on 06 Jan 2022","+ 05"));

        CreditedCoinAdapter creditedCoinAdapter = new CreditedCoinAdapter(this, creditedCoinModelArrayList);

        // below line is for setting a layout manager for our recycler view.
        // here we are creating vertical list so we will provide orientation as vertical
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);

        // in below two lines we are setting layoutmanager and adapter to our recycler view.
        coin_history.setLayoutManager(linearLayoutManager);
        coin_history.setAdapter(creditedCoinAdapter);


        final List<String> plantsList = new ArrayList<>(Arrays.asList(FootBallPlayers));
        final ArrayAdapter<String> spinnerArrayAdapter = new ArrayAdapter<>(this, R.layout.support_simple_spinner_dropdown_item, plantsList);
        spinnerArrayAdapter.setDropDownViewResource(R.layout.spinner_value);
        spinner.setAdapter(spinnerArrayAdapter);
    }
    public void SelectSpinnerValue(View view) {
        spinner.setSelection(2);
    }
    }
