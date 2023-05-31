package com.epam.langSyntax;

public class DigitsSumCalculator {

    public void calculateSum(int number) {
        int sum = 0;
        String strNum = String.valueOf(number);

        for(int i = 0; i < strNum.length(); i++) {
            int piece = number % 10;
            number = number / 10;
            sum += piece;
        }
        System.out.println(sum);
    }
}
