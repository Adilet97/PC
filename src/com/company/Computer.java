package com.company;

public abstract class Computer implements Printable {
    private String type;
    private String name;

    public Computer(String type, String name) {
        this.type = type;
        this.name = name;
    }
    public String getInfo(){
        return "type: " + type + "\n Name:" + name;
    }
}
