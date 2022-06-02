package com.syntax.class05;

import java.util.Scanner;

public class TaskDmv {

	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Please Enter your age");
		int age=scan.nextInt();
		
		if (age>=18) {
			System.out.println("Issue a drifer license");
		} else {
			System.out.println("we will offer you a learner's permit");
		}
	}

}
