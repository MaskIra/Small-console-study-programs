package Classes.Task5;

// 2 Животные могут выполнять действия:
// бежать, плыть, перепрыгивать препятствие.
// В качестве параметра каждому методу передается
// величина, означающая или длину препятствия (для
// бега и плавания), или высоту (для прыжков). 3 У
// каждого животного есть ограничения на действия
// (бег: кот 200 м., собака 500 м.;
// прыжок: кот 2 м., собака 0.5 м.;
// плавание: кот не умеет плавать, собака 10 м.).
// 4 При попытке животного выполнить одно из этих действий,
// оно должно сообщить результат в консоль. (Например, dog1.run(150); -> результат: run: true)
// 5 * Добавить животным разброс в ограничениях. То есть у одной собаки ограничение на бег может быть 400 м., у другой 600 м.

public abstract class Animal {
    private double runMax;
    private double jumpMax;
    private double swimMax;

    protected Animal(double runMax, double jumpMax, double swimMax) {
        this.runMax = runMax;
        this.jumpMax = jumpMax;
        this.swimMax = swimMax;
    }

    public boolean run(double meters) {
        return runMax != 0 && runMax >= meters && meters > 0;
    }

    public boolean jump(double meters) {
        return jumpMax != 0 &&  jumpMax >= meters && meters > 0;
    }

    public boolean swim(double meters) {
        return swimMax != 0 &&  swimMax >= meters && meters > 0;
    }
}
