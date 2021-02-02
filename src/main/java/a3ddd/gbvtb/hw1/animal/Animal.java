package a3ddd.gbvtb.hw1.animal;

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

    public abstract void run(int go);
    public abstract void swim(int go);
}

