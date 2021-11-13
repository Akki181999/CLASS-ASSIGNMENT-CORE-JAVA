package com.technoelevate.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayListDemo {
	public static void main(String[] args) {
		ArrayList arrayList = new ArrayList();
		arrayList.add(10);
		arrayList.add(20);
		arrayList.add(30);
		System.out.println(arrayList);
		System.out.println("=======using for loop====");
		for (int i = 0; i < arrayList.size(); i++) {
			System.out.println(arrayList.get(i));
		}
		System.out.println("======using for each loop");
		for (Object object : arrayList) {
			System.out.println(object);
		}
		System.out.println("============using Iterator and iterator()====");
		Iterator iterator = arrayList.iterator();
		while (iterator.hasNext()) {
		System.out.println(iterator.next());
		}		
		System.out.println("=======using ListIterator forward print==============");
        ListIterator iterator2=arrayList.listIterator();
        while(iterator2.hasNext()) {
        	System.out.println(iterator2.next());
        }
        System.out.println("=========using ListIterator backward print=========");
        ListIterator iterator3=arrayList.listIterator(arrayList.size());//overloaded method
		while (iterator3.hasPrevious()) {
			System.out.println(iterator3.previous());
			
		}
			
		}
			
			
		
		
	}

