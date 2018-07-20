package com.java.lambda.expression;

public class LambdaExpWithRunnable {
	
	public static void main(String[] args) {
		
		//Using Annonymous
		Runnable runnable = new Runnable() {		
			@Override
			public void run() {
				
				System.out.println("Inside Runnabe");
				
			}
		};
		
		runnable.run();
		
		//Using Labda
		Runnable runnable2 = ()->{
			System.out.println("Using lambda runnable");
		};
		
		runnable2.run();
		
	}

}
