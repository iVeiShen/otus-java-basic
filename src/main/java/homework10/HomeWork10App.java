package homework10;

public class HomeWork10App {
    public static void main(String[] args) {
        PhoneBook phoneBook = new PhoneBook();
        System.out.println("Created PhoneBook: " + phoneBook);
        phoneBook.add("John", 3456029);
        phoneBook.add("John", 3456029);
        phoneBook.add("Alice", 3442946);
        phoneBook.add("Mark", 2671281);
        phoneBook.add("John", 2282288);
        System.out.println("PhoneBook size: " + phoneBook.getData().size());
        phoneBook.find("John");
        System.out.println(phoneBook.containsPhoneNumber(3456029));
        System.out.println(phoneBook.containsPhoneNumber(123));
    }
}
