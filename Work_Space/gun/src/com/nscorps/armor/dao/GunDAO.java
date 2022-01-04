package com.nscorps.armor.dao;

import com.nscorps.armor.dto.GunDTO;
import com.nscorps.armor.enums.GunTypes;

public class GunDAO {
	GunDTO[] gun = new GunDTO[5];
	int index = 0;

	public String save(GunDTO dto) {
		if (index < gun.length) {
			gun[index] = dto;
			index++;
			return "Got The Value";
		}
		return "Not Got";
	}

	public void printAll() {
		for (int index = 0; index < gun.length; index++) {
			System.out.println(gun[index]);
		}
	}

	public GunDTO[] getAllByTypes(GunTypes type) {
		GunDTO[] gunDTOs = new GunDTO[gun.length];
		int j = 0;
		for (int index = 0; index < gun.length; index++) {
			if (gun[index] != null) {
				if (type.equals(gun[index].getTypes())) {
					gunDTOs[j] = gun[index];
					j++;
				}
			}
		}
		return gunDTOs;
	}

	public GunDTO[] getAllByMaterial(String material) {
		GunDTO[] gunDTOs1 = new GunDTO[gun.length];
		int g = 0;
		for (int index = 0; index < gunDTOs1.length; index++) {
			if (gun[index] != null) {
				if (material.equals(gun[index].getMaterial())) {
					gunDTOs1[g] = gun[index];
					g++;
				}

			}

		}
		return gunDTOs1;
	}

	public GunDTO updateMaterialByMagzinSize(String material, int magzinSize) {
		for (int index = 0; index < gun.length; index++) {
			if (magzinSize == (gun[index].getMagzinSize())) {
				gun[index].setMaterial(material);
				return gun[index];

			}
		}
		return null;
	}

	public String deleteByMaterial(String material) {
		for (int index = 0; index < gun.length; index++) {
			if (gun[index] != null) {
				if (material == (gun[index].getMaterial())) {
					gun[index] = null;
					return "Deleted";
				}

			}
		}
		return "Not Deleted";

	}

}
