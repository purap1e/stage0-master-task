package com.epam.loops;

public class HalfPyramid {

    public void printHalfPyramid(int cathetusLength) {
        for (int i = 0; i < cathetusLength; i++) {
            StringBuilder str = new StringBuilder();
            for (int j = 1; j <= cathetusLength; j++) {
                if (cathetusLength - j == i) {
                    for (int k = 0; k < i + 1; k++) {
                        str.append('*');
                    }
                    break;
                } else {
                    str.append(" ");
                }
            }
            System.out.println(str);
        }
    }

    public static void main(String[] args) {
        new HalfPyramid().printHalfPyramid(8);
    }

}
