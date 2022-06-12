package com.shweta.reyound.di.module;

public class CreditedCoinModel {
    private String order_name, credited_date,credited_coin;
   // private int credited_coin;

    public CreditedCoinModel(String order_name, String credited_date, String credited_coin) {
        this.order_name = order_name;
        this.credited_date = credited_date;
        this.credited_coin = credited_coin;
    }

    public String getOrder_name() {
        return order_name;
    }

    public void setOrder_name(String order_name) {
        this.order_name = order_name;
    }

    public String getCredited_date() {
        return credited_date;
    }

    public void setCredited_date(String credited_date) {
        this.credited_date = credited_date;
    }

    public String getCredited_coin() {
        return credited_coin;
    }

    public void setCredited_coin(String credited_coin) {
        this.credited_coin = credited_coin;
    }
}
