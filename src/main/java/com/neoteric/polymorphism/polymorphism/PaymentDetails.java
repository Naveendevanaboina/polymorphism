package com.neoteric.polymorphism.polymorphism;

import java.util.Date;

public class PaymentDetails {

    private String utrId;
    private String transactionId;
    private String status;
    private Date transactionDate;
    private Double amount;

    public String getUtrId() {
        return utrId;
    }

    public void setUtrId(String utrId) {
        this.utrId = utrId;
    }

    public String getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Date getTransactionDate() {
        return transactionDate;
    }

    public void setTransactionDate(Date transactionDate) {
        this.transactionDate = transactionDate;
    }
}
