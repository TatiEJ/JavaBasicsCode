package com.syntax.class07;

public class whileLoopExamples {

	public static void main(String[] args) {
		// print numbers from 1 to 10
		
		int num=1;
		
		while(num<=10) {
			System.out.print(num+ " ");
			num++;
		}
		// print numbers from 1 to 10
		System.out.println();
		
		int num1=0;
		
		while(num1<=10) {
			num1++;
			System.out.print(num1+ " ");
		
		System.out.println();
		// print numbers from 10 to 100
	int a=10;
		
		while(a<=100) {
			System.out.print(a+ " ");
			a++;
		}
		System.out.println();
		// print numbers from 10 to 1
	int b=10;
		
		while(b>=1) {
			System.out.print(b+" ");
			b--;
		}
		
		System.out.println();
		// print numbers from 100 to 50
	int c=100;
		
		while(c>=50) {
			System.out.print(c+ " ");
			c--;
		}
		System.out.println();
		// print numbers from -1 to -10
	int d=-1;
		
		while(d>=-10) {
			System.out.print(d+ " ");
			d--;
		}
			
		System.out.println();
		// print numbers from 1 to 20 but only even numbers

int e=2;
		
	while (e<=20) {
		System.out.print(e+" ");
		e+=2;
		}
	
	
	// 2 way
	System.out.println();
	// print numbers from 1 to 20 but only even numbers

	int f=1;
	
	while (f <=20) {
		if (f % 2 ==0) {
			System.out.print(f+" ");	
	}
		f++;
	}
	
	}}
}
