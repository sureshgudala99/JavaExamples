package com.test.dtst;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import java.util.function.Function;
import java.util.stream.Collectors;

public class SampleClass
{
    public static void main(String[] args) {

        List<String> list = new ArrayList<>(List.of("abc","dec","xyz","abc","xyz"));
        list.remove("xyz");



        Map<Object, Long> occ= list.stream().collect(Collectors.groupingBy(s -> s,Collectors.counting()));





    }
}
