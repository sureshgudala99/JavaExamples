package com.test.samples;

import java.util.Arrays;

public class KthSmallestElement {

    public static void main(String[] args) {

        int[] array = {4,2,5,8,9,11,10};
        int k=3;

        int kthElement =Arrays.stream(array).sorted().skip(k-1).findFirst().orElse(-1);
        System.out.println(kthElement);
    }
}
