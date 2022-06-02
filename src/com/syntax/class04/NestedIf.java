package com.syntax.class04;

public class NestedIf {

	public static void main(String[] args) {
		
		boolean vaccine=false;
		int dose=1;
		
		if (vaccine) {
			System.out.println("Let me check how many doses you have");
		
		if (dose==1) {
			System.out.println("you need 1 more short");
		}else {
			System.out.println("you are fully vacinated");
		}
				
		}
		System.out.println("--------------------------");
		
		String month="June";
		int day=30;
		
		if (month.equals("May")) {
			System.out.println("let me check day in May");
		if (day==8) {
			System.out.println("Today es the Mother's day");
		}
		}else if (month.equals("June")) {
			System.out.println("let me check what is today's date");
			if (day==19) {
				System.out.println("Today is a Father's Day");
			}
			if (day==30) {
				System.out.println("Happy Birthday Mi Amor");
			}
		
		
		
	}
	}}
