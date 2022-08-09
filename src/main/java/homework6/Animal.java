package homework6;

public abstract class Animal {
    private static int countOfAnimals = 0;
    protected String name;

    public Animal(String name) {
        this.name = name;
        countOfAnimals++;
    }

    public abstract void run(int length);

    public abstract void swim(int length);

    public static int getCountOfAnimals() {
        return countOfAnimals;
    }
}
