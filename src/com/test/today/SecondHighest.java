package com.test.today;

import java.util.Arrays;
import java.util.OptionalInt;

public class SecondHighest {

    public static void main(String[] args) {

        int[] numberes = {3, 2, 2, 3, 7, 3, 5,7};


      // int secondlargest= Arrays.stream((numberes).distinct().sorted().skip(numberes.length-2).findFirst().orElseThrow(() ->new IllegalArgumentException("No Second highest"));


        int secondlargest= Arrays.stream(numberes).distinct().sorted().skip(2).findFirst().orElseThrow();
       System.out.println(secondlargest);
    }
}
