package com.test.feb;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class MaxMin {

    public static void main(String[] args) {

        List<Integer> intlist = Arrays.asList(2,4,80,79,1,3,9,12);

        intlist.stream().sorted().limit(3).forEach(System.out::println);

      Integer max= intlist.stream().max(Comparator.naturalOrder()).get();

      Integer min=  intlist.stream().min(Comparator.naturalOrder()).get();

      System.out.println("Maximum is"+max+"Minimum is"+min);



    }
}
