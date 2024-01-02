package com.hijava.practice;

public class N {
	int x = 1;
	int y = 2;
	public static void main(String[] args){
		
		N n = new N();
		
		System.out.println(n.x);
		System.out.println(n.y);
		
		
		System.out.println("----------");
		
		
		n.swap();
		System.out.println(n.x);
		System.out.println(n.y);
		
	}
	
	public void swap() {
		int temp = x;
		x = y;
		y = temp;
	}
}
