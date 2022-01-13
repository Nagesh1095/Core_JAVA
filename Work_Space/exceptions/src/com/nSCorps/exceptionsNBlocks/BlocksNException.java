package com.nSCorps.exceptionsNBlocks;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class BlocksNException {

	public static String name;
	public static int numbers;
	public int nums[];

	public BlocksNException() {
		System.out.println("\n" + "Invoke the Constructor");
		{
			{
				System.out.println("\nInvoke the Instance 2");
				File file = new File("E:\\Work_Space\\Bank\\src\\com\\xworkz\\bank\\TestEmployee");

				BufferedReader reader = null;
				try {
					reader = new BufferedReader(new FileReader(file));
				} catch (FileNotFoundException e) {
					System.err.println("\n" + e.getMessage());
				}

				String read;
				try {
					while ((read = reader.readLine()) != null) {
						System.out.println(read);
					}
				} catch (IOException e) {
					System.err.println("\n" + e.getMessage());
				}
			}

			System.out.println("\nInvoke the Instance 3");
		}

	}

	static {
		{
			System.out.println("Invoke the Static 1");
			name = "Nagesha N";
			try {
				numbers = Integer.parseInt(name.toUpperCase());
			} catch (NumberFormatException numberFormatException) {
				System.err.println("\n" + numberFormatException.getMessage());
			}
		}
	}
	{
		System.out.println("\n" + "Invoke the Instance 1");
		{
			try {
//				 code that may raise exception
				int data = 100 / 0;
			} catch (ArithmeticException exception) {
				System.err.println("\n" + exception.getMessage());
			}
			// rest code of the program
			System.out.println("\nrest of the code...");

		}

		{

			try {
				int nums[] = { 1, 2, 3, 4, 5 };
				System.out.println("\nIm selecting the Number " + nums[6]);
			} catch (ArrayIndexOutOfBoundsException e) {
				System.err.println("\n" + e.getMessage());
			}
		}
		{
			Object obj = new Object();
			try {
				String str = (String) obj;
				System.out.println(str);
			} catch (ClassCastException exception) {
				System.err.println("\n" + exception.getMessage());
			}
		}
	}
}
