package com.xworkz.bank;

import com.xworkz.bank.Loan.Loan;

public class TestLoan {
	public static void main(String[]a) {
		
		Loan loan1=new Loan("DBS Bank","goldloan",2345,"raju",8073343646.0,"hd963877873",54645.87f);
		System.out.println(loan1.printAll());
		Loan loan2=new Loan("DBS Bank","homeloan",2346,"ram",8073348645.0,"he963877873",54666.87f);
		System.out.println(loan2.printAll());
		Loan loan3=new Loan("DBS Bank","carloan",2345,"arun",8550071423.0,"hp963877873",67645.87f);
		System.out.println(loan3.printAll());
		Loan loan4=new Loan("DBS Bank","bikeloan",2845,"nagesh",8075643646.0,"hy963877873",54855.87f);
		System.out.println(loan4.printAll());
		Loan loan5=new Loan("DBS Bank","siri",2895,"gavi",80789343646.0,"hd9638567873",546455.87f);
		System.out.println(loan5.printAll());
		
	}

}
