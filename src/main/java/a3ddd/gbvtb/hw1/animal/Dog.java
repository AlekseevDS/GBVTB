package a3ddd.gbvtb.hw1.animal;

public class Dog extends Animal {
    public Dog(String name) {
        this.name = name;
        this.run = 500;
        this.swim = 10;
        countDog++;
        countAnim++;
    }

/*    int countDog;

    public int getCountDog() {
        return countDog;
    }
*/

    public void run(int go) {
        if (go <= this.run) {
            System.out.println(name + " пробежал " + go + " метров");
        } else {
            System.out.println(name + " не смог");
        }
    }

    public void swim(int go) {
        if (go <= this.swim) {
            System.out.println(name + " проплыл " + go + " метров");
        } else {
            System.out.println(name + " не смог проплыть");
        }
    }


}