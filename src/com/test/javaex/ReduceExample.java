package com.test.javaex;

import java.util.Arrays;
import java.util.List;

public class ReduceExample {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

        // Using reduce to calculate the product of the elements
        int product = numbers.stream()
                .reduce(1, (a, b) -> a * b);  // Initial value 1, then multiply each element

        System.out.println("Product: " + product);
    }
}
