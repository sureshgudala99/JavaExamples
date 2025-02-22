package com.test.dtst;

import java.util.Scanner;

public class PerfectNumber {

    public static void main(String[] args)
    {
            int n =6;

        isPerfect(n);
        System.out.println(n + " is a perfect number");
    }

    static boolean isPerfect(int n)
    {
        if (n==1)
            return false;
        int sum=1;
        for(int i=2;i<n;i++) {
            if (n % i == 0) {
                sum += i;
            }
        }
        if(sum ==n)
        return true;
        return false;
        }
    }



