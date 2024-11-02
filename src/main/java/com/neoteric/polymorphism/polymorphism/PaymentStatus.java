package com.neoteric.polymorphism.polymorphism;

public enum PaymentStatus {

    SUCCESS("Transation is success"),

    FAILED("Transation is failed"),

    PENDING("Transation is in-progress");

    private String lable;

    PaymentStatus(String lable){
        this.lable=lable;
    }

    public String getLable() {
        return lable;
    }

    public void setLable(String lable) {
        this.lable = lable;
    }
}

