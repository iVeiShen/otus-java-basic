package homework6;

public class HomeWork6App {
    public static void main(String[] args) {
        Plate plate = new Plate(100);
        System.out.println("Создана тарелка!");
        plate.info();
        Cat[] cats = {new Cat("Барсик", 15), new Cat("Мурзик", 34), new Cat("Феликс", 43), new Cat("Обжора", 90)};
        System.out.println("Созданы коты!");
        for (Cat cat : cats) {
            cat.info();
            cat.eat(plate);
            plate.info();
        }
    }
}
