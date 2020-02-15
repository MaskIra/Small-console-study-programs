public class Task2 {
    // •	1 Задать целочисленный массив, состоящий из элементов 0 и 1.
    // Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ]. С помощью цикла и
    // условия заменить 0 на 1, 1 на 0; 2 Задать пустой целочисленный
    // массив размером 8. С помощью цикла заполнить его значениями
    // 0 3 6 9 12 15 18 21; 3 Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ]
    // пройти по нему циклом, и числа меньшие 6 умножить на 2; 4 Создать квадратный
    // двумерный целочисленный массив (количество строк и столбцов одинаковое), и с
    // помощью цикла(-ов) заполнить его диагональные элементы единицами;
    // 5 ** Задать одномерный массив и найти в нем минимальный и максимальный элементы
    // (без помощи интернета); 6 ** Написать метод, в который передается не пустой одномерный
    // целочисленный массив, метод должен вернуть true если в массиве есть место,
    // в котором сумма левой и правой части массива равны.  Примеры: checkBalance([1, 1, 1, || 2, 1]) → true,
    // checkBalance ([2, 1, 1, 2, 1]) → false, checkBalance ([10, || 10]) → true,
    // граница показана символами ||, эти символы в массив не входят.
    // 7 **** Написать метод, которому на вход подаётся одномерный массив и число n
    // (может быть положительным, или отрицательным), при этом метод должен сместить
    // все элементы массива на n позиций. Для усложнения задачи нельзя пользоваться вспомогательными массивами.
    public static void main(String[] args) {
        // 1
        int[] mas = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};

        for (int i = 0; i < mas.length; i++)
            mas[i] = (mas[i] == 1) ? 0 : 1;

        System.out.print("#1 ");
        for (int x : mas)
            System.out.print(x + "  ");

        // 2
        System.out.println();
        int[] mas2 = new int[8];

        for (int i = 0, j = 0; i < mas2.length; i++, j += 3)
            mas2[i] = j;

        System.out.print("#2 ");
        for (int x : mas2)
            System.out.print(x + "  ");

        // 3
        System.out.println();
        int[] mas3 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};

        for (int i = 0; i < mas3.length; i++)
            if (mas3[i] < 6) mas3[i] *= 2;

        System.out.print("#3 ");
        for (int x : mas3)
            System.out.print(x + "  ");

        // 4
        System.out.println();
        int[][] mas4 = new int[4][4];

        for (int i = 0; i < mas4.length; i++)
            mas4[i][i] = 1;

        System.out.println("#4 ");
        for (int[] x : mas4) {
            for (int y : x)
                System.out.print(y + "  ");
            System.out.println();
        }

        // 5
        int min = mas3[0], max = mas3[0];
        for (int value : mas3) {
            min = min > value ? value : min; // or Math.min
            max = max < value ? value : max; // or Math.max
        }

        System.out.println("#5 " + min + " <be or not to be> " + max);

        // 6
        System.out.println("#6 true = " + checkBalance(new int[]{1, 2, 3}) + " & false = " + checkBalance(new int[]{0, 2, 3}));

        // 7
        System.out.print("#7 ");
        int[] mas7 = Cool(new int[]{1, 2, 3}, 2);
        for (int x : mas7)
            System.out.print(x + "  ");
    }

    // 6
    static boolean checkBalance(int[] mas) {
        int sumEnd = 0, sumStart = 0;
        for (int x : mas)
            sumEnd += x;

        for (int x : mas) {
            sumStart += x;
            sumEnd -= x;
            if (sumEnd == sumStart) return true;
        }
        return false;
    }


    // 7
    static int[] Cool(int[] mas, int n) {
        if (n == 0) return mas;
        if (n > 0) {
            for (int i = 0; i < n; i++) {
                int temp = mas[mas.length - 1];
                for (int j = mas.length - 1; j > 0; j--) {
                    mas[j] = mas[j - 1];
                }
                mas[0] = temp;
            }
        } else {
            for (int i = mas.length; i > n; i--) {
                int temp = mas[mas.length - 1];
                for (int j = mas.length - 1; j > 0; j--) {
                    mas[j] = mas[j - 1];
                }
                mas[0] = temp;
            }
        }
        return mas;
    }
}
