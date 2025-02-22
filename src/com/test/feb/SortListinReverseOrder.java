package com.test.feb;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SortListinReverseOrder {

    public static void main(String[] args) {

        List<Integer> intList=  Arrays.asList(12,1,3,6,8,7,10,9,4,5);

        intList.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);

    }
}
