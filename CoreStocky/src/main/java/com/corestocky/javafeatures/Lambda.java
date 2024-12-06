package com.corestocky.javafeatures;

/*Java Lambda expressions are one of the most significant features introduced in Java 8. They are a way to write more concise and functional code,
 especially useful for simplifying instances where you'd use anonymous classes. Lambdas are commonly used in functional interfaces,
 where you have exactly one abstract method.
Key Points:
Syntax: (parameters) -> {body}

Parameters: Inputs to the lambda.
        ->: Lambda operator.
Body: Logic of the function.
Functional Interface: An interface with only one abstract method (e.g., Runnable, Comparator, or custom interfaces annotated with @FunctionalInterface).

Common Use Cases:
Implementing functional interfaces.
Stream API for processing collections*/

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

interface calc{
    void add();
}

interface calci{
    int add(int a, int b);

}
class calcImpl implements calc,calci{

    @Override
    public void add() {

        System.out.println("normal way");
    }
    public int add(int a, int b){
        int c =a+b;
        System.out.println("addition two numbers: "+c);
        return c;
    };

}
public class Lambda {
    public static void main(String[] args) {
        calcImpl ci = new calcImpl();
        ci.add();

        calc c = new calc() {
            @Override
            public void add() {
                System.out.println("using inner class concept");
            }
        };
        System.out.println("some thing...");

        calc c1 = ()-> System.out.println("using Lambda concept"); //Syntax: (parameters) -> {body}

        List l = Arrays.asList("akbar","Farooq","adam","fouyzia","Akbar");
        l.sort(Comparator.naturalOrder());
        System.out.println(l);
        calci c2 = (a,b) -> a+b;
        System.out.println(c2);
        c1.add();
        System.out.println(c2.add(2,7));


    }
}
