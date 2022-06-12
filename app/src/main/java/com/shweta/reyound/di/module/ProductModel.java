package com.shweta.reyound.di.module;

public class ProductModel {
    int productimage;
    String productname,amount,totalamount,off,dec;

    public ProductModel(int productimage, String productname, String amount, String totalamount, String off, String dec) {
        this.productimage = productimage;
        this.productname = productname;
        this.amount = amount;
        this.totalamount = totalamount;
        this.off = off;
        this.dec = dec;
    }

    public int getProductimage() {
        return productimage;
    }

    public void setProductimage(int productimage) {
        this.productimage = productimage;
    }

    public String getProductname() {
        return productname;
    }

    public void setProductname(String productname) {
        this.productname = productname;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public String getTotalamount() {
        return totalamount;
    }

    public void setTotalamount(String totalamount) {
        this.totalamount = totalamount;
    }

    public String getOff() {
        return off;
    }

    public void setOff(String off) {
        this.off = off;
    }

    public String getDec() {
        return dec;
    }

    public void setDec(String dec) {
        this.dec = dec;
    }
}
