import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

public class Task3 {
    public static void main(String[] args) {
        tryToKnowNumber.go();
        tryToKnowWord.go();
    }

    static class tryToKnowNumber {
        static public void go() {
            // Написать программу, которая загадывает случайное число от 0 до 9,
            // и пользователю дается 3 попытки угадать это число. При каждой попытке
            // компьютер должен сообщить больше ли указанное пользователем число, чем загаданное,
            // или меньше. После победы или проигрыша выводится запрос – «Повторить игру еще раз?
            // 1 – да / 0 – нет»(1 – повторить, 0 – нет).
            System.out.println("#1 tryToKnowNumber");
            boolean trigger = true;
            while (trigger) {
                int number = new Random().nextInt(10);
                for (int i = 1; i < 4; i++) {
                    System.out.print(i + ") Enter the number: ");
                    int trying = Integer.parseInt(readInput());
                    if (number == trying)
                        break;
                    else System.out.println("Oooh! Number is " + ((number > trying) ? "larger" : "less"));
                }
                System.out.println("You win!\n Do you want try again? 1 – yes / 0 – no");
                if (Integer.parseInt(readInput()) == 0) trigger = false;
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
            System.out.println("#2 tryToKnowWord");
            String word = words[new Random().nextInt(words.length)];
            char[] result = "###############".toCharArray();
            while (true) {
                System.out.print("- Enter the word (to 15 symbols): ");
                String trying = readInput().trim();
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
            System.out.print("You win!");
        }
    }

    private static String readInput() {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String str = null;
        try {
            str = reader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return str;
    }
}
