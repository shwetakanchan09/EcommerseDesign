package com.shweta.reyound.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.shweta.reyound.R;
import com.shweta.reyound.adapter.HomeCategoryAdapter3;
import com.shweta.reyound.adapter.VoucherHistoryAdapter;
import com.shweta.reyound.di.module.HomeData3;
import com.shweta.reyound.di.module.VoucherModel;

import java.util.ArrayList;

public class MyVouchers extends AppCompatActivity {

    private ArrayList<VoucherModel> voucherDataArrayList;
    RecyclerView rv_Voucher_History;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_vouchers);

        rv_Voucher_History = findViewById(R.id.rv_voucher_history);

        voucherDataArrayList = new ArrayList<>();
        voucherDataArrayList.add(new VoucherModel("Domino's Voucher\n Worth Rs.999","Valid till 31 May 2022" ,"Active",R.drawable.domino));
        voucherDataArrayList.add(new VoucherModel("MacDonals's Voucher\n Worth Rs.399","Valid till 31 May 2022" ,"Active",R.drawable.mac));
        voucherDataArrayList.add(new VoucherModel("Natural's\n Worth Rs.299","Valid till 31 May 2022","Active" ,R.drawable.icecream));
        voucherDataArrayList.add(new VoucherModel("Domino's Voucher\n Worth Rs.499","Valid till 31 May 2022","Active" ,R.drawable.domino));
        voucherDataArrayList.add(new VoucherModel("Mom's Co.\n Worth Rs.699","Valid till 31 May 2021","Expire" ,R.drawable.momsco));
        voucherDataArrayList.add(new VoucherModel("Himalaya Voucher\n Worth Rs.499","Valid till 31 May 2021","Expire" ,R.drawable.himalaya));
        voucherDataArrayList.add(new VoucherModel("Natural's\n Worth Rs.999","Valid till 31 May 2021","Expire" ,R.drawable.icecream));
        voucherDataArrayList.add(new VoucherModel("Mom's Co. Voucher\n Worth Rs.799","Valid till 31 May 2021" ,"Expire",R.drawable.momsco));





        VoucherHistoryAdapter adapter = new VoucherHistoryAdapter(voucherDataArrayList, this);
        GridLayoutManager layoutManager = new GridLayoutManager(this, 2);
        rv_Voucher_History.setLayoutManager(layoutManager);
        rv_Voucher_History.setAdapter(adapter);

    }
}