package com.nscorps.radio;

import com.nscorps.radio.dao.RadioDAO;
import com.nscorps.radio.dto.RadioDTO;
import com.nscorps.radio.dto.SizeDTO;

public class TestRadio {
	public static void main(String[] args) {
		RadioDTO radioDTO= new RadioDTO();
		radioDTO.setCompeny("Sony");
		radioDTO.setPrice(509);
		radioDTO.setColor("Matte Black");
		radioDTO.setNoOfRS((byte)15);
		SizeDTO sizeDTO = new SizeDTO();
		radioDTO.setSize(sizeDTO);
		sizeDTO.setHeight(5.5f);
		sizeDTO.setLength(10.6f);
		sizeDTO.setWidth(1.2);
		radioDTO.setSize(sizeDTO);
		System.out.println(radioDTO.toString());
		
		RadioDAO dao = new RadioDAO();
		System.out.println(dao.add(radioDTO));
	    
	    
	    String isdelete=dao.deletebyCompany("Sony");
				System.out.println(isdelete);
				
		RadioDTO res = dao.updatePricebyCompany(900, "Sony");
		System.out.println(res.toString());
		
		RadioDTO res1 = dao.updateColorByPrice("White", 900);
		System.out.println(res1);
		
		RadioDTO res2 = dao.updateCompanyBycolor("Yamaha", "White");
		System.out.println(res2);
		
		RadioDTO dto = dao.getByCompany("Yamaha");
		System.out.println(dto);
		
		RadioDTO dto2 = dao.getByPrice(509);
		System.out.println(dto2);
		
		RadioDTO dto3 = dao.getByWidth(1.2d);
		System.out.println(dto3);
	
	}
}
