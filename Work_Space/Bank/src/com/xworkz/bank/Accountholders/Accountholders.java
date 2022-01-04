package com.xworkz.bank.Accountholders;

public class Accountholders {
	String Bankname;
	String Holdername;
	int DOB;
	long accountno;
	int ifsccode;
	String pancard;
	String MRICcode;
	long contactno;
	long Aadharno;
	String Adress;
	
	public Accountholders(String bankname, String holdername) {
		this.Bankname = bankname;
		this.Holdername = holdername;
	}

	public Accountholders(String bankname, String holdername,int dOB) {
		this.Bankname = bankname;
		this.Holdername = holdername;
		this.DOB = dOB;
		
	}

	public Accountholders(String bankname, String holdername,int dOB,long accountno,int ifsccode ) {
		this.Bankname = bankname;
		this.Holdername = holdername;
		this.DOB = dOB;
		this.accountno= accountno;
		this.ifsccode = ifsccode;
		
	}

	public Accountholders(String bankname, String holdername,int dOB,long accountno,int ifsccode,String pancard) {
		this.Bankname = bankname;
		this.Holdername = holdername;
		this.DOB = dOB;
		this.accountno= accountno;
		this.ifsccode = ifsccode;
		this.pancard = pancard;
	}

	public Accountholders(String bankname, String holdername,int dOB,long accountno,int ifsccode,String pancard,String MRIcode, long Aadharno ) {
		this.Bankname = bankname;
		this.Holdername = holdername;
		this.DOB = dOB;
		this.accountno= accountno;
		this.ifsccode = ifsccode;
		this.pancard = pancard;
		this.Aadharno = Aadharno;
	}
	
   
	
	public Accountholders(String bankname, String holdername, int dOB, long accountno, int ifsccode, String pancard,
			String mRICcode, long contactno, long aadharno, String adress) {
		
		this.Bankname = bankname;
		this.Holdername = holdername;
		this.DOB = dOB;
		this.accountno = accountno;
		this.ifsccode = ifsccode;
		this.pancard = pancard;
		this.MRICcode = mRICcode;
		this.contactno = contactno;
		this.Aadharno = aadharno;
		this.Adress = adress;
	}

	public String printall() {
		return "Bankname=" + Bankname + ", Holdername=" + Holdername + ", DOB=" + DOB + ", accountno="
				+ accountno + ", ifsccode=" + ifsccode + ", pancard=" + pancard + ", MRICcode=" + MRICcode
				+ ", contactno=" + contactno + ", Aadharno=" + Aadharno + ", Adress=" + Adress ;
	}

	

}

