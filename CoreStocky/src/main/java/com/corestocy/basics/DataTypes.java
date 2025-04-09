package com.corestocy.basics;

public class DataTypes {
    byte first_Datatype = 127; // -128 to 127 1 byte
    short second$Datatype = 128; // 2 bytes
    int number_First = 10; // 4 bytes 2,147,483,647 not suitable for phone number
    long long123 = 2346778; // 8bytes
    float value = 0.02345f; // 6 to 7 decimal digits
    double fractionValue = 0.12345678901234566777;// 15 decimal digits
    boolean flag = true; // true/false
    char numeric = 'a'; // single character/letter or ASCII values

    Integer salary = 10;
    Character sign = 'Y';

    // Primitive classes are faster when compared to wrapper classes. However, the
    // wrapper class allows null values, but the primitive class does not allow any null values.
    // Wrapper classes help the Java program be completely object-oriented, whereas
    // primitive data types help in the simple declaration of values with variables.

    /*Primitive Types
    Simplicity and Efficiency: Primitive types are straightforward and more efficient in terms of memory usage and performance.
    They directly hold the value without any additional overhead of objects.
    Working with Arrays, Default Values

    Wrapper Classes
    Additional Functionality: Wrapper classes provide additional functionalities and utility methods that are not available in primitive types.
    For example, parsing, conversion, comparison, and utility methods for working with data.
    Nullability: Wrapper classes can handle null values, whereas primitive types cannot.*/

    // TypeCasting
    // byte -> short -> char -> int -> long -> float -> double
    int a = 10;
    long val = a; // Automatically
    byte b = (byte) a; // Manually

    public static void main(String[] args) {
        boolean value = false;
        String s = "True";
        Boolean v = value; // AutoBoxing from primitive to Wrapper for particular datatype
        Boolean val = Boolean.valueOf(value);
        Boolean va = Boolean.valueOf(s);
        System.out.println("va: "+va);
        String ss = String.valueOf(va);
        System.out.println(ss);
    }
}
