package com.NSCorp.sep20;

import com.NSCorp.sep20.CURDOperation.Operatordto;
import com.NSCorp.sep20.dTOOperator.DTOoperation;

public class TestOperatordto  {
	public static void main(String []args) {
		
		Operatordto operator = new Operatordto();
		DTOoperation dto = new DTOoperation((byte)14,"Aruna KR","08-07-1999","akr6134@gmail.com",8550071423l,"kodigehalli");
		  operator.add(dto);
		
		operator.display();
	}

}



