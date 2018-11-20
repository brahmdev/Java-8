package com.dev.lambda;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

public class ForEachTest {

    public static void main(String[] args) {
        System.out.println("main method");

        List<Integer> values = Arrays.asList(1,2,3,4,5,6,7,8,9);

        for (int i = 0 ; i < values.size(); i++) {
            System.out.println("Index based looping: "+ values.get(i));
        }

        for (int i : values) {
            System.out.println("Enhanced for loop: " + i);
        }

        values.forEach(i -> {
            System.out.println("forEach using Lambda Expression: " + i);
        });

    }
}
