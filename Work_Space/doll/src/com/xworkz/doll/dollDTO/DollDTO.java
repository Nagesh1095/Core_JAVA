package com.xworkz.doll.dollDTO;

public class DollDTO {
	String type;
	int size;
	String color;
	short price;
	
	public void Designadoll() {
		System.out.println("Reguler Doll");
	}

	public void Designadoll(String type) {
		System.out.println("Reguler Doll Type	"+ type);
	}

	public void Designadoll(String color,int size ) {
		System.out.println("Reguler Doll Color and Size 	"+ color + size);
	}

	public void Designadoll(short price) {
		System.out.println("Reguler Doll price	"+ price);
	}
	
	
	
}
