package com.reestts.files;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class MainBuffered {

    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new FileReader("test_read.txt"));
             BufferedWriter writer = new BufferedWriter(new FileWriter("test_write.txt"))) {
            int character;
            while ((character = reader.read()) != -1) {
                writer.write(character);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
