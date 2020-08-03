package ru.geekbrains;

import java.util.*;

public class Main {

    public static void main(String[] args) {
	// write your code here

        String[] testArrayString = {"дерево", "дом", "башня", "остров", "дом", "овраг", "дом", "башня", "замок", "кровать",
                "замок", "кухня", "мост", "дом", "дерево", "коса", "овраг", "дом", "плюк", "беловодье"};

        System.out.println("1. Входной массив");
        System.out.println(Arrays.toString(testArrayString));

        Set<String> set = new LinkedHashSet<>();
        for (String item: testArrayString) {
            set.add(item.toString());
        }
        System.out.println("= Выводим уникальные значения:");
        System.out.println(set);


        System.out.println("2. Телефонная книга");
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.add("Иван", "+79111234567");
        phoneBook.add("Марья", "+79111234568");
        phoneBook.add("Степан", "+79121234569");
        phoneBook.add("Алевтина", "+79121234566");
        phoneBook.add("Прокл", "+79112223344");

        System.out.println("Выводим результаты поиска");
        phoneBook.get("Марья");
        phoneBook.get("СТЕПАН");
        phoneBook.get("ШтирЛИЦ");
    }
}
