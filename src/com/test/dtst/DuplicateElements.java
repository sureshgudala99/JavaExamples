package com.test.dtst;

import java.util.*;

public class DuplicateElements {
    public static <Set> void main(String[] args) {
        List<Integer> integerList = Arrays.asList(10,2,4,10,24,2,4,65,24,2,5);
        java.util.Set<Integer> intstream =  new HashSet<Integer>();
       // integerList.stream().filter(n -> !intstream.add(n)).distinct().forEach(System.out::println);

      // long count= integerList.stream().count();
      //  Optional<Integer> max= integerList.stream().max(Integer::compare);
        integerList.stream().sorted(Collections.reverseOrder()).forEach(System.out::println);
      // System.out.println(max);
    }
}
