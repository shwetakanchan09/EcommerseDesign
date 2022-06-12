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
import com.shweta.reyound.di.module.TrendingModel;

import java.util.ArrayList;
import java.util.List;

public class TrendingAdapter extends RecyclerView.Adapter<TrendingAdapter.Viewholder> {

     Context context;
     List<TrendingModel> trendingModelArrayListt;

    // Constructor


    public TrendingAdapter(Context context, List<TrendingModel> trendingModelArrayListt) {
        this.context = context;
        this.trendingModelArrayListt = trendingModelArrayListt;
    }

    @NonNull
    @Override
    public Viewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        // to inflate the layout for each item of recycler view.
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_trending, parent, false);
        return new Viewholder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull TrendingAdapter.Viewholder holder, int position) {
        // to set data to textview and imageview of each card layout
        TrendingModel model = trendingModelArrayListt.get(position);
        holder.trendingName.setText(model.getTrending_name());
        holder.trending_Dec.setText(model.getTrending_dec());
        holder.trending_Rate.setText("" + model.getTrending_rating());
        holder.trending_Image.setImageResource(model.getTrending_image());
    }

    @Override
    public int getItemCount() {
        // this method is used for showing number
        // of card items in recycler view.
        return trendingModelArrayListt.size();
    }

    // View holder class for initializing of
    // your views such as TextView and Imageview.
    public class Viewholder extends RecyclerView.ViewHolder {
         ImageView trending_Image;
         TextView trendingName,trending_Dec, trending_Rate;

        public Viewholder(@NonNull View itemView) {
            super(itemView);
            trending_Image =(ImageView) itemView.findViewById(R.id.imgTrend);
            trending_Dec= (TextView) itemView.findViewById(R.id.txtDec);
            trendingName =(TextView) itemView.findViewById(R.id.txtTitle);
            trending_Rate =(TextView) itemView.findViewById(R.id.TrendRating);
        }
    }
}
