package com.company;

public class Samsung extends Computer {
    private String model;

    public Samsung (String type, String name, String model) {
        super(type, name);
        this.model = model;
    }

    @Override
    public void print() {
        System.out.println(getInfo() + "\nmodel:" + model);
    }
}
