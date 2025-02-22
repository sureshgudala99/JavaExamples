package com.test.sept;

import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FirstNonRepCharecter {

    public static void main(String[] args) {
        String input="Happy Vinayaka Chavithi";

     /*  Character ch= input.chars().mapToObj(s->Character.toLowerCase(Character.valueOf((char)s)))
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new,Collectors.counting()))
                .entrySet().stream().filter(entry->entry.getValue()>1).map(entry -> entry.getKey()).findFirst().get();
   System.out.println(ch);*/

        Set<Character> characters =new HashSet<>();

  //    Character chs=  input.chars().mapToObj(c->(char)c).filter(s-> !characters.add(s)).findFirst().orElse(null);
  //      System.out.println(chs);


    }
}
