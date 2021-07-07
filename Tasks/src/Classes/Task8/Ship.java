package Classes.Task8;

public class Ship {
    private Size capacity;
    private Type type;
    private int loaded; // already loaded onto the ship

    public Ship(Size capacity, Type type) {
        this.capacity = capacity;
        this.type = type;
    }

    public Type getType() {
        return type;
    }

    public Size getCapacity() {
        return capacity;
    }

    /**
     * Loads the goods onto the ship
     *
     * @param count count of goods
     * @return remainder of goods
     */
    public int add(int count) {
        if (count <= 0) { // bed value
            return count;
        }
        if (loaded + count <= capacity.getSize()) {
            loaded += count;
            System.out.printf("/ship %s %d/ I got %d", type.toString(), capacity.getSize(), count);
            return 0;
        } else {
            loaded = capacity.getSize();
            int remainder = count - (capacity.getSize() - loaded);
            System.out.printf("/ship %s %d/ I'm full. Remainder = %d", type.toString(), capacity.getSize(), remainder);
            return remainder;
        }
    }

    public boolean checkCapacity() {
        return loaded == capacity.getSize();
    }
}
