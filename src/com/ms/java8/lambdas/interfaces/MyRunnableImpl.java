package com.ms.java8.lambdas.interfaces;

public class MyRunnableImpl implements Runnable {

	@Override
	public void run() {
		for(int i=1;i<10;i++) {
			System.out.println("child Thread");
			
		}
	}

}
