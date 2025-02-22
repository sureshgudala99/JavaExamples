package com.test.dtst;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;



public class CorrectFlatMapExample {

    List<String> stringList = Arrays.asList("Java world","Welcome to Streams");

    List<String> words =  stringList.stream().flatMap(sentence -> Arrays.stream(sentence.split(" "))).collect(Collectors.toList());


}
