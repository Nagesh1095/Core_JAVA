package com.NSCorp.sep20;

import com.NSCorp.sep20.CURDOperation.Butterflyoperatordto;
import com.NSCorp.sep20.dTOOperator.ButterflyDTO;

public class TestButterflydto {
	public static void main() {
	
	Butterflyoperatordto operator = new Butterflyoperatordto();
	
	ButterflyDTO dto = new ButterflyDTO("king","black",15,5.6f);
	ButterflyDTO dto1 = new ButterflyDTO("queen","red",10,4.8f);
	ButterflyDTO dto2 = new ButterflyDTO("helicofter","coffee",8,8.6f);
	ButterflyDTO dto3 = new ButterflyDTO("kite","yellow",8,3.6f);
	
	operator.fly(dto);
	operator.fly(dto1);
	operator.fly(dto2);
	operator.fly(dto3);
	operator.getAll();
	System.out.println();
	
	ButterflyDTO dlt=operator.updatenameusingheight("king", 18.6f);
	  System.out.println(dlt);
	  operator.getAll();
	  
	  System.out.println(operator.delete("helicofter"));
	  operator.getAll();
}
}