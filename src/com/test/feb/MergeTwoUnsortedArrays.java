package com.test.feb;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class MergeTwoUnsortedArrays {

    public static void main(String[] args) {

        int[] array1 = {1,2,3,4};
        int[] array2= {2,4,6,8,12};

        int[] mergedArray =IntStream.concat(Arrays.stream(array1),Arrays.stream(array2)).toArray();
        System.out.println("MergedSortedArray"+Arrays.toString(mergedArray));


        List<Integer> intlist1 = Arrays.asList(2,4,80,79,1,3,9,12);
        List<Integer> intList2=  Arrays.asList(12,1,3,6,8,7,10,9,4,5);

        List<Integer> mergedList =Stream.concat(intlist1.stream(),intList2.stream()).distinct().sorted().collect(Collectors.toList());

        System.out.println(mergedList);


    }








}
