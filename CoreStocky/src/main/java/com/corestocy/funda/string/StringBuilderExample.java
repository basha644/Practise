package com.corestocy.funda.string;

/*A StringBuilder is similar to StringBuffer but is not thread-safe. It is faster in single-threaded environments.

Key Points:
Mutable like StringBuffer.
        Not synchronized, hence faster in non-concurrent situations.
Common Methods:
Same as StringBuffer (e.g., append, insert, replace, delete, reverse).*/

public class StringBuilderExample {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Hello");

        // StringBuilder Methods
        sb.append(", World!");
        System.out.println("After append: " + sb); // 'Hello, World!'

        sb.insert(5, " Java");
        System.out.println("After insert: " + sb); // 'Hello Java, World!'

        sb.replace(6, 10, "Program");
        System.out.println("After replace: " + sb); // 'Hello Program, World!'

        sb.delete(5, 13);
        System.out.println("After delete: " + sb); // 'Hello, World!'

        sb.reverse();
        System.out.println("After reverse: " + sb); // '!dlroW ,olleH'
    }
}

