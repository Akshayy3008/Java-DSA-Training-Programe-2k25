package com.mru.loops;

public class Loops {
	public static void main(String args[]) {
		int arr1[] = {100,200,300,400,500};
		int el = arr1[0];
		System.out.println("0th Index Element: "+el);
		 el = arr1[1];
		System.out.println("1th Index Element: "+el);
		 el = arr1[2];
		System.out.println("2th Index Element: "+el);
		 el = arr1[3];
		System.out.println("3th Index Element: "+el);
		 el = arr1[4];
		System.out.println("4th Index Element: "+el);
		System.out.println("The length of the array: "+arr1.length);
		for(int i=0;i<arr1.length;i++) {
			System.out.print(arr1[i]+" ");
		}
		System.out.println();
		int j =0;
		while(j<arr1.length) {
			System.out.print(arr1[j]+" ");
			j++;
		}
		System.out.println();
		int x =0;
		do {
			System.out.print(arr1[x]+" ");
			x++;
		}
		while(j<arr1.length);
		System.out.println();
		for(int i:arr1) {
			System.out.print(i+" ");
		}
		System.out.println();
	}
}
