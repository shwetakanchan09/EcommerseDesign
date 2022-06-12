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
import java.util.List;

public class FeaturedItemAdapter extends RecyclerView.Adapter<FeaturedItemAdapter.ViewHolder> {
    Context mContext;
    List<FeaturedItemModel> featuredItemModelList;

    public FeaturedItemAdapter(Context mContext, List<FeaturedItemModel> featuredItemModelList) {
        this.mContext = mContext;
        this.featuredItemModelList = featuredItemModelList;
    }

    @NonNull
    @Override
    public FeaturedItemAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_featured_more_like, parent, false);

        return new FeaturedItemAdapter.ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull FeaturedItemAdapter.ViewHolder holder, int position) {
        FeaturedItemModel featuredItemModel= featuredItemModelList.get(position);

        holder.brand_name.setText(featuredItemModel.getBrand_name());
        holder.amount.setText(featuredItemModel.getAmount());
        holder.rating_num.setText(featuredItemModel.getRating_num());
        holder.img_product.setImageResource(featuredItemModel.getItem_image());

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
        return featuredItemModelList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView img_product;
        TextView brand_name,amount,rating_num;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            brand_name = itemView.findViewById(R.id.text_brand_name);
            amount = itemView.findViewById(R.id.tv_amount);
            rating_num = itemView.findViewById(R.id.txt_rating_num);
            img_product = itemView.findViewById(R.id.product_image);
        }
    }
}
