package model;

public class Person {
	private int employeeId;
	private String firstName;
	private String lastName;
	private int zipCode;
	private int carpool;
	
	public Person() {
	}
	
	public Person (int employeeId, String firstName, String lastName, int zipCode) {
		this.employeeId=employeeId;
		this.firstName=firstName;
		this.lastName=lastName;
		this.zipCode = zipCode;
		this.carpool=0;
	}
	
	public int getEmployeeId() {
		return this.employeeId;
	}
	
	public String getFirstName() {
		return this.firstName;
	}
	
	public String getLastName() {
		return this.lastName;
	}
	
	public int getZipCode() {
		return this.zipCode;
	}
	
	public int getCarpool() {
		return this.carpool;
	}
	
	public void setCarpool(int carpool) {
		this.carpool=carpool;
	}
	
	public String toString() {
		return "Name = " + this.firstName + " " + this.lastName + ", employee ID = " + this.employeeId + ", zip code = " 
				+ this.zipCode + ", carpool = " + this.carpool;
 	}
}
