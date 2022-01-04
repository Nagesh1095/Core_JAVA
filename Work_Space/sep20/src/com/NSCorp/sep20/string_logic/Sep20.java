package com.NSCorp.sep20.string_logic;

public class Sep20 {
	public static void main(String[] args) {
		
		String name = new String("Chatty");
		char ch=name.charAt(3);
		System.out.println(ch);
		
		String name1 = new String("Chatty");
		boolean b = name1.contains("Cha");
		System.out.println(b);
		
		String name2 = new String("Chatty ");
		String c=name2.concat("a"+"t");
		System.out.println(c);
		
		String name3 = new String("Chatty");
		boolean d = name3.equals("chatty");
		System.out.println(d);
	
		String name4 = new String("Chatty");
		int e = name4.indexOf("a");
		System.out.println(e);
		
		String name5 = new String("Chatty");
		boolean f = name5.isEmpty();
		System.out.println(f);
		
		String name6 = new String("Chatty");
		int g = name6.length();
		System.out.println(g);
		
		String name7 = new String("Chatty");
		String h = name7.replace('y','e');
		System.out.println(h);
		
		String name8 = new String("Chatty");
		char[] i = name8.toCharArray();
		System.out.println(i);
		
		String name9 = new String("Chatty");
		String j = name9.toLowerCase();
		System.out.println(j);
		
		String name10 = new String("Chatty");
		String k = name10.toUpperCase();
		System.out.println(k);
	
		String name11 = new String("Chatty");
		String[] l = name11.split("h");
		for(int index=0;index<l.length;index++) {
		System.out.println(l[index]);	
		}
		
		String name12 = new String("Chatty");
		int m = name12.lastIndexOf("");
		System.out.println(m);
		
		
	}
}
