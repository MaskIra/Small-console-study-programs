import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean trigger = true;
        while (trigger) {
            System.out.println("What game do you want? 1 – tryToKnowNumber / 2 - tryToKnowWord / 0 – exit");
            int x = scanner.nextInt();
            if (x == 0) {
                trigger = false;
            } else if (x == 1) {
                tryToKnowNumber.go();
            } else if (x == 2) {
                tryToKnowWord.go();
            } else {
                System.out.println("Okay... Try again");
            }
        }
    }

    static class tryToKnowNumber {
        static public void go() {
            // Написать программу, которая загадывает случайное число от 0 до 9,
            // и пользователю дается 3 попытки угадать это число. При каждой попытке
            // компьютер должен сообщить больше ли указанное пользователем число, чем загаданное,
            // или меньше. После победы или проигрыша выводится запрос – «Повторить игру еще раз?
            // 1 – да / 0 – нет»(1 – повторить, 0 – нет).
            System.out.println("#1 tryToKnowNumber \n// The computer created a number from 0 to 9 inclusive. " +
                    "\n// You have 3 attempts to guess it.");
            Scanner scanner = new Scanner(System.in);
            boolean trigger = true;
            while (trigger) {
                int number = new Random().nextInt(10);
                for (int i = 1; i < 4; i++) {
                    System.out.print(i + ") Enter the number: ");
                    int trying = scanner.nextInt();
                    if (number == trying) {
                        break;
                    } else {
                        System.out.println("Oooh! Number is " + ((number > trying) ? "larger" : "less"));
                    }
                }
                System.out.println("You win!\n Do you want try again? 1 – yes / 0 – no");
                int x = scanner.nextInt();
                if (x == 0) trigger = false;
            }
        }
    }

    static class tryToKnowWord {
        static public void go() {
            // ). 2 * Создать массив из слов
            // String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli", "carrot", "cherry", "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom", "nut", "olive", "pea", "peanut", "pear", "pepper", "pineapple", "pumpkin", "potato"};
            // При запуске программы компьютер загадывает слово, запрашивает ответ у пользователя,
            // сравнивает его с загаданным словом и сообщает правильно ли ответил пользователь.
            // Если слово не угадано, компьютер показывает буквы которые стоят на своих местах.
            // apple – загаданное apricot - ответ игрока ap############# (15 символов, чтобы
            // пользователь не мог узнать длину слова) Для сравнения двух слов посимвольно,
            // можно пользоваться: String str = "apple"; str.charAt(0); - метод, вернет char,
            // который стоит в слове str на первой позиции Играем до тех пор, пока игрок не отгадает
            // слово Используем только маленькие буквы
            String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli",
                    "carrot", "cherry", "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom",
                    "nut", "olive", "pea", "peanut", "pear", "pepper", "pineapple", "pumpkin", "potato"};
            System.out.println("#2 tryToKnowWord \n // Try to guess which word from the following list the computer created\n" +
                    Arrays.toString(words));
            Scanner scanner = new Scanner(System.in);
            String word = words[new Random().nextInt(words.length)];
            char[] result = "###############".toCharArray();
            while (true) {
                System.out.print("- Enter the word: ");
                String trying = scanner.next();
                if (word.equals(trying))
                    break;
                else {
                    for (int i = 0; i < (Math.min(word.length(), trying.length())); i++) {
                        if (trying.charAt(i) == word.charAt(i))
                            result[i] = word.charAt(i);
                    }
                    System.out.print("No! But... " + new String(result));
                }
            }
            System.out.println("You win! ");
        }
    }
}
