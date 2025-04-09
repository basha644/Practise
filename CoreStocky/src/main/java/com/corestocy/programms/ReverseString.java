package com.corestocy.programms;

public class ReverseString {
    public static void main(String[] args) {
        String name = "Basha";
        String reverse = "";
        char c ;
        for(int i=0; i<name.length(); i++){
            c = name.charAt(i);
            reverse = c+ reverse;
        }
        System.out.println(reverse);
    }
}
