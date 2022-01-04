package com.xworkz.bank;

import com.xworkz.bank.Employee.Employee;

public class TestEmployee {
	public static void main(String []grs) {
		
		Employee employee1= new Employee(1,"Ram",115544.85f,"Manager","ram@mail.com","Mysore",98564865646L);
		Employee employee2 = new Employee(2,"John",123549.56f,"General Manager","john@mail.com","Sydney",9874561236L);
		Employee employee3 = new Employee(3,"Arun",200500.546f,"Vice President","arun@mail.com","Tumkur",987454566L);
		Employee employee4 = new Employee(4,"Nagesh",256250.546f,"Vice President-1","nagesh@mail.com","Turuvekere",98555554566L);
		Employee employee5 = new Employee(3,"Shanmuk",278955.546f,"Vice President-2","shanmuk@mail.com","Hyderabad",9888886566L);
		Employee employee6 = new Employee(3,"Somashekar",199520.546f,"Vice President-3","somashekar@mail.com","Bangalore",9874969666L);
		
		
		
		System.out.println(employee1.printAll());
		System.out.println();
		System.out.println(employee2.printAll());
		System.out.println();
		System.out.println(employee3.printAll());
		System.out.println();
		System.out.println(employee4.printAll());
		System.out.println();
		System.out.println(employee5.printAll());
		System.out.println();
		System.out.println(employee6.printAll());
		System.out.println();
		
	}
	
}
