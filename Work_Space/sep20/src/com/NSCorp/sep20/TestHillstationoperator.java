package com.NSCorp.sep20;

import com.NSCorp.sep20.CURDOperation.HillstationOperatordto;
import com.NSCorp.sep20.dTOOperator.HillstationDTO;

public class TestHillstationoperator {
	public static void main(String []args) {
	
	HillstationOperatordto hillstation = new HillstationOperatordto();
	HillstationDTO dto = new HillstationDTO("nandihills","chikkaballapura",(short)20,(byte)50);
	HillstationDTO dto1 = new HillstationDTO("scandagiri","chikkaballapura",(short)15,(byte)30);
	HillstationDTO dto2 = new HillstationDTO("devarayanadurga","tumkur",(short)25,(byte)100);
	HillstationDTO dto3 = new HillstationDTO("yekashilabetta","madhugiri",(short)30,(byte)80);
	    hillstation.truck(dto);
	    hillstation.truck(dto1);
	    hillstation.truck(dto2);
	    hillstation.truck(dto3);
	    hillstation.getAll();
	    
	    
	    System.out.println();
	    HillstationDTO hilldto = hillstation.updatenamebydistance("nandihills",30);
	      System.out.println(hilldto.printAll());
	      System.out.println();
	      System.out.println(hillstation.delete("scandagiri"));
	      hillstation.getAll();
	
	
	}
}
