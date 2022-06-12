package com.shweta.reyound.di.module;

public class MayLikeModel {

    int productimage;
    String brand_name,dis_amount,total_amount,off;

    public MayLikeModel(int productimage, String brand_name, String dis_amount, String total_amount, String off) {
        this.productimage = productimage;
        this.brand_name = brand_name;
        this.dis_amount = dis_amount;
        this.total_amount = total_amount;
        this.off = off;
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

    public String getOff() {
        return off;
    }

    public void setOff(String off) {
        this.off = off;
    }
}
