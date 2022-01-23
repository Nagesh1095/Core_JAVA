package com.nSCorps.jewellery.dao;

import com.nSCorps.jewellery.dto.Jewellery;
import com.nSCorps.jewellery.exceptions.DataNotSaved;
import com.nSCorps.jewellery.exceptions.DataNotUpdated;
import com.nSCorps.jewellery.exceptions.ErrorInDeletingData;
import com.nSCorps.jewellery.exceptions.ErrorInGettingData;

public class JewelleryDAO {

	Jewellery[] jewelleries = new Jewellery[3];

	int index = 0;

	public void save(Jewellery j) {
		if (index < jewelleries.length) {
			jewelleries[index] = j;
			index++;
			System.out.println(j + "\n");
		} else {
			throw new DataNotSaved("Data Not Saved");
		}
	}

	public Jewellery updatePriceByDesignNumber(int price, int designNumber) {
		Jewellery jewellery = null;
		boolean check = false;
		for (int index = 0; index < jewelleries.length; index++) {
			if (designNumber==jewelleries[index].getDesignNumber()) {
				jewelleries[index].setPrice(price);
				jewellery = jewelleries[index];
				check = true;
				System.out.println("Price Updated By DesignNumber");
			}
			if (check == false) {
				throw new DataNotUpdated("Data Not Updated");
			}
		}
		return jewellery;
	}

	public Jewellery updatePriceByMaterial(int price, String material) {
		Jewellery jewellery = null;
		boolean check = false;
		for (int index = 0; index < jewelleries.length; index++) {
			if (material.equals(jewelleries[index].getTypeOfMaterial())) {
				jewelleries[index].setPrice(price);
				jewellery = jewelleries[index];
				check = true;
				System.out.println("\nPrice Upadated By Material");
			}
			if (check == false) {
				throw new DataNotUpdated("Data Not Updated");
			}
		}
		return jewellery;
	}

	public Jewellery getAllByMaterial(String material)  {
		Jewellery jewellery = null;
		boolean check = false;
		for (int index = 0; index < jewelleries.length; index++) {
			if (material.equals(jewelleries[index].getTypeOfMaterial())) {
				jewellery = jewelleries[index];
				check = true;
				System.out.println("\nGot All by Matrial");
			}
			if (check == false) {
				throw new ErrorInGettingData("\nError In Getting Data");
			}
		}
		return jewellery;
	}
	public Jewellery GetByType(String type) {
		Jewellery jewellery = null;
		boolean check = false;
		for (int index = 0; index < jewelleries.length; index++) {
			if (type.equals(jewelleries[index].getType())) {
				jewellery=jewelleries[index];
				check=true;
				System.out.println("\nGot by Type");
			}
			if (check == false) {
				throw new ErrorInGettingData("\nError In Getting Data");
			}
		}
		return jewellery;
	}
	public Jewellery DeleteByType(String type) {
		Jewellery jewellery = null;
		boolean check = false;
		for (int index = 0; index < jewelleries.length; index++) {
			if (type.equals(jewelleries[index].getType())) {
				jewellery=jewelleries[index];
				check=true;
				System.out.println("\nDeleted by Type");
			}
			if (check == false) {
				throw new ErrorInDeletingData("\nError In Deleting Data");
			}
		}
		return jewellery;
	}
}
