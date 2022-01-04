package com.nscorps.collage.dao;

import com.nscorps.collage.dto.CollageDTO;

public class CollageDAO {
	CollageDTO[] dtos = new CollageDTO[5];
	int index = 0;

	public String add(CollageDTO name) {
		if (index < dtos.length) {
			dtos[index] = name;
			return "Added";
		}
		index++;
		return "Not Added";
	}

	public void printAll() {
		for (int index = 0; index < dtos.length; index++) {
			System.out.println(dtos[index]);
		}
	}

	public CollageDTO updateCNameByNoOfFaculties(String CName, short noOfFaculties) {
		for (int index = 0; index < dtos.length; index++) {
			if (dtos[index] != null && noOfFaculties == (dtos[index].getNoOfFaculties())) {
				dtos[index].setcName(CName);
			}
		}
		return dtos[index];
	}

	public CollageDTO updateNoOfCoursesByNoOfStudents(byte NoOfCourses, short noOfStudents) {
		for (int index = 0; index < dtos.length; index++) {
			if (dtos[index] != null && noOfStudents == (dtos[index].getNoOfStudents())) {
				dtos[index].setNoOfCourses(NoOfCourses);
			}
		}
		return dtos[index];
	}

//	public String deleteByNoOfCourses(byte noOfCourses) {
//		for (int index = 0; index < dtos.length; index++) {
//			if (dtos[index] != null && noOfCourses == (dtos[index].getNoOfCourses())) {
//				dtos[index] = null;
//				return "Deleted";
//			}
//		}
//		return "Not Deleted";
//	}

	public String deleteByNoOfFaculties(short noOfFaculties) {
		for (int index = 0; index < dtos.length; index++) {
			if (dtos[index] != null && noOfFaculties == (dtos[index].getNoOfFaculties())) {
					dtos[index] = null;
					return "Deleted";

				
			}
		}
		return "Not Deleted";
	}

	public CollageDTO getByNoOfCourses(byte noOfCourses) {
		for (int index = 0; index < dtos.length; index++) {
			if (dtos[index] != null && noOfCourses == (dtos[index].getNoOfCourses())) {

			}
		}
		return dtos[index];
	}

	public CollageDTO getByCity(String city) {
		for (int index = 0; index < dtos.length; index++) {
			if (dtos[index] != null && city.equals(dtos[index].getAddress().getCity())) {

			}
		}
		return dtos[index];
	}

}
