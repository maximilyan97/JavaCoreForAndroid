package homework6;

public class Dog extends Animal {
    private static int countOfDogs = 0;

    public Dog(String name) {
        super(name);
        countOfDogs++;
    }

    @Override
    public void run(int length) {
        if (length > 500) {
            System.out.println("Псы так много не бегают!");
        } else {
            System.out.printf("Пес %s пробежал %d м%n", name, length);
        }
    }

    @Override
    public void swim(int length) {
        if (length > 10) {
            System.out.println("Псы так много не плавают!");
        } else {
            System.out.printf("Пес %s проплыл %d м%n", name, length);
        }
    }

    public static int getCountOfDogs() {
        return countOfDogs;
    }
}
