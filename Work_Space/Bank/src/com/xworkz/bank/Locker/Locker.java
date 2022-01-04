package com.xworkz.bank.Locker;

public class Locker {
	String bank_name;
	String location;
	String locker_holder_name;
	int locker_holder_id;
	long mobile_No;
	long aadhar_no;
	String PAN_card;
	
	public Locker(String bank_name) {
		this.bank_name = bank_name;
	}

	public Locker(String location, String locker_holder_name) {
		this.location = location;
		this.locker_holder_name = locker_holder_name;
	}

	public Locker(int locker_holder_id) {
		this.locker_holder_id = locker_holder_id;
	}

	public Locker(long mobile_No) {
		this.mobile_No = mobile_No;
	}

	public Locker(long aadhar_no, String pAN_card) {
		this.aadhar_no = aadhar_no;
		this.PAN_card = pAN_card;
	}

	public Locker(String bank_name, String location, String locker_holder_name, int locker_holder_id, long mobile_No,
		long aadhar, String pAN_card) {
		this(aadhar,pAN_card);
		this.bank_name = bank_name;
		this.location = location;
		this.locker_holder_name = locker_holder_name;
		this.locker_holder_id = locker_holder_id;
		this.mobile_No = mobile_No;
		
	}

	public String printAll() {
	String res = "Bank Name="+bank_name +"\t"+"Location="+location +"\t"+ "Locker Holder Name="+locker_holder_name +"\t"+ "Locker Holder ID="+locker_holder_id +"\t"+ "Mobile No="+mobile_No +"\t"+ "Aadhar No="+aadhar_no +"\t"+ "PAN Card="+PAN_card;
	return res;
	}
	
}
