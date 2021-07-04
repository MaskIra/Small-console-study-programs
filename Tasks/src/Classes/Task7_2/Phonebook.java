package Classes.Task7_2;

import java.util.*;

public class Phonebook {
    private HashMap<String, ArrayList<Long>> table;

    public Phonebook() {
        table = new HashMap<>();
    }

    public boolean add(String name, Long phone) {
        if (name.isEmpty() || phone == 0)
            return false;
        if (!table.containsKey(name)) {
            table.put(name, new ArrayList<Long>());
        }
        table.get(name).add(phone);
        return true;
    }

    public ArrayList<Long> get(String name) {
        return table.get(name);
    }
}
