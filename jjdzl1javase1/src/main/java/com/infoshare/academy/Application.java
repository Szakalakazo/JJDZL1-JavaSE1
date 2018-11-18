package com.infoshare.academy;


public class Application {

    public static void main(String[] args) {
        System.out.println("Hello World!");

        int result = sum(2, 5);
        System.out.println("Wynik: " + result);

        Card visa = new Card("Visa", "134567");
        Card masterCard = new Card("MasterCard", "6789");

        visa.printData();
        masterCard.printData();
    }

    public static int sum(int number1, int number2) {
        System.out.println("Dodanie liczb");
        return number1 + number2;
    }
}