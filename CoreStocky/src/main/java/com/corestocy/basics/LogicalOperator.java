package com.corestocy.basics;

public class LogicalOperator {
    // Logical AND(&&) vs Bitwise AND(&)
    //First, logical operators work on boolean expressions and return boolean values (either true or false)
    //whereas bitwise operators work on binary digits of integer values (long, int, short, char, and byte) return an integer
    //The logical && operator doesn't check the second condition if the first condition is false. It checks the second condition only if the first one is true.
    //The bitwise and operator always checks both conditions whether the first condition is true or false.

    public static void main(String[] args) {
        int a=10;
        int b=5;
        int c=20;
        int d=5;
        System.out.println(a<b && a++<c);//false && true = false
        System.out.println(a);//10 because the second condition is not checked
        System.out.println(a<b & a++<c);//false & true = false
        System.out.println(a);//11 because second condition is checked
        System.out.println( "if both are true : "+ (a>b & b==d)); // true
        System.out.println( "if both are not true : "+ (a>b & b<d)); // false
        System.out.println( a & b); // returns integer value: 1
        System.out.println();

        System.out.println("a value:"+a); // a=11
        System.out.println(a<b || a++<c);//false || true = true
        System.out.println(a);//12 because the both conditions checked
        System.out.println(a<b | a++<c);//false | true = true
        System.out.println(a);//13 because the both conditions checked
        System.out.println( "if both are true : "+ (a>b | b==d)); // true
        System.out.println( "if both are not true : "+ (a>b | b<d)); // true
        System.out.println( a | b); // returns integer value: 13


    }
}
