package com.dev.lambda;

import java.util.function.Function;

public class FunctionTest {

    public static void main(String[] args) {

        Function<Integer,Integer> function = (i) -> i*i;
        System.out.println("The square of 4 is : " + function.apply(4));
    }
}
