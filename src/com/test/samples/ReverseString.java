package com.test.samples;

public class ReverseString {

    public static void main(String[] args) {

        String str = "Helloworld";

        String reversed = reverseString(str);

        System.out.println("Original String " + str);
        System.out.println("Reversed String" + reversed);

    }

    private static String reverseString(String str) {

        char[] chars = str.toCharArray();
        int left = 0;
        int right = chars.length - 1;

        while (left < right) {
            char temp = chars[left];
            chars[left] = chars[right];
            chars[right] = temp;

            left++;
            right--;

        }
        return new String(chars);
    }
}