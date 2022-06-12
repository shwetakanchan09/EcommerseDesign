package com.shweta.reyound.di.module;

public class GiftCardModel {
    private String gift_dec,txt_rupee;

    public GiftCardModel(String gift_dec, String txt_rupee) {
        this.gift_dec = gift_dec;
        this.txt_rupee = txt_rupee;
    }

    public String getGift_dec() {
        return gift_dec;
    }

    public void setGift_dec(String gift_dec) {
        this.gift_dec = gift_dec;
    }

    public String getTxt_rupee() {
        return txt_rupee;
    }

    public void setTxt_rupee(String txt_rupee) {
        this.txt_rupee = txt_rupee;
    }
}
