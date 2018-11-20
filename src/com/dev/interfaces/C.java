package com.dev.interfaces;

public class C extends B implements  I, J {

    public static void main(String[] args) {
        System.out.println("main method");
        C c = new C();
        c.show();

        I.display();
    }
}



