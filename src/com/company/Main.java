package com.company;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        writer();
        reader();

    }
    public static void writer() throws IOException {
       // FileWriter writer = new FileWriter("alphabet.txt");
        String str = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String str1="abcdefghijklmnopqrstuvwxyz";
        String num = "012345679";
        try {

            FileWriter fw
                    = new FileWriter("alphabet.txt");


            for (int i = 0; i < str.length(); i++) {
                fw.write(str.charAt(i)+" "+str1.charAt(i)+"\n");

            }
            for (int i = 0; i < num.length(); i++) {
                fw.write(num.charAt(i)+"\n");
            }
            System.out.println("Successfully written");

            fw.close();
        }
        catch (Exception e) {
            e.getStackTrace();
        }

    }
    public static void reader() throws IOException {
        FileReader reader = new FileReader("alphabet.txt");
        Scanner scanner = new Scanner(reader);

        while (scanner.hasNextLine()){
            System.out.println(scanner.nextLine());
        }
        reader.close();
    }

}
