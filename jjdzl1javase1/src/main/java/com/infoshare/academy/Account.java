package com.infoshare.academy;

import java.math.BigDecimal;

public class Account {
    private static String name;
    private static String number;
    private static BigDecimal balance;

    public static String getName() {
        return name;
    }

    public static String getNumber() {
        return number;
    }

    public static BigDecimal getBalance() {
        System.out.println("Current balance: " + balance);
        return balance;
    }

    public Account(String name, String number, String moneyOnAccount){
        this.name = name;
        this.number = number;
        this.balance = new BigDecimal(moneyOnAccount);
    }
    public static void pay(String paymentAmount) {
        System.out.println("Money to transfer: " + paymentAmount);
        BigDecimal moneyToSubstract = new BigDecimal(paymentAmount);
        BigDecimal balanceAfterTransfer = balance.subtract(moneyToSubstract);
        balance = balanceAfterTransfer;
    }

}


