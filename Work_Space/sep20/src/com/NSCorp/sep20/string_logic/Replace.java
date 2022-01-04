package com.NSCorp.sep20.string_logic;

public class Replace {
	public static void main(String[] args) {
		String N = new String("Hello World Lets live the life");
		char[] c = N.toCharArray();
		char ch = 'o';
		for(int i=0;i<c.length;i++) {
			if(ch==c[i]) {
				c[i]='O';
				System.out.println(c[i]);	
			}
			else {
				System.out.println(c[i]);	
			}
			
		}
	}
}
