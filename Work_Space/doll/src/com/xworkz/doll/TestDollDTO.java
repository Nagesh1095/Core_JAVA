package com.xworkz.doll;

import com.xworkz.doll.dollDTO.DollDTO;

public class TestDollDTO {
	public static void main(String[] args) {
		DollDTO dollDTO = new DollDTO();
		dollDTO.Designadoll();
		dollDTO.Designadoll("Smooth Cloth");
		dollDTO.Designadoll("Red", (int)63);
		dollDTO.Designadoll((short)682);
	}
}
