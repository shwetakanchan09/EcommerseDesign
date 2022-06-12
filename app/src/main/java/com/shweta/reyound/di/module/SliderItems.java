package com.shweta.reyound.di.module;

public class SliderItems {
    //set to String, if you want to add image url from internet
    private int image;

    public SliderItems(int image) {
        this.image = image;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }
}
