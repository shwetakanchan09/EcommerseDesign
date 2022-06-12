package com.shweta.reyound.di.module;

public class UsePointModel {
    int image_gift, image_point;
    String reward_des, txtuse, txtPoint;

    public UsePointModel(int image_gift, int image_point, String reward_des, String txtuse, String txtPoint) {
        this.image_gift = image_gift;
        this.image_point = image_point;
        this.reward_des = reward_des;
        this.txtuse = txtuse;
        this.txtPoint = txtPoint;
    }

    public int getImage_gift() {
        return image_gift;
    }

    public void setImage_gift(int image_gift) {
        this.image_gift = image_gift;
    }

    public int getImage_point() {
        return image_point;
    }

    public void setImage_point(int image_point) {
        this.image_point = image_point;
    }

    public String getReward_des() {
        return reward_des;
    }

    public void setReward_des(String reward_des) {
        this.reward_des = reward_des;
    }

    public String getTxtuse() {
        return txtuse;
    }

    public void setTxtuse(String txtuse) {
        this.txtuse = txtuse;
    }

    public String getTxtPoint() {
        return txtPoint;
    }

    public void setTxtPoint(String txtPoint) {
        this.txtPoint = txtPoint;
    }
}