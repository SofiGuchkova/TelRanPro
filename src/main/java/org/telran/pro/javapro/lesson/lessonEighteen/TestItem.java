package org.telran.pro.javapro.lesson.lessonEighteen;

import java.util.Arrays;
import java.util.List;

public class TestItem {

    public static void main(String[] args) {
        List<Item> itemList = Arrays.asList(
                new Item("New", 33.5),
                new Item("City", 14),
                new Item("Window", 13),
                new Item("Phone", 43),
                new Item("Milk", 15),
                new Item("Table", 30),
                new Item("Sun", 11),
                new Item("Door", 14),
                new Item("Paper", 43),
                new Item("Phone", 31)
        );
        itemList.stream()
                .filter(a -> a.getPrice() > 20)
                .map(a -> a.getName())
                .distinct()
                .forEach(a -> System.out.println(a));

    }
}
