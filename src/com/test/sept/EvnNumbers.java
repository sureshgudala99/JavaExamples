package com.test.sept;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class EvnNumbers {

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(2,4,6,7,9,9,10,14,16);

        list.stream().filter(n-> n%2==0).forEach(System.out::println);

        System.out.println("Sorted List is..............");

        list.stream().sorted(Integer::compare).forEach(System.out::println);

        System.out.println("Sorted List is..............Descending Order");
        list.stream().sorted(Collections.reverseOrder()).forEach(System.out::println);

        int inarray[] =new int[]{1,2,3,5,7,9};



    }
}
