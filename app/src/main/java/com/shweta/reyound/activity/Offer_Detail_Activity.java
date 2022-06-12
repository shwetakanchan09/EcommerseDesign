package com.shweta.reyound.activity;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.shweta.reyound.MainActivity;
import com.shweta.reyound.R;
import com.shweta.reyound.Voucher_Code_Activity;

public class Offer_Detail_Activity extends AppCompatActivity {

    Intent intent;
    Button btn_dialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_offer_detail);

        btn_dialog = findViewById(R.id.btn_dialog);

        btn_dialog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog();
            }
        });
    }
        private void dialog() {
            AlertDialog.Builder builder = new AlertDialog.Builder(Offer_Detail_Activity.this);
            LayoutInflater inflater = getLayoutInflater();
            View dialogView = inflater.inflate(R.layout.custom_dialog_reward, null);
            builder.setView(dialogView);
            builder.setCancelable(false);

            final AlertDialog alertDialog = builder.create();
            alertDialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
            alertDialog.show();

            TextView btn_no = dialogView.findViewById(R.id.btn_no);
            TextView btn_yes = dialogView.findViewById(R.id.btn_yes);

            btn_no.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    alertDialog.dismiss();
                }
            });

            btn_yes.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    alertDialog.dismiss();
                    Toast.makeText(Offer_Detail_Activity.this, "Continue", Toast.LENGTH_SHORT).show();
                startActivity(new Intent(Offer_Detail_Activity.this, Voucher_Code_Activity.class));
                finish();
                }
            });
        }

    }

