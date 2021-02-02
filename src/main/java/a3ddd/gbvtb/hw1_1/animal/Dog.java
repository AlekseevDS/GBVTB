package a3ddd.gbvtb.hw1_1.animal;

public class Dog extends Animal {
    public Dog(String name) {
        this.name = name;
        this.run = 500;
        this.swim = 10;
        countDog++;
        countAnim++;
    }
}