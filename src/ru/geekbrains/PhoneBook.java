package ru.geekbrains;

import java.util.HashMap;
import java.util.HashSet;

public class PhoneBook {

    HashMap<String, HashSet<String>> phoneBook;

    public PhoneBook() {
        this.phoneBook = new HashMap<>();
    }

    public void add(String name, String phone) {
        String lname = name.toLowerCase();
        HashSet<String> hashName = phoneBook.getOrDefault(lname, new HashSet<>());
        hashName.add(phone);
        phoneBook.put(lname, hashName);
    }

    public void get(String name) {
        String lname = name.toLowerCase();
        System.out.println("Пользователь: " + name + "\tТелефон: " + phoneBook.getOrDefault(lname, new HashSet<>()));
    }
}
