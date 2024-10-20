package lesson_8;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PhoneBook {
    private final Map<String, List<String>> phoneBook;

    public PhoneBook(){
        phoneBook = new HashMap<>();
    }

    public void add(String username, String phoneNumber){

        if (!phoneBook.containsKey(username)) {
            phoneBook.put(username, new ArrayList<>());
        }
        phoneBook.get(username).add(phoneNumber);
    }


    public List<String> get(String username){
        return phoneBook.get(username);
    }


}
