package com.xworkz.bank.Loan;

	public class Loan {

		String Bankname;
		String Loanname;
		int Loanid;
		String Loanapplicantname;
		double Phnum;
		String Adharnum;
		float Loanamnt;
	
 
	public Loan(String bankname) {
		Bankname = bankname;
	}

	public Loan(String loanname, int loanid) {
		Loanname = loanname;
		Loanid = loanid;
	}

	public Loan(String loanapplicantname, double phnum) {
		Loanapplicantname = loanapplicantname;
		Phnum = phnum;
	}

	public Loan(String adharnum, float loanamnt) {
		Adharnum = adharnum;
		Loanamnt = loanamnt;
	}

	public Loan(String bankname, String loanname, int loanid) {
		Bankname = bankname;
		Loanname = loanname;
		Loanid = loanid;
	}

	public Loan(String loanapplicantname, double phnum, String adharnum, float loanamnt) {
		Loanapplicantname = loanapplicantname;
		Phnum = phnum;
		Adharnum = adharnum;
		Loanamnt = loanamnt;
	}

	public Loan(String bankname, String loanname, int loanid, String loanapplicantname, double phnum, String adharnum,
		float loanamnt) {
		Bankname = bankname;
		Loanname = loanname;
		Loanid = loanid;
		Loanapplicantname = loanapplicantname;
		Phnum = phnum;
		Adharnum = adharnum;
		Loanamnt = loanamnt;
	}

	public String printAll() {
	return "Bankname=" + Bankname + ", Loanname=" + Loanname + ", Loanid=" + Loanid + ", Loanapplicantname="
			+ Loanapplicantname + ", Phnum=" + Phnum + ", Adharnum=" + Adharnum + ", Loanamnt=" + Loanamnt ;
	}
	
}