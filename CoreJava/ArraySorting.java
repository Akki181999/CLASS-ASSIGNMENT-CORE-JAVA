package com.technoelevate.CoreJava;

import java.util.Arrays;

public class ArraySorting {

	public static void main(String[] args) {
		String[] arr= {"Java", "Python", "PHP", "C#", "C Programming", "C++"};
		Arrays.sort(arr);
		System.out.print("[");
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]);
			if(i==arr.length-1)
			{}
			else
				System.out.print(" , ");
		}
		System.out.println("]");
	}

}
