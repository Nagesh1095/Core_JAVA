package com.nscorps.oneplus.operator;

import com.nscorps.oneplus.dto.MobileDTO;

public class MobileOperator {
	MobileDTO[] mobiles = new MobileDTO[4];
	int index = 0;

	public void add(MobileDTO dto) {
		if (index < mobiles.length) {
			mobiles[index] = dto;
			index++;
		}
	}

	public void printAll() {

		for (int index = 0; index < mobiles.length; index++) {

			if (mobiles[index] != null) {
				System.out.println(mobiles[index].getAll());
			}
		}

	}
	public MobileDTO updatemodelusingram( String model, byte ram) {
		for(int index = 0;index < mobiles.length;index++) {
			if(index .equals) {
				
			}
		}
	}

}
