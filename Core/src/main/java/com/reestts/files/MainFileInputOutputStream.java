package com.reestts.files;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class MainFileInputOutputStream {

    public static void main(String[] args) {
        try (FileInputStream inputStream = new FileInputStream("Access modifiers.jpg");
             FileOutputStream outputStream = new FileOutputStream("Access modifiers.jpg")) {
            int i;
            while ((i = inputStream.read()) != -1) {
                outputStream.write(i);
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
