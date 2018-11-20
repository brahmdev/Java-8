package com.dev.interfaces;

public class A implements  I, J {

    @Override
    public void show() {
        System.out.printf("Class A");
    }

    public static void main(String[] args) {
        System.out.println("main method");
        A a = new A();
        a.show();
    }
}
