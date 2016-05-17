package com.company;

public class AlternateCase {

    public static void main(String[] args) {

    }
    public static String toAlternativeCase(String string) {

        char[] arr = string.toCharArray();
        for(int i = 0;i<arr.length;i++) {
            if (Character.isAlphabetic(arr[i])) {
                if (Character.isUpperCase(arr[i])) {
                    arr[i] = Character.toLowerCase(arr[i]);
                } else {
                    arr[i] = Character.toUpperCase(arr[i]);
                }
            }
        }
        return new String(arr);
    }
}
