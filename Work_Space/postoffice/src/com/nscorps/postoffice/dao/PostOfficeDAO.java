package com.nscorps.postoffice.dao;

import com.nscorps.postoffice.dto.PostOfficeDTO;

public class PostOfficeDAO {
	PostOfficeDTO[] dao = new PostOfficeDTO[5];
	int index = 0;

	public String add(PostOfficeDTO name) {
		if (index < dao.length) {
			dao[index] = name;
			return "Added";
		}
		index++;
		return "Not Added";
	}

	public void printAll() {
		for (int index = 0; index < dao.length; index++) {
			if (dao[index] != null) {
				System.out.println(dao[index].toString());
			}
		}
	}

	public PostOfficeDTO updateNameByPlace(String name, String place) {
		for (int index = 0; index < dao.length; index++) {
			if (dao[index] != null && place.equals(dao[index].getPlace())) {
				dao[index].setName(name);
			}
		}
		return dao[index];
	}
	public PostOfficeDTO updateBranchByPlace(String branch,String place) {
		for (int index = 0; index < dao.length; index++) {
			if (dao[index] != null && place.equals(dao[index].getPlace())) {
				dao[index].setBranch(branch);
			}
		}
		return dao[index];
	}
	public PostOfficeDTO getByName(String name) {
		for (int index = 0; index < dao.length; index++) {
			if (dao[index] != null && name.equals(dao[index].getName())) {
				
			}
		}
		return dao[index];
	}
	public PostOfficeDTO getByManagerName(String managerName) {
		for (int index = 0; index < dao.length; index++) {
			if (dao[index] != null && managerName.equals(dao[index].getAddress().getManagerName())) {
				
			}
		}
		return dao[index];
	}

	public PostOfficeDTO deleteByname(String name) {
		for (int index = 0; index < dao.length; index++) {
			if (dao[index] != null && name.equals(dao[index].getName())) {
			}
		}
		return dao[index];
	}
}
