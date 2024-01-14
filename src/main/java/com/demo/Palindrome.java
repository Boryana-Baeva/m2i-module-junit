package com.demo;

public class Palindrome {

    public static boolean check(String input) {
        String text = input.toUpperCase();
        StringBuilder reversedText = new StringBuilder();

        for (int i = 0; i < text.length(); i++) {
            reversedText.append(text.charAt(text.length() -1 - i));
        }

        String reverse = reversedText.toString().trim();
        text = text.trim();

        return reverse.equals(text);
    }

    public static boolean isPalindrome(String phrase){

        int indexDebut = 0;
        int indexFin = phrase.length()-1;

        while(indexDebut < indexFin && phrase.charAt(indexDebut)==phrase.charAt(indexFin)){
            indexDebut++;
            indexFin--;
        }

        return indexDebut >= indexFin;
    }
}
