package homework7;

public class Rover implements Driveable {
    private int fuel = 100;

    @Override
    public boolean drive(Terrain terrain, int distance) {
        if (fuel - (10 * distance / 100) <= 0) {
            System.out.println("У вездехода недостаточно бензина, чтобы проехать расстояние " + distance + " метров!");
            return false;
        }
        fuel -= (10 * distance / 100);
        System.out.println("Вездеход проехал " + distance + " метров по местности " + terrain.getDescription());
        return true;
    }
}
