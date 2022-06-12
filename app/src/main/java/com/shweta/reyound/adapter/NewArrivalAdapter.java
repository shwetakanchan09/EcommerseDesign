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
import com.shweta.reyound.activity.Product_List_Activity;
import com.shweta.reyound.di.module.HomeDecorModel;
import com.shweta.reyound.di.module.NewArrivalModel;

import java.util.List;

public class NewArrivalAdapter extends RecyclerView.Adapter<NewArrivalAdapter.NewArrivalViewHolder> {
    Context mContext;
    List<NewArrivalModel> newArrivalModelList;

    public NewArrivalAdapter(Context mContext, List<NewArrivalModel> newArrivalModelList) {
        this.mContext = mContext;
        this.newArrivalModelList= newArrivalModelList;
    }

    @NonNull
    @Override
    public NewArrivalAdapter.NewArrivalViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v= LayoutInflater.from(parent.getContext()).inflate(R.layout.item_new_arrival,parent,false);

        return new NewArrivalAdapter.NewArrivalViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull NewArrivalAdapter.NewArrivalViewHolder holder, int position) {
        NewArrivalModel newArrivalModel= newArrivalModelList.get(position);


        holder.tv_homedecor_product_name.setText(newArrivalModel.getName());
        holder.iv_homedecor.setImageResource(newArrivalModel.getImage());

       holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(mContext, Product_List_Activity.class);
                mContext.startActivity(i);
            }
        });
    }

    @Override
    public int getItemCount() {
        return newArrivalModelList.size();
    }

    public class NewArrivalViewHolder extends RecyclerView.ViewHolder {
        ImageView iv_homedecor;
        TextView tv_homedecor_product_name;

        public NewArrivalViewHolder(@NonNull View itemView) {
            super(itemView);
            iv_homedecor = itemView.findViewById(R.id.iv_homedecor);
            tv_homedecor_product_name = itemView.findViewById(R.id.tv_homedecor_product_name);
        }
    }
}

