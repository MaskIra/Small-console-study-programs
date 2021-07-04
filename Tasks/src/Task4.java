import Classes.Task4.Employee;

import java.util.Random;

public class Task4 {
    /**
     * 1. Создать класс "Сотрудник" с полями: ФИО, должность, email, телефон, зарплата, возраст;
     * Внутри класса «Сотрудник» написать метод, который выводит информацию об объекте в консоль;
     * Создать массив из 5 сотрудников
     * С помощью цикла вывести информацию только о сотрудниках старше 40 лет;
      */
    public static void main(String[] args) {
        Employee[] persArray = new Employee[5];
        for (int i = 0; i < persArray.length; i++) {
            persArray[i] = new Employee("Ivanov Ivan" + i, "Engineer", " ivivan" + i + "@mailbox.com ", (892312310 + i), i * 10000, new Random().nextInt(70));
            if (persArray[i].getAge() > 40) persArray[i].toPrint();
        }
    }
}
