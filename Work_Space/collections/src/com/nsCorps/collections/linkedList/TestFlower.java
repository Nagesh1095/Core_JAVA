package com.nsCorps.collections.linkedList;

public class TestFlower {
	public static void main(String[] args) {
		
		Flower dto = new Flower();
		Flower dto1 = new Flower();
		
		dto.setName("Rose");
		dto.setColor("Red");
		dto.setPrice(400);
		dto.setScientificName("Rosa");
		dto.setSepals((byte)80);
		
		dto1.setName("hybiscus");
		dto1.setColor("maroon");
		dto1.setPrice(300);
		dto1.setScientificName("hibiscus rosa-sinensis");
        dto1.setSepals((byte)5);
        
       
		
		
		FlowerDAO dao = new FlowerDAO();
		dao.add(dto);
		dao.add(dto1);
		dao.printAll(); 
		System.out.println();
		Flower upd=dao.updateColorUsingName("hybiscus", "saffron");
		System.out.println(upd);
		System.out.println();
		dao.printAll();
		System.out.println();
		
		Flower get = dao.getByColor("Red");
		System.out.println(get);
		System.out.println();
		Flower del=dao.deleteByPrice(400);
		System.out.println(del);
		System.out.println();
		dao.printAll();
	}

}
