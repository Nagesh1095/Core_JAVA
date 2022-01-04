package com.xworkz.bank.Employee;

public class Employee {
	
	int id;
	String name;
	float salary;
	String designation;
	String email,city;
	long phone;
	static String ceo = "Gavirangaswamy";
	

	public Employee(int id, String name) {
		
		this.id = id;
		this.name = name;
	}

	public Employee(float salary, String designation) {
		
		this.salary = salary;
		this.designation = designation;
	}

	public Employee(long phone) {
		
		this.phone = phone;
	}
	
	public Employee(String email, String city) {
		this.email = email;
		this.city = city;
	}

	public Employee(int id, String name, float salary, String designation, String email, String city, long phone) {
		this(id,name);
		this.salary = salary;
		this.designation = designation;
		this.email = email;
		this.city = city;
		this.phone = phone;
	}

	public String printAll() {
		return "id=" + id +", ceo="+ceo+ ", name=" + name + ", salary=" + salary + ", designation=" + designation
				+ ", email=" + email + ", city=" + city + ", phone=" + phone ;
	}

	
}
