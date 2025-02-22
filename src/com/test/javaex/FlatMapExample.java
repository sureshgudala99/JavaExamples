package com.test.javaex;

import java.util.Arrays;
import java.util.List;

public class FlatMapExample {

    public static void main(String[] args) {


        List<List<String>> listofList = Arrays.asList(Arrays.asList("a","b","c"),Arrays.asList("d","e","f"),Arrays.asList("g","h","i"));

        listofList.stream().flatMap(list ->list.stream()).forEach(System.out::println);

    }


}
