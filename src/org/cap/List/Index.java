package org.cap.List;

import java.util.ArrayList;
import java.util.List;

public class Index {

	public static void main(String[] args) {
		
		
		List<Integer> li=new ArrayList<>();
		
		li.add(10);
		li.add(20);
		li.add(30);
		li.add(90);
		li.add(10);
		li.add(10);
		li.add(40);
		li.add(50);
		 
		li.add(1000);
		
		int i=li.indexOf(50);
		System.out.println(i);
		
		int j=li.indexOf(90);
		System.out.println(j);
		
		int k=li.indexOf(10);
		System.out.println(k);
		
		
		Integer m=li.get(2);
		System.out.println(m);
		
		Integer n=li.get(4);
		System.out.println(n);
		
	
		Integer o=li.get(8);
		System.out.println(o);
		
		
		
	}
	
}
