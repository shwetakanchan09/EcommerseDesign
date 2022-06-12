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
import com.shweta.reyound.di.module.CouponPointModel;
import com.shweta.reyound.di.module.GiftCardModel;

import java.util.List;

public class GiftCardAdapter extends RecyclerView.Adapter<GiftCardAdapter.ViewHolder> {
    Context mContext;
    List<GiftCardModel> giftCardModelsList;

    public GiftCardAdapter(Context mContext, List<GiftCardModel> giftCardModelsList) {
        this.mContext = mContext;
        this.giftCardModelsList = giftCardModelsList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_gift_card, parent, false);

        return new GiftCardAdapter.ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull GiftCardAdapter.ViewHolder holder, int position) {
        GiftCardModel giftCardModel = giftCardModelsList.get(position);
        holder.txtExtraOff.setText(giftCardModel.getGift_dec());
        holder.txt_rupee.setText(giftCardModel.getTxt_rupee());

    }

    @Override
    public int getItemCount() {
        return giftCardModelsList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        TextView txtExtraOff,txt_rupee;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            txtExtraOff = itemView.findViewById(R.id.txt_Extra_off);
            txt_rupee = itemView.findViewById(R.id.txt_rupee);

        }
    }
}
