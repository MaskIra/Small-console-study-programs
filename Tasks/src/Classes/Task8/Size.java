package Classes.Task8;

public enum Size {
    SMALL(10), MIDDLE(50), BIG(100);
    private int size;

    Size(int size) {
        this.size = size;
    }

    public int getSize() {
        return size;
    }
}
