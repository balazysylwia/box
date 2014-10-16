package com.company;

public class Main {

    public static void main(String[] args) {
        Boxx<Integer> integerBox;
        integerBox = new Boxx<Integer>();
        integerBox.add(new Integer(10));
        Integer someInteger = integerBox.get();
        System.out.println(someInteger);
    }
}
