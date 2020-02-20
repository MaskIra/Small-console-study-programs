import Classes.Task7_2.Phonebook;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

public class Task7_2 {
    // Создать массив с набором слов (10-20 слов, должны встречаться повторяющиеся).
    // Найти и вывести список уникальных слов, из которых состоит массив (дубликаты не считаем).
    // Посчитать, сколько раз встречается каждое слово.
    // 2 Написать простой класс Телефонный
    // Справочник, который хранит в себе список фамилий и телефонных номеров. В этот телефонный
    // справочник с помощью метода add() можно добавлять записи, а с помощью метода get()
    // искать номер телефона по фамилии. Следует учесть, что под одной фамилией может быть
    // несколько телефонов (в случае однофамильцев), тогда при запросе такой фамилии должны
    // выводиться все телефоны. Желательно не добавлять лишний функционал (дополнительные поля
    // (имя, отчество, адрес), взаимодействие с пользователем через консоль и т.д). Консоль
    // использовать только для вывода результатов проверки телефонного справочника.

    public static void main(String[] args) {
        // 1
        String[] mas = new String[]{"cat", "dog", "leo", "fish", "tree", "fish", "leo", "leo", "fish", "dog"};
        System.out.println("#1 array: " + Arrays.toString(mas));
        List<String> list = Arrays.asList(mas);
        HashSet<String> hash = new HashSet<>(list);
        for (String str : hash) {
            System.out.println(str + " - " + Collections.frequency(list, str));
        }

        // 2
        Phonebook pb = new Phonebook();
        System.out.println("\n#2 The phonebook\nnameOne 9992223351" + (pb.add("nameOne", 9992223351L) ? " is added" : "isn't added"));
        System.out.println("nameOne 9992223352" + (pb.add("nameOne", 9992223352L) ? " is added" : "isn't added"));
        System.out.println("nameOne 9992223353" + (pb.add("nameOne", 9992223353L) ? " is added" : "isn't added"));
        System.out.println("nameTwo 9992223359" + (pb.add("nameTwo", 9992223359L) ? " is added" : "isn't added"));

        System.out.println("for nameOne: " + pb.get("nameOne").toString());
        System.out.println("for nameTwo: " + pb.get("nameTwo").toString());
    }
}