package com.nsCorps.collections.linkedList;

import java.util.LinkedList;

public class FlowerDAO {
	
	LinkedList<Flower> list = new LinkedList<Flower>();
	
	public void add(Flower naam) {
		list.add(naam);
		System.out.println("data added to the list----");
	}
	
	public void printAll() {
		for (Flower flower : list) {
			System.out.println(flower.toString());
		}
	}
	
	public Flower updateColorUsingName(String name,String color) {
		for (Flower flower : list) {
			if(name.equals(flower.getName())) {
				flower.setColor(color);
				return flower;
			}
			
		}
		return null;
	}
	
	
	public Flower getByColor(String color) {
		for (Flower flower : list) {
			if(color.equals(flower.getColor())) {
				list.get(0);
				return flower;
			}
		}
		return null;
	}
	
	public Flower deleteByPrice(int price) {
		for (Flower flower : list) {
		  if(price == flower.getPrice()) {
			  list.remove(flower);
		  }
			
		}
		return null;
	}

}
