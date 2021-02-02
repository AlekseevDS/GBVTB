package a3ddd.gbvtb.hw1;

import a3ddd.gbvtb.hw1.animal.Animal;
import a3ddd.gbvtb.hw1.animal.hCat;
import a3ddd.gbvtb.hw1.animal.Dog;

public class MainHw1 {
    public static void main(String[] args) {
        Animal c = new hCat("111");
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

//      System.out.println("Anim/Cat/Dog: " + animHw[1].getCountAnim() + ((hCat)animHw[1]).getCountHcat());
        //Это если счетчик хранится в классе с животным

/*        System.out.println(Animal.getCountAnim()); // варианты вызова геттеров
        System.out.println(Animal.getCountHcat());
        System.out.println(Animal.getCountDog());
        System.out.println(Animal.getCountAll());
*/
        System.out.println("Anim/Dog/Cat: " + Animal.getCountAll());
    }
}
