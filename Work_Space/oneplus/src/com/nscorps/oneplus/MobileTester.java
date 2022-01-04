package com.nscorps.oneplus;

import com.nscorps.oneplus.dto.MobileDTO;
import com.nscorps.oneplus.operator.MobileOperator;

public class MobileTester {
	public static void main(String[] args) {
		MobileOperator operator = new MobileOperator();
		MobileDTO dto = new MobileDTO("Oneplus9r", "SD870", (byte) 8, 37000, "Matte Black", (byte) 48, (byte) 4);
		operator.add(dto);
		operator.printAll();

	}
}
