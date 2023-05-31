package com.epam.conditions;

public class DaysInMonth {

    public void printDays(int year, int month) {
        if (year < 0 || month > 12 || month < 0) {
            System.out.println("invalid date");
        } else {
            switch (month) {
                case 1, 3, 5, 7, 8, 10, 12 -> System.out.println("31");
                case 2 -> System.out.println((year % 4 == 0 && year >= 2000) ? "29" : "28");
                case 4, 6, 9, 11 -> System.out.println("30");
            }
        }
    }
}
