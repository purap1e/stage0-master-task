package com.epam.langSyntax;

public class NumberReverter {

    public void revert(int number) {

        StringBuilder reverseNumber = new StringBuilder();
        String strNum = String.valueOf(number);

        for(int i = 0; i < strNum.length(); i++) {
            int piece = number % 10;
            number = number / 10;
            reverseNumber.append(piece);
        }
        System.out.println(reverseNumber);

    }
}
