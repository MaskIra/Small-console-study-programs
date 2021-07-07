package Classes.Task8;

import java.util.Random;

public class ShipGenerator implements Runnable {

    private Tunnel tunnel;
    private int maxCountOfShip;

    public ShipGenerator(Tunnel tunnel, int maxCountOfShip) {
        this.tunnel = tunnel;
        this.maxCountOfShip = maxCountOfShip;
    }

    @Override
    public void run() {
        int count = 0;
        while (count <= maxCountOfShip) {
            Ship newShip = new Ship(getRandomSize(), getRandomType());
            System.out.printf("\n/generator/ Im create new ship (%s %d)", newShip.getType().toString(), newShip.getCapacity().getSize());
            tunnel.addShip(newShip);
            count++;

            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    private Type getRandomType() {
        Random random = new Random();
        return Type.values()[random.nextInt(Type.values().length)];
    }

    private Size getRandomSize() {
        Random random = new Random();
        return Size.values()[random.nextInt(Size.values().length)];
    }
}
