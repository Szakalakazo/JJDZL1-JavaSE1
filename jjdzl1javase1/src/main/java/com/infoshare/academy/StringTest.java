package com.infoshare.academy;

public class StringTest {

    public static void testStringMethods(){
        String emptyString = "";
        String text = "Lubie programowac";
        System.out.println("01. isEmpty for an empty String : " + emptyString.isEmpty());
        System.out.println("02. isEmpty for a not-empty Stering : " + text.isEmpty());
        System.out.println("03. Character at index 2: " + text.charAt(2));
        System.out.println("04. Strign 'Lubie programowac' contains 'z': " + text.contains("z"));
        System.out.println("05. Strign 'Lubie programowac' ends with 'aut': " + text.endsWith("z"));
        System.out.println("06. Strign 'Lubie programowac' starts with 'aut: " + text.startsWith("z"));
        System.out.println("07. First occurence of substring 'prog' starts at index: " + text.indexOf("prog"));
        System.out.println("08. Last occurence of substring 'a' at index: " + text.lastIndexOf('a'));
        System.out.println("09. Replace substring 'p' with 'P': " + text.replace('p', 'P'));
        System.out.println("10. Upper case: " + text.toUpperCase());
        System.out.println("10. lower case: " + text.toLowerCase());

    }
}
