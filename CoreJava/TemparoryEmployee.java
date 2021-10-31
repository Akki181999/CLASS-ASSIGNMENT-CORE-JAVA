package com.technoelevate.CoreJava;

public class TemparoryEmployee extends HybridInheritanceEmployee{
	double hike = 0.35;
	void incrementSalary(){
	super.Salary();
	System.out.println("The Temporary Employee incremented salary is :" +(salary+(salary * hike)) );
	}
}
