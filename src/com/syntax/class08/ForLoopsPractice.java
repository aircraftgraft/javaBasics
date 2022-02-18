package com.syntax.class08;

public class ForLoopsPractice {

	public static void main(String[] args) {
		
		for(int i=1; i<=3; i++) {
			System.out.println("Hello "+i);
		}
		
		System.out.println("multiplication table");
		
		int num=7;
		int result;
		
		for(int i=1; i<=10; i++) {
			result=num*i;
			System.out.println(num+" x "+i+" = "+result);
		}
		
		System.out.println("WHAT IS THE OUTPUT");
		
		int sum=0;
		
		for(int i=1; i<=5; i++) {
			sum+=i;
			System.out.println(sum);
		}
		
	}

}
