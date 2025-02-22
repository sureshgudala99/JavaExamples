package com.test.samples;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SortedList {

    public static void main(String[] args) {

        List<Integer> list1 = Arrays.asList(1, 3,4 ,5,3, 7, 9);
        List<Integer> list2 = Arrays.asList(2, 4, 6,1 ,8, 10);

        List<Integer> mergeList = Stream.concat(list1.stream(),list2.stream()).sorted().collect(Collectors.toList());
    List<Integer> intersection = list1.stream().filter(list2::contains).collect(Collectors.toList());

        List<Integer> remDup=list1.stream().distinct().collect(Collectors.toList());

        System.out.println("Removing duplicates"+remDup);

    }
}
