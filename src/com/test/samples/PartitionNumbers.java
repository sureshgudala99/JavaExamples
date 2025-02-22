package com.test.samples;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class PartitionNumbers {

    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
        Map<Boolean,List<Integer>> partMap = numbers.stream().collect(Collectors.partitioningBy(n->n%2 ==0));
List<Integer> oddnumbers =partMap.get(false);
        List<Integer> evennumbers =partMap.get(true);

        System.out.println("Odd numbers...."+oddnumbers);

        System.out.println("Even numbers...."+evennumbers);


    }
}
