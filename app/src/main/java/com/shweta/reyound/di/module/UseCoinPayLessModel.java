package com.shweta.reyound.di.module;

public class UseCoinPayLessModel {
    int item_image;
    String brand_name, total_amount, offer_amount, dis_amount, pay_amount, pay_coin,discription;

    public UseCoinPayLessModel(int item_image, String brand_name, String total_amount, String offer_amount, String dis_amount, String pay_amount, String pay_coin, String discription) {

        this.item_image = item_image;
        this.brand_name = brand_name;
        this.total_amount = total_amount;
        this.offer_amount = offer_amount;
        this.dis_amount = dis_amount;
        this.pay_amount = pay_amount;
        this.pay_coin = pay_coin;
        this.discription = discription;
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

    public String getTotal_amount() {
        return total_amount;
    }

    public void setTotal_amount(String total_amount) {
        this.total_amount = total_amount;
    }

    public String getOffer_amount() {
        return offer_amount;
    }

    public void setOffer_amount(String offer_amount) {
        this.offer_amount = offer_amount;
    }

    public String getDis_amount() {
        return dis_amount;
    }

    public void setDis_amount(String dis_amount) {
        this.dis_amount = dis_amount;
    }

    public String getPay_amount() {
        return pay_amount;
    }

    public void setPay_amount(String pay_amount) {
        this.pay_amount = pay_amount;
    }

    public String getPay_coin() {
        return pay_coin;
    }

    public void setPay_coin(String pay_coin) {
        this.pay_coin = pay_coin;
    }

    public String getDiscription() {
        return discription;
    }

    public void setDiscription(String discription) {
        this.discription = discription;
    }
}