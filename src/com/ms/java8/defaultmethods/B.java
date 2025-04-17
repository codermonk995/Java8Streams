package com.ms.java8.defaultmethods;

public class B implements A ,X{

	 public void m1() {
		System.out.println("m1 inside B");
	}
	 
//	 public void m1() {								if commented then error shows of diamond problem 
//			System.out.println("m1 inside B");
//		}
}
