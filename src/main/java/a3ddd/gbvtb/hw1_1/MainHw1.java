package a3ddd.gbvtb.hw1_1;

import a3ddd.gbvtb.hw1_1.animal.Dog;
import a3ddd.gbvtb.hw1_1.animal.hCat;
import a3ddd.gbvtb.hw1_1.animal.Animal;

public class MainHw1 {
    public static void main(String[] args) {
        Animal[] animHw = {
                new hCat("Murz"),
                new Dog("Bob"),
                new Dog("Max"),
                new hCat("bars")
        };

        for (Animal i : animHw) {
            i.run(400);
            i.swim(25);
        }

        System.out.println("Anim/Dog/Cat: " + Animal.getCountAll());
    }
}
