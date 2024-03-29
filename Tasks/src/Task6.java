import Classes.Task6.CatPet;

import java.util.Random;

public class Task6 {
    /** 1. Расширить задачу про котов и тарелки с едой.
     * 2. Сделать так, чтобы в тарелке с едой не могло получиться отрицательного количества еды
     * 3. Каждому коту нужно добавить поле сытость (когда создаем котов, они голодны).
     * Если коту удалось покушать (хватило еды), сытость = true.
     * 4. Считаем, что если коту мало еды в тарелке, то он её просто не трогает,
     * то есть не может быть наполовину сыт
     * 5. Создать массив котов и тарелку с едой, попросить всех котов покушать из этой тарелки
     * и потом вывести информацию о сытости котов в консоль.
     * 6. Добавить в тарелку метод, с помощью которого можно было бы добавлять еду в тарелку.
    */
    public static void main(String[] args) {
        CatPet[] mas = new CatPet[10];
        CatPet.addFood(500);
        for (int i = 0; i < mas.length; i++) {
            mas[i] = new CatPet("Cat №" + i);
            int food = new Random().nextInt(151);
            mas[i].feed(food);
            System.out.println("Meow! I want " + food + ", in the plate " + CatPet.getPlate());
            System.out.println(mas[i].getName() + " / " + mas[i].getSatiety() + "\n");
        }
    }
}
