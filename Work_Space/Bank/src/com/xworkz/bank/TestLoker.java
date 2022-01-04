package com.xworkz.bank;

import com.xworkz.bank.Locker.Locker;

public class TestLoker {
	public static void main(String []nag) {
		Locker locker1=new Locker("DBS Bank","M G Road","GRS",26546,9584256987l,256836583254l,"PNHG2368l");
		System.out.println(locker1.printAll());
		Locker locker2=new Locker("DBS Bank","M G Road","Shanmuk",56842,9854726823l,2547835698745l,"MNCG9572J");
		System.out.println(locker2.printAll());
		Locker locker3=new Locker("DBS Bank","M G Road","Arun",65482,7854123659l,536574258413l,"KDGB5742K");
		System.out.println(locker3.printAll());
		Locker locker4=new Locker("DBS Bank","M G Road","Nagesh",58746,9739538340l,485147965145l,"BKID5874K");
		System.out.println(locker4.printAll());
	}
	
}
