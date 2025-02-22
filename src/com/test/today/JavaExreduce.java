package com.test.today;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class JavaExreduce {

    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(1,2,3,4);

        Optional<Integer> integer =numbers.stream().reduce((a, b) ->a*b);

        boolean check=numbers.stream().allMatch(n -> n>0);

        System.out.println(check);

        System.out.println(integer);

    }

}
