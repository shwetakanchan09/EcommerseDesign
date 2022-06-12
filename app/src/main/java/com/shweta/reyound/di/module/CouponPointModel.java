package com.shweta.reyound.di.module;

public class CouponPointModel {
    int image_coupon, image_point;
    String coupon_des, txt_use, txt_Point, txt_Extra_off;

    public CouponPointModel(int image_coupon, int image_point, String coupon_des, String txt_use, String txt_Point, String txt_Extra_off) {
        this.image_coupon = image_coupon;
        this.image_point = image_point;
        this.coupon_des = coupon_des;
        this.txt_use = txt_use;
        this.txt_Point = txt_Point;
        this.txt_Extra_off = txt_Extra_off;
    }

    public int getImage_coupon() {
        return image_coupon;
    }

    public void setImage_coupon(int image_coupon) {
        this.image_coupon = image_coupon;
    }

    public int getImage_point() {
        return image_point;
    }

    public void setImage_point(int image_point) {
        this.image_point = image_point;
    }

    public String getCoupon_des() {
        return coupon_des;
    }

    public void setCoupon_des(String coupon_des) {
        this.coupon_des = coupon_des;
    }

    public String getTxt_use() {
        return txt_use;
    }

    public void setTxt_use(String txt_use) {
        this.txt_use = txt_use;
    }

    public String getTxt_Point() {
        return txt_Point;
    }

    public void setTxt_Point(String txt_Point) {
        this.txt_Point = txt_Point;
    }

    public String getTxt_Extra_off() {
        return txt_Extra_off;
    }

    public void setTxt_Extra_off(String txt_Extra_off) {
        this.txt_Extra_off = txt_Extra_off;
    }
}