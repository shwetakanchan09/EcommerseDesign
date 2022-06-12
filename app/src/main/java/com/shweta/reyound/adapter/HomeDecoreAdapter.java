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
import com.shweta.reyound.di.module.HomeDecorModel;

import java.util.List;

public class HomeDecoreAdapter extends RecyclerView.Adapter<HomeDecoreAdapter.HomeDecoreViewHolder> {
    Context mContext;
    List<HomeDecorModel> homeDecorModelList;

    public HomeDecoreAdapter(Context mContext, List<HomeDecorModel> homeDecorModelList) {
        this.mContext = mContext;
        this.homeDecorModelList = homeDecorModelList;
    }

    @NonNull
    @Override
    public HomeDecoreViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v= LayoutInflater.from(parent.getContext()).inflate(R.layout.item_homedecor,parent,false);

        return new HomeDecoreViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull HomeDecoreAdapter.HomeDecoreViewHolder holder, int position) {
        HomeDecorModel homeDecorModel= homeDecorModelList.get(position);


        holder.tv_homedecor_product_name.setText(homeDecorModel.getName());
        holder.iv_homedecor.setImageResource(homeDecorModel.getImage());

//       holder.itemView.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent i=new Intent(mContext, CategoryListActivity.class);
//                mContext.startActivity(i);
//            }
//        });
    }

    @Override
    public int getItemCount() {
        return homeDecorModelList.size();
    }

    public class HomeDecoreViewHolder extends RecyclerView.ViewHolder {
        ImageView iv_homedecor;
        TextView tv_homedecor_product_name;

        public HomeDecoreViewHolder(@NonNull View itemView) {
            super(itemView);
            iv_homedecor = itemView.findViewById(R.id.iv_homedecor);
            tv_homedecor_product_name = itemView.findViewById(R.id.tv_homedecor_product_name);
        }
    }
}
