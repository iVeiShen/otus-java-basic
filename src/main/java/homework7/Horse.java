package homework7;

public class Horse implements Driveable {
    private int power = 15;

    @Override
    public boolean drive(Terrain terrain, int distance) {
        if (terrain == Terrain.SWAMP) {
            System.out.println("Лошадь не может пробежать по местности " + terrain.getDescription() + "!");
            return false;
        }
        if (power - (10 * distance / 100) <= 0) {
            System.out.println("У Лошади недостаточно сил, чтобы пробежать расстояние " + distance + " метров!");
            return false;
        }
        power -= (10 * distance / 100);
        System.out.println("Лошадь пробежала " + distance + " метров по местности " + terrain.getDescription());
        return true;
    }
}
