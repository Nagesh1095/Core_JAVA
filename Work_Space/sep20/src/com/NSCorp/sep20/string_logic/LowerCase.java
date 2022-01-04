package com.NSCorp.sep20.string_logic;

public class LowerCase {
	public static void main(String []args) {
	
		String name="NAGESH";
		char[] a =name.toCharArray();
		
		for(int i=0;i<a.length;i++) {
			
			if(a[i]>='A' && a[i]<='Z') {
				a[i]=(char)((a[i] +32));
			}
		
			System.out.print(a[i]);
		}
	}
}

