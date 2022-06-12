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
import com.shweta.reyound.activity.Offer_Detail_Activity;
import com.shweta.reyound.di.module.UsePointModel;

import java.util.List;

public class UseCoinAdapter extends RecyclerView.Adapter<UseCoinAdapter.UsePointViewHolder> {
    Context mContext;
    List<UsePointModel> UsePointModelList;

    public UseCoinAdapter(Context mContext, List<UsePointModel> usePointModelList) {
        this.mContext = mContext;
        UsePointModelList = usePointModelList;
    }

    @NonNull
    @Override
    public UsePointViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_popular_reward, parent, false);

        return new UsePointViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull UseCoinAdapter.UsePointViewHolder holder, int position) {
        UsePointModel usePointModel = UsePointModelList.get(position);


        holder.txt_reward_des.setText(usePointModel.getReward_des());
        holder.imgPoint.setImageResource(usePointModel.getImage_point());
        holder.imgReward.setImageResource(usePointModel.getImage_gift());
        holder.txtUse.setText(usePointModel.getTxtuse());
        holder.txtPoint.setText(usePointModel.getTxtPoint());

       holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(mContext, Offer_Detail_Activity.class);
                mContext.startActivity(i);
            }
        });
    }

    @Override
    public int getItemCount() {
        return UsePointModelList.size();
    }

    public class UsePointViewHolder extends RecyclerView.ViewHolder {
        ImageView imgReward, imgPoint;
        TextView txt_reward_des, txtUse, txtPoint;

        public UsePointViewHolder(@NonNull View itemView) {
            super(itemView);
            imgReward = itemView.findViewById(R.id.imgReward);
            imgPoint = itemView.findViewById(R.id.imgPoint);
            txt_reward_des = itemView.findViewById(R.id.txt_reward_des);
            txtUse = itemView.findViewById(R.id.txtUse);
            txtPoint = itemView.findViewById(R.id.txtPoint);


        }

    }
}