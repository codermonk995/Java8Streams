package com.ms.java8.lambdas.anonymous;

public class Test {
	
	public static void main(String[] args) {
		
		/*Thread t = new Thread(new Runnable() {

			@Override
			public void run() {
				for(int i =1 ; i<= 10 ; i++) {
					System.out.println("child thread");
				}
			}
		});*/
		
		//using lambda
		Thread t = new Thread(()->{
			for(int i =1 ; i<= 10 ; i++) {
				System.out.println("child thread");
			}
		});
			
		t.start();
		
		for(int i=1; i<=10 ; i++) {
			System.out.println("Main Thread");
		}
	}

}
