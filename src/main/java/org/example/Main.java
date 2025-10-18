package org.example;


import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        System.out.println(checkForPalindrome("I did, did I?"));
        System.out.println(checkForPalindrome("Racecar"));
        System.out.println(checkForPalindrome("hello"));
        System.out.println(checkForPalindrome("Was it a car or a cat I saw ?"));
    }
    public static boolean checkForPalindrome(String input){
        if (input == null) {
            return false;
        }
        String cleaned = input.toLowerCase();
        cleaned = cleaned.replaceAll("[^a-z0-9]", "");

        String reversed = new StringBuilder(cleaned).reverse().toString();
        return cleaned.equals(reversed);
    }

    public static String convertDecimalToBinary(int number){
        if(number == 0) {
            return "0";
        }

        LinkedList<Integer> list = new LinkedList<>();
        int temp = number;

        while(temp>0){
            list.addFirst(temp % 2);
            temp /= 2;
        }

        StringBuilder binary = new StringBuilder();
        for (int digit : list){
            binary.append(digit);
        }
        return binary.toString();
    }
}