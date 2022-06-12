package com.shweta.reyound;

public class HomeModel {

    //private String name;
//    private String offer_description;
    private int offer_image;

    public HomeModel(int offer_image) {
        this.offer_image = offer_image;
    }

    public int getOffer_image() {
        return offer_image;
    }

    public void setOffer_image(int offer_image) {
        this.offer_image = offer_image;
    }
}
