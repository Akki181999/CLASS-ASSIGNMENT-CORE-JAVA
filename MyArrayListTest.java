package com.technoelevate.collection;

import java.util.Iterator;

public class MyArrayListTest {

	public static void main(String[] args) {
		MyArrayList arrayList =new MyArrayList(5);
		arrayList.add(10);
		arrayList.add(20);
		arrayList.add(30);
		arrayList.add(40);
		arrayList.add(50);
		arrayList.add(60);
		arrayList.add(70);
		System.out.println(arrayList.get(1));
		System.out.println(arrayList.size());
		System.out.println(arrayList);
		Iterator iterator=arrayList.iterator();
		System.out.println("=====using iterator====");
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
	}
	

}
