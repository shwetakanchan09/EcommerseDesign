package com.shweta.reyound.di.module;

public class ShoppingBagModel {
    int productimage;
    String brand_name, description, dis_amount, total_amount, offer;

    public ShoppingBagModel(int productimage, String brand_name, String description, String dis_amount, String total_amount, String offer) {
        this.productimage = productimage;
        this.brand_name = brand_name;
        this.description = description;
        this.dis_amount = dis_amount;
        this.total_amount = total_amount;
        this.offer = offer;
    }

    public int getProductimage() {
        return productimage;
    }

    public void setProductimage(int productimage) {
        this.productimage = productimage;
    }

    public String getBrand_name() {
        return brand_name;
    }

    public void setBrand_name(String brand_name) {
        this.brand_name = brand_name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDis_amount() {
        return dis_amount;
    }

    public void setDis_amount(String dis_amount) {
        this.dis_amount = dis_amount;
    }

    public String getTotal_amount() {
        return total_amount;
    }

    public void setTotal_amount(String total_amount) {
        this.total_amount = total_amount;
    }

    public String getOffer() {
        return offer;
    }

    public void setOffer(String offer) {
        this.offer = offer;
    }
}
