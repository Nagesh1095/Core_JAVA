package com.nscorps.armor;

import com.nscorps.armor.dao.GunDAO;
import com.nscorps.armor.dto.BulletDTO;
import com.nscorps.armor.dto.CompanyDTO;
import com.nscorps.armor.dto.GunDTO;
import com.nscorps.armor.enums.GunTypes;

public class GunTester {
	public static void main(String[] args) {
		GunDTO gunDTO = new GunDTO();
		gunDTO.setTypes(GunTypes.Pistol);
		gunDTO.setMaterial("Bronze");
		gunDTO.setMagzinSize(12);
		gunDTO.setRange(100.50f);

		GunDTO gunDTO2 = new GunDTO();
		gunDTO2.setTypes(GunTypes.Assault_rifles);
		gunDTO2.setMaterial("S_Steel");
		gunDTO2.setMagzinSize(30);
		gunDTO2.setRange(400.6f);

		GunDTO gunDTO3 = new GunDTO();
		gunDTO3.setTypes(GunTypes.Machine_guns);
		gunDTO3.setMaterial("Bronze");
		gunDTO3.setMagzinSize(300);
		gunDTO3.setRange(150.4f);

		GunDTO gunDTO4 = new GunDTO();
		gunDTO4.setTypes(GunTypes.Sniper_rifles);
		gunDTO4.setMaterial("Gun_Metal");
		gunDTO4.setMagzinSize(6);
		gunDTO4.setRange(986.5f);

		GunDTO gunDTO5 = new GunDTO();
		gunDTO5.setTypes(GunTypes.Shotguns);
		gunDTO5.setMaterial("Gun_Metal");
		gunDTO5.setMagzinSize(2);
		gunDTO5.setRange(30.8f);

		BulletDTO bulletDTO = new BulletDTO();
		bulletDTO.setCaliber(375);
		bulletDTO.setMaterial("copper-plated soft steel jacket");
		bulletDTO.setShape("ogive shape");

		BulletDTO bulletDTO2 = new BulletDTO();
		bulletDTO2.setCaliber(45);
		bulletDTO2.setMaterial("copper-plated soft steel jacket");
		bulletDTO2.setShape("round nose");

		BulletDTO bulletDTO3 = new BulletDTO();
		bulletDTO3.setCaliber(652);
		bulletDTO3.setMaterial("Tungsten");
		bulletDTO3.setShape("wadcutter");

		BulletDTO bulletDTO4 = new BulletDTO();
		bulletDTO4.setCaliber(585);
		bulletDTO4.setMaterial("Tungsten");
		bulletDTO4.setShape("Semi Round");

		BulletDTO bulletDTO5 = new BulletDTO();
		bulletDTO5.setCaliber(69);
		bulletDTO5.setMaterial("Meledium");
		bulletDTO5.setShape("Bulge Hit");

		CompanyDTO companyDTO = new CompanyDTO();
		companyDTO.setComFounder("Nagesha");
		companyDTO.setComName("N S Corps");
		companyDTO.setCountry("India");

		CompanyDTO companyDTO2 = new CompanyDTO();
		companyDTO2.setComFounder("Kamala");
		companyDTO2.setComName("K M Industries");
		companyDTO2.setCountry("India");

		CompanyDTO companyDTO3 = new CompanyDTO();
		companyDTO3.setComFounder("Faisal");
		companyDTO3.setComName("Faisu Ammonation");
		companyDTO3.setCountry("India");

		CompanyDTO companyDTO4 = new CompanyDTO();
		companyDTO4.setComFounder("Nagesha");
		companyDTO4.setComName("N S Corps");
		companyDTO4.setCountry("India");

		CompanyDTO companyDTO5 = new CompanyDTO();
		companyDTO5.setComFounder("Nagesha");
		companyDTO5.setComName("N S Corps");
		companyDTO5.setCountry("India");

		gunDTO.setBullets(bulletDTO);
		gunDTO.setComDetails(companyDTO);

		gunDTO2.setBullets(bulletDTO2);
		gunDTO2.setComDetails(companyDTO2);

		gunDTO3.setBullets(bulletDTO3);
		gunDTO3.setComDetails(companyDTO3);

		gunDTO4.setBullets(bulletDTO4);
		gunDTO4.setComDetails(companyDTO4);

		gunDTO5.setBullets(bulletDTO5);
		gunDTO5.setComDetails(companyDTO5);

		GunDAO gunDAO = new GunDAO();
		gunDAO.save(gunDTO);
		gunDAO.save(gunDTO2);
		gunDAO.save(gunDTO3);
		gunDAO.save(gunDTO4);
		gunDAO.save(gunDTO5);
		gunDAO.printAll();

		System.out.println();
		System.out.println("Get Things by types👇");
		GunDTO[] res = gunDAO.getAllByTypes(GunTypes.Pistol);
		for (int index = 0; index < res.length; index++) {
			System.out.println(res[index]);
		}
		System.out.println();
		System.out.println("Get Things by Material👇👇");
		GunDTO[] res1 = gunDAO.getAllByMaterial("S_Steel");
		int index = 0;
		if (res1[index] != null) {
			for ( int i1 = 0; i1 < res1.length; i1++) {
				System.out.println(res1[i1]);
				index++;
		}
		
		}
		System.out.println("Update Material by MagzinSize 👇👇👇");
		GunDTO update = gunDAO.updateMaterialByMagzinSize("Gun Metal", 30);
		System.out.println(update);
		System.out.println();
		String delete = gunDAO.deleteByMaterial("Bronze");
		System.out.println(delete);
		
		System.out.println(gunDTO.equals(gunDTO2));
		System.out.println(gunDTO.hashCode());
		System.out.println(gunDTO2.hashCode());
	}
	
}
