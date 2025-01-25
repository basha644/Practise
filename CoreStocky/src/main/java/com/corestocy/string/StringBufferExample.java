package com.corestocy.string;

/*A StringBuffer is a mutable sequence of characters, which means it can be modified without creating new objects.

Key Points:
Thread-safe (synchronized), suitable for multithreaded environments.
Slightly slower due to synchronization overhead.
Common Methods:
append(String): Adds text to the end.
insert(offset, String): Inserts text at a specific position.
Replace(start, end, String): Replaces part of the text.
delete(start, end): Deletes characters.
reverse(): Reverses the sequence.*/

public class StringBufferExample {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Hello");

        // StringBuffer Methods
        sb.append(", World!"); // Appends text
        System.out.println("After append: " + sb); // 'Hello, World!'

        sb.insert(5, " Java"); // Inserts text at index 5
        System.out.println("After insert: " + sb); // 'Hello Java, World!'

        sb.replace(6, 10, "Program"); // Replaces 'Java' with 'Program'
        System.out.println("After replace: " + sb); // 'Hello Program, World!'

        sb.delete(5, 13); // Deletes ' Program'
        System.out.println("After delete: " + sb); // 'Hello, World!'

        sb.reverse(); // Reverses the string
        System.out.println("After reverse: " + sb); // '!dlroW ,olleH'
    }
}

