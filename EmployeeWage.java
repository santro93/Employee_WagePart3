package com.bridgelabz.EmployeeWage_UC7;

public class EmployeeWage {
	
	public static void main(String[] args) {
		System.out.println("Welcome to Employee Wage Computation Problem Part3!");
		
		int fullTime = 1;
		int empWagePerHr = 20;
	    int empHrs = 0;
	    int empWage = 0; 
	    
        double empCheck = Math.floor(Math.random()*2);
        System.out.println("Random value for emp Attendence check is: "+ empCheck);

        if(empCheck == fullTime ){
            System.out.println("Employee is Present.");
            empHrs = 8;
           }
        else{
            System.out.println("Employee is Absent.");
            empHrs = 0;
       		}
        
        empWage = empHrs*empWagePerHr;
        System.out.println("Employee Daily Wage is: "+empWage );
	}     
}
 
