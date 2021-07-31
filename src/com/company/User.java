package com.company;

import java.util.ArrayList;
import java.util.List;

public class User {
    private String name;
    private int id;
    private char sex;
    private int age;
//    private String contactNumber;

    private static List<User> list = new ArrayList<>();

    public User(String name, Character sex, int age) {
        this.name = name;
//        this.id = id;
        this.sex = sex;
        this.age = age;
//        this.contactNumber = contactNumber;
    }

    public static void addUser(User user) {
        list.add(user);
    }


}
