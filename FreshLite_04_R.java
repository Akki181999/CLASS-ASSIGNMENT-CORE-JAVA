package com.advancedjava.multithreading.Assignment;


public class FreshLite_04_R implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("REACT STUDENT");
		Thread.currentThread().setPriority(2);
		System.out.println("FreshLite04_(J) Priority "+Thread.currentThread().getPriority());
	}
	

}
