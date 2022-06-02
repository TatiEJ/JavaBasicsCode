package com.syntax.reviewclass03;

public class IfElse2 {

	public static void main(String[] args) {
		
		String day="Friday";
		if (day.equals("Monday")) {
			System.out.println("weekday");
		}else if("Tuesday".equals(day)) {
			System.out.println("weekday");
		}else if("Wednesday".equals(day)) {
			System.out.println("weekday");
		}else if("Thursday".equals(day)) {
			System.out.println("weekday");
		}else if("Friday".equals(day)) {
			System.out.println("weekday");
		}else if("Saturday".equals(day)) {
			System.out.println("weekend");
		}else if("Sunday".equals(day)) {
			System.out.println("weekend");
		}
		if (day.equals("Monday")||"Tuesday".equals(day)||
				"Wednesday".equals(day)||"Thursday".equals(day)||"Friday".equals(day)){
			{
				System.out.println("weekend");
			}
		}
	
		}
	}


