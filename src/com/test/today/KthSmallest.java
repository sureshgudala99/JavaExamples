package com.test.today;

import java.util.Arrays;

public class KthSmallest {

    public static int kthSmallest(int[] arr,int k)
    {
        Arrays.sort(arr);
        return arr[k-1];
    }


    public static void main(String[] args) {
        int[] arr ={12,3,4,6,7,8,9};
        int k=3;

        System.out.println("kth smallest element is " + kthSmallest(arr,k));


    }
}
