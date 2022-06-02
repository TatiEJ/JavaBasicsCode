package com.syntax.reviewclass;

import java.util.Scanner;

public class whileLoops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x=0;
		Scanner scanner=new Scanner(System.in);
		while (x!=10) {
			System.out.println("Please enter the number");
			x=scanner.nextInt();
			System.out.println(x+2);
		}
		
		
		
	}

}
