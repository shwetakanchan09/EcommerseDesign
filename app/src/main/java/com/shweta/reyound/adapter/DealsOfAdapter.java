package com.shweta.reyound.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.shweta.reyound.R;
import com.shweta.reyound.di.module.BannerSliderModel;
import com.shweta.reyound.di.module.DealsOfDayModel;
import com.smarteist.autoimageslider.SliderViewAdapter;

import java.util.List;

public class DealsOfAdapter extends SliderViewAdapter<DealsOfAdapter.DealsViewHolder> {
    Context mContext;
    List<DealsOfDayModel> dealSliderModelList;

    public DealsOfAdapter(Context mContext, List<DealsOfDayModel> dealSliderModelList) {
        this.mContext = mContext;
        this.dealSliderModelList = dealSliderModelList;
    }

    @Override
    public DealsOfAdapter.DealsViewHolder onCreateViewHolder(ViewGroup parent) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.adapter_banner_slider_image, null);
        return new DealsOfAdapter.DealsViewHolder(v);
    }

    @Override
    public void onBindViewHolder(DealsOfAdapter.DealsViewHolder viewHolder, int position) {
        DealsOfDayModel dealsOfDayModel = dealSliderModelList.get(position);

        //Glide is use to load image from url in your imageview.
        Glide.with(viewHolder.itemView)
                .load(dealsOfDayModel.getImgUrl())
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
        return dealSliderModelList.size();
    }

    public class DealsViewHolder extends ViewHolder {
        ImageView iv_banner = (ImageView) itemView.findViewById(R.id.iv_banner);
        // ImageView iv_banner;

        public DealsViewHolder(View itemView) {
            super(itemView);
            //
            //  ButterKnife.bind(this,itemView);
        }
    }
}