package Classes.Task5;

public class Dog extends Animal {
    public Dog(){
        super(500, 0.5, 10);
    }

    public Dog(double runMax, double jumpMax, double swimMax){
        super(runMax, jumpMax, swimMax);
    }
}
