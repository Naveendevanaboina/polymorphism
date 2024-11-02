package com.neoteric.polymorphism.polymorphism;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import java.util.function.BiPredicate;

public class PhonePay implements UPIPayments{
       public static   Map<String,Double> accountBalanceMap = new HashMap<>();

        static {
            accountBalanceMap.put("9392732358",10000.0);
            accountBalanceMap.put("7729992084",5000.0);


        }

        BiPredicate<String,Double> balanceCheck =(accountNumber,amt) ->{
            Double accountBalance = accountBalanceMap.get(accountNumber);
            if (accountBalance > amt) {
                return true;
            }else {
                return false;
            }
        };
    @Override
    public PaymentDetails tranfer(String fromMobileNumber, String toNumber, Double amount) {
        PaymentDetails p = new PaymentDetails();
        if (balanceCheck.test(fromMobileNumber,amount)){

            Double fromAccountBalance = accountBalanceMap.get(fromMobileNumber);
            Double toAccountBalance = accountBalanceMap.get(toNumber);
            Double fromTotalBalance = fromAccountBalance-amount;
            Double toTotalBalance = toAccountBalance+amount;
            accountBalanceMap.put(fromMobileNumber,fromTotalBalance);
            accountBalanceMap.put(toNumber,toTotalBalance);
            p.setStatus(PaymentStatus.SUCCESS.getLable());
            p.setTransactionId(UUID.randomUUID().toString());
            p.setUtrId(UUID.randomUUID().toString());
            p.setTransactionDate(new Date());

        }else {

            p.setStatus(PaymentStatus.FAILED.getLable());
            p.setTransactionId(UUID.randomUUID().toString());
            p.setUtrId(UUID.randomUUID().toString());
            p.setTransactionDate(new Date());
        }
        return p;
    }
}
