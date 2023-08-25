package homework5;

import homework5.animals.Cat;
import homework5.animals.Dog;
import homework5.animals.Horse;

public class HomeWork5App {
    public static void main(String[] args) {
        Cat cat = new Cat("Дымок", 6, 25);
        Dog dog = new Dog("Бетховен", 5, 2, 25);
        Horse horse = new Horse("JVM", 6, 2, 50);
        cat.info();
        System.out.println("\n*****************\n");
        dog.info();
        System.out.println("\n*****************\n");
        horse.info();
        System.out.println("\n*****************\n");
        cat.run(12);
        cat.info();
        cat.run(50);
        cat.info();
        System.out.println("\n*****************\n");
        dog.run(20);
        dog.info();
        dog.swim(5);
        dog.info();
        System.out.println("\n*****************\n");
        horse.run(10);
        horse.info();
        horse.swim(20);
        horse.info();
    }
}
