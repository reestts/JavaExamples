package com.reestts.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MainRegex {

    public static void main(String[] args) {
        String sOne = "ABCD ABCDE ABCBFBANSHS";
        Pattern pattern = Pattern.compile("ABCD");
        Matcher mathcerOne = pattern.matcher(sOne);

        while (mathcerOne.find()) {
            System.out.println(mathcerOne.group());
        }

        System.out.println();

        String sTwo = "Ivanov Ivan, Russia, Moscow, Lenin st, 51, Flat 48, email: ivanov@mail.ru, Postcode: AA99, Phone Number: +123456789;" +
                "Petrova Olga, Poland, Warsaw, Main st, 33, Flat 18. email: petrova@yahoo.com, Postcode: POL54, Phone Number: +987654321;" +
                "John Smith, USA, Dallas, Trump st, 17, Flat 1, email: smith@gmail.com, Postcode: USA01, Phone Number: +136478952.";
        Pattern emails = Pattern.compile("\\w+@\\w+\\.(ru|com)");
        Matcher matcherTwo = emails.matcher(sTwo);

        while (matcherTwo.find()) {
            System.out.println(matcherTwo.group());
        }
    }
}
