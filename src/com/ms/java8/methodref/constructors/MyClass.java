package com.ms.java8.methodref.constructors;

public class MyClass {
	
	private String s ;
	
	
	MyClass(String s){
		this.s = s;
		System.out.println("inside the constructors: "+s);
	}
}
