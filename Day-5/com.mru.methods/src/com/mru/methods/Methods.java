package com.mru.methods;

public class Methods {
public void leetCode() {
	System.out.println("welcome to leetCode");
}
public void codeChef(String name) {
	System.out.println("welcome to"+name);
}
public String hackerRank() {
	return "Bye Bye!!!";
}
public static void main(String args[]) {
	Methods obj = new Methods();
	obj.leetCode();
	obj.codeChef("Codechef");
	System.out.print(obj.hackerRank());
}
}
