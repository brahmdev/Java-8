package com.dev.lambda;

interface I {
    void show();
}

/*class Test implements I{

    @Override
    public void show() {
        System.out.println("in show of test implementation");
    }
}*/
public class LambdaExpression {

    public static void main(String[] args) {
        System.out.println("main method");

/*      I i = new Test();
        i.show();*/

/*        I i = new I() {
            public void show() {
                System.out.println("in anonymous class");
            }
        };

        i.show();*/

        I i = () -> System.out.println("Lambda Expression");
        i.show();
    }

}

