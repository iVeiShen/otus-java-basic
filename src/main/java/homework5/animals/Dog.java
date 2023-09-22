package homework5.animals;

import homework5.Animal;

public class Dog extends Animal {

    public Dog(String name, int runSpeed, int swimSpeed, int endurance) {
        super(name, runSpeed, swimSpeed, endurance);
    }

    public void swim(int distance) {
        int completedDistance = 0;
        System.out.println(name + " начал заплыв на " + distance + " метров.");
        for (int i = 1; i <= distance; i++) {
            if (endurance - 2 < 0) {
                break;
            }
            endurance -= 2;
            completedDistance += 1;
        }
        if (distance != completedDistance) {
            System.out.println(name + " проплыл " + completedDistance + " метров.");
            System.out.println("Затраченное время =  " + -1);
            System.out.println("У " + name + " появилось состояние усталости!");
        } else {
            System.out.println(name + " проплыл " + distance + " метров.");
            System.out.println("Затраченное время =  " + distance / swimSpeed);
        }

    }
}
