package homework6;

public class Cat extends Animal {
    private static int countOfCats = 0;

    public Cat(String name) {
        super(name);
        countOfCats++;
    }

    @Override
    public void run(int length) {
        if (length > 200) {
            System.out.println("Коты так много не бегают!");
        } else {
            System.out.printf("Кот %s пробежал %d м%n", name, length);
        }
    }

    @Override
    public void swim(int length) {
        System.out.println("Коты не умеют плавать!");
    }

    public static int getCountOfCats() {
        return countOfCats;
    }
}
