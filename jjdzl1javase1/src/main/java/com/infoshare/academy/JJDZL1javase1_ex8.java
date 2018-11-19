package com.infoshare.academy;

public class JJDZL1javase1_ex8 {
    public static void main(String[] args) {

        Account account1 = new Account("Mbank", "1111-2222-3333", "10000.99");
        account1.getBalance();
        account1.pay("5000");
        account1.getBalance();

    }
}
