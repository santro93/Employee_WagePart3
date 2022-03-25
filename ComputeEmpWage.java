package com.bridgelabz.EmployeeWage_UC7;

public interface ComputeEmpWage {
	public void addCompanyEmpWage(String company, int empRatePerHr, int numOfWorkingDays, int maxHrsPerMonth);
	void empWageCalculation();
}
