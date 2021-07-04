/**
 // Напишите метод, на вход которого подаётся двумерный строковый массив
 // размером 4х4. При подаче массива другого размера необходимо бросить
 // исключение MyArraySizeException. 2 Далее метод должен пройтись по всем
 // элементам массива, преобразовать в int и просуммировать. Если в каком-то
 // элементе массива преобразование не удалось (например, в ячейке лежит
 // символ или текст вместо числа), должно быть брошено исключение
 // MyArrayDataException с детализацией, в какой именно ячейке лежат неверные
 // данные. 3 В методе main() вызвать полученный метод, обработать возможные
 // исключения MySizeArrayException и MyArrayDataException и вывести результат расчета
  */
public class Task7_1 {

    public static void main(String[] args) {
        String[][] arr = new String[4][4];

        // check size
        arr[0] = new String[2];
        try {
            int sum = checkArr(arr);
            System.out.println("No exception! " + sum);
        } catch (MyArraySizeException | MyArrayDataException exc) {
            System.out.println(exc.getMessage());
        }

        // check data
        arr = new String[][] {{"00","text","02","03"}, {"10","11","12","13"},{"20","21","22","23"},{"30","31","32","33"}};
        try {
            int sum = checkArr(arr);
            System.out.println("No exception! " + sum);
        } catch (MyArraySizeException | MyArrayDataException exc) {
            System.out.println(exc.getMessage());
        }

        // all true
        arr[0][1] = "01";
        try {
            int sum = checkArr(arr);
            System.out.println("No exception! " + sum);
        } catch (MyArraySizeException | MyArrayDataException exc) {
            System.out.println(exc.getMessage());
        }
    }

    static int checkArr(String[][] arr) throws MyArraySizeException, MyArrayDataException {
        if (arr.length != 4 || arr[0].length != 4) {
            for (String[] s : arr) {
                if (s.length != 4)
                    throw new MyArraySizeException();
            }
        }

        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                try {
                    sum += Integer.parseInt(arr[i][j]);
                } catch (Exception e) {
                    throw new MyArrayDataException(i, j);
                }
            }
        }
        return sum;
    }

    static public class MyArraySizeException extends Exception {
        public MyArraySizeException() {
            super("Size is not 4x4");
        }
    }

    static public class MyArrayDataException extends Exception {
        public MyArrayDataException(int x, int y) {
            super("Exception in [" + x + "][" + y + "]");
        }
    }
}
