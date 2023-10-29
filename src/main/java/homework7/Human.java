package homework7;

public class Human {
    private String name;
    private Driveable currentTransport;

    public Human(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void takeVehicle(Driveable vehicle) {
        if (currentTransport == null) {
            currentTransport = vehicle;
            System.out.println(name + " сел на транспорт");
        } else {
            System.out.println(name + " уже находиться на транспорте!");
        }
    }

    public void getOffVehicle(Driveable vehicle) {
        if (currentTransport == null) {
            System.out.println(name + " уже слез с транспорта!");
        } else {
            currentTransport = null;
            System.out.println(name + " слез с транспорта");
        }
    }

    public boolean drive(Terrain terrain, int distance) {
        if (currentTransport == null) {
            System.out.println(name + " прошел " + distance + " метров пешком по местности " + terrain.getDescription());
            return true;
        } else {
            return currentTransport.drive(terrain, distance);
        }
    }
}
