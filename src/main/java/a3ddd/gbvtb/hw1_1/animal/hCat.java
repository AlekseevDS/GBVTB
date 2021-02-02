package a3ddd.gbvtb.hw1_1.animal;

public class hCat extends Animal {
    public hCat(String name) {
        this.name = name;
        this.run = 200;
        this.swim = 0;
        countHcat++;
        countAnim++;
    }

@Override
    public void swim(int go) {
        System.out.println("Cats isn`t swimming, and " + name + " too");
    }
}
