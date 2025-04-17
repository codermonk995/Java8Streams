package com.ms.java8.methodref.constructors;

public class Test {
	public static void main(String[] args) {

		MyInterface f1 = s -> new MyClass(s);
		f1.get("using lambdas");
		
		MyInterface f2 = MyClass::new;
		f2.get("using comstructor mapping");
	}
}
