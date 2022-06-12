package com.shweta.reyound;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.shweta.reyound.adapter.OfferAdapter;

import java.util.ArrayList;

public class OfferFragment extends Fragment {

    RecyclerView idOffer;

    // Arraylist for storing data
    private ArrayList<OfferModel> offerModelArrayList;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_offer, container, false);

       final RecyclerView idOffer = (RecyclerView) v.findViewById(R.id.RVOffer);


        // here we have created new array list and added data to it.
        offerModelArrayList = new ArrayList<>();
        offerModelArrayList.add(new OfferModel("Kids Offer","buy 1 get 1 free", R.drawable.reyound));
        offerModelArrayList.add(new OfferModel("Save300","Flat Rs.300 OFF on baby care products above Rs.1299", R.drawable.reyound));

        offerModelArrayList.add(new OfferModel("Save100","Flat Rs.100 OFF on fashion products above Rs.599", R.drawable.reyound));
        offerModelArrayList.add(new OfferModel("Save200","Flat Rs.200 OFF on fashion products above Rs.899", R.drawable.reyound));
        offerModelArrayList.add(new OfferModel("Save400","Flat Rs.400 OFF on fashion products above Rs.1599", R.drawable.reyound));



        RecyclerView.LayoutManager layoutManager11 = new LinearLayoutManager(getActivity(), LinearLayoutManager.VERTICAL, false);
        idOffer.setLayoutManager(layoutManager11);
        idOffer.setHasFixedSize(true);

       /* OfferAdapter offerAdapter = new OfferAdapter(this, offerModelArrayList);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);
        idOffer.setLayoutManager(linearLayoutManager);
        idOffer.setAdapter(OfferAdapter);
*/
        return v;
    }
}