package com.nSCorps.recursion;

public class Recursion {
	public static void main(String[] args) {

		int result = sum(10, 20);
		System.out.println(result);
	}

	public static int sum(int start, int end) {
		if (end > start) {
			return end + sum(start, end - 2);
		} else
			return end;
	}
}
