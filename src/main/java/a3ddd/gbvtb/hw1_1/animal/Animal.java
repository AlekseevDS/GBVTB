package a3ddd.gbvtb.hw1_1.animal;

public abstract class Animal {
    String name;
    int run;
    int swim;
    static int countAnim;
    static int countDog;
    static int countHcat;

    public static int getCountAnim() {
        return countAnim;
    }

    public static int getCountDog() {
        return countDog;
    }

    public static int getCountHcat() {
        return countHcat;
    }

    public static String getCountAll() {
        return (getCountAnim() + "/" + getCountDog() + "/" + getCountHcat());

    }

    public void run(int go) {
        if (go <= this.run) {
            System.out.println(name + " пробежал " + go + " метров");
        } else {
            System.out.println(name + " не смог пробежать");
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

