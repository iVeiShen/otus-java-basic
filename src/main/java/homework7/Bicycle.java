package homework7;

public class Bicycle implements Driveable {
    @Override
    public boolean drive(Terrain terrain, int distance) {
        if (terrain == Terrain.SWAMP) {
            System.out.println("Велосипед не может проехать по местности " + terrain.getDescription() + "!");
            return false;
        }
        System.out.println("Велосипед проехал " + distance + " метров по местности " + terrain.getDescription());
        return true;
    }
}
