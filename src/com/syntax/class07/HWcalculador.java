package com.syntax.class07;

import java.util.Scanner;

public class HWcalculador {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Please entre the numbers");
		double x = scan.nextDouble();
		double y = scan.nextDouble();
		System.out.println("Please entre the operators + , - , * , / ");
		char opp = scan.next().charAt(0);
		double result = 0;
		
		String operator=null;
		switch (opp) {
		case '+':
			result = x + y;
			break;
		case '-':
			result = x - y;
			break;
		case '/':
			result = x / y;
			break;
		case '*':
			result=x*y;
			break;
			
			default:
				System.out.println("invalid operator");
				operator="invalid";
		}
		
		if (result != 0 || operator==null) {
			System.out.println(x + " " + opp + " "+ y +"=" + result);
		}
		scan.close();
		
		
	System.out.println(result);
	}

}
