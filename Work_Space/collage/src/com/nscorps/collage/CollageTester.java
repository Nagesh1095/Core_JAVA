package com.nscorps.collage;

import com.nscorps.collage.dao.CollageDAO;
import com.nscorps.collage.dto.AddressDTO;
import com.nscorps.collage.dto.CollageDTO;

public class CollageTester {
public static void main(String[] args) {
		
		CollageDTO college = new CollageDTO();
		
		college.setcName("N S Institute of Technology");
		college.setNoOfCourses((byte)13);
		college.setNoOfFaculties((short)512);
		college.setNoOfStudents((short)4800);
		college.setAutonomousCollege(true);
		college.setGovernmentCollege(false);
		
		AddressDTO address = new AddressDTO();
		address.setCity("Bangalore");
		address.setState("Karnataka");
		address.setCountry("India");
		address.setPincode(560010);
		college.setAddress(address);
		
		System.out.println(college);
		
		CollageDAO collageDAO = new CollageDAO();
		System.out.println(collageDAO.add(college));
		
		CollageDTO res = collageDAO.updateCNameByNoOfFaculties("Xworks",(short) 512);
		System.out.println(res);
		
		CollageDTO res2 = collageDAO.updateNoOfCoursesByNoOfStudents((byte)99,(short) 4800);
		System.out.println(res2);
		
		CollageDTO collageGet = collageDAO.getByNoOfCourses((byte)99);
		System.out.println(collageGet);
		
		CollageDTO collageGet1 = collageDAO.getByCity("Bangalore");
		System.out.println(collageGet1);
		
//		String collageDTO = collageDAO.deleteByNoOfCourses((byte)13);
//		System.out.println(collageDTO);
		
		String collageDTO1 = collageDAO.deleteByNoOfFaculties((short)512);
		System.out.println(collageDTO1.toString());
		
		
		
		
	}

}
