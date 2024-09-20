package com.basics;

public class DataTypes {
	byte first_Datatype = 127; // -128 to 127 1 byte
	short second$Datatype = 128; // 2 bytes
	int number_First = 10; // 4 bytes 2,147,483,647 not suitable for phonenumber
	long long123 = 2346778; // 8bytes
	float value = 0.02345f; // 6 to 7 decimal digits
	double fractionValue = 0.12345678901234566777;// 15 decimal digits
	boolean flag = true; // true/false
	char numeric = 'a'; // single character/letter or ASCII values
	
	Integer salary =10;
	Character sign='Y';
	
	// Primitive classes are faster when compared to wrapper classes. However, the
	// wrapper class allows null values but the primitive class does not allow any null values.
	// Wrapper classes help the Java program be completely object-oriented whereas
	// primitive data types help in the simple declaration of values with variables.

	// TypeCasting
	// byte -> short -> char -> int -> long -> float -> double
	int a = 10;
	long val = a; // Automatically
	byte b = (byte) a; // Manually
}
