package com.shweta.reyound.adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.shweta.reyound.R;
import com.shweta.reyound.di.module.BannerSliderModel;
import com.smarteist.autoimageslider.SliderViewAdapter;

import java.util.List;

import butterknife.ButterKnife;

public class BannerSliderAdapter extends SliderViewAdapter<BannerSliderAdapter.BannerSliderViewHolder> {
    Context mContext;
    List<BannerSliderModel> bannerSliderModelList;

    public BannerSliderAdapter(Context mContext, List<BannerSliderModel> bannerSliderModelList) {
        this.mContext = mContext;
        this.bannerSliderModelList = bannerSliderModelList;
    }

    @Override
    public BannerSliderViewHolder onCreateViewHolder(ViewGroup parent) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.adapter_banner_slider_image, null);
        return new BannerSliderViewHolder(v);
    }

    @Override
    public void onBindViewHolder(BannerSliderAdapter.BannerSliderViewHolder viewHolder, int position) {
        BannerSliderModel bannerSliderModel = bannerSliderModelList.get(position);

        //Glide is use to load image from url in your imageview.
        Glide.with(viewHolder.itemView)
                .load(bannerSliderModel.getImgUrl())
                .fitCenter()
                .into(viewHolder.iv_banner);

       /* viewHolder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(mContext, CategoryListActivity.class);
                mContext.startActivity(i);
            }
        });
    }
*/
    }

    @Override
    public int getCount() {
        return bannerSliderModelList.size();
    }

    public class BannerSliderViewHolder extends ViewHolder {
       ImageView iv_banner = (ImageView) itemView.findViewById(R.id.iv_banner);
       // ImageView iv_banner;

        public BannerSliderViewHolder(View itemView) {
            super(itemView);
            //
            //  ButterKnife.bind(this,itemView);
        }
    }
}
