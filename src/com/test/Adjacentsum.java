package com.test;

public class Adjacentsum {

    public static void main(String[] args) {

        int[] arr ={2,7,9,3,1};
        int maxsum=finMaxSum(arr);


    }

    private static int finMaxSum(int[] arr)

    {
        int maxsum=Integer.MIN_VALUE;

        for(int i =0;i<arr.length-1;i++)
        {

            int sum =arr[i+2];
            maxsum =Math.max(maxsum,sum);
        }

        return maxsum;
    }
}
