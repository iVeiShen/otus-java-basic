package homework10;

import java.util.HashMap;
import java.util.Map;

public class PhoneBook {
    private static HashMap<Human, Integer> data;

    public PhoneBook() {
        this.data = new HashMap<>();
    }

    public HashMap<Human, Integer> getData() {
        return data;
    }

    public void add(String name, Integer phoneNumber) {
        data.put(new Human(name), phoneNumber);
        System.out.println("Sucess add {" + name + " : " + phoneNumber + "} to PhoneBook");
    }

    public void find(String name) {
        System.out.println("Finding name {" + name + "} in PhoneBook:");
        for (Map.Entry<Human, Integer> entry : data.entrySet()) {
            if (entry.getKey().getName() == name) {
                System.out.println("Name: " + entry.getKey().getName() + " Phone: " + entry.getValue());
            }
        }
    }

    public boolean containsPhoneNumber(Integer phoneNumber) {
        System.out.println("Containing phone number {" + phoneNumber+"}");
        return data.containsValue(phoneNumber);
    }
}
