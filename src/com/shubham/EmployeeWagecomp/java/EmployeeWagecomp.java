package com.shubham.EmployeeWagecomp.java;

import java.util.Random;

public class EmployeeWagecomp {

	public static void main(String[] args) {

		int attendance = 0;
		int dailywage =0;
		int employee_type = 0;
		int WAGE_PER_HR = 20;
		int FULL_TIME_HR = 8;
		int PART_TIME_HR = 4;
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
			employee_type = random.nextInt(9) % 2;
		   if(employee_type == 0)
		   {
			   dailywage = PART_TIME_HR * WAGE_PER_HR;
			   System.out.println("Employee is part_time");
				
			}
		   else
		   {
			 dailywage = FULL_TIME_HR * WAGE_PER_HR;
			 System.out.println("Employee is full_time");
			
		   }
		   System.out.println("dailywage="+dailywage);
		}
	}	
}
