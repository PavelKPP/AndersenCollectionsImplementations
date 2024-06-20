package com.andersencollectionsimplementation.hashset;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class CustomHashSet {
    private final int MAX_VALUE = 10000000;
    private final int ARRAY_SIZE = 100;
    private List<List<Integer>> parental;

    public CustomHashSet() {
        parental = new ArrayList<>(ARRAY_SIZE);
        for(int i = 0; i < ARRAY_SIZE; i++) {
            parental.add(null);
        }
    }

    public void add(int key) {
        int index = key % ARRAY_SIZE;
        List<Integer> childish = parental.get(index);
        if (childish == null) {
            List<Integer> list = new LinkedList<>();
            list.add(key);
            parental.set(index, list);
        } else {
            if (!childish.contains(key)) {
                childish.add(key);
            }
        }
    }

    public void remove(int key) {
        int index = key % ARRAY_SIZE;
        List<Integer> childish = parental.get(index);
        if(childish != null) {
            childish.remove(Integer.valueOf(key));
        }
    }

    public boolean contains(int key) {
        int index = key % ARRAY_SIZE;
        List<Integer> childish = parental.get(index);
        return childish != null && childish.contains(key);
    }

    public Integer getValue(int key) {
        int index = key % ARRAY_SIZE;
        List<Integer> childish = parental.get(index);
        return childish.get(key);
    }

    public void display() {
       for(int i = 0; i < parental.size(); i++) {
           System.out.println(parental.get(i));
       }
    }

}
