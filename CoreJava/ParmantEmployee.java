package com.technoelevate.CoreJava;

public class ParmantEmployee extends HybridInheritanceEmployee{
	double hike = 0.5;
	void incrementSalary(){
	super.Salary();
	System.out.println("The Permanent Employee incremented salary is :" +(salary+(salary * hike)) );
	}
}
