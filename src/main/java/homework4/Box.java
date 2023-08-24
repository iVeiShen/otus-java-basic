package homework4;

public class Box {
    private int size;
    private String color;
    private String item;
    private int isOpen;

    public Box(int size, String color) {
        this.size = size;
        this.color = color;
    }

    public void open() {
        if (isOpen == 1) {
            System.out.println("Коробка уже открыта!!!");
        } else {
            isOpen = 1;
            System.out.println("Коробка открыта");
        }
    }

    public void close() {
        if (isOpen == 0) {
            System.out.println("Коробка уже закрыта!!!");
        } else {
            isOpen = 0;
            System.out.println("Коробка закрыта");
        }
    }

    public void putItem(String item) {
        if (!(this.item == null)) {
            System.out.println("В коробке уже есть предмет. Используйте другую коробку!!!");
        } else if (this.isOpen == 0) {
            System.out.println("Коробка закрыта. Прежде чем положить предмет в коробку ее нужно открыть!!!");
        } else {
            this.item = item;
            System.out.println("В коробку положен предмет " + item);
        }
    }

    public void paint(String color) {
        this.color = color;
        System.out.println("Коробка покрашена в цвет:" + color);
    }

    public void info() {
        System.out.println("Размер коробки: " + size);
        System.out.println("Цвет коробки: " + color);
        if (isOpen == 0) {
            System.out.println("Состояние: закрыта");
        } else {
            System.out.println("Состояние: открыта");
        }
        if (item == null) {
            System.out.println("Предмет в коробке: отсутствует");
        } else {
            System.out.println("Предмет в коробке: " + item);
        }
    }
}
