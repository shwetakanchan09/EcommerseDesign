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

import com.shweta.reyound.CustomGreed1;
import com.shweta.reyound.R;
import com.shweta.reyound.adapter.CasualAdapter;

public class CasualActivity extends Activity {

   LinearLayout ll_Relevant,ll_Filter;
   Intent intent;
   ImageView backbtn;

        GridView grid;
        String[] web = {
                "Men Casual-Shirt",
                "Men Casual-Shirt",
                "Men Casual-Shirt",
                "Men Casual-Shirt",
                "Men Casual-Shirt",
                "Men Casual-Shirt",
                "Men Casual-Shirt",
                "Men Casual-Shirt",
                "Men Casual-Shirt",
                "Men Casual-Shirt",
                "Men Casual-Shirt",
                "Men Casual-Shirt",
                "Men Casual-Shirt",
                "Men Casual-Shirt",
                "Men Casual-Shirt"

        } ;
        int[] imageId = {
                R.drawable.casual1,
                R.drawable.casual2,
                R.drawable.casual3,
                R.drawable.casual4,
                R.drawable.casual5,
                R.drawable.casual6,
                R.drawable.casual7,
                R.drawable.casual8,
                R.drawable.casual9,
                R.drawable.casual10,
                R.drawable.casual11,
                R.drawable.casual12,
                R.drawable.casual13,
                R.drawable.casual14,
                R.drawable.casual15,
                R.drawable.casual16

        };


        @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_casual);


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

            CasualAdapter adapter = new CasualAdapter(CasualActivity.this, web, imageId);
            grid=(GridView)findViewById(R.id.grid);
            grid.setAdapter(adapter);
            grid.setOnItemClickListener(new AdapterView.OnItemClickListener() {

                @Override
                public void onItemClick(AdapterView<?> parent, View view,
                                        int position, long id) {
                    Toast.makeText(CasualActivity.this, "You Clicked at " +web[+ position], Toast.LENGTH_SHORT).show();

                }
            });

        }
}