package com.reestts.files;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class MainFileReader {

    public static void main(String[] args) throws IOException {
        try (FileReader reader = new FileReader("test_read.txt")) {
            int character;
            while ((character = reader.read()) != -1) {
                System.out.print((char) character);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
