package com.test.today;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class JEXSFMap {
    public static void main(String[] args) {

        List<List<String>> listofLists= Arrays.asList(Arrays.asList("one","two"),Arrays.asList("Three","Four"));
       List<String> strcolection = listofLists.stream().flatMap(Collection::stream).collect(Collectors.toList());


       System.out.println(strcolection);

    }
}
