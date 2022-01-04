package com.nscorps.enums;

import com.nscorps.enums.dto.ContactDetailsDTO;
import com.nscorps.enums.dto.DonerDTO;
import com.nscorps.enums.operation.DonarOperation;
import com.nscorps.enums.enums.BloodGroup;
import com.nscorps.enums.enums.Gender;

public class TestDonerDTO {
	public static void main(String[] args) {

		DonerDTO dto = new DonerDTO();
		dto.setName("Nagesh N");
		dto.setAge((byte) 26);
		dto.setWeight(79.6f);
		dto.setBloodGroup(BloodGroup.A_POSITIVE);
		dto.setGender(Gender.MALE);

		DonerDTO dto1 = new DonerDTO();
		dto1.setName("Kamalanath");
		dto1.setAge((byte) 25);
		dto1.setWeight(65.5f);
		dto1.setBloodGroup(BloodGroup.A_POSITIVE);
		dto1.setGender(Gender.MALE);

		DonerDTO dto2 = new DonerDTO();
		dto2.setName("Madhu");
		dto2.setAge((byte) 26);
		dto2.setWeight(56.5f);
		dto2.setBloodGroup(BloodGroup.AB_POSITIVE);
		dto2.setGender(Gender.FEMALE);

		DonerDTO dto3 = new DonerDTO();
		dto3.setName("Faisal");
		dto3.setAge((byte) 26);
		dto3.setWeight(80.4f);
		dto3.setBloodGroup(BloodGroup.A_POSITIVE);
		dto3.setGender(Gender.MALE);

		ContactDetailsDTO details = new ContactDetailsDTO();
		details.setContactNumber(9739538340l);
		details.setEmail("samartha1095@gmail.com");
		details.setAdress("Turuvekere");

		ContactDetailsDTO details1 = new ContactDetailsDTO();
		details1.setContactNumber(9852147569l);
		details1.setEmail("kamala.manju365@gmail.com");
		details1.setAdress("Turvekere");

		ContactDetailsDTO details2 = new ContactDetailsDTO();
		details2.setContactNumber(9657426941l);
		details2.setEmail("Madhukkp321@gmail.com");
		details2.setAdress("Banglore");

		ContactDetailsDTO details3 = new ContactDetailsDTO();
		details3.setContactNumber(8547216726l);
		details3.setEmail("faisal.faisu@gmail.com");
		details3.setAdress("Turvekere");

		dto.setDetails(details);
		dto1.setDetails(details1);
		dto2.setDetails(details2);
		dto3.setDetails(details3);

		DonarOperation operation = new DonarOperation();
		operation.save(dto);
		operation.save(dto1);
		operation.save(dto2);
		operation.save(dto3);
		operation.printAll();
		System.out.println();
		System.out.println("get by bloodgroup");
		DonerDTO res = operation.getByBloodGroup(BloodGroup.A_POSITIVE);
		System.out.println(res.toString());
		System.out.println();
		System.out.println("get by gender");
		DonerDTO get = operation.getByGender(Gender.MALE);
		System.out.println(get.toString());
		System.out.println();
		System.out.println("updated contact number by name");
		DonerDTO update = operation.updateContactByName("Madhu", 9624365987l);
		System.out.println(update.toString());
		System.out.println();
		operation.printAll();
		System.out.println();
		System.out.println("get all female array");
		DonerDTO[] all = operation.getByAllGender(Gender.FEMALE);
		for (int index = 0; index < all.length; index++) {
			System.out.println(all[index]);
			System.out.println();
			System.out.println("get by bloodgroup by array");
			DonerDTO[] response = operation.getByAllBloodGroup(BloodGroup.A_POSITIVE);
			for (int i = 0; i < response.length; i++) {
				System.out.println(response[i]);
				System.out.println();

			}

		}

	}

}
