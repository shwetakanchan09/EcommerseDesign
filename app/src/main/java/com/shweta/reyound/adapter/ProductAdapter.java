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
import com.shweta.reyound.activity.AboutActivity;
import com.shweta.reyound.activity.AddBasketActivity;
import com.shweta.reyound.activity.BasketActivity;
import com.shweta.reyound.di.module.ProductModel;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class ProductAdapter extends RecyclerView.Adapter<ProductAdapter.ProductViewHolder> {
    Context mContext;
    List<ProductModel> productModelList;

    public ProductAdapter(Context mContext, List<ProductModel> productModelList) {
        this.mContext = mContext;
        this.productModelList = productModelList;
    }

    @NonNull
    @Override
    public ProductViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v= LayoutInflater.from(parent.getContext()).inflate(R.layout.item_add_to_cart_new_arrival,parent,false);

        return  new ProductViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull ProductAdapter.ProductViewHolder holder, int position) {
        ProductModel productModel=productModelList.get(position);

        holder.product_name.setText(productModel.getProductname());
        holder.amount.setText(productModel.getAmount());
        holder.total_amount.setText(productModel.getTotalamount());
        holder.off.setText(productModel.getOff());
        holder.dec.setText(productModel.getDec());
        holder.product_image.setImageResource(productModel.getProductimage());

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
        return productModelList.size();
    }

    public class ProductViewHolder extends RecyclerView.ViewHolder {

         ImageView product_image;
         TextView product_name,amount,total_amount,off,dec;
        public ProductViewHolder(@NonNull View itemView) {
            super(itemView);

            product_name = (TextView) itemView.findViewById(R.id.text_brand_name);
            product_image = (ImageView) itemView.findViewById(R.id.product_image);
            total_amount = (TextView) itemView.findViewById(R.id.tv_totalamount);
            amount = (TextView) itemView.findViewById(R.id.tv_amount);
            dec = (TextView) itemView.findViewById(R.id.text_description);
            off = (TextView) itemView.findViewById(R.id.tv_off);

        }
    }
}


