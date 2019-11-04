package com.java.arraylist;

import java.util.ArrayList;

public class ArrayList1 {
	public static void main(String[] args) {
		ArrayList<Integer> als=new ArrayList<>();
		als.add(500);
		als.add(200);
		als.add(300);
		als.add(1000);
		als.add(900);
		
		ArrayList<Integer> als2=new ArrayList<>();
		als2.add(400);
		als2.add(300);
		als2.add(600);
		als2.add(2000);
		als2.add(900);
		
		//System.out.println(als);
		System.out.println(als.size());
		//System.out.println(als.get(5));
		System.out.println((als.remove(Integer.valueOf(500))));
		System.out.println(als);
		System.out.println(als2);
		System.out.println(als.addAll(als2));
		System.out.println(als.retainAll(als2));
		System.out.println(als);
		System.out.println(als.equals(als2));
		System.out.println(als.removeAll(als2));
		System.out.println(als);
		System.out.println();
		 
	}

}
