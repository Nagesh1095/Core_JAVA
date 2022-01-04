package com.nsCorps.oneplus;

import com.nsCorps.oneplus.dtos.EarPhoneDTO;
import com.nsCorps.oneplus.operator.EarPhoneOperator;

public class EarphoneTester {
	public static void main(String[] args) {
		
		EarPhoneOperator operator = new EarPhoneOperator();
		EarPhoneDTO dto = new EarPhoneDTO();
		dto.setType("NeckBand");
		dto.setDriver((byte)10);
		dto.setPrice(2500);
		dto.setColor("Grey");
		dto.setPlayBack((byte)38);
		dto.setChipset("QM38e");
		dto.setBattery((short)400);
		dto.setModel("r365");
		dto.setNoOfconnection((byte)2);
		dto.setWaterResistent("IP6");
		operator.add(dto);
				
		EarPhoneDTO dto1 = new EarPhoneDTO();
		dto1.setType("TWS");
		dto1.setDriver((byte)10);
		dto1.setPrice(4200);
		dto1.setColor("Black");
		dto1.setPlayBack((byte)24);
		dto1.setChipset("QM35u");
		dto1.setBattery((short)150);
		dto1.setModel("t9sr");
		dto1.setNoOfconnection((byte)2);
		dto1.setWaterResistent("IP68");
		operator.add(dto1);
		operator.getAll();
		
		String earphone = operator.updateDriverUsingChipset("QM38e",(byte)11);
		System.out.println(earphone);
		System.out.println(dto.printAll());
		
		String music = operator.deleteByChipset("QM38e");
		System.out.println(music);
		dto.printAll();
	}
}
