README.md

#Java8 New features:

1) Functional Programming
2) Lamda Expressions
3) Streams API
4) Mehtod in Interface

* Till Java7, Java didn't support Multiple Inheritence to avoid diamond problem.
But Java8, diamond problem was introduced again because of "default" methods in Interface.

Interface I {
	default show() {
	 //some logic here
	}
}

Interface J {
	show();
}

Class A implements I, J {

	//Diamond problem here, we need to override the show here otherwise it will give error
}

what if Class A also has a method show() and Class B is as below:

Class B extends A implements I, J {
	show(); //show() method from class A will be called because class has preceedence over Interfaces. ThirdRule
}

* If a method is defined using "default" keyword in Interface and its signature is same as those one present in the Obejct class then it will give and error.

* We can declare methods as "static" from Java8 onwards.

