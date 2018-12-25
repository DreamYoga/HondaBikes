package com.hondabikes.employee;

import java.util.Date;

import com.hondabikes.address.Address;

public class EmployeeDetails {
	
	private String employeeName;
	private String employeeId;
	private Address employeeAddress;
	private double salary;
	private Date joinDate;
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public String getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}
	public Address getEmployeeAddress() {
		return employeeAddress;
	}
	public void setEmployeeAddress(Address employeeAddress) {
		this.employeeAddress = employeeAddress;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public Date getJoinDate() {
		return joinDate;
	}
	public void setJoinDate(Date joinDate) {
		this.joinDate = joinDate;
	}
	public EmployeeDetails(String employeeName, String employeeId,
			Address employeeAddress, double salary, Date joinDate) {
		super();
		this.employeeName = employeeName;
		this.employeeId = employeeId;
		this.employeeAddress = employeeAddress;
		this.salary = salary;
		this.joinDate = joinDate;
	}
	public String toString() {
		return "EmployeeDetails [employeeName=" + employeeName
				+ ", employeeId=" + employeeId + ", employeeAddress="
				+ employeeAddress + ", salary=" + salary + ", joinDate="
				+ joinDate + "]";
	}
	
	
	
	
	

}
