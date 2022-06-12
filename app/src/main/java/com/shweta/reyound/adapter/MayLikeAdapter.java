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
import com.shweta.reyound.di.module.HomeCategoriesModel;
import com.shweta.reyound.di.module.MayLikeModel;

import java.util.List;

public class MayLikeAdapter extends RecyclerView.Adapter<MayLikeAdapter.ViewHolder> {
    Context mContext;
    List<MayLikeModel> mayLikeModelList;

    public MayLikeAdapter(Context mContext, List<MayLikeModel> mayLikeModelList) {
        this.mContext = mContext;
        this.mayLikeModelList = mayLikeModelList;
    }

    @NonNull
    @Override
    public MayLikeAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_product_view, parent, false);

        return new MayLikeAdapter.ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull MayLikeAdapter.ViewHolder holder, int position) {
        MayLikeModel mayLikeModel= mayLikeModelList.get(position);

        holder.brand_name.setText(mayLikeModel.getBrand_name());
        holder.dis_amount.setText(mayLikeModel.getDis_amount());
        holder.total_amount.setText(mayLikeModel.getTotal_amount());
        holder.off.setText(mayLikeModel.getOff());
        holder.img_product.setImageResource(mayLikeModel.getProductimage());

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
        return mayLikeModelList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView img_product;
        TextView brand_name, description,dis_amount,total_amount,off;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            img_product = itemView.findViewById(R.id.product_image);
            brand_name = itemView.findViewById(R.id.text_brand_name);
            dis_amount = itemView.findViewById(R.id.tv_amount);
            total_amount = itemView.findViewById(R.id.tv_totalamount);
            off = itemView.findViewById(R.id.tv_off);
        }
    }
}



