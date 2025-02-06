package com.corestocy.iopackage;

import java.io.*;

public class BufferedClass {
    public static void main(String[] args) throws IOException {
        File f = new File("D:\\Downloads\\Java\\new.txt");

        FileWriter fw = new FileWriter(f,true);
        BufferedWriter bw = new BufferedWriter(fw);
        bw.write("Foujiya");
        bw.newLine();
        bw.write("Nasima");
        bw.newLine();
        bw.write(65);
        bw.flush();
        bw.close();

        FileReader fr = new FileReader(f);
        BufferedReader br = new BufferedReader(fr);
        String i = br.readLine();
        while (i != null){
            System.out.println(i);
            i = br.readLine();
        }
        br.close();
        fr.close();


    }
}
