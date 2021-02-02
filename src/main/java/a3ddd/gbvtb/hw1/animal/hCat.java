package a3ddd.gbvtb.hw1.animal;

public class hCat extends Animal {
    public hCat(String name) {
        this.name = name;
        this.run = 200;
        this.swim = 0;
        countHcat++;
        countAnim++;
    }

/*    int countHcat;

    public int getCountHcat() {
        return countHcat;
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
        System.out.println("Cats isn`t swimming, and " + name + " too");
    }
}
