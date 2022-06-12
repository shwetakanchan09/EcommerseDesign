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
import com.shweta.reyound.di.module.ShoppingBagModel;

import java.util.List;

public class ShoppingBagAdapter extends RecyclerView.Adapter<ShoppingBagAdapter.ViewHolder> {
    Context mContext;
    List<ShoppingBagModel> shoppingBagModelList;

    public ShoppingBagAdapter(Context mContext, List<ShoppingBagModel> shoppingBagModelList) {
        this.mContext = mContext;
        this.shoppingBagModelList = shoppingBagModelList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_shopping_bag, parent, false);
        return new ShoppingBagAdapter.ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

        ShoppingBagModel shoppingBagModel = shoppingBagModelList.get(position);
        holder.brand_name.setText(shoppingBagModel.getBrand_name());
        holder.description.setText(shoppingBagModel.getDescription());
        holder.dis_amount.setText(shoppingBagModel.getDis_amount());
        holder.total_amount.setText(shoppingBagModel.getTotal_amount());
        holder.offer.setText(shoppingBagModel.getOffer());
        holder.img_product.setImageResource(shoppingBagModel.getProductimage());

       /* holder.mRemoveButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                // Get the clicked item label
                String itemLabel = mDataSet.get(position);
                // Remove the item on remove/button click
                mDataSet.remove(position);
                notifyItemRemoved(position);
                notifyItemRangeChanged(position,mDataSet.size());
                // Show the removed item label`enter code here`
                Toast.makeText(mContext,"Removed : " + itemLabel,Toast.LENGTH_SHORT).show();

            }*/
    }


    @Override
    public int getItemCount() {
        return shoppingBagModelList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        ImageView img_product;
        TextView brand_name, description,dis_amount,total_amount,offer;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            img_product = itemView.findViewById(R.id.imgfinal);
            brand_name = itemView.findViewById(R.id.txt_brand_name);
            description = itemView.findViewById(R.id. txt_description);
            dis_amount = itemView.findViewById(R.id.txt_amount);
            total_amount = itemView.findViewById(R.id.txt_off_amount);
            offer = itemView.findViewById(R.id.txt_per_off);
        }

    }

}

