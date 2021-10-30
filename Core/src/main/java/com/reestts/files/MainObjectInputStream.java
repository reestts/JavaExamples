package com.reestts.files;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.List;

public class MainObjectInputStream {

    public static void main(String[] args) {
        List<String> cars;
        try (ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("cars.bin"))) {
            cars = (ArrayList) inputStream.readObject();
            System.out.println(cars);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
