package com.hondabikes.address;

public class EmployeeAddress extends Address{
	
	private String employeeName;
	private String employeeHouseNo;
	private String ApartmentName;
	private String employeeStreetName;
	public String toString() {
		return "EmployeeAddress [employeeName=" + employeeName
				+ ", employeeHouseNo=" + employeeHouseNo + ", ApartmentName="
				+ ApartmentName + ", employeeStreetName=" + employeeStreetName
				+ "]";
	}

	public EmployeeAddress(String streetName, String landMark, String laneNo,
			long pin, String employeeName, String employeeHouseNo,
			String apartmentName, String employeeStreetName) {
		super(streetName, landMark, laneNo, pin);
		this.employeeName = employeeName;
		this.employeeHouseNo = employeeHouseNo;
		ApartmentName = apartmentName;
		this.employeeStreetName = employeeStreetName;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public String getEmployeeHouseNo() {
		return employeeHouseNo;
	}

	public void setEmployeeHouseNo(String employeeHouseNo) {
		this.employeeHouseNo = employeeHouseNo;
	}

	public String getApartmentName() {
		return ApartmentName;
	}

	public void setApartmentName(String apartmentName) {
		ApartmentName = apartmentName;
	}

	public String getEmployeeStreetName() {
		return employeeStreetName;
	}

	public void setEmployeeStreetName(String employeeStreetName) {
		this.employeeStreetName = employeeStreetName;
	}

	

	public EmployeeAddress(String streetName, String landMark, String laneNo,
			long pin) {
		super(streetName, landMark, laneNo, pin);
		// TODO Auto-generated constructor stub
	}
	
	
	
	

}
