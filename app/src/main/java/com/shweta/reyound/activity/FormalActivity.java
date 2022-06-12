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
import com.shweta.reyound.adapter.CasualAdapter;
import com.shweta.reyound.adapter.FormalAdapter;

public class FormalActivity extends Activity {

    Intent intent;
    LinearLayout ll_Relevant,ll_Filter;
    ImageView backbtn;

    GridView grid;
    String[] web = {
            "Men Formal-Shirt",
            "Men Formal-Shirt",
            "Men Formal-Shirt",
            "Men Formal-Shirt",
            "Men Formal-Shirt",
            "Men Formal-Shirt",
            "Men Formal-Shirt",
            "Men Formal-Shirt",
            "Men Formal-Shirt",
            "Men Formal-Shirt",
            "Men Formal-Shirt",
            "Men Formal-Shirt",
            "Men Formal-Shirt",
            "Men Formal-Shirt",
            "Men Formal-Shirt",
            "Men Formal-Shirt"

    } ;
    int[] imageId = {
            R.drawable.formal1,
            R.drawable.formal2,
            R.drawable.formal3,
            R.drawable.formal4,
            R.drawable.formal5,
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
        setContentView(R.layout.activity_formal);


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


        FormalAdapter adapter = new FormalAdapter(FormalActivity.this, web, imageId);
        grid=(GridView)findViewById(R.id.grid);
        grid.setAdapter(adapter);
        grid.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {
                Toast.makeText(FormalActivity.this, "You Clicked at " +web[+ position], Toast.LENGTH_SHORT).show();

            }
        });

    }
}