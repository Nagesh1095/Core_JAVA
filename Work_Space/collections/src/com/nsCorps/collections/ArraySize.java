package com.nsCorps.collections;

import java.util.Arrays;

public class ArraySize {
	public static void main(String[] args) {
		
		int[] arr = new int[5];
		int counter=0;
		for (int i = 0; i <=5; i++) {
			if(counter == arr.length) {
				int[] newArr = Arrays.copyOf(arr, arr.length+1);
				arr = newArr;
			}
			
			arr[i] = i*2;
			counter +=1;
		}
		
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i] +" ");
		}
	}

}
