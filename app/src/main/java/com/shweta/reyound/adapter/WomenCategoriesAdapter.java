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
import com.shweta.reyound.di.module.NewArrivalModel;
import com.shweta.reyound.di.module.WomenCategoriesModel;

import java.util.List;

public class WomenCategoriesAdapter extends RecyclerView.Adapter<WomenCategoriesAdapter.WomenCategoryViewHolder> {
    Context mContext;
    List<WomenCategoriesModel> newWomenCategoriesList;

    public WomenCategoriesAdapter(Context mContext, List<WomenCategoriesModel> newWomenCategoriesList) {
        this.mContext = mContext;
        this.newWomenCategoriesList = newWomenCategoriesList;
    }

    @NonNull
    @Override
    public WomenCategoriesAdapter.WomenCategoryViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_all_category, parent, false);

        return new WomenCategoriesAdapter.WomenCategoryViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull WomenCategoriesAdapter.WomenCategoryViewHolder holder, int position) {
        WomenCategoriesModel womenCategoriesModel = newWomenCategoriesList.get(position);


        holder.tv_women_list.setText(womenCategoriesModel.getName());
        holder.iv_women.setImageResource(womenCategoriesModel.getImage());

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
        return newWomenCategoriesList.size();
    }

    public class WomenCategoryViewHolder extends RecyclerView.ViewHolder {
        ImageView iv_women;
         TextView tv_women_list;

        public WomenCategoryViewHolder(@NonNull View itemView) {
            super(itemView);
            iv_women = itemView.findViewById(R.id.cv_women);
            tv_women_list = itemView.findViewById(R.id.tv_women_list);
        }
    }
}
