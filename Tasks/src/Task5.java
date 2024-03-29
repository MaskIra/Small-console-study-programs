import Classes.Task5.Cat;
import Classes.Task5.Dog;

public class Task5 {
    /**
     *  1 Создать классы Собака и Кот с наследованием от класса Животное.
     *  2 Животные могут выполнять действия: бежать, плыть, перепрыгивать препятствие.
     *  В качестве параметра каждому методу передается величина,
     *  означающая или длину препятствия (для бега и плавания), или высоту (для прыжков).
     *  3 У каждого животного есть ограничения на действия (бег: кот 200 м., собака 500 м.;
     *  прыжок: кот 2 м., собака 0.5 м.; плавание: кот не умеет плавать, собака 10 м.).
     *  4 При попытке животного выполнить одно из этих действий, оно должно сообщить результат в консоль.
     *  (Например, dog1.run(150); -> результат: run: true) 5 * Добавить животным разброс в ограничениях.
     *  То есть у одной собаки ограничение на бег может быть 400 м., у другой 600 м.
    */
    public static void main(String[] args) {
        Cat c = new Cat(); // super(200, 2, 0);
        Dog d = new Dog(); // super(500, 0.5, 10);
        Cat c1 = new Cat(100, 3, 1);
        Dog d1 = new Dog(1000, 1, 100);
        System.out.println("c.run(200)="+c.run(200) +"\t\t c.jump(2)="+ c.jump(2)+"\t\t c.swim(200)="+c.swim(200));
        System.out.println("d.run(300)="+d.run(300) +"\t\t d.jump(1)="+ d.jump(1)+"\t d.swim(2)="+d.swim(2));
        System.out.println("c1.run(200)="+c1.run(200) +"\t c1.jump(2)="+ c1.jump(2)+"\t c1.swim(200)="+c1.swim(200));
        System.out.println("d1.run(1100)="+d1.run(1100) +"\t d1.jump(1)="+ d1.jump(1)+"\t d1.swim(2)="+d1.swim(2));
    }
}
