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
import com.shweta.reyound.adapter.MakeupAdapter;

public class HaireCareActivity extends Activity {
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
            R.drawable.hair_care1,
            R.drawable.hair_care2,
            R.drawable.hair_care3,
            R.drawable.hair_care4,
            R.drawable.hair_care5,
            R.drawable.hair_care6,
            R.drawable.hair_care7,
            R.drawable.hair_care8,
            R.drawable.hair_care9,
            R.drawable.hair_care10,
            R.drawable.hair_care11,
            R.drawable.hair_care12,
            R.drawable.hair_care13,
            R.drawable.hair_care14,
            R.drawable.hair_care15,
            R.drawable.hair_care6,
            R.drawable.hair_care7,
            R.drawable.hair_care8,
            R.drawable.hair_care9,
            R.drawable.hair_care10
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

        HairAdapter adapter = new HairAdapter(HaireCareActivity.this, web, imageId);
        grid=(GridView)findViewById(R.id.grid);
        grid.setAdapter(adapter);
        grid.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {
                Toast.makeText(HaireCareActivity.this, "You Clicked at " +web[+ position], Toast.LENGTH_SHORT).show();

            }
        });
    }
}