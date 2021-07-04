package Classes.Task5;

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
