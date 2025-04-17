package com.ms.lambdas.java8.basics;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//A a = new C();
		A a = ()->System.out.println("inside Mymethod");
		a.myMethod();

	}

}
