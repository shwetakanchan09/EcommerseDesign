package com.shweta.reyound.activity;

import androidx.appcompat.app.AppCompatActivity;

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
import com.shweta.reyound.adapter.HairAdapter;
import com.shweta.reyound.adapter.SkinAdapter;

public class SkinCareActivity extends Activity {

    Intent intent;
    LinearLayout ll_Relevant,ll_Filter;
    ImageView backbtn;

    GridView grid;
    String[] web = {
            "Beauty Products - Hair Care",
            "Beauty Products - Hair Care",
            "Beauty Products - Hair Care",
            "Beauty Products - Hair Care",
            "Beauty Products - Hair Care",
            "Beauty Products - Hair Care",
            "Beauty Products - Hair Care",
            "Beauty Products - Hair Care",
            "Beauty Products - Hair Care",
            "Beauty Products - Hair Care",
            "Beauty Products - Hair Care",
            "Beauty Products - Hair Care",
            "Beauty Products - Hair Care",
            "Beauty Products - Hair Care",
            "Beauty Products - Hair Care",
            "Beauty Products - Hair Care",
            "Beauty Products - Hair Care",
            "Beauty Products - Hair Care",
            "Beauty Products - Hair Care",
            "Beauty Products - Hair Care"



    } ;
    int[] imageId = {
            R.drawable.hair1,
            R.drawable.hair2,
            R.drawable.hair3,
            R.drawable.hair4,
            R.drawable.hair5,
            R.drawable.hair6,
            R.drawable.hair7,
            R.drawable.hair8,
            R.drawable.hair9,
            R.drawable.hair10,
            R.drawable.hair11,
            R.drawable.hair12,
            R.drawable.hair13,
            R.drawable.hair14,
            R.drawable.hair1,
            R.drawable.hair6,
            R.drawable.hair7,
            R.drawable.hair8,
            R.drawable.hair9,
            R.drawable.hair10
    };



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_haire_care);


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

        SkinAdapter adapter = new SkinAdapter(SkinCareActivity.this, web, imageId);
        grid=(GridView)findViewById(R.id.grid);
        grid.setAdapter(adapter);
        grid.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {
                Toast.makeText(SkinCareActivity.this, "You Clicked at " +web[+ position], Toast.LENGTH_SHORT).show();

            }
        });
    }
}