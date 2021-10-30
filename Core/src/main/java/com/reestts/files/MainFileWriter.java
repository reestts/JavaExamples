package com.reestts.files;

import java.io.FileWriter;
import java.io.IOException;

public class MainFileWriter {

    public static void main(String[] args) throws IOException {
        String text = "Text for testing FileWriter";
        try (FileWriter writer = new FileWriter("test_write.txt")) {
            for (int i = 0; i < text.length(); i++) {
                writer.write(text.charAt(i));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
