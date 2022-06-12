package com.shweta.reyound.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.shweta.reyound.R;
import com.shweta.reyound.adapter.TrendingAdapter;
import com.shweta.reyound.adapter.ViewHistoryAdapter;
import com.shweta.reyound.di.module.TrendingModel;
import com.shweta.reyound.di.module.ViewHistoryModel;

import java.util.ArrayList;
import java.util.List;

public class ViewHistoryActivity extends AppCompatActivity {

    //ViwHistory
    List<ViewHistoryModel> viewHistoryModelList = new ArrayList<>();

    RecyclerView rv_View_History;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_history);

        rv_View_History = findViewById(R.id.rv_View_History);

        //Transaction list
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);
        rv_View_History.setLayoutManager(linearLayoutManager);
        rv_View_History.setItemAnimator(new DefaultItemAnimator());
        ViewHistoryAdapter viewHistoryAdapter = new ViewHistoryAdapter(this, viewHistoryModelList);
        rv_View_History.setAdapter(viewHistoryAdapter);

        viewHistoryModelList.add(new ViewHistoryModel("12/08/2021", "₹ 500", 1234567890));
        viewHistoryModelList.add(new ViewHistoryModel("20/08/2021", "₹ 500", 1234567891));
        viewHistoryModelList.add(new ViewHistoryModel("30/08/2021", "₹ 700", 1345678900));
        viewHistoryModelList.add(new ViewHistoryModel("12/09/2021", "₹ 1000", 1232567890));
        viewHistoryModelList.add(new ViewHistoryModel("19/09/2021", "₹ 1200", 1232562290));
        viewHistoryModelList.add(new ViewHistoryModel("30/09/2021", "₹ 500", 1232567000));
        viewHistoryModelList.add(new ViewHistoryModel("01/10/2021", "₹ 2000", 1234447890));
        viewHistoryModelList.add(new ViewHistoryModel("12/10/2021", "₹ 2000", 1232511190));
        viewHistoryModelList.add(new ViewHistoryModel("18/09/2021", "₹ 500", 1232457890));
        viewHistoryModelList.add(new ViewHistoryModel("03/11/2021", "₹ 1000", 1002567890));
        viewHistoryModelList.add(new ViewHistoryModel("08/11/2021", "₹ 700", 1002567120));
        viewHistoryModelList.add(new ViewHistoryModel("15/11/2021", "₹ 5000", 1002567890));













    }
}