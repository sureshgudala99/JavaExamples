package com.test.dtst;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class FindIFDuplicates {

    public static Boolean findDuplicates(int[] nums)
    {
    List<Integer> list   = Arrays.stream(nums).boxed().collect(Collectors.toList());

        Set<Integer> intSet= new HashSet<>(list);
        if(intSet.size()==list.size())
        {
            return false;
          }
        return true;



    }

    public static void main(String[] args) {

        int[] ints =new int[]{1,2,3};
       Boolean b= findDuplicates(ints);
       System.out.println(b);

    }
}
