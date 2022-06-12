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
import com.shweta.reyound.di.module.KidsCategoriesModel;
import com.shweta.reyound.di.module.MenCategoriesModel;

import java.util.List;

public class KidsCategoriesAdapter extends RecyclerView.Adapter<KidsCategoriesAdapter.KidsCategoryViewHolder> {
        Context mContext;
        List<KidsCategoriesModel> newKidsCategoriesList;

    public KidsCategoriesAdapter(Context mContext, List<KidsCategoriesModel> newKidsCategoriesList) {
        this.mContext = mContext;
        this.newKidsCategoriesList = newKidsCategoriesList;
    }

    @NonNull
    @Override
    public KidsCategoryViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_all_category, parent, false);

        return new KidsCategoriesAdapter.KidsCategoryViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull KidsCategoryViewHolder holder, int position) {

        KidsCategoriesModel kidsCategoriesModel = newKidsCategoriesList.get(position);


        holder.tv_kid_list.setText(kidsCategoriesModel.getName());
        holder.iv_kid.setImageResource(kidsCategoriesModel.getImage());


    }

    @Override
    public int getItemCount() {
        return newKidsCategoriesList.size();
    }

    public class KidsCategoryViewHolder extends RecyclerView.ViewHolder {
        ImageView iv_kid;
        TextView tv_kid_list;
        public KidsCategoryViewHolder(@NonNull View itemView) {
            super(itemView);
            iv_kid = itemView.findViewById(R.id.cv_women);
            tv_kid_list = itemView.findViewById(R.id.tv_women_list);
        }
    }
}
