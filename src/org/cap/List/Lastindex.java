package org.cap.List;

import java.util.ArrayList;
import java.util.List;

public class Lastindex {

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
		
		
		int i=li.lastIndexOf(10);
		System.out.println(i);
		
//		li.remove(2);
//		System.out.println(li);
		
//		li.remove(10);
//		System.out.println(li);
		
		
		li.remove(5);
		System.out.println(li);
		
		li.add(2,50);
		System.out.println(li);
		
		
		li.add(70);
		System.out.println(li);
		
		
		li.add(8,80);
		System.out.println(li);
		
		li.add(100);
		System.out.println(li);
		
		
		
		li.set(0, 100);
		li.set(4, 100);
		li.set(5, 100);
		System.out.println(li);
		
		
		
	}
}
