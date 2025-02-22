package com.test.javaex;
import java.util.Arrays;
import java.util.Collections;
import java.util.stream.Collectors;


public class ReverseString {

    static String reverseWords(String text)

    {
        String[] str = text.split(" ");
        Collections.reverse(Arrays.asList(str));

        return String.join(" ",str);
    }

    public static void main(String[] args) {
        String text ="I Love India";

      String reversedString =  Arrays.stream(text.split(" ")).map(word -> new StringBuffer(word).reverse()).collect(Collectors.joining());
       System.out.println(reversedString);

    }
}
