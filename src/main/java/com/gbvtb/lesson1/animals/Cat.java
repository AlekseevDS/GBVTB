package com.gbvtb.lesson1.animals;

public class Cat extends Animal{
    //private, default, protected, public

    public Cat(String name, String color, int age) {
        this.name = name;
        this.color = color;
        this.age = age;
    }

    @Override
    public void voice() {
        System.out.println(name + " Myu");
    }

    public void methodCat() {
        System.out.println("Cat Met");
    }
}

