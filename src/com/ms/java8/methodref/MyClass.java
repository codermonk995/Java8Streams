package com.ms.java8.methodref;

public class MyClass {
	
	public void mymethod123(int i) {
		System.out.println(i);
	}
	
	public static void main(String[] args) {

		MyInterface f = i->System.out.println(i);
		f.myMethod(10);
		
		MyClass c = new MyClass();
		MyInterface i = c::mymethod123;
		i.myMethod(20);
		
	}

}
