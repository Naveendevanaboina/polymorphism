package com.neoteric.polymorphism.polymorphism;

public interface InterfaceTest {
    public static void main(String[] args) {
             UPIPayments Payments = new PhonePay();
            PaymentDetails pay = Payments.tranfer("9392732358","7729992084",3000.0);
     System.out.println(pay.getTransactionId()+"status:"+pay.getStatus()+"uter:"+pay.getUtrId());
          System.out.println("Balance of from account: "+PhonePay.accountBalanceMap.get("9392732358"));
        System.out.println(" to account balance: "+PhonePay.accountBalanceMap.get("7729992084"));
    }
}
