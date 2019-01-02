package com.dev.lambda;

import java.util.function.Predicate;

public class PredicateTest {

    public static void main(String[] args) {

        Predicate<Integer> predicate = (number) -> number%2 == 0;
        System.out.println("Number 512 is even : " + predicate.test(512));
    }
}
