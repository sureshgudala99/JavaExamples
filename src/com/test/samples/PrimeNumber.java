package com.test.samples;

import java.util.Arrays;
import java.util.List;

public class PrimeNumber {

    public void main(String[] args) {

       List<Integer> numbers= Arrays.asList(2,4,6,8,10,12,14);
       boolean containPrime= numbers.stream().anyMatch(this::isPrime);

        System.out.println("List contains a prime number: " + containPrime);



}

    public boolean isPrime(int num)
    {
        if(num <=1)
        {
            return false;
        }

        for(int i=2; i<=Math.sqrt(num); i++)
        {
            if(num%i==0)
            {
                return false;
            }

        }
        return true;
    }

}
