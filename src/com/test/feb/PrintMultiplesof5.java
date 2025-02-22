package com.test.feb;

import java.util.stream.IntStream;

public class PrintMultiplesof5 {


    public static void main(String[] args) {

        IntStream.rangeClosed(1,100).filter(i->i%5==0).forEach(System.out::println);


    }
}
