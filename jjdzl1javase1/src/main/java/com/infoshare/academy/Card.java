package com.infoshare.academy;

public class Card {
    public String name;
    public String number;

    public Card(String name, String number){
        this.number = number;
        this.name = name;
    }

    public void printData(){
        System.out.println("Nazwa: " + name + ", numer: " + number);
    }
}
