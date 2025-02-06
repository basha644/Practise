package com.corestocy.iopackage;

import java.io.*;

class Student implements Serializable {
    String name;
    transient int rool_num;
    long phone_num;

    public Student() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRool_num() {
        return rool_num;
    }

    public void setRool_num(int rool_num) {
        this.rool_num = rool_num;
    }

    public long getPhone_num() {
        return phone_num;
    }

    public void setPhone_num(long phone_num) {
        this.phone_num = phone_num;
    }

    void display(){
        System.out.println("name: "+ name);
        System.out.println("rool_num: "+ rool_num);
        System.out.println("phone_num: "+ phone_num);

    }
    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", rool_num=" + rool_num +
                ", phone_num=" + phone_num +
                '}';
    }

    public Student(String name, int rool_num, long phone_num) {
        this.name = name;
        this.rool_num = rool_num;
        this.phone_num = phone_num;
    }
}

public class StreamClass {
    public static void main(String[] args) {
//        Student s = new Student("Basha",1,123456780);
//        s.display();
//        try {
//            FileOutputStream fos = new FileOutputStream("D:\\Downloads\\Java\\file.txt");
//            ObjectOutputStream oos = new ObjectOutputStream(fos);
//            oos.writeObject(s);
//            oos.close();
//            fos.close();
//        } catch (FileNotFoundException e) {
//            throw new RuntimeException(e);
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }
//
//    }
        try {
            FileInputStream fis = new FileInputStream("D:\\Downloads\\Java\\file.txt");
            ObjectInputStream ois = new ObjectInputStream(fis);
           Student s1= (Student) ois.readObject();
           s1.display();

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

}}
