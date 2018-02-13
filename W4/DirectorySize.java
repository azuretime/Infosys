package com.example;

import java.io.File;
import java.util.Scanner;

public class DirectorySize {
    public static int numOfFiles = 0;
    public static void main (String[] args) {
        //Prompt the user to enter a directory or file
        System.out.println ("Enter a directory or file: ");
        Scanner input = new Scanner(System.in);
        String directory = input.nextLine();

        //Display the size
        System.out.println(getSize(new File(directory)) + " bytes");

    }
    public static long getSize (File file) {
        //numOfFiles += 1;
        //System.out.println ("In getSize. Num of files = " + numOfFiles);
        long size = 0; // Store the total size of all files

        if (file.isDirectory()) {
            File[] files = file.listFiles(); //All files and subdirectories
            for (int i = 0; files != null && i < files.length; i++) {
                size += getSize(files[i]); //Recursive call
            }
        }
        else { //Base case
            size += file.length();
        }
        return size;
    }
}
