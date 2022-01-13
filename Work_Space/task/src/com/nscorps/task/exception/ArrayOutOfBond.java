package com.nscorps.task.exception;

public class ArrayOutOfBond {
	public static void main(String[] args) {
		int[] num= {1,2,3,4,5,6,7};
		for(int index=0;index<num.length;index++) {
			
			System.out.println(num[index]);
		}
	}

}
