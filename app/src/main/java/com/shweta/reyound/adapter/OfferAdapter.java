package com.shweta.reyound.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.shweta.reyound.OfferFragment;
import com.shweta.reyound.OfferModel;
import com.shweta.reyound.R;

import java.util.ArrayList;
import java.util.List;

public class OfferAdapter extends RecyclerView.Adapter<OfferAdapter.Viewholder>{

    private Context context;
    private ArrayList<OfferModel> offerArrayList;
   // List<OfferModel> offerModels=new ArrayList();

    /*public OfferAdapter(OfferFragment context, ArrayList<OfferModel> offerArrayList) {
        this.context = context;
        this.offerArrayList = offerArrayList;
    }
*/
    @NonNull
    @Override
    public Viewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_offer, parent, false);
        return new Viewholder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull Viewholder holder, int position) {

        OfferModel model = offerArrayList.get(position);
        holder.offerName.setText(model.getOffer_name());
        holder.Description.setText("" + model.getOffer_description());
        holder.Rlogo.setImageResource(model.getOffer_image());

    }

    @Override
    public int getItemCount() {
        return offerArrayList.size();
    }

    public class Viewholder extends RecyclerView.ViewHolder {
        private ImageView Rlogo;
        private TextView offerName, Description;

        public Viewholder(@NonNull View itemView) {
            super(itemView);
            Rlogo = itemView.findViewById(R.id.idRlogo);
            offerName = itemView.findViewById(R.id.idOfferName);
            Description = itemView.findViewById(R.id.Description);
        }
    }
}
