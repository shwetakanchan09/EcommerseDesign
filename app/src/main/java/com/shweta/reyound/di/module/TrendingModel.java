package com.shweta.reyound.di.module;

public class TrendingModel {
    private String trending_name, trending_dec;
    //private String trending_dec
    private int trending_rating;
    private int trending_image;

    public TrendingModel(String trending_name, String trending_dec, int trending_rating, int trending_image) {
        this.trending_name = trending_name;
        this.trending_dec = trending_dec;
        this.trending_rating = trending_rating;
        this.trending_image = trending_image;

    }

    public String getTrending_name() {
        return trending_name;
    }

    public void setTrending_name(String trending_name) {
        this.trending_name = trending_name;
    }

    public String getTrending_dec() {
        return trending_dec;
    }

    public void setTrending_dec(String trending_dec) {
        this.trending_dec = trending_dec;
    }

    public int getTrending_rating() {
        return trending_rating;
    }

    public void setTrending_rating(int trending_rating) {
        this.trending_rating = trending_rating;
    }

    public int getTrending_image() {
        return trending_image;
    }

    public void setTrending_image(int trending_image) {
        this.trending_image = trending_image;
    }
}
