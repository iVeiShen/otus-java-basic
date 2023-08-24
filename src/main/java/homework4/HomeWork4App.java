package homework4;

public class HomeWork4App {
    public static void main(String[] args) {
        String[] firstNames = {"Александр", "Петр", "Артем", "Иван", "Михаил"};
        String[] lastNames = {"Баллак", "Бекхем", "Бергкемп", "Барриос", "Бейл"};
        String[] middleNames = {"Сергеевич", "Саламович", "Андреевич", "Владимирович", "Анатольевич"};

        User[] users = new User[10];
        for (int i = 0; i < users.length; i++) {
            users[i] = new User(firstNames[(int) (Math.random() * 5)], middleNames[(int) (Math.random() * 5)], lastNames[(int) (Math.random() * 5)], 2005 - (int) (Math.random() * 50), "user" + i + " @gmail.com");
        }
        for (int i = 0; i < users.length; i++) {
            if ((2023 - users[i].getBirthYear()) > 40) {
                users[i].info();
            }
        }

        System.out.println("\n*******************************\n");

        Box box = new Box(4, "red");
        box.info();
        box.close();
        box.open();
        box.open();
        box.paint("Blue");
        box.putItem("Palochka");
        box.putItem("Pomidor");
        box.info();
    }
}
