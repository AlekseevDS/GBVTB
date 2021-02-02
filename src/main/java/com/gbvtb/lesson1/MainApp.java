package com.gbvtb.lesson1;

import com.gbvtb.lesson1.animals.Animal;
import com.gbvtb.lesson1.animals.Cat;
import com.gbvtb.lesson1.animals.Dog;

public class MainApp {
    public static void main(String[] args) {
        Cat cat = new Cat("Murz", "White", 15);
        Cat cat1 = new Cat("Bars", "Black", 5);
        Dog dog = new Dog("Tuz","BW", 2);

        Cat[] cats = new Cat[2];
        cats[0] = new Cat("A","Bl", 2);
        cats[1] = new Cat("B","Wt", 4);

        cats[0].info();
        cat.voice();
        dog.voice();

        Animal[] catsAndDogs = {
                new Cat("AA","Y", 3),
                new Dog("DD","W", 7)
        };
        for (Animal o : catsAndDogs) {
            o.voice();
        }

        Animal catA = new Cat("AC","FF", 4);

        if (catA instanceof Cat) {
            ((Cat)catA).methodCat(); // каст, говорим что Animal catA относится к Cat и берем его метод
        } else {
            System.out.println("NE KOT");
        }




    }
}
