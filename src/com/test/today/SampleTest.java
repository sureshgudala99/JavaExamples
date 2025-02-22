package com.test.today;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class SampleTest {

    public static void main(String[] args) {

        String name ="SureshGudala";

      Character ch=  name.chars().mapToObj(c->(char)c).collect(Collectors.groupingBy(Function.identity(),
                LinkedHashMap::new,Collectors.counting())).entrySet().stream().filter(entry->entry.getValue()==1).map(Map.Entry::getKey).skip(2).findFirst().orElse(null);

        if(ch!=null)

        {
            System.out.println(ch);
        }



    }
}
