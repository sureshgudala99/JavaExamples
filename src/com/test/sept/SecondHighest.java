package com.test.sept;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class SecondHighest {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(10,20,30,40,50,20,30);

        Optional<Integer> secondhighest =list.stream().distinct().sorted((a, b)-> b-a).skip(1).findFirst();


        System.out.println(secondhighest);


    }



}
