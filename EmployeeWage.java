package com.bridgelabz.EmployeeWage_UC7;

public class EmployeeWage {
	public static final int FULL_TIME = 1;
	public static final int PART_TIME = 2;
	public static final int EMP_WAGE_PER_HR = 20;
	
	public static void main(String[] args) {
		System.out.println("Welcome to Employee Wage Computation Problem Part3!");
		
		
	    int empHrs = 0;
	    int empWage = 0; 
	    
        double empCheck = Math.floor(Math.random()*3);
        System.out.println("Random value for emp Attendence check is: "+ empCheck);

        switch ((int)empCheck){
		        case FULL_TIME:
		        	System.out.println("Employee is present Full Time");
		        	empHrs = 8;
		       				break;
		       
		        case PART_TIME:
		       		System.out.println("Employee is present Part Time");
		       		empHrs = 4;
		       				break;
		  
		        default:
		        	System.out.println("Employee is Absent");
		        	empHrs = 0;	
		  }
        empWage = empHrs*EMP_WAGE_PER_HR;
        System.out.println("Employee Daily Wage is: "+empWage );
	}     
}
 
