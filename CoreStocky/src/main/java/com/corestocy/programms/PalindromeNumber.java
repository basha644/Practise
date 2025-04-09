package com.corestocy.programms;

public class PalindromeNumber {
    static int reversNumber(int n)
    {
         n = 123464321;

        int reversed_n = 0;
        while (n > 0) {
            reversed_n = reversed_n * 10 + n % 10; // (%- Modulo 7 % 3 = 1)
            n = n / 10; // (/- Division 7 / 3 = 2)
        }
        return reversed_n;
    }

    // Main function
    public static void main(String[] args)
    {
        int n = 123464321;
        int reverseN = reversNumber(n);
        System.out.println("Reverse of n = " + reverseN);

        // Checking if n is same
        // as reverse of n
        if (n == reverseN)
            System.out.println("Palindrome = Yes");
        else
            System.out.println("Palindrome = No");
    }

}
