package com.epam.OOP;

public class Animal {

    public static final String PAWS = "paws";
    public static final String PAW = "paw";
    public static final String PRETEXT_A = "a";
    public static final String PRETEXT_NO = "no";
    private String color;
    private int numberOfPaws;
    private  boolean hasFur;

    public Animal() {}
    public Animal(String color, int numberOfPaws, boolean hasFur) {
        this.color = color;
        this.numberOfPaws = numberOfPaws;
        this.hasFur = hasFur;
    }

    public String getColor() {
        return color;
    }

    public int getNumberOfPaws() {
        return numberOfPaws;
    }

    public boolean isHasFur() {
        return hasFur;
    }

    public String checkPaws(int numberOfPaws) {
        if (numberOfPaws > 1) {
            return PAWS;
        }
        return PAW;
    }

    public String checkFur(boolean fur) {
        if (fur) {
            return PRETEXT_A;
        }
        return PRETEXT_NO;
    }

    public String getDescription() {
        return String.format("This animal is mostly %s. It has %s %s and %s fur.",
                getColor(),
                getNumberOfPaws(),
                checkPaws(getNumberOfPaws()),
                checkFur(isHasFur()));
    }
}
