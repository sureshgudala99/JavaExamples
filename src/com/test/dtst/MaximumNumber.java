package com.test.dtst;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class MaximumNumber {

    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(2,4,6,10,15,1,9,35);
       Optional<Integer> max= numbers.stream().max(Integer::compareTo);

       if (max.isPresent())

       {
           System.out.println("Maximum Number: "+ max);
       }
       else
       {
           System.out.println("No Maximum Number Found");
       }

    }
}
