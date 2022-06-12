package com.shweta.reyound.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.shweta.reyound.R;
import com.shweta.reyound.di.module.CreditedCoinModel;
import com.shweta.reyound.di.module.TrendingModel;

import java.util.List;

public class CreditedCoinAdapter extends RecyclerView.Adapter<CreditedCoinAdapter.Viewholder> {

    Context context;
    List<CreditedCoinModel> creditedCoinModelList;

    // Constructor


    public CreditedCoinAdapter(Context context, List<CreditedCoinModel> creditedCoinModelList) {
        this.context = context;
        this.creditedCoinModelList = creditedCoinModelList;
    }

    @NonNull
    @Override
    public CreditedCoinAdapter.Viewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        // to inflate the layout for each item of recycler view.
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_coin_credit, parent, false);
        return new CreditedCoinAdapter.Viewholder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CreditedCoinAdapter.Viewholder holder, int position) {
        // to set data to textview and imageview of each card layout
        CreditedCoinModel model = creditedCoinModelList.get(position);
        holder.orderName.setText(model.getOrder_name());
        holder.creditedDate.setText(model.getCredited_date());
        holder.creditedCoin.setText("" + model.getCredited_coin());
    }

    @Override
    public int getItemCount() {
        // this method is used for showing number
        // of card items in recycler view.
        return creditedCoinModelList.size();
    }

    // View holder class for initializing of
    // your views such as TextView and Imageview.
    public class Viewholder extends RecyclerView.ViewHolder {

        TextView orderName,creditedDate, creditedCoin;

        public Viewholder(@NonNull View itemView) {
            super(itemView);
            orderName= (TextView) itemView.findViewById(R.id.txtOrderName);
            creditedDate =(TextView) itemView.findViewById(R.id.txtCredited);
           creditedCoin =(TextView) itemView.findViewById(R.id.points);
        }
    }
}
