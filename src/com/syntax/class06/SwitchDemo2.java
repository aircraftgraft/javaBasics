package com.syntax.class06;

public class SwitchDemo2 {

	public static void main(String[] args) {
		
		char choice='y';
		String answer;
		
		switch (choice) {
		case 'y':
			answer="yes";
			break;
		case 'n':
			answer="no";
			break;
		case 'm':
			answer="maybe";
			break;
		default:
			answer="unknown";
			break;
		}
		
		System.out.println(answer);
		
	}

}
