package com.test.dtst;

import java.util.Arrays;
import java.util.List;

public class CubeProgram {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(2,3,4,5,6,7,11,15);

        list.stream().map(i ->i*i*i).filter(i ->i>50).forEach(System.out::println);


    }
}
