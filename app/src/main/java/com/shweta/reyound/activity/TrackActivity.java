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
import com.shweta.reyound.adapter.TrackAdapter;

public class TrackActivity extends Activity {

    Intent intent;
    LinearLayout ll_Relevant,ll_Filter;

    GridView grid;
    String[] web = {
            "Men Track-Pant",
            "Men Track-Pant",
            "Men Track-Pant",
            "Men Track-Pant",
            "Men Track-Pant",
            "Men Track-Pant",
            "Men Track-Pant",
            "Men Track-Pant",
            "Men Track-Pant",
            "Men Track-Pant",
            "Men Track-Pant",
            "Men Track-Pant",
            "Men Track-Pant",
            "Men Track-Pant",
            "Men Track-Pant",
            "Men Track-Pant"
    } ;
    int[] imageId = {
            R.drawable.track2,
            R.drawable.track3,
            R.drawable.track4,
            R.drawable.track5,
            R.drawable.track6,
            R.drawable.track7,
            R.drawable.track2,
            R.drawable.track3,
            R.drawable.track4,
            R.drawable.track5,
            R.drawable.track6,
            R.drawable.track7,
            R.drawable.track2,
            R.drawable.track3,
            R.drawable.track4,
            R.drawable.track5

    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_track);


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

        TrackAdapter adapter = new TrackAdapter(TrackActivity.this, web, imageId);
        grid=(GridView)findViewById(R.id.grid);
        grid.setAdapter(adapter);
        grid.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {
                Toast.makeText(TrackActivity.this, "You Clicked at " +web[+ position], Toast.LENGTH_SHORT).show();

            }
        });

    }
}