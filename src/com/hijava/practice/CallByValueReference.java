package com.hijava.practice;

public class CallByValueReference {
	int m = 2;
	
	public static void main(String[] args) {
		
//		int i = 1;
//		System.out.println("i=" + i);
//		
//		change1(i);
//		System.out.println("i=" + i);
		
		CallByValueReference cb1 = new CallByValueReference();
		
		
	}
	
	public static void change1(int x) {
		System.out.println("x+" + x);
		x = 100;
	}
	public static void change2(CallByValueReference cb) {
		cb.m = 100;
	}	

}
