package com.nsCorps.test;

import com.nsCorps.test.dao.FunctionImpl;
import com.nsCorps.test.dto.Functions;
import com.nsCorps.test.dto.MobileDTO;

public class Tester {
	public static void main(String[] args) {
		MobileDTO dto = new MobileDTO();
		dto.setBrandName("Realme");
		dto.setModelName("Realme GT Master Edition");
		dto.setMobileID("RMX9568");
		dto.setSerialNumber(2574697412681l);
		dto.setMemoryInGB((short) 256);
		dto.setNoOfCamera((byte) 3);
		dto.setPrice(25999);

		MobileDTO dto2 = new MobileDTO();
		dto2.setBrandName("I-Phone");
		dto2.setModelName("13 Pro Max");
		dto2.setMobileID("APL2546");
		dto2.setSerialNumber(874145346136l);
		dto2.setMemoryInGB((short) 512);
		dto2.setNoOfCamera((byte) 3);
		dto2.setPrice(95699);

		MobileDTO dto3 = new MobileDTO();
		dto3.setBrandName("One Plus");
		dto3.setModelName("One Plus 8T");
		dto3.setMobileID("RNT4265");
		dto3.setSerialNumber(45665314651340l);
		dto3.setMemoryInGB((short) 128);
		dto3.setNoOfCamera((byte) 4);
		dto3.setPrice(48599);

		Functions functions = new FunctionImpl();
		System.out.println(functions.add(dto));
		System.out.println(functions.add(dto2));
		System.out.println(functions.add(dto3));
		System.out.println();;
		functions.getAll();
		functions.getAllByBrandName("One Plus");
		MobileDTO res = functions.updateBySerialNumber(25125453164l, "Realme GT Master Edition");
		System.out.println("\n"+ "The Serial Number Updated \n"+res.toString());
		MobileDTO resp =  functions.deleteByMobileID("RNT4265");
		System.out.println("\n"+ "It is deleted by Mobile ID \n"+resp);

	}
}
