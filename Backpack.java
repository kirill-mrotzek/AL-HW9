package com.telran.prof.org.algoritms.homeworknine;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Backpack {

    public static void main(String[] args) {
        List<Item>items = new ArrayList<>();
        items.add(new Item(2, 10));
        items.add(new Item(3, 15));
        items.add(new Item(5, 25));
        items.add(new Item(7, 35));

        int maxCapacity = 10;

        double maxValue = getMaxValue(items, maxCapacity);

        System.out.println(maxValue);
    }
    private static double getMaxValue(List<Item>items, int capacity){
        Collections.sort(items, Comparator.comparingDouble((Item item) -> item.valuePerWeight));
        double totalValue = 0;
        int currentWeight = 0;

        for (Item item : items) {
            if (currentWeight + item.weight <= capacity) {
                currentWeight += item.weight;
                totalValue += item.value;
            } else {
                int remainingWeight = capacity - currentWeight;
                totalValue += item.valuePerWeight * remainingWeight;
                break;
            }
        }
        return totalValue;
    }
}

