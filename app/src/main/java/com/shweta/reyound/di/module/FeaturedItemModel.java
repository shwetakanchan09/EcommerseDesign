package com.shweta.reyound.di.module;

public class FeaturedItemModel {
    int item_image;
    String brand_name,amount,rating_num;

    public FeaturedItemModel(int item_image, String brand_name, String amount, String rating_num) {
        this.item_image = item_image;
        this.brand_name = brand_name;
        this.amount = amount;
        this.rating_num = rating_num;
    }

    public int getItem_image() {
        return item_image;
    }

    public void setItem_image(int item_image) {
        this.item_image = item_image;
    }

    public String getBrand_name() {
        return brand_name;
    }

    public void setBrand_name(String brand_name) {
        this.brand_name = brand_name;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public String getRating_num() {
        return rating_num;
    }

    public void setRating_num(String rating_num) {
        this.rating_num = rating_num;
    }
}

