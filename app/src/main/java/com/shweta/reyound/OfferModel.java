package com.shweta.reyound;

public class OfferModel {
    private String offer_name;
    private String offer_description;
    private int offer_image;

    public OfferModel(String offer_name, String offer_description, int offer_image) {
        this.offer_name = offer_name;
        this.offer_description = offer_description;
        this.offer_image = offer_image;
    }

    public String getOffer_name() {
        return offer_name;
    }

    public void setOffer_name(String offer_name) {
        this.offer_name = offer_name;
    }

    public String getOffer_description() {
        return offer_description;
    }

    public void setOffer_description(String offer_description) {
        this.offer_description = offer_description;
    }

    public int getOffer_image() {
        return offer_image;
    }

    public void setOffer_image(int offer_image) {
        this.offer_image = offer_image;
    }
}
