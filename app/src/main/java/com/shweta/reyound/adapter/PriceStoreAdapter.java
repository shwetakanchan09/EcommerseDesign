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
import com.shweta.reyound.di.module.PriceStoreModel;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class PriceStoreAdapter extends RecyclerView.Adapter<PriceStoreAdapter.PriceStoreViewHolder> {
    Context mContext;
    List<PriceStoreModel> priceStoreModelList;

    public PriceStoreAdapter(Context mContext, List<PriceStoreModel> priceStoreModelList) {
        this.mContext = mContext;
        this.priceStoreModelList = priceStoreModelList;
    }

    @NonNull
    @Override
    public PriceStoreViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v= LayoutInflater.from(parent.getContext()).inflate(R.layout.item_price_store,parent,false);

        return new PriceStoreViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull PriceStoreAdapter.PriceStoreViewHolder holder, int position) {
        PriceStoreModel priceStoreModel=priceStoreModelList.get(position);

        holder.tv_price_name.setText(priceStoreModel.getName());

//        holder.itemView.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent i=new Intent(mContext, CategoryListActivity.class);
//                mContext.startActivity(i);
//            }
//        });
   }

    @Override
    public int getItemCount() {
        return priceStoreModelList.size();
    }

    public class PriceStoreViewHolder extends RecyclerView.ViewHolder {
        TextView tv_price_name = (TextView) itemView.findViewById(R.id.tv_price_name);

        public PriceStoreViewHolder(@NonNull View itemView) {
            super(itemView);
            ButterKnife.bind(this,itemView);
        }
    }
}
