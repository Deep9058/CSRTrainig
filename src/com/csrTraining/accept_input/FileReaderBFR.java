package com.csrTraining.accept_input;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderBFR {
    static void main(String[] args) throws IOException {
        FileReader fileReader=new FileReader("D:\\dhruv\\Sample File.txt");
        BufferedReader bf= new BufferedReader(fileReader);
        String line;
        while ((line= bf.readLine())!=null)
        {
            System.out.println(line);
        }
        bf.close();
}
}
