package com.shweta.reyound.di.module;

public class HomeData3 {
    private String title;
    private int imgid;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getImgid() {
        return imgid;
    }

    public void setImgid(int imgid) {
        this.imgid = imgid;
    }

    public HomeData3(String title, int imgid) {
        this.title = title;
        this.imgid = imgid;
    }
}
