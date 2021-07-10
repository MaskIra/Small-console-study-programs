package Classes.Task8;

import java.util.ArrayList;

public class Tunnel {
    private int volume;
    private ArrayList<Ship> ships;

    public Tunnel(int volume) {
        this.volume = volume;
        ships = new ArrayList<>(volume);
    }

    public int getVolume() {
        return volume;
    }

    public synchronized Ship getShip(Type type) {
        try {
            if (ships.size() > 0) {
                notifyAll();

                for (Ship ship : ships) {
                    if (ship.getType() == type) {
                        System.out.printf("\n/tunnel/ I gave you ship %s %d", ship.getType().toString(), ship.getCapacity().getSize());
                        ships.remove(ship);
                        return ship;
                    }
                }
            }
            wait();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return null;
    }

    public synchronized boolean addShip(Ship ship) {
        try {
            if (ships.size() < volume) {
                notifyAll();
                System.out.print("\n/tunnel/ I got a ship:)");
                ships.add(ship);
                return true;
            } else {
                System.out.print("\n/tunnel/ I'm full @_@");
                wait();
                return false;
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return false;
    }
}
