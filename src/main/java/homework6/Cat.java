package homework6;

public class Cat {
    private String name;
    private int appetite;
    private boolean satiety;

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
        this.satiety = false;
    }

    public void info(){
        System.out.println("Имя: " + name + "\nАппетит: " + appetite + "\nСытость: " + satiety);
    }

    public void eat(Plate plate) {
        if (plate.getFoodAmountCurrent() < appetite) {
            System.out.println("В тарелке мало еды.");
            return;
        }
        plate.decreaseFood(appetite);
        System.out.println(name + " поел. В тарелке осталось: " + plate.getFoodAmountCurrent() + " ед. еды.");
    }
}
