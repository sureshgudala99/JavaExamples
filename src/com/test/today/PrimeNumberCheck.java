package com.test.today;

import java.util.stream.IntStream;

public class PrimeNumberCheck {

    public static void main(String[] args) {

        IntStream.rangeClosed(2,100).filter(PrimeNumberCheck::isPrime).forEach(System.out::println);

    }

    public static boolean isPrime(int number)

    {
        if(number==1)
            return false;
        for(int i=2;i<=number/2;i++) {
            if (number % i == 0) {
                return false;

            }
        }
        return true;

        }


}
