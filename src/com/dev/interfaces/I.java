package com.dev.interfaces;

public interface I {

    default void show() {
        System.out.println("Interface I");
    }

    static void display() {
        System.out.printf("\nin display");
    }
}


