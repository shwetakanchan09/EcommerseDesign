package com.shweta.reyound.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.Toast;

import com.shweta.reyound.CustomGrid;
import com.shweta.reyound.R;

public class WomenActivity extends Activity {

    GridView grid;
    ImageView backbtn;
    String[] web = {
            "Women Top black",
            "Women Top yellow",
            "Women Top black",
            "Women T-shirt",
            "Women Top maroon",
            "Women Top white",
            "Women Top white",
            "Women Top white",
            "Women Top red",
            "Women Top blue",
            "Women Top yellow",
            "Women Top black",
            "Women Top short",
            "Women Top black",
            "Women Top"

    } ;
    int[] imageId = {
            R.drawable.wom1,
            R.drawable.wom2,
            R.drawable.wom3,
            R.drawable.wom4,
            R.drawable.wom5,
            R.drawable.wom6,
            R.drawable.wom7,
            R.drawable.wom8,
            R.drawable.wom9,
            R.drawable.wom10,
            R.drawable.wom11,
            R.drawable.wom12,
            R.drawable.wom13,
            R.drawable.wom14,
            R.drawable.wom15

    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_women);

        backbtn = findViewById(R.id.back_btn);

        backbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });


        CustomGrid adapter = new CustomGrid(WomenActivity.this, web, imageId);
        grid=(GridView)findViewById(R.id.grid);
        grid.setAdapter(adapter);
        grid.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {
                Toast.makeText(WomenActivity.this, "You Clicked at " +web[+ position], Toast.LENGTH_SHORT).show();

            }
        });

    }
}
