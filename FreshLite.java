package com.advancedjava.multithreading.Assignment;

public class FreshLite {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		FreshLite_03_J freshLite_03_J=new FreshLite_03_J();
		freshLite_03_J.start();
		freshLite_03_J.setName("FreshLite Java(03)");
		System.out.println(freshLite_03_J.getName());
		freshLite_03_J.setPriority(7);
		System.out.println("FreshLite_03(J) priority "+freshLite_03_J.getPriority());
		FreshLite_04_R freshLite_04_R=new FreshLite_04_R();
		Thread thread=new Thread(freshLite_04_R);
		Thread.currentThread().setName("Main Method");
		System.out.println(Thread.currentThread().getName());
		System.out.println("Main Method Priority "+Thread.currentThread().getPriority());
		thread.start();
		
		
		
		 
	}

}
