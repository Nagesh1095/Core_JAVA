package com.nsCorps.typeCastingInheritence.method_Overriding.tester;

import com.nsCorps.typeCastingInheritence.method_Overriding.childClass.Ship;
import com.nsCorps.typeCastingInheritence.method_Overriding.parentClass.Transportation;

public class TestShip {
	public static void main(String[] args) {
		
		Ship ship = new Ship();
		ship.watertransport();
		ship.shippinggoods();
		ship.travelling();
		ship.timeconvinient();
		ship.carryGoods();
		System.out.println();
		
		Transportation transportation =new Transportation();
		transportation.timeconvinient();
		transportation.carryGoods();
		transportation.travelling();
		System.out.println(transportation.money);
		
		System.out.println();
		
		Transportation transport = new Ship();
		transport.timeconvinient();
		transport.carryGoods();
		transport.travelling();
		System.out.println();
		
		Ship ship1 = (Ship) transport;
		ship1.watertransport();
		ship1.shippinggoods();
		ship1.travelling();
		ship1.timeconvinient();
		ship1.carryGoods();
		System.out.println(ship1.haltingyards);
	}

}
