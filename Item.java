package com.telran.prof.org.algoritms.homeworknine;

import lombok.Getter;

@Getter
public class Item {

    int weight;
    int value;
    double valuePerWeight;

    public Item(int weight, int value) {
        this.weight = weight;
        this.value = value;
        this.valuePerWeight = (double) value / weight;
    }
}