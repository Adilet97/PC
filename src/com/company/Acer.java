package com.company;

public class Acer extends Computer {
    private String model;

    public Acer(String type, String name, String model) {
        super(type, name);
        this.model=model;

    }


    @Override
    public void print() {
        System.out.println(getInfo()+ "\nmodel:"+model);

    }
}
