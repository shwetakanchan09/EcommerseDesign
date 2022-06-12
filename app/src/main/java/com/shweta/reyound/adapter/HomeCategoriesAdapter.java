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
import com.shweta.reyound.di.module.HomeCategoriesModel;
import com.shweta.reyound.di.module.MenCategoriesModel;

import java.util.List;

public class HomeCategoriesAdapter extends RecyclerView.Adapter<HomeCategoriesAdapter.HomeCategoryViewHolder> {
        Context mContext;
        List<HomeCategoriesModel> newHomeCategoriesList;

public HomeCategoriesAdapter(Context mContext, List<HomeCategoriesModel> newHomeCategoriesList) {
        this.mContext = mContext;
        this.newHomeCategoriesList = newHomeCategoriesList;
        }

@NonNull
@Override
public HomeCategoriesAdapter.HomeCategoryViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_all_category, parent, false);

        return new HomeCategoriesAdapter.HomeCategoryViewHolder(v);
        }

@Override
public void onBindViewHolder(@NonNull HomeCategoriesAdapter.HomeCategoryViewHolder holder, int position) {
        HomeCategoriesModel homeCategoriesModel = newHomeCategoriesList.get(position);


        holder.tv_home_list.setText(homeCategoriesModel.getName());
        holder.iv_home.setImageResource(homeCategoriesModel.getImage());

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
        return newHomeCategoriesList.size();
        }

public class HomeCategoryViewHolder extends RecyclerView.ViewHolder {
    ImageView iv_home;
    TextView tv_home_list;

    public HomeCategoryViewHolder(@NonNull View itemView) {
        super(itemView);
        iv_home = itemView.findViewById(R.id.cv_women);
        tv_home_list = itemView.findViewById(R.id.tv_women_list);
    }
}
}
