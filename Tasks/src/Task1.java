/**
 * 1. Создать пустой проект в IntelliJ IDEA и прописать метод main();
 * 2. Создать переменные всех пройденных типов данных, и инициализировать их значения;
 * 3. Написать метод вычисляющий выражение a * (b + (c / d));
 * 4. Написать метод и проверяющий что их сумма двух чисел лежит в пределах от 10 до 20(включительно)
 * 5. Написать метод, которому в качестве параметра передается целое число,
 * метод должен напечатать в консоль положительное ли число передали, или отрицательное;
 * Замечание: ноль считаем положительным числом.
 * 6. Написать метод, которому в качестве параметра передается целое число, метод должен вернуть true,
 * если число отрицательное;
 * 7. Написать метод, которому в качестве параметра передается строка,
 * обозначающая имя, метод должен вывести в консоль сообщение «Привет, указанное_имя!»;
 * 8. *Написать метод, который определяет является ли год високосным, и выводит сообщение в консоль.
 * Каждый 4-й год является високосным, кроме каждого 100-го, при этом каждый 400-й – високосный.
 */
public class Task1 {
    public static void main(String[] args) { // 1
        // 2
        byte b = 127;
        short h = 2;
        int a = 3;
        float f = 1.5f;
        double d = 1.55;
        long l = 11;
        char c = 'c';
        boolean bool = true;

        String str = "";
        // 3-7
        System.out.println("3) " + Sum(1, 3, 6, 2));
        System.out.println("4) " + sravnit(10, 10));
        print(-1);
        System.out.println("6) " + plusOrNot(1));
        getName("Ёжик в тумане");
        getYear(2020);
    }

    // 3
    static double Sum(double a, double b, double c, double d) {
        return a * (b + (c / d));
    }

    // 4
    static boolean sravnit(double x, double y) {
        return x + y <= 20 && x + y >= 10;
    }

    // 5
    static void print(int x) {
        if((x < 0)) System.out.println("5) -");
        else System.out.println("5) +");
    }

    // 6
    static boolean plusOrNot(int x) {
        return x < 0;
    }

    // 7
    static void getName(String name) {
        System.out.println("7) Привет, " + name + "!");
    }

    // 8
    static void getYear(int year) {
        if (year % 4 == 0 && year % 100 != 0 || year % 400 != 0) {
            System.out.println("8) Oh, yeah! // " + year);
        } else System.out.println("8) Oh, no! // " + year);
    }
}
