package com.reestts.files;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class MainObjectOutputStream {

    public static void main(String[] args) {

        List<String> muscleCars = new ArrayList<>();
        muscleCars.add("Chevrolet Camaro");
        muscleCars.add("Dodge Challenger");
        muscleCars.add("Ford Mustang");

        try (ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("cars.bin"))) {
            outputStream.writeObject(muscleCars);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
