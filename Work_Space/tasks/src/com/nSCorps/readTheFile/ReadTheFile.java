package com.nSCorps.readTheFile;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class ReadTheFile {
	
	public static void main(String[] args) throws Exception {
		
		File file = new File("E:\\Work_Space\\Bank\\src\\com\\xworkz\\bank\\TestEmployee.java");
		
		BufferedReader reader =new BufferedReader(new FileReader(file));
		
		String read;
		while((read=reader.readLine())!=null) {
		System.out.println(read);
		}
	}

}
