package com.test.javaex;

import java.util.stream.IntStream;

public class First10EvenNum {

    public static void main(String[] args) {
        IntStream.rangeClosed(1,10).map(i ->i*2).forEach(System.out::println);
    }
}
