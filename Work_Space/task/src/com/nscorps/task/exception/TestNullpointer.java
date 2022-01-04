package com.nscorps.task.exception;

public class TestNullpointer {
	public static void main(String[] args) {
		
		Nullpointer pointer = new Nullpointer();
		pointer.save("arun");
		pointer.save("rajshekar");
		
		pointer.printAll();
	}

}
