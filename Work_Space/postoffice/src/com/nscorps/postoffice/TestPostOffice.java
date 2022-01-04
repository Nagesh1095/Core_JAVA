package com.nscorps.postoffice;

import com.nscorps.postoffice.dao.PostOfficeDAO;
import com.nscorps.postoffice.dto.AddressDTO;
import com.nscorps.postoffice.dto.PostOfficeDTO;

public class TestPostOffice {
	public static void main(String[] args) {
		PostOfficeDTO postOfficeDTO = new PostOfficeDTO();
		postOfficeDTO.setBranch("Village Office");
		postOfficeDTO.setPlace("Anekere");
		postOfficeDTO.setName("TED Post Office");
		AddressDTO addressDTO = new AddressDTO();
		postOfficeDTO.setAddress(addressDTO);
		addressDTO.setManagerName("Nagesh");
		addressDTO.setCity("Turuvekere");
		addressDTO.setState("Karnataka");
		addressDTO.setCountry("India");
		addressDTO.setPincode(572212);
		System.out.println(postOfficeDTO.toString());
		
		PostOfficeDAO dao = new PostOfficeDAO();
		System.out.println(dao.add(postOfficeDTO));
		
		PostOfficeDTO dto= dao.updateNameByPlace("MES Post Office", "Anekere");
		System.out.println(dto);
		
		PostOfficeDTO dto2 = dao.updateBranchByPlace("Regional Branch", "Anekere");
		System.out.println(dto2);
		
		PostOfficeDTO dto3 = dao.getByName("MES Post Office");
		System.out.println(dto3);
		
		PostOfficeDTO dto4 = dao.getByManagerName("Nagesh");
		System.out.println(dto4);
		
		PostOfficeDTO resp=dao.deleteByname("TED Post Office");
		System.out.println(resp);
		
	}
}
