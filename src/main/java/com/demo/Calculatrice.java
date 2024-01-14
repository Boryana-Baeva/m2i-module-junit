package com.demo;

import java.util.ArrayList;

public class Calculatrice {

    public static int additionner(int a, int b) {
        return  a + b;
    }

    public static int soustraire(int a, int b) {
        return  a - b;
    }

    public static int max(int a, int b) {
        return a > b ? a : b;
    }

    public static ArrayList<Integer> getImpairsUntil(int max) {
        ArrayList<Integer> impairs = new ArrayList<>();

        for (int i = 0; i <= max; i++) {
            if(i % 2 != 0) {
                impairs.add(i);
            }
        }

        return impairs;
    }

    public static int diviser(int a, int b) {
        return a / b;
    }
}
