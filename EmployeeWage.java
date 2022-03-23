package com.bridgelabz.EmployeeWage_UC7;

public class EmployeeWage {
	//declared global variables
	public static final int FULL_TIME = 1;
	public static final int PART_TIME = 2;
	public static final int EMP_WAGE_PER_HR = 20;
	
	//method: employee wage calculation	
		public static void empWageComputation(String company, int empWagePerHr, int workingDayPerMonth, int maxHrsInMonth){
			//variables initialization
			 int empHrs = 0, empWage = 0, totalEmpWage = 0, totalEmpHrs = 0, totalWorkingDays = 1 ;

			  //check total emp hour not more than 100 and total days not more than 20
			    while (totalEmpHrs <= maxHrsInMonth && totalWorkingDays <= workingDayPerMonth){
			    
			        double empCheck = Math.floor(Math.random()*3);
			        System.out.println("Random value for emp Attendence check is: "+empCheck);
			
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
			        
			    //calculate total emp hours
	                    totalEmpHrs += empHrs;
			    System.out.println("Day : "+ totalWorkingDays +" Emp Hrs : "+empHrs);
		    	   //day increment by 1 every iteration
		       	    totalWorkingDays++ ;
			}
			 // calculate total emp wage
			  totalEmpWage = totalEmpHrs * empWagePerHr;
		      	  System.out.println("Total Hours workdone by Employee in month is: "+company +" " + totalEmpHrs); 
		          System.out.println("Employee Daily Wage is: " +company +" " +totalEmpWage );
		}
	
	public static void main(String[] args) {
		System.out.println("Welcome to Employee Wage Computation Problem Part3!");
		
		//method call
		EmployeeWage empWageComputation = new EmployeeWage();
		empWageComputation.empWageComputation("D-MART", 25, 5, 25);
		empWageComputation.empWageComputation("Vijay Sales", 25, 15, 25);
   }     
}
 
