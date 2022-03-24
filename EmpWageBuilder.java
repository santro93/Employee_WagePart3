package com.bridgelabz.EmployeeWage_UC7;

public class EmpWageBuilder {

	public static final int IS_FULL_TIME = 1; 
	public static final int IS_PART_TIME = 2; 
	

	private final String company;
	private final int empRatePerHr;
	private final int numOfWorkingDays;
	private final int maxHrsPerMonth;
	private int totalEmpWage;
	
	public EmpWageBuilder(String company, int empRatePerHour, int numOfWorkingDays, int maxHrsPerMonth) {
		this.company = company;
		this.empRatePerHr = empRatePerHour;
		this.numOfWorkingDays = numOfWorkingDays;
		this.maxHrsPerMonth = maxHrsPerMonth;
	}
	
	public void empWageCalculation() {
		int totalEmpHour = 0;
		int empHour = 0;
		int totalWorkingDays = 0;
		
		while(totalEmpHour <= maxHrsPerMonth && totalWorkingDays <= numOfWorkingDays) {
			totalWorkingDays++;
			int empCheck = (int) Math.floor(Math.random() * 10) % 3;
			switch(empCheck) {
			case IS_FULL_TIME:
				empHour = 8;
				break;
				
			case IS_PART_TIME:
				empHour = 4;
				break;
				
			default:
				empHour = 0;		
			}
			totalEmpHour += empHour;
		}
		totalEmpWage = totalEmpHour * empRatePerHr;	
	}
	
	@Override
	public String toString() {
		return "[Total Employee Wage for Company " + company + " is: " + totalEmpWage + "]";
	}

	public static void main(String[] args) {
		System.out.println("Welcome to Employee Wage Computation");
		EmpWageBuilder dMart = new EmpWageBuilder("D-Mart", 24, 30, 150);
		dMart.empWageCalculation();
		System.out.println(dMart);
		EmpWageBuilder vijaySales = new EmpWageBuilder("vijay Sales", 20, 30, 200);
		vijaySales.empWageCalculation();
		System.out.println(vijaySales);
		EmpWageBuilder relianceMart = new EmpWageBuilder("Reliance Mart", 22, 30, 300);
		relianceMart.empWageCalculation();
		System.out.println(relianceMart);
	}
}