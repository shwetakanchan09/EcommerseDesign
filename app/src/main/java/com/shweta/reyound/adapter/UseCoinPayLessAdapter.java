package com.shweta.reyound.adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.shweta.reyound.R;
import com.shweta.reyound.activity.AddBasketActivity;
import com.shweta.reyound.di.module.FeaturedItemModel;
import com.shweta.reyound.di.module.UseCoinPayLessModel;

import java.util.List;

public class UseCoinPayLessAdapter extends RecyclerView.Adapter<UseCoinPayLessAdapter.ViewHolder> {
    Context mContext;
    List<UseCoinPayLessModel> useCoinPayLessModelList;

    public UseCoinPayLessAdapter(Context mContext, List<UseCoinPayLessModel> useCoinPayLessModelList) {
        this.mContext = mContext;
        this.useCoinPayLessModelList = useCoinPayLessModelList;
    }

    @NonNull
    @Override
    public UseCoinPayLessAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_use_coin, parent, false);

        return new UseCoinPayLessAdapter.ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull UseCoinPayLessAdapter.ViewHolder holder, int position) {
        UseCoinPayLessModel useCoinPayLessModel= useCoinPayLessModelList.get(position);

        holder.brand_name.setText(useCoinPayLessModel.getBrand_name());
        holder.total_amount.setText(useCoinPayLessModel.getTotal_amount());
        holder.offer_amount.setText(useCoinPayLessModel.getOffer_amount());
        holder.dis_amount.setText(useCoinPayLessModel.getDis_amount());
        holder.pay_amount.setText(useCoinPayLessModel.getPay_amount());
        holder.pay_coin.setText(useCoinPayLessModel.getPay_coin());
        holder.description.setText(useCoinPayLessModel.getDiscription());
        holder.img_product.setImageResource(useCoinPayLessModel.getItem_image());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(v.getContext(), AddBasketActivity.class);
                v.getContext().startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return useCoinPayLessModelList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView img_product;
        TextView brand_name,total_amount,offer_amount,dis_amount,pay_amount,pay_coin,description;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            brand_name = itemView.findViewById(R.id.txt_brand_name);
            total_amount = itemView.findViewById(R.id.txt_amount);
            offer_amount = itemView.findViewById(R.id.txt_off_amount);
            dis_amount = itemView.findViewById(R.id.txt_per_off);
            pay_amount = itemView.findViewById(R.id.txt_pay);
            pay_coin = itemView.findViewById(R.id.txt_no_of_coin);
            description = itemView.findViewById(R.id.txt_description);
            img_product = itemView.findViewById(R.id.product_image);
        }
    }
}
