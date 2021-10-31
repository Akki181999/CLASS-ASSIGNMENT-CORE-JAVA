package com.technoelevate.CoreJava;

public class MultipleInheritance implements MultipleInterfaceParent,MultipleInheritanceParentSecond {

	@Override
	public void display1() {
		System.out.println("METHOD FROM PARENTSECOND");
		
	}

	@Override
	public void show() {
		System.out.println("METHOD FROM PARENT");
		
	}

	@Override
	public void display(int a) {
		a=1000;
		System.out.println(a);
		
	}
	}


