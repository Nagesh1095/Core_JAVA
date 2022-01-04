package com.NSCorp.sep20;

import com.NSCorp.sep20.CURDOperation.Cricketoperatordto;
import com.NSCorp.sep20.dTOOperator.CricketDTO;

public class TestCricketdto {
public static void main(String []args) {
		
		Cricketoperatordto dto = new Cricketoperatordto();
		
		CricketDTO dto1 = new CricketDTO("IPL","RCB","virat",(byte)11,"ganguly",(byte)20);
		CricketDTO dto2 = new CricketDTO("IPL","MI","rohit",(byte)11,"sachin",(byte)20);
		CricketDTO dto3 = new CricketDTO("IPL","CSK","dhoni",(byte)11,"hussy",(byte)20);
		CricketDTO dto4 = new CricketDTO("IPL","DC","shreyas",(byte)11,"hdjbv",(byte)20);
		CricketDTO dto5 = new CricketDTO("IPL","RCB","virat",(byte)11,"ganguly",(byte)20);
		dto.play(dto1);
		dto.play(dto2);
		dto.play(dto3);
		dto.play(dto4);
		dto.play(dto5);
		dto.printAll();
		
		System.out.println();
	
		CricketDTO response= dto.updatetypebynoofovers("IPL" , 50);
		  System.out.println(response.printAll());
		  
		  System.out.println(dto.delete("DC"));
		  dto.printAll();
	}

}


