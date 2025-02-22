package com.test.samples;

public class MissingNumber {

    public static void main(String[] args) {

        int[] nums = {3,0,1,5,2,6,4};

        int missingnumber = findMissingNumber(nums);

        System.out.println("The missing number"+missingnumber);

    }

    private static int findMissingNumber(int[] nums) {
int n = nums.length;
int expectedsum = n*(n+1)/2;

int actualsum=0;

for(int num:nums)
{
    actualsum+=num;
}

return expectedsum-actualsum;


    }
}
