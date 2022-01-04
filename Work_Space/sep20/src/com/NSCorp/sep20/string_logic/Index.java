package com.NSCorp.sep20.string_logic;

public class Index {
	public static void main(String[] args) {
		String N = new String("Hello World Lets live the life");
		char[] c = N.toCharArray();
		char ch = 'o';
		for(int i=0;i<c.length;i++) {
			if(c[i]==ch) {
		System.out.println(i);	
			}		
		}
	}
}
