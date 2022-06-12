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
import com.shweta.reyound.di.module.HomeData3;
import com.shweta.reyound.di.module.VoucherModel;

import java.util.ArrayList;

public class VoucherHistoryAdapter extends RecyclerView.Adapter<VoucherHistoryAdapter.RecyclerViewHolder> {

    private ArrayList<VoucherModel> voucherDataArrayList;
    private Context mcontext;

    public VoucherHistoryAdapter(ArrayList<VoucherModel> voucherDataArrayList, Context mcontext) {
        this.voucherDataArrayList = voucherDataArrayList;
        this.mcontext = mcontext;
    }


    @NonNull
    @Override
    public VoucherHistoryAdapter.RecyclerViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        // Inflate Layout
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_voucher_history, parent, false);
        return new VoucherHistoryAdapter.RecyclerViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull VoucherHistoryAdapter.RecyclerViewHolder holder, int position) {
        // Set the data to textview and imageview.
        VoucherModel recyclerData = voucherDataArrayList.get(position);
        holder.tv_voucher.setText(recyclerData.getVoucher_list());
        holder.tv_validity.setText(recyclerData.getVaucher_validity());
        holder.active.setText(recyclerData.getActive());
        holder.imgvoucher.setImageResource(recyclerData.getImgid());
    }

    @Override
    public int getItemCount() {
        // this method returns the size of recyclerview
        return voucherDataArrayList.size();
    }

    // View Holder Class to handle Recycler View.
    public class RecyclerViewHolder extends RecyclerView.ViewHolder {

        private TextView tv_voucher;
        private TextView tv_validity;
        private TextView active;
        private ImageView imgvoucher;

        public RecyclerViewHolder(@NonNull View itemView) {
            super(itemView);
            tv_voucher = itemView.findViewById(R.id.tv_voucher_list);
            tv_validity = itemView.findViewById(R.id.tv_validity_list);
            active = itemView.findViewById(R.id.btnActive);
            imgvoucher = itemView.findViewById(R.id.cv_voucher);
        }
    }
}
