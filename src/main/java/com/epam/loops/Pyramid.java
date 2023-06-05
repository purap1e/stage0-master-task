package com.epam.loops;

public class Pyramid {

    public void printPyramid(int cathetusLength) {

        for (int i = 0; i < cathetusLength; i++) {
            StringBuilder str = new StringBuilder();
            for (int j = 1; j <= cathetusLength; j++) {
                if (cathetusLength - j == i) {
                    for (int k = i + 1; k > 0; k--) {
                        str.append(k);
                    }
                    break;
                } else {
                    str.append(" ");
                }
            }
            for (int k = 2; k < i + 2; k++) {
                str.append(k);
            }
            System.out.println(str);
        }
    }

    public static void main(String[] args) {
        new Pyramid().printPyramid(7);
    }

}
