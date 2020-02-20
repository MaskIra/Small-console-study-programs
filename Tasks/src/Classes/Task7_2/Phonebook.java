package Classes.Task7_2;

import java.util.*;

public class Phonebook {
    // 2 Написать простой класс Телефонный
    // Справочник, который хранит в себе список фамилий и телефонных номеров. В этот телефонный
    // справочник с помощью метода add() можно добавлять записи, а с помощью метода get()
    // искать номер телефона по фамилии. Следует учесть, что под одной фамилией может быть
    // несколько телефонов (в случае однофамильцев), тогда при запросе такой фамилии должны
    // выводиться все телефоны. Желательно не добавлять лишний функционал (дополнительные поля
    // (имя, отчество, адрес), взаимодействие с пользователем через консоль и т.д). Консоль
    // использовать только для вывода результатов проверки телефонного справочника.
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
