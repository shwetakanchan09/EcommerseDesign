package com.shweta.reyound.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Toast;

import com.shweta.reyound.R;

public class EarnActivity extends AppCompatActivity {

    ImageView imgCopy;
    LinearLayout ll_level;
    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_earn);

        imgCopy = findViewById(R.id.imgCopy);

        ll_level = findViewById(R.id.ll_Level);

        ll_level.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(getApplicationContext(), LevelActivity.class);
                startActivity(intent);
            }
        });

        imgCopy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "copied", Toast.LENGTH_SHORT).show();
            }
        });
    }
}