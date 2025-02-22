package com.test.samples;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SampleTest {

    public static void main(String[] args) {
List<String> stringList = Arrays.asList("apple","","Banana","orange","","Grapes","","Pineapple");

List<Integer> intList =Arrays.asList(1,3,7,9,12,15,1,3,5);
        List<Integer> sqList =intList.stream().distinct().map(x-> x*x).collect(Collectors.toList());





    //count empty elements
    //  long count=  stringList.stream().filter(x -> x.isEmpty()).count();

      //count length more than 3
        //long count = stringList.stream().filter(x-> x.length()>3).count();

//count elements starts with a
  //    long count=  stringList.stream().filter(x->x.startsWith("a")).count();

       List<String> neList= stringList.stream().filter(x->!x.isEmpty()).collect(Collectors.toList());
      String jList=  stringList.stream().map(x->x.toUpperCase()).collect(Collectors.joining(", "));


       System.out.println("Empty elements are        "+jList);

        System.out.println("Square List      "+sqList);



    }



    
}
