package com.company;

public class Main {

    public static void main(String[] args) {
        Printable print[] = {createObject("firstObject"), createObject("secondObject"), createObject("thirdObject")};
        for (Printable printable: print){
            printable.print();
        }
    }

    public static Printable createObject(String className) {

        switch (className){
            case "firstObject":
                Lenovo lenovo = new Lenovo("L-15n09", "Lenovo", "110-15 (80TR000GRK)");
                return lenovo;

            case "secondObject":
                Acer acer= new Acer ("A-19v79", "Acer", "Chromebook Spin 713");
                return acer;

            case "thirdObject":
                Samsung samsung = new Samsung("S-22m89", "Samsung", "Galaxy Book Flex2 Alpha");
                return samsung;
        }
        return null;
    }
}



