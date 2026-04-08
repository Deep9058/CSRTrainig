package com.csrTraining.accept_input;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class FileReaderScanner {
    static void main(String[] args) throws IOException {
        File file= new File("D:\\dhruv\\Sample File.txt");
        Scanner sc= new Scanner(file);
        String line;
        while (sc.hasNextLine())
        {
            System.out.println(sc.nextLine());
        }
        sc.close();
    }
}
