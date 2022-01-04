package com.nsCorps.typeCasting;

public class TypeCasting {
	byte byteValue = 68;
	short shortValue = 65;
	int intValue = 66;
	long longValue = 70;
	float floatValue = 67.458f;
	double doubleValue = 69.25551;
	char value = 'G';

	public void tcByte() {

		System.out.println("Conversion of byte into other primitive datatypes");
		short tcShort = byteValue;
		System.out.println(tcShort);
		int tcInt = byteValue;
		System.out.println(tcInt);
		long tcLong = byteValue;
		System.out.println(tcLong);
		float tcFloat = byteValue;
		System.out.println(tcFloat);
		double tcDouble = byteValue;
		System.out.println(tcDouble);
		char tcChar = (char) byteValue;
		System.out.println(tcChar);

	}

	public void tcShort() {

		System.out.println("Conversion of short into other primitive datatypes");
		byte tcByte = (byte) shortValue;
		System.out.println(tcByte);
		int tcInt = shortValue;
		System.out.println(tcInt);
		long tcLong = shortValue;
		System.out.println(tcLong);
		float tcFloat = shortValue;
		System.out.println(tcFloat);
		double tcDouble = shortValue;
		System.out.println(tcDouble);
		char tcChar = (char) shortValue;
		System.out.println(tcChar);

	}

	public void tcInt() {

		System.out.println("Conversion of int into other primitive datatypes");
		byte tcByte = (byte) intValue;
		System.out.println(tcByte);
		short tcShort = (short) intValue;
		System.out.println(tcShort);
		long tcLong = intValue;
		System.out.println(tcLong);
		float tcFloat = intValue;
		System.out.println(tcFloat);
		double tcDouble = intValue;
		System.out.println(tcDouble);
		char tcChar = (char) intValue;
		System.out.println(tcChar);

	}

	public void tcLong() {

		System.out.println("Conversion of long into other primitive datatypes");
		byte tcByte = (byte) longValue;
		System.out.println(tcByte);
		int tcInt = (short) longValue;
		System.out.println(tcInt);
		short tcShort = (short) longValue;
		System.out.println(tcShort);
		float tcFloat = longValue;
		System.out.println(tcFloat);
		double tcDouble = longValue;
		System.out.println(tcDouble);
		char tcChar = (char) longValue;
		System.out.println(tcChar);

	}

	public void tcFloat() {

		System.out.println("Conversion of float into other primitive datatypes");
		byte tcByte = (byte) floatValue;
		System.out.println(tcByte);
		int tcInt = (short) floatValue;
		System.out.println(tcInt);
		short tcShort = (short) floatValue;
		System.out.println(tcShort);
		long tcLong = (long) floatValue;
		System.out.println(tcLong);
		double tcDouble = floatValue;
		System.out.println(tcDouble);
		char tcChar = (char) floatValue;
		System.out.println(tcChar);

	}

	public void tcDouble() {

		System.out.println("Conversion of double into other primitive datatypes");
		byte tcByte = (byte) doubleValue;
		System.out.println(tcByte);
		int tcInt = (short) doubleValue;
		System.out.println(tcInt);
		short tcShort = (short) doubleValue;
		System.out.println(tcShort);
		long tcLong = (long) doubleValue;
		System.out.println(tcLong);
		float tcFloat = (float) doubleValue;
		System.out.println(tcFloat);
		char tcChar = (char) doubleValue;
		System.out.println(tcChar);
	}

	public void tcChar() {

		System.out.println("Conversion of char into other primitive datatypes");
		byte tcByte = (byte) value;
		System.out.println(tcByte);
		int tcInt = (short) value;
		System.out.println(tcInt);
		short tcShort = (short) value;
		System.out.println(tcShort);
		long tcLong = (long) value;
		System.out.println(tcLong);
		float tcFloat = (float) value;
		System.out.println(tcFloat);
		char tcChar = (char) value;
		System.out.println(tcChar);
	}

	public void toBoolean() {
		byte data = 20;
		boolean b = true;

		boolean value = true;
		System.out.println("Conversion of boolean into other primitive datatypes");
		byte tcByte = (byte) value;
		System.out.println(tcByte);
		int tcInt = (int) value;
		System.out.println(tcInt);
		short tcShort = (short) value;
		System.out.println(tcShort);
		long tcLong = (long) value;
		System.out.println(tcLong);
		float tcFloat = (float) value;
		System.out.println(tcFloat);
		char tcChar = (char) value;
		System.out.println(tcChar);
	}
}
