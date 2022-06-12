package com.shweta.reyound.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.shweta.reyound.R;
import com.shweta.reyound.di.module.GiftAmountModel;

import java.util.List;

public class GiftAmountAdapter extends RecyclerView.Adapter<GiftAmountAdapter.ViewHolder> {
    Context mContext;
    List<GiftAmountModel> newGiftAmountModelList;

    public GiftAmountAdapter(Context mContext, List<GiftAmountModel> newGiftAmountModelList) {
        this.mContext = mContext;
        this.newGiftAmountModelList= newGiftAmountModelList;
    }

    @NonNull
    @Override
    public GiftAmountAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v= LayoutInflater.from(parent.getContext()).inflate(R.layout.item_gift_money,parent,false);

        return new GiftAmountAdapter.ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull GiftAmountAdapter.ViewHolder holder, int position) {
        GiftAmountModel giftAmountModel= newGiftAmountModelList.get(position);


        holder.txt_gift_amount.setText(giftAmountModel.getAmount());

       /* holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(mContext, Product_List_Activity.class);
                mContext.startActivity(i);
            }
        });*/
    }

    @Override
    public int getItemCount() {
        return newGiftAmountModelList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        TextView txt_gift_amount;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            txt_gift_amount = itemView.findViewById(R.id.gift_amount);
        }
    }
}



