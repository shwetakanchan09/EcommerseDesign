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
import com.shweta.reyound.di.module.HomeData;

import java.util.ArrayList;

public class HomeCategoryAdapter extends RecyclerView.Adapter<HomeCategoryAdapter.RecyclerViewHolder> {

private ArrayList<HomeData> courseDataArrayList;
private Context mcontext;

public HomeCategoryAdapter(ArrayList<HomeData> recyclerDataArrayList, Context mcontext) {
        this.courseDataArrayList = recyclerDataArrayList;
        this.mcontext = mcontext;
        }

@NonNull
@Override
public RecyclerViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        // Inflate Layout
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.card_view, parent, false);
        return new RecyclerViewHolder(view);
        }
@Override
public void onBindViewHolder(@NonNull RecyclerViewHolder holder, int position) {
        // Set the data to textview and imageview.
        HomeData recyclerData = courseDataArrayList.get(position);
        holder.courseTV.setText(recyclerData.getTitle());
        holder.courseIV.setImageResource(recyclerData.getImgid());


//    Intent i=new Intent(mcontext, AboutActivity.class);
//    i.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
//    mcontext.startActivity(i);
        }

@Override
public int getItemCount() {
        // this method returns the size of recyclerview
        return courseDataArrayList.size();
        }

// View Holder Class to handle Recycler View.
public class RecyclerViewHolder extends RecyclerView.ViewHolder {

    private TextView courseTV;
    private ImageView courseIV;
    public RecyclerViewHolder(@NonNull View itemView) {
        super(itemView);
        courseTV = itemView.findViewById(R.id.idTVCourse);
        courseIV = itemView.findViewById(R.id.idIVcourseIV);
    }
}
}