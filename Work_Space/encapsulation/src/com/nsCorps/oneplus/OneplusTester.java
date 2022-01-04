package com.nsCorps.oneplus;

import com.nsCorps.oneplus.dtos.OneplusDTO;
import com.nsCorps.oneplus.operator.OneplusOperator;

public class OneplusTester {
	public static void main(String[] args) {
		OneplusOperator operator = new OneplusOperator();
		OneplusDTO oneplus = new OneplusDTO();
		oneplus.setColor("Matte Black");
		oneplus.setModel("rT");
		oneplus.setPrice(48000);
		oneplus.setProcessor("SD888");
		oneplus.setRam((byte) 12);
		oneplus.setDisplay("Qled 2k");
		oneplus.setoS("Oxygen");
		oneplus.setNoOfCamera((byte)4);
		oneplus.setStorage((short)265);
		oneplus.setMegaPixel((byte)50);
		operator.add(oneplus);
		
		OneplusDTO oneplus1 = new OneplusDTO();
		oneplus1.setModel("8t");
		oneplus1.setColor("Arora Blue");
		oneplus1.setPrice(36999);
		oneplus1.setProcessor("SD860");
		oneplus1.setRam((byte) 6);
		oneplus1.setDisplay("Amloid 2k");
		oneplus1.setoS("Oxygen");
		oneplus1.setNoOfCamera((byte)3);
		oneplus1.setStorage((short)128);
		oneplus1.setMegaPixel((byte)48);
		operator.add(oneplus1);
		operator.getAll();

		String dto = operator.updateRamUsingModel("rT", (byte) 6);
		System.out.println(dto);
		System.out.println(oneplus.printAll());

		String mobile = operator.deleteByModel("8t");
		System.out.println(mobile);
	}

}
