package com.test.javaex;

import java.util.Arrays;
import java.util.stream.IntStream;

public class SortedArray {

    public static void main(String[] args) {
        int[] array1 =new int[]{2,4,6,8};
        int[] array2 = new int[]{1,3,5,7};

        int[] c=IntStream.concat(Arrays.stream(array1),Arrays.stream(array2)).sorted().toArray();

        System.out.println(Arrays.toString(c));
    }
}
