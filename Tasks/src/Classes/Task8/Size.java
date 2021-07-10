package Classes.Task8;

public enum Size {
    SMALL(10), MIDDLE(20), BIG(30);
    private int size;

    Size(int size) {
        this.size = size;
    }

    public int getSize() {
        return size;
    }
}
