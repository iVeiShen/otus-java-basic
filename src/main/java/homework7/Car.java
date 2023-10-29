package homework7;

public class Car implements Driveable {
    private int fuel = 100;

    @Override
    public boolean drive(Terrain terrain, int distance) {
        if (terrain == Terrain.SWAMP || terrain == Terrain.FOREST) {
            System.out.println("Машина не может проехать по местности " + terrain.getDescription() + "!");
            return false;
        }
        if (fuel - (10 * distance / 100) <= 0) {
            System.out.println("У машины недостаточно бензина, чтобы проехать расстояние " + distance + " метров!");
            return false;
        }
        fuel -= (10 * distance / 100);
        System.out.println("Машина проехала " + distance + " метров по местности " + terrain.getDescription());
        return true;
    }
}
