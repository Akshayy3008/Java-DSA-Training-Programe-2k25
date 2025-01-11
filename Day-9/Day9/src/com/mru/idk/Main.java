package com.mru.idk;

public class Main {
	public static void main(String agrs[]) {
		Adapter a = new Adapter();
		Test1 t1 =a.getinstance();
		Test2 t2 = a.getinstancee();
		Test11 t3 = a.getinstanceee();
		System.out.println(t1.msg);
		System.out.println(t2.msg);
		System.out.println(t3.msg);
		t3.m1();
		t1.m1();
		t2.m1();
		
		
		
	}
}
