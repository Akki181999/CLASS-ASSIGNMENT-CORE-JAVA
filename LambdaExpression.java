package com.advancedjava.multithreading.Assignment;

public class LambdaExpression {
	public static void main(String[] args) {
		Runnable runnable1=()->{
			for(int i=1;i>=10;i++) {
				System.out.println("1st thread");
			}
		};
		Runnable runnable2=()->{
			for(int i= 1;i>=10;i++) {
				System.out.println("1st thread");
			}
		};
		Thread thread=new Thread(runnable1);
		Thread thread1=new Thread(runnable2);
		thread.start();
		thread1.start();
		thread.setName("Name");
		System.out.println(thread.getName());
		thread1.setName("AKSHAY JOSHI");
		System.out.println(thread1.getName());
	}
}
