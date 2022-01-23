package com.nSCorps.jewellery;

import com.nSCorps.jewellery.dao.JewelleryDAO;
import com.nSCorps.jewellery.dto.Jewellery;
import com.nSCorps.jewellery.exceptions.DataNotUpdated;
import com.nSCorps.jewellery.exceptions.ErrorInDeletingData;
import com.nSCorps.jewellery.exceptions.ErrorInGettingData;

public class JewelleryTester {
	public static void main(String[] args) {

		JewelleryDAO dao = new JewelleryDAO();
		JewelleryDAO dao1 = new JewelleryDAO();
		JewelleryDAO dao2 = new JewelleryDAO();

		Jewellery jewellery = new Jewellery();
		jewellery.setTypeOfMaterial("Gold");
		jewellery.setWeight(50.6);
		jewellery.setDesignNumber(52);
		jewellery.setPrice(545362);
		jewellery.setType("Long Chain");
		jewellery.setKarat((byte) 22);
		jewellery.setColor("Golden Yellow");
		jewellery.setAlloy("Copper N Gold");
		dao.save(jewellery);

		Jewellery jewellery1 = new Jewellery();
		jewellery1.setTypeOfMaterial("Platinum");
		jewellery1.setWeight(12.3);
		jewellery1.setDesignNumber(125);
		jewellery1.setPrice(632543);
		jewellery1.setType("Hand Chain");
		jewellery1.setKarat((byte) 2);
		jewellery1.setColor("No Color");
		jewellery1.setAlloy("Platinum N Iridium");
		dao1.save(jewellery1);

		Jewellery jewellery2 = new Jewellery();
		jewellery2.setTypeOfMaterial("Silver");
		jewellery2.setWeight(150.3);
		jewellery2.setDesignNumber(63);
		jewellery2.setPrice(58596);
		jewellery2.setType("Plate");
		jewellery2.setKarat((byte) 36);
		jewellery2.setColor("Silver");
		jewellery2.setAlloy("Silver N Alluminium");
		dao2.save(jewellery2);

		try {
			System.out.println("\n" + dao.updatePriceByDesignNumber(1054826, 52));
		} catch (DataNotUpdated e) {
			System.err.println(e.getMessage());
		}
		try {
			System.out.println("\n" + dao1.updatePriceByMaterial(4644665, "Platinum"));
		} catch (DataNotUpdated e) {
			System.err.println(e.getMessage());
		}
		try {
			System.out.println("\n" + dao1.getAllByMaterial("Platinum"));
		} catch (ErrorInGettingData e) {
			System.err.println(e.getMessage());
		}
		try {
			System.out.println("\n" + dao2.GetByType("Plate"));
		} catch (ErrorInGettingData e) {
			System.err.println(e.getMessage());
		}
		try {
			System.out.println(dao.GetByType("Long Chain"));
		} catch (ErrorInDeletingData e) {
			System.err.println(e.getMessage());
		}

	}

}
