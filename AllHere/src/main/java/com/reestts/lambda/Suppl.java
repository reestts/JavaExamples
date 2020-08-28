package com.reestts.lambda;

import java.util.Scanner;
import java.util.function.Supplier;

public class Suppl {
    public static void main(String[] args) {
        Supplier<User> userFactory = () -> {
            Scanner in = new Scanner(System.in);
            System.out.println("Введите имя: ");
            String name = in.nextLine();
            return new User(name);
        };

        User user1 = userFactory.get();
        User user2 = userFactory.get();

        System.out.println("Имя user1: " + user1.getName());
        System.out.println("Имя user2: " + user2.getName());
    }
}

class User {
    private String name;

    User(String n) {
        this.name = n;
    }

    String getName() {
        return name;
    }
}