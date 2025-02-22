package com.test.javaex;

import java.util.stream.IntStream;

public class SumNaturalNumbers {

    public static void main(String[] args) {

        int sum = IntStream.range(1,11).sum();

        System.out.println(sum);

    }
}
