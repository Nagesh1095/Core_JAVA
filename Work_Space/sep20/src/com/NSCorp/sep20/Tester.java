package com.NSCorp.sep20;

import com.NSCorp.sep20.CURDOperation.CRUDoperation;

public class Tester {
		public static void main(String []args) {
			CRUDoperation operation =new CRUDoperation();
			  operation.add("Arun");
			  operation.add("Naga");
			  operation.add("Shanu");
			  operation.add("Shashi");
			  operation.add("Ammu");
			  
			  operation.printAll();
			  
			  System.out.println();
			  String res=operation.update("Ravi","Ravichandra T");
			  System.out.println(res);
			  System.out.println();
			  
			  operation.printAll();
			  
			  String tlt=operation.delete();
			  System.out.println(tlt);
			  
			  operation.printAll();
			  
		}

	}
