package com.syntax.class09;

public class AllValuesfromArray {

	public static void main(String[] args) {
		
		char[] grade= {'A', 'B', 'C','D','E','F'};
		//how many elements inside array?
		
		int size=grade.length;
		System.out.println("Numbers of elements is "+size);
		
		
		for(int i=0; i<size; i++) {
		System.out.println(grade[i]);
		}
		
	}

}
