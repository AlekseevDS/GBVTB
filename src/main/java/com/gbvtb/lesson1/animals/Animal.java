package com.gbvtb.lesson1.animals;

public abstract class Animal {
    protected String name;
    protected String color;
    protected int age;

    public void info() {
        System.out.println(name + " " + color + " " + age);
    }

    public abstract void voice();
}
