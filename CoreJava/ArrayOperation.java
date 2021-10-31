package com.technoelevate.CoreJava;
import java.util.Scanner;
public class ArrayOperation {
	public static void main(String[]args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter number of element");
	int length1=scan.nextInt();
	int[] arr=new int[length1];
	
	for(int i=0;i<arr.length;i++)
	{
		System.out.print("Enter "+(i+1)+" numbers: ");
		int number=scan.nextInt();
		arr[i]=number;
	}
	int countPos=0;
	int countNeg=0;
	int countEven=0;
	int countOdd=0;
	int count0=0;
	for (int i=0;i<arr.length;i++) {
		if (arr[i]>0) {
			countPos++;
		}
	}
	System.out.println("Number of positive numbers in the array : "+countPos);
	for (int i=0;i<arr.length;i++) {
		if (arr[i]<0) {
			countNeg++;
		}
	}
	System.out.println("Number of negative numbers in the array : "+countNeg);
	for (int i=0;i<arr.length;i++) {
		if (arr[i]%2==0) {
			countEven++;
		}
	}
	System.out.println("Number of even numbers in the array : "+countEven);
	for (int i=0;i<arr.length;i++) {
		if (arr[i]%2!=0) {
			countOdd++;
		}
	}
	System.out.println("Number of odd numbers in the array : "+countOdd);
	for (int i=0;i<arr.length;i++) {
		if (arr[i]==0) {
			count0++;
		}
	}
	System.out.println("Number of 0s in the array : "+count0);
	}
 }




