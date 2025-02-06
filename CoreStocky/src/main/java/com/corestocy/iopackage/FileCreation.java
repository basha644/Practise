package com.corestocy.iopackage;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileCreation {
    public static void main(String[] args) {
        

        try {
            // File and folder creation
            File f = new File("D:\\Downloads\\Java\\io.txt");
//            File d = new File("D:\\Downloads\\Java\\newFile");
//            f.createNewFile();
//            System.out.println(f.exists());
//            d.mkdir();
//            System.out.println(d.isDirectory());


//            FileWriter fw = new FileWriter(f,true);
//            fw.write("Akbar");
//            fw.write("\n");
//            fw.write(65);
//            fw.close();


            FileReader fr = new FileReader(f);
            int i = fr.read();
            while (i != -1){
                System.out.println(i);
                i = fr.read();
            }
            fr.close();

//            System.out.println(fw.toString());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

}
