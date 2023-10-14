package homework10;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PhoneBook {
    private HashMap<String, List<Integer>> data;

    public PhoneBook() {
        data = new HashMap<>();
    }

    public HashMap<String, List<Integer>> getData() {
        return data;
    }

    public void add(String name, Integer phoneNumber) {
        if (!(data.get(name) == null)) {
            if (data.get(name).contains(phoneNumber)) {
                return;
            }
            //data.get(name).add(phoneNumber);
            List<Integer> phoneList = new ArrayList<>(data.get(name));
            phoneList.add(phoneNumber);
            data.put(name, phoneList);
        } else {
            data.put(name, List.of(phoneNumber));
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
        for (Map.Entry<String, List<Integer>> row : data.entrySet())
            if (row.getValue().contains(phoneNumber)) {
                return true;
            }
        return false;
    }
}
