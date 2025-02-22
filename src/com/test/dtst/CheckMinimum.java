package com.test.dtst;

import java.util.Arrays;
import java.util.Optional;
import java.util.stream.Stream;

public class CheckMinimum {

    public static int findMinimum(int[] arr) {
        int minimum = arr[0];

       return Arrays.stream(arr).min().orElse(0);
       /* for (int i = 1; i < arr.length; i++) {
            if (arr[i] < minimum) {
                minimum = arr[i];

            }
        }*/
        //return minimum;
    }
     public static void main(String[] args)

     {
         int[] arr = {9,2,3,6};

         System.out.println("Array : ");
         for (int i : arr) System.out.println(i + "");

         int min = findMinimum(arr);

         System.out.println("Minimum of the Array"+min);

     }

    }

