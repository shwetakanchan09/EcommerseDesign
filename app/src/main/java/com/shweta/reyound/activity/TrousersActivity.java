package com.shweta.reyound.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Toast;

import com.shweta.reyound.R;
import com.shweta.reyound.adapter.TrousersAdapter;

public class TrousersActivity extends Activity {

    LinearLayout ll_Filter,ll_Relevant;
    Intent intent;
    ImageView backbtn;

    GridView grid;
    String[] web = {
            "Men's Trouser",
            "Men's Trouser",
            "Men's Trouser",
            "Men's Trouser",
            "Men's Trouser",
            "Men's Trouser",
            "Men's Trouser",
            "Men's Trouser",
            "Men's Trouser",
            "Men's Trouser",
            "Men's Trouser",
            "Men's Trouser",
            "Men's Trouser",
            "Men's Trouser",
            "Men's Trouser",
            "Men's Trouser",

    } ;
    int[] imageId = {
            R.drawable.tr1,
            R.drawable.tr2,
            R.drawable.tr3,
            R.drawable.tr4,
            R.drawable.tr5,
            R.drawable.tr6,
            R.drawable.tr7,
            R.drawable.tr8,
            R.drawable.tr9,
            R.drawable.tr10,
            R.drawable.tr1,
            R.drawable.tr2,
            R.drawable.tr3,
            R.drawable.tr4,
            R.drawable.tr5,
            R.drawable.tr6,
    };



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_trousers);


        ll_Relevant = findViewById(R.id.ll_Relevent);
        ll_Filter = findViewById(R.id.ll_Filter);
        backbtn = findViewById(R.id.back_btn);

        backbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });


        ll_Relevant.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(getApplicationContext(), ReleventActivity.class);
                startActivity(intent);
            }
        });

        ll_Filter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(getApplicationContext(), FilterActivity.class);
                startActivity(intent);
            }
        });


        TrousersAdapter adapter = new TrousersAdapter(TrousersActivity.this, web, imageId);
        grid=(GridView)findViewById(R.id.grid);
        grid.setAdapter(adapter);
        grid.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {
                Toast.makeText(TrousersActivity.this, "You Clicked at " +web[+ position], Toast.LENGTH_SHORT).show();

            }
        });
    }
}