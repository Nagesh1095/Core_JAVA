package com.NSCorp.sep20.string_logic;

public class UpperCase {
	public static void main(String []args) {
		
		String name="nagesh";
		char[] a =name.toCharArray();
		
		for(int i=0;i<a.length;i++) {
			
			if(a[i]>='a' && a[i]<='z') {
				a[i]=(char)((a[i] -32));
			}
		
			System.out.print(a[i]);
		}
	}
}

