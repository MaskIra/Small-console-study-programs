import Classes.Task4.Employee;

import java.util.Random;

public class Task4 {
    // 1. Создать класс "Сотрудник" с полями: ФИО, должность, email, телефон, зарплата, возраст;
    // Конструктор класса должен заполнять эти поля при создании объекта;
    // Внутри класса «Сотрудник» написать метод, который выводит информацию об объекте в консоль;
    // Создать массив из 5 сотрудников:
    // Пример: Person[] persArray = new Person[5]; // Вначале объявляем массив объектов
    // persArray[0] = new Person("Ivanov Ivan", "Engineer", " ivivan@mailbox.com ", "892312312", 30000, 30);
    // потом для каждой ячейки массива задаем объект persArray[1] = new Person(...); ... persArray[4] = new Person(...);
    // С помощью цикла вывести информацию только о сотрудниках старше 40 лет;
    public static void main(String[] args) {
        Employee[] persArray = new Employee[5];
        for (int i = 0; i < persArray.length; i++) {
            persArray[i] = new Employee("Ivanov Ivan" + i, "Engineer", " ivivan" + i + "@mailbox.com ", (892312310 + i), i * 10000, new Random().nextInt(70));
            if (persArray[i].getAge() > 40) persArray[i].toPrint();
        }
    }
}
