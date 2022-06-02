package com.syntax.class07;

import java.util.Scanner;

public class LoopWithScanner {

	public static void main(String[] args) {
		/*
		 * we are going to ask you if you got a job
		 * we will continuosly asking if you get a job intil you say yes!
		 * 
		 * once you ---> congratulations
		 */

		
		Scanner scan = new Scanner (System.in);
		String job;
		
		System.out.println("Did you get a job");
		job=scan.nextLine();
		
		do {
			System.out.println("Did you get a job");
			job=scan.nextLine();
		}while(!job.equalsIgnoreCase("yes"));
		
		System.out.println("congratulations");
		
		
		System.out.println("-----------------------");
		
		Scanner input=new Scanner(System.in);
		String offer;
		
		System.out.println("Did you get a job");
		offer=input.nextLine();
		
		while(!offer.equalsIgnoreCase("yes")) {
			System.out.println("did you get a job");
			offer= input.nextLine();
		}
		System.out.println("congrats");
		
	}

	private static void While(boolean b) {
		// TODO Auto-generated method stub
		
	}
		
		
	}


