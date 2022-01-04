package com.nsCorps.oneplus;


import com.nsCorps.oneplus.dtos.WatchDTO;
import com.nsCorps.oneplus.operator.WatchOperator;

public class WatchTester {
	public static void main(String[] args) {
		WatchOperator operator = new WatchOperator();
		WatchDTO watch = new WatchDTO();
		watch.setColor("Matte Black");
		watch.setModel("Deo");
		watch.setPrice(4800);
		watch.setProcessor("STM32");
		watch.setRam((float) 1f);
		watch.setBattery((short)400);
		watch.setNoOfCamera((byte)0);
		watch.setDisplay("Amloid");
		watch.setoS("Wear OS");
		watch.setStorage((short)32);
		operator.add(watch);
		

		WatchDTO watch1 = new WatchDTO();
		watch1.setColor("Daring Blue");
		watch1.setModel("Harry Potter");
		watch1.setPrice(5800);
		watch1.setProcessor("STM32");
		watch1.setRam((float) 1.5f);
		watch1.setBattery((short)450);
		watch1.setNoOfCamera((byte)0);
		watch1.setDisplay("IPS");
		watch1.setoS("Wear OS");
		watch1.setStorage((short)32);
		operator.add(watch1);
		operator.getAll();
		System.out.println();
		String dto = operator.updateRamUsingModel("Deo",(byte)3);
		System.out.println(dto);
		System.out.println(watch.printAll());

		String music = operator.deleteByModel("Deo");
		System.out.println(music);
		operator.getAll();
		


	}
}
