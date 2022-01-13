package com.nSCorps.writeTheFile;

import java.io.FileWriter;

public class WriteTheFile {
	public static void main(String args[]) {
		try {
			FileWriter fw = new FileWriter("E:\\FileWriter.txt");
			fw.write("Hello Devs");
			fw.close();
		} catch (Exception e) {
			System.out.println("Sariyag Hakale");
		}
		System.out.println("File Created.....");
	}
}
