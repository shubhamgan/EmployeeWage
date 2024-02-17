package com.shubham.EmployeeWagecomp.java;

import java.util.Random;

public class EmployeeWagecomp {

	public static void main(String[] args) {

		int attendance = 0;
		int dailywage =0;
		int WAGE_PER_HR = 20;
		int FULL_DAY_HR = 8;
		System.out.println("Welcome to Employee Wage computation program");
		
		Random random = new Random();
		attendance = random.nextInt(9) % 2;
		
		if(attendance == 0)
		{
			System.out.println("Employee is Absend");
		}
		else
		{
			System.out.println("Employee is present");
			dailywage = FULL_DAY_HR * WAGE_PER_HR;
			System.out.println("Dailywage="+dailywage);
		}
	}	
}
