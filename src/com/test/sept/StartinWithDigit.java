package com.test.sept;

import java.util.*;
import java.util.stream.Stream;

public class StartinWithDigit {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(35,21,32,15,18,16,25,19,30,22,32,15,39);
        list.stream().filter(n ->n.toString().startsWith("3")).forEach(System.out::println);

        Set<Integer> duplset =new HashSet<>();
        System.out.println("Duplicates are.....");
        list.stream().filter(n-> !duplset.add(n)).forEach(System.out::println);

        System.out.println("Count of Elements");

    System.out.println("Count of Element in list are"+ list.stream().count());

        System.out.println("First Element is.....");

     list.stream().findFirst().ifPresent(System.out::println);

        System.out.println("Maximum In the list is.....");

        list.stream().max(Integer::compare).ifPresent(System.out::println);





    }
}
