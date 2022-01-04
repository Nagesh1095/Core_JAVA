package com.nsCorps.typeCastingInheritence.method_Overriding.tester;

import com.nsCorps.typeCastingInheritence.method_Overriding.childClass.Bus;
import com.nsCorps.typeCastingInheritence.method_Overriding.parentClass.Transportation;

public class TestBus {
	public static void main(String[] args) {
		
		Bus bus = new Bus();
		bus.timeconvinient();
		bus.travelling();
		bus.heavyLoad();
		bus.carryGoods();
		
		 System.out.println();
		Transportation transportation = new Transportation();
		transportation.travelling();
		transportation.carryGoods();
		transportation.timeconvinient();
		System.out.println();
		
		Transportation transport =new Bus();
		transport.travelling();
		transport.carryGoods();
		transport.timeconvinient();
		
		System.out.println();
		Bus bus1 = (Bus) transport;
		bus1.timeconvinient();
		bus1.travelling();
		bus1.heavyLoad();
		bus1.carryGoods();
		
	}

}
