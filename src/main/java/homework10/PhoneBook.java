package homework10;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PhoneBook {
    private HashMap<String, ArrayList<Integer>> data;

    public PhoneBook() {
        data = new HashMap<>();
    }

    public HashMap<String, ArrayList<Integer>> getData() {
        return data;
    }

    public void add(String name, Integer phoneNumber) {
        if (!(data.get(name) == null)) {
            if (data.get(name).contains(phoneNumber)) {
                return;
            }
            data.get(name).add(phoneNumber);
        } else {
            data.put(name, new ArrayList<>(List.of(phoneNumber)));
        }
        System.out.println("Success add {" + name + " : " + phoneNumber + "} to PhoneBook");
    }

    public void find(String name) {
        System.out.println("Finding phone numbers for {" + name + "} in PhoneBook:");
        for (Integer phoneNumber : data.get(name)) {
            System.out.println("Name: {" + name + "} | Phone number: {" + phoneNumber + "}");
        }
    }

    public boolean containsPhoneNumber(Integer phoneNumber) {
        System.out.println("Containing phone number {" + phoneNumber + "}:");
        for (Map.Entry<String, ArrayList<Integer>> row : data.entrySet())
            if (row.getValue().contains(phoneNumber)) {
                return true;
            }
        return false;
    }
}
