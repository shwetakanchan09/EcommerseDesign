package com.shweta.reyound.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.shweta.reyound.R;

public class ProceedPayment extends AppCompatActivity {

    Intent intent;
//    TextView txtTerms;
    LinearLayout ll_New_address,ll_Address,ll_AllAddress;
    Button btnCheckout;
    ImageView backbtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_proceed_payment);

        ll_New_address = findViewById(R.id.ll_New_address);
       // txtTerms = findViewById(R.id.txtTerms);
        ll_AllAddress = findViewById(R.id.ll_AllAddress);
        ll_Address = findViewById(R.id.ll_Address);
        btnCheckout = findViewById(R.id.Checkout);
        backbtn = findViewById(R.id.back_btn);

        backbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });


        ll_New_address.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(getApplicationContext(), AddAddressActivity.class);
                startActivity(intent);
            }
        });

        /*txtTerms.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(getApplicationContext(), TermsAndConditionActivity.class);
                startActivity(intent);
            }
        });
*/
        ll_Address.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                 ll_AllAddress.isShown();
                    ll_AllAddress.setVisibility(View.VISIBLE);

            }
        });
        btnCheckout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(getApplicationContext(), PaymentActivity.class);
                startActivity(intent);
            }
        });

    }
}