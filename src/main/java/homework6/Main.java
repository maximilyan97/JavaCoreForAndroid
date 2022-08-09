package homework6;

public class Main {

    public static void main(String[] args) {

        Cat cat = new Cat("Борис");
        Dog dog = new Dog("Шарик");

        cat.swim(2);
        cat.run(100);
        cat.run(300);

        dog.run(600);
        dog.run(200);
        dog.swim(100);
        dog.swim(7);

        Cat cat2 = new Cat("Мурзик");
        Dog dog2 = new Dog("Шарик");
        Cat cat3 = new Cat("Борис");
        Dog dog3 = new Dog("Шарик");
        Cat cat4 = new Cat("Борис");

        System.out.printf("Всего создано %d животных. Из них %d котов и %d собак.",
                Animal.getCountOfAnimals(), Cat.getCountOfCats(), Dog.getCountOfDogs());

    }

}
