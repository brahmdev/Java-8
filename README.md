README.md

## Java8 New features:

1. Lambda Expression
2. Functional Interface
3. Default and static  method
4. Predefined Functional Interface
   Predicate
   Function
   Consumer
   Supplier
5. Double color operator (::)
   Method reference
   Constructor reference
6. Streams API
7. Date and Time API
8. Optional class
9. Nashorn Javascript engine

### Objective of Lambda Expression:
------------------------------------------
To enable the Functional Programming in the Java

### What is Lambda Expression:
------------------------------------------
It is an anonymous Function
1. without name
2. without return type
3. without modifier

### Poionts to Remember
------------------------------------------
* Till Java7, Java didn't support Multiple Inheritence to avoid diamond problem.
But Java8, diamond problem was introduced again because of "default" methods in Interface.

```
Interface I {
	default show() {
	 //some logic here
	}
}

Interface J {
	show();
}

Class A implements I, J {

	/*
        Diamond problem here, we need to override the show here otherwise it will give error
        */
}
```

* what if Class A also has a method show() and Class B is as below:

```
Class B extends A implements I, J {
	show(); 
        /*
        show() method from class A will be called because class has preceedence over Interfaces. ThirdRule
        */
}
```

* If a method is defined using "default" keyword in Interface and its signature is same as those one present in the Obejct class then it will give and error.

* We can declare methods as "static" from Java8 onwards.

* A Functional Interface (@FunctionalInterface) is an interface that contains only one abstract method. They can have only one functionality to exhibit.

* If one interface extends another another Functional Interface and marked as @FunctionalInterface then that interface can't have any other abstract method but can override the one which is present in the parent method
Example: 

1. InValid: <br/>
   <code>
   @FunctionalInterface
   interface A {
           public void m1();
   }

   @FunctionalInterface
   interface B extends A {
           public void m2();
   }
   </code>

2. Valid: <br/>
   <code>
   @FunctionalInterface
   interface A {
           public void m1();
   }

   interface B extends A {
           public void m2();
   }
   </code>

* Lambda Expression with Functional Interface: <br/>
  <i>Old way</i>:

  <code>
   @FunctionalInterface
   interface A {
        public void m1();
   }
   Class Demo Implements A {
        public void m1() {
                System.out.println("Old way"):
        }
   }

   Class Test {
        public static void main(String[] args) {
                A obj = new Demo();
                obj.m1();
        }
   }
  </code>

  <i>With Lamda Expression</i>
  <code>
   @FunctionalInterface
   interface A {
        public void m1();
   }
  
   Class Test {
        public static void main(String[] args) {
                A obj = () -> System.out.println("With Lambda Expression");
                obj.m1();
        }
   }
  </code>



