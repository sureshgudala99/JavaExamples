package com.test.today;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class JavaExample {

    public static void main(String[] args) {

        List<Integer> integerList = Arrays.asList(2,4,7,8,9,12,5,6);

       List<Integer> intlist=    integerList.stream().filter(n -> n>5).collect(Collectors.toList());

        Optional<Integer> max=integerList.stream().max(Integer::compareTo);

       System.out.println(max);

    }


}
