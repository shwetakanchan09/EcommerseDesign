package com.shweta.reyound.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.LinearLayout;
import android.widget.Toast;

import com.shweta.reyound.R;
import com.shweta.reyound.adapter.KurtaAdapter;

public class KurtaActivity extends Activity {

    Intent intent;
    LinearLayout ll_Relevant,ll_Filter;

    GridView grid;
    String[] web = {
            "Men's Kurta",
            "Men's Kurta",
            "Men's Kurta",
            "Men's Kurta",
            "Men's Kurta",
            "Men's Kurta",
            "Men's Kurta",
            "Men's Kurta",
            "Men's Kurta",
            "Men's Kurta",
            "Men's Kurta",
            "Men's Kurta",
            "Men's Kurta",
            "Men's Kurta",
            "Men's Kurta",
            "Men's Kurta"

    } ;
    int[] imageId = {
            R.drawable.kurta,
            R.drawable.kurta1,
            R.drawable.kurta3,
            R.drawable.kurta4,
            R.drawable.kurta5,
            R.drawable.kurta6,
            R.drawable.kurta7,
            R.drawable.kurta8,
            R.drawable.kurta9,
            R.drawable.kurta2,
            R.drawable.kurta,
            R.drawable.kurta1,
            R.drawable.kurta3,
            R.drawable.kurta4,
            R.drawable.kurta5,
            R.drawable.kurta6,

    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kurta);


        ll_Relevant = findViewById(R.id.ll_Relevent);
        ll_Filter = findViewById(R.id.ll_Filter);

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


        KurtaAdapter adapter = new KurtaAdapter(KurtaActivity.this, web, imageId);
        grid=(GridView)findViewById(R.id.grid);
        grid.setAdapter(adapter);
        grid.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {
                Toast.makeText(KurtaActivity.this, "You Clicked at " +web[+ position], Toast.LENGTH_SHORT).show();

            }
        });
    }
}