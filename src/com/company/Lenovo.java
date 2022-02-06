package com.company;

public class Lenovo extends Computer {
    private String model;

    public Lenovo(String type, String name, String model) {
        super(type, name);
        this.model = model;

    }

    @Override
    public void print() {
        System.out.println(getInfo() + "\nmodel:" + model);
    }
}
