package com.shweta.reyound.di.module;

public class ViewHistoryModel {
    private String date;
    private String amount;
    private int reference_no;

    public ViewHistoryModel(String date, String amount, int reference_no) {
        this.date = date;
        this.amount = amount;
        this.reference_no = reference_no;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public int getReference_no() {
        return reference_no;
    }

    public void setReference_no(int reference_no) {
        this.reference_no = reference_no;
    }
}