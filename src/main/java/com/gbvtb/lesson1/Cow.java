package com.gbvtb.lesson1;

import com.gbvtb.lesson1.animals.Animal;

public class Cow extends Animal {
    public void info() {
        System.out.println(name + " " + color + " " + age);
    }

    @Override
    public void voice() {
        System.out.println("moo");
    }
}
