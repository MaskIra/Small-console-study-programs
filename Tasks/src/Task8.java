import Classes.Task8.Pier;
import Classes.Task8.ShipGenerator;
import Classes.Task8.Tunnel;
import Classes.Task8.Type;

import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Есть транспортные корабли, которые подплывают к туннели и далее плывут к причалам для погрузки разного рода товара.
 * Они проходят через узкий туннель где одновременно могут находиться только 5 кораблей. (существует генератор кораблей)
 * Вид кораблей и их вместительность могут быть разными в зависимости от типа товаров, которые нужно загрузить на корабль.
 * Например: 3 Типа кораблей (Уголь, Еда и Одежда) и три вида вместительности 10, 50, 100 шт. товаров.
 * Далее есть 3 вида причалов для погрузки кораблей — Уголь, Еда и Одежда. Каждый причал берет или подзывает
 * к себе необходимый ему корабль и начинает его загружать. За одну секунду причал загружает на корабль 10 ед. товара.
 * <p>
 * Требования:
 * Правильно разбить задачу на параллельность.
 * Синхронизировать потоки, сохранить целостность данных.
 * Работа генератора кораблей не должна зависеть от работы причалов и наоборот.
 * Общий ресурс должен быть Thread Safe (Если таковой есть в реализации)
 * Потоки не должны быть активными если нет задач.
 * Потоки не должны держать mutex если нет задач.
 */
public class Task8 {
    public static void main(String[] args) {
        Tunnel tunnel = new Tunnel(5);

            Random rnd = new Random();
            int maxCountOfShip = rnd.nextInt(20);
            System.out.printf("/main/ I want %d ships", maxCountOfShip);
            ShipGenerator shipGenerator = new ShipGenerator(tunnel, maxCountOfShip);

            Pier coalPier = new Pier(Type.COAL, tunnel,10);
            Pier clothPier = new Pier(Type.CLOTHING,tunnel,10);
            Pier foodPier = new Pier(Type.FOOD,tunnel,10);
            new Thread(shipGenerator).start();
            new Thread(coalPier).start();
            new Thread(clothPier).start();
            new Thread(foodPier).start();


//            ExecutorService service = Executors.newFixedThreadPool(Runtime.getRuntime().availableProcessors());
//            service.execute(shipGenerator);
//            service.execute(coalPier);
//            service.execute(clothPier);
//            service.execute(foodPier);
//            service.shutdown();

    }
}