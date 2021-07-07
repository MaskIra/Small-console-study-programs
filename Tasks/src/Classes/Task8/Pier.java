package Classes.Task8;

public class Pier implements Runnable {
    private Type type;
    private Tunnel tunnel;
    private int force;

    public Pier(Type type, Tunnel tunnel, int force) {
        this.type = type;
        this.tunnel = tunnel;
        this.force = force;
    }

    @Override
    public void run() {
        boolean flag = true;
        Ship ship = tunnel.getShip(type);
        if (ship != null) {
            System.out.printf("\n/Pier %s/ I am loading the ship", type.toString());
            while (flag) {
                if (ship.add(force) > 0) {
                    flag = false;
                }
                try {
                    Thread.sleep(5000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.printf("\n/Pier %s/ I loaded the ship", type.toString());
        }
    }
}
