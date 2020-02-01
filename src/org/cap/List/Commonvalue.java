package org.cap.List;

import java.util.ArrayList;
import java.util.List;

public class Commonvalue {
	public static void main(String[] args) {
		
		List<Integer> li=new ArrayList<>();
		
		li.add(10);
		li.add(20);
		li.add(30);
		li.add(40);
		li.add(50);
		li.add(60);
		li.add(70);
		li.add(80);
		
		List<Integer> si=new ArrayList<>();
		si.addAll(li);
		
		si.add(10);
		si.add(20);
		si.add(60);
		si.add(50);
		si.add(40);
		si.add(70);
		si.add(80);
		si.add(90);
					
//		si.add(100);
//		si.add(200);
//		si.add(300);
//		si.add(400);
//		si.add(500);
//		si.add(600);
//		si.add(700);
//		si.add(8000);
		
		si.retainAll(li);
		System.out.println(si);
	}

}
