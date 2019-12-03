package com.lambda;

public class LambdaWithThread {

	public static void main(String[] args) {
		Runnable r1 = () -> System.out.println(" Hello world thread using lambda !!!!!!!");

		Thread t1 = new Thread(r1);

		t1.start();
	}
}
