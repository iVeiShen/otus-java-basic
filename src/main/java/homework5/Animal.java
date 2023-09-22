package homework5;

public class Animal {
    protected String name;
    protected int runSpeed;
    protected int swimSpeed;
    protected int endurance;

    public Animal(String name, int runSpeed, int swimSpeed, int endurance) {
        this.name = name;
        this.runSpeed = runSpeed;
        this.swimSpeed = swimSpeed;
        this.endurance = endurance;
    }

    public void run(int distance) {
        int completedDistance = 0;
        System.out.println(name + " начал бежать " + distance + " метров.");
        for (int i = 1; i <= distance; i++) {
            if (endurance - 1 < 0) {
                break;
            }
            endurance -= 1;
            completedDistance += 1;
        }
        if (distance != completedDistance) {
            System.out.println(name + " пробежал " + completedDistance + " метров.");
            System.out.println("Затраченное время =  " + -1);
            System.out.println("У " + name + " появилось состояние усталости!");
        } else {
            System.out.println(name + " пробежал " + distance + " метров.");
            System.out.println("Затраченное время =  " + distance / runSpeed);
        }
    }

    public void info() {
        System.out.println("Имя: " + name);
        System.out.println("Скорость бега: " + runSpeed);
        System.out.println("Скорость плавания: " + swimSpeed);
        System.out.println("Выносливость: " + endurance);
    }
}
