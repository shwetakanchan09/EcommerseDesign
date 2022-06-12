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

public class MenActivity extends Activity {

    Intent intent;
    LinearLayout ll_Relevant,ll_Filter;
ImageView backbtn;
    GridView grid;
    String[] web = {
            "Men T-Shirt",
            "Men T-Shirt",
            "Men T-Shirt",
            "Men T-Shirt",
            "Men T-Shirt",
            "Men T-Shirt",
            "Men T-Shirt",
            "Men T-Shirt",
            "Men T-Shirt",
            "Men T-Shirt",
            "Men T-Shirt",
            "Men T-Shirt",
            "Men T-Shirt",
            "Men T-Shirt",
            "Men T-Shirt"

    } ;
    int[] imageId = {
            R.drawable.men1,
            R.drawable.men2,
            R.drawable.men3,
            R.drawable.men4,
            R.drawable.men5,
            R.drawable.men6,
            R.drawable.men7,
            R.drawable.men8,
            R.drawable.men9,
            R.drawable.men10,
            R.drawable.men11,
            R.drawable.men12,
            R.drawable.men13,
            R.drawable.men14,
            R.drawable.men15,
            R.drawable.men16

    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_men);


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


        CustomGreed1 adapter = new CustomGreed1(MenActivity.this, web, imageId);
        grid=(GridView)findViewById(R.id.grid);
        grid.setAdapter(adapter);
        grid.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {
                Toast.makeText(MenActivity.this, "You Clicked at " +web[+ position], Toast.LENGTH_SHORT).show();

            }
        });



    }
}
