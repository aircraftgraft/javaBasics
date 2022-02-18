package com.syntax.class06;

import java.util.Scanner;

public class Task {

	public static void main(String[] args) {
		
		/* ask user to enter their country and capture it.
		 * Once values are csptured print which language user speaks.
		 */
		
		Scanner in=new Scanner(System.in);
		
	System.out.println("Please indicate your country");
	
	String country=in.next();
	String language=null;
	
	switch (country.toLowerCase()) {
	case "usa": 
		language="english";
		break;
	case "russia":
		language="russian";
		break;
	case "india":
		language="hindu";
		break;
	default:
		language="unknown";
		
	}
	in.close();
	System.out.println("In "+country+" people speak "+language);
	
	}

}
