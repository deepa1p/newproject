package org.cap.List;

import java.util.LinkedList;
import java.util.List;

public class Linked1 {
	public static void main(String[] args) {
		
		
		List<Integer> li=new LinkedList<>();
		li.add(100);
		li.add(200);
		li.add(300);
		li.add(400);
		li.add(500);
		li.add(600);
		li.add(700);
		
		//int s=li.size();
		//System.out.println(s);
//		
//		for (int i = 0; i <li.size(); i++) {
//			
//			System.out.println(li.get(i));
//		}
		
		
		for (Integer x : li) {
			System.out.println(x);
			
		}
	}

}
