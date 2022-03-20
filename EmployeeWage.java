package com.bridgelabz.EmployeeWage_UC7;

public class EmployeeWage {
	
	public static void main(String[] args) {
		System.out.println("Welcome to Employee Wage Computation Problem Part3!");
		
		int fullTime = 1;

        double empCheck = Math.floor(Math.random()*2);
        System.out.println("Random value for emp Attendence check is: "+ empCheck);

        if(empCheck == fullTime ){
            System.out.println("Employee is Present");
           }
       else{
            System.out.println("Employee is Absent");
       		}
	}     
}
 
