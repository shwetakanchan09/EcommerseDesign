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
import com.shweta.reyound.di.module.AccCategoriesModel;
import com.shweta.reyound.di.module.MenCategoriesModel;

import java.util.List;

public class AccCategoriesAdapter extends RecyclerView.Adapter<AccCategoriesAdapter.AccCategoryViewHolder> {
    Context mContext;
    List<AccCategoriesModel> newAccCategoriesList;

    public AccCategoriesAdapter(Context mContext, List<AccCategoriesModel> newAccCategoriesList) {
        this.mContext = mContext;
        this.newAccCategoriesList = newAccCategoriesList;
    }

    @NonNull
    @Override
    public AccCategoryViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_all_category, parent, false);

        return new AccCategoriesAdapter.AccCategoryViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull AccCategoryViewHolder holder, int position) {
        AccCategoriesModel accCategoriesModel = newAccCategoriesList.get(position);


        holder.tv_acc_list.setText(accCategoriesModel.getName());
        holder.iv_acc.setImageResource(accCategoriesModel.getImage());


    }

    @Override
    public int getItemCount() {
        return newAccCategoriesList.size();
    }


    public class AccCategoryViewHolder extends RecyclerView.ViewHolder {
        ImageView iv_acc;
        TextView tv_acc_list;
        public AccCategoryViewHolder(@NonNull View itemView) {
            super(itemView);
            iv_acc = itemView.findViewById(R.id.cv_women);
            tv_acc_list = itemView.findViewById(R.id.tv_women_list);
        }
    }
}
