package com.test.javaex;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class MuliPlierofFive {

    public static void main(String[] args) {

        List<Integer> integerList = Arrays.asList(45,12,50,60,11,75,100,98);

        integerList.stream().filter(i ->i%5==0).collect(Collectors.toList()).forEach(System.out::println);

       Optional<Integer> max= integerList.stream().max(Integer::compareTo);

        Optional<Integer> maximum= integerList.stream().max(Comparator.naturalOrder());


        System.out.println("Second maximum numbers are .....");
        integerList.stream().sorted(Comparator.reverseOrder()).limit(2).skip(1).forEach(System.out::println);



        if(maximum.isPresent())
        {

            System.out.println("Maximum number is: "+maximum.get());
        }





    }

}
