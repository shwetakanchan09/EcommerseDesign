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
import com.shweta.reyound.di.module.ViewHistoryModel;

import java.util.List;

public class ViewHistoryAdapter extends RecyclerView.Adapter<ViewHistoryAdapter.Viewholder> {

    Context context;
    List<ViewHistoryModel> viewHistoryModelList;

    // Constructor


    public ViewHistoryAdapter(Context context, List<ViewHistoryModel> viewHistoryModelList) {
        this.context = context;
        this.viewHistoryModelList = viewHistoryModelList;
    }

    @NonNull
    @Override
    public ViewHistoryAdapter.Viewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        // to inflate the layout for each item of recycler view.
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_view_history, parent, false);
        return new Viewholder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHistoryAdapter.Viewholder holder, int position) {
        // to set data to textview and imageview of each card layout
        ViewHistoryModel model = viewHistoryModelList.get(position);
        holder.date.setText(model.getDate());
        holder.amount.setText(model.getAmount());
        holder.reference_no.setText("" + model.getReference_no());
    }

    @Override
    public int getItemCount() {
        // this method is used for showing number
        // of card items in recycler view.
        return viewHistoryModelList.size();
    }

    // View holder class for initializing of
    // your views such as TextView and Imageview.
    public class Viewholder extends RecyclerView.ViewHolder {
        TextView date,amount, reference_no;

        public Viewholder(@NonNull View itemView) {
            super(itemView);
            date= (TextView) itemView.findViewById(R.id.date_transaction);
            amount =(TextView) itemView.findViewById(R.id.amount_transaction);
            reference_no =(TextView) itemView.findViewById(R.id.reference_transaction);
        }
    }
}
