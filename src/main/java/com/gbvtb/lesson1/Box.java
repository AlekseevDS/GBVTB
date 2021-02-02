package com.gbvtb.lesson1;

public class Box {
    String color;
    int size;

    public Box(String color, int size) {
        this.color = color;
        this.size = size;
    }
    public boolean equals(Object obj) { // переопределения equals для сравнения коробок по заданным параметрам
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Box)) {
            return  false;
        }
        Box anotherBox = (Box)obj;
        return this.color.equals(anotherBox.color) && this.size == anotherBox.size;

    }

}
