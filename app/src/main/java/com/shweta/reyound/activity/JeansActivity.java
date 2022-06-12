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
import com.shweta.reyound.adapter.JeansAdapter;

public class JeansActivity extends Activity {

    Intent intent;
    LinearLayout ll_Relevant,ll_Filter;
    ImageView backbtn;

    GridView grid;
    String[] web = {
            "Men's denim Jeans",
            "Men's denim Jeans",
            "Men's denim Jeans",
            "Men's denim Jeans",
            "Men's denim Jeans",
            "Men's denim Jeans",
            "Men's denim Jeans",
            "Men's denim Jeans",
            "Men's denim Jeans",
            "Men's denim Jeans",
            "Men's denim Jeans",
            "Men's denim Jeans",
            "Men's denim Jeans",
            "Men's denim Jeans",
            "Men's denim Jeans",
            "Men's denim Jeans",
            "Men's denim Jeans",
            "Men's denim Jeans",
            "Men's denim Jeans",
            "Men's denim Jeans",
            "Men's denim Jeans"


    } ;
    int[] imageId = {
            R.drawable.jeans1,
            R.drawable.jeans2,
            R.drawable.jeans3,
            R.drawable.jeans4,
            R.drawable.jeans5,
            R.drawable.jeans6,
            R.drawable.jeans7,
            R.drawable.jeans8,
            R.drawable.jeans9,
            R.drawable.jeans10,
            R.drawable.jeans1,
            R.drawable.jeans2,
            R.drawable.jeans3,
            R.drawable.jeans4,
            R.drawable.jeans5,
            R.drawable.jeans6,
            R.drawable.jeans7,
            R.drawable.jeans8,
            R.drawable.jeans9,
            R.drawable.jeans10

    };



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jeans);


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

        JeansAdapter adapter = new JeansAdapter(JeansActivity.this, web, imageId);
        grid=(GridView)findViewById(R.id.grid);
        grid.setAdapter(adapter);
        grid.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {
                Toast.makeText(JeansActivity.this, "You Clicked at " +web[+ position], Toast.LENGTH_SHORT).show();

            }
        });
    }
}