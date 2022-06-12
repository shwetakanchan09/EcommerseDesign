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
import com.shweta.reyound.di.module.UsePointModel;

import java.util.List;

public class TrendingCouponAdapter extends RecyclerView.Adapter<TrendingCouponAdapter.ViewHolder> {
    Context mContext;
    List<CouponPointModel> trendingCouponModelList;

    public TrendingCouponAdapter(Context mContext, List<CouponPointModel> trendingCouponModelList) {
        this.mContext = mContext;
        this.trendingCouponModelList = trendingCouponModelList;
    }

    @NonNull
    @Override
    public TrendingCouponAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_trending_coupon, parent, false);

        return new TrendingCouponAdapter.ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull TrendingCouponAdapter.ViewHolder holder, int position) {
        CouponPointModel couponPointModel = trendingCouponModelList.get(position);


        holder.txt_coupon_des.setText(couponPointModel.getCoupon_des());
        holder.img_Coupon_Point.setImageResource(couponPointModel.getImage_point());
        holder.imgCoupon.setImageResource(couponPointModel.getImage_coupon());
        holder.txtUse.setText(couponPointModel.getTxt_use());
        holder.txt_Coupon_Point.setText(couponPointModel.getTxt_Point());
        holder.txt_Extra_off.setText(couponPointModel.getTxt_Extra_off());

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
        return trendingCouponModelList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView imgCoupon, img_Coupon_Point;
        TextView txt_coupon_des, txtUse, txt_Coupon_Point,txt_Extra_off;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            imgCoupon = itemView.findViewById(R.id.imgCoupon);
            img_Coupon_Point = itemView.findViewById(R.id.img_Coupon_Point);
            txt_coupon_des = itemView.findViewById(R.id.txt_coupon_des);
            txtUse = itemView.findViewById(R.id.txtUse);
            txt_Coupon_Point = itemView.findViewById(R.id.txt_Coupon_Point);
            txt_Extra_off = itemView.findViewById(R.id.txt_Extra_off);


        }

    }
}
