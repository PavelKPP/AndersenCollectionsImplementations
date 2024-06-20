package com.andersencollectionsimplementation;

import com.andersencollectionsimplementation.arraylist.CustomArrayList;
import com.andersencollectionsimplementation.hashset.CustomHashSet;

import java.util.Iterator;

public class Main {
    private static CustomArrayList customArrayList = new CustomArrayList();
    public static void main(String[] args) {

        System.out.println("custom array list:");
        customArrayList.put("Andriy");
        customArrayList.put("Pavlo");
        customArrayList.put("Sviatoslav");
        customArrayList.put("Anderson");
        customArrayList.put("Java");
        customArrayList.put("From");
        customArrayList.put("Scratch");

        displayCustomArrayList();

        customArrayList.delete(2);
        System.out.println("custom array list after deletions: ");

        displayCustomArrayList();

        System.out.println("get by index:" + " [" + customArrayList.getByIndex(4) + "]");

        System.out.println("creating a customHashSet:");
        CustomHashSet customHashSet = new CustomHashSet();
        customHashSet.add(1);
        customHashSet.add(20);
        customHashSet.add(30);
        customHashSet.add(40);
        customHashSet.add(100);
        customHashSet.add(12);
        customHashSet.add(33);
        customHashSet.add(55);

        System.out.println("displaying custom hashset");
        customHashSet.display();
    }

    public static void displayCustomArrayList() {
        for(int i = 0; i < customArrayList.getSize(); i++) {
            System.out.println(customArrayList.getByIndex(i));
        }
    }
}
