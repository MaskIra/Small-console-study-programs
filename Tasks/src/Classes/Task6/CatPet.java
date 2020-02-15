package Classes.Task6;

public class CatPet {
    private static int plateOfFood = 0;

    private String name;
    private boolean satiety;

    public CatPet(String name) {
        this.name = (name.isEmpty()) ? "" : name;
    }

    public boolean feed(int food) {
        satiety = false;
        if (food > 0 && food < plateOfFood) {
            plateOfFood -= food;
            satiety = true;
        }
        return satiety;
    }

    public static void addFood(int food) {
        if (food > 0) plateOfFood += food;
    }

    public String getName() {
        return name;
    }

    public boolean getSatiety() {
        return satiety;
    }

    public static int getPlate() {
        return plateOfFood;
    }
}
