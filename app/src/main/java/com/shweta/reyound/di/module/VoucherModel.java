package com.shweta.reyound.di.module;

public class VoucherModel {
    private String voucher_list, vaucher_validity, active;
    private int imgid;

    public VoucherModel(String voucher_list, String vaucher_validity, String active, int imgid) {
        this.voucher_list = voucher_list;
        this.vaucher_validity = vaucher_validity;
        this.active = active;
        this.imgid = imgid;
    }

    public String getVoucher_list() {
        return voucher_list;
    }

    public void setVoucher_list(String voucher_list) {
        this.voucher_list = voucher_list;
    }

    public String getVaucher_validity() {
        return vaucher_validity;
    }

    public void setVaucher_validity(String vaucher_validity) {
        this.vaucher_validity = vaucher_validity;
    }

    public String getActive() {
        return active;
    }

    public void setActive(String active) {
        this.active = active;
    }

    public int getImgid() {
        return imgid;
    }

    public void setImgid(int imgid) {
        this.imgid = imgid;
    }
}