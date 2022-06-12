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
import com.shweta.reyound.di.module.MenCategoriesModel;
import com.shweta.reyound.di.module.WomenCategoriesModel;

import java.util.List;

public class MenCategoriesAdapter extends RecyclerView.Adapter<MenCategoriesAdapter.MenCategoryViewHolder> {
    Context mContext;
    List<MenCategoriesModel> newMenCategoriesList;

    public MenCategoriesAdapter(Context mContext, List<MenCategoriesModel> newMenCategoriesList) {
        this.mContext = mContext;
        this.newMenCategoriesList = newMenCategoriesList;
    }

    @NonNull
    @Override
    public MenCategoriesAdapter.MenCategoryViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_all_category, parent, false);

        return new MenCategoriesAdapter.MenCategoryViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull MenCategoriesAdapter.MenCategoryViewHolder holder, int position) {
        MenCategoriesModel menCategoriesModel = newMenCategoriesList.get(position);


        holder.tv_men_list.setText(menCategoriesModel.getName());
        holder.iv_men.setImageResource(menCategoriesModel.getImage());

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
        return newMenCategoriesList.size();
    }

    public class MenCategoryViewHolder extends RecyclerView.ViewHolder {
        ImageView iv_men;
        TextView tv_men_list;

        public MenCategoryViewHolder(@NonNull View itemView) {
            super(itemView);
            iv_men = itemView.findViewById(R.id.cv_women);
            tv_men_list = itemView.findViewById(R.id.tv_women_list);
        }
    }
}
