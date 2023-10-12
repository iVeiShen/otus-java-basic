package homework7;

public class HomeWork7App {
    public static void main(String[] args) {
        Human human = new Human("John");
        Driveable[] vehicles = {new Car(), new Rover(), new Bicycle(), new Horse()};
        driveAll(human, Terrain.FOREST, 100, vehicles);
        driveAll(human, Terrain.SWAMP, 100, vehicles);
        driveAll(human, Terrain.PLAIN, 100, vehicles);

    }

    public static void driveAll(Human human, Terrain terrain, int distance, Driveable[] vehicles) {
        System.out.println("Местность: " + terrain.getDescription());
        human.drive(terrain, distance);
        for (Driveable vehicle : vehicles) {
            human.takeVehicle(vehicle);
            human.drive(terrain, distance);
            human.getOffVehicle(vehicle);
        }
    }
}
