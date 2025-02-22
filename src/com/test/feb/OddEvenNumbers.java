package com.test.feb;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class OddEvenNumbers {

    public static void main(String[] args) {
      List<Integer> intList=  Arrays.asList(12,1,3,6,8,7,10,9,4,5);

        Map<Boolean,List<Integer>> oddeveMap= intList.stream().collect(Collectors.partitioningBy(i-> i%2==0));

        Set<Map.Entry<Boolean,List<Integer>>>  oeSet= oddeveMap.entrySet();



        for(Map.Entry<Boolean,List<Integer>> entry:oeSet)
        {
            System.out.println("--------------");

            if (entry.getKey()==true)
            {
                System.out.println("Even Numbers");
            }
            else
            {
                System.out.println("Odd Numbers");
            }

            System.out.println("--------------");

            List<Integer> list = entry.getValue();

            for (int i : list)
            {
                System.out.println(i);
            }

        }


    }
}
