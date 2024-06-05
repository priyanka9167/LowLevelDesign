public class Main {
    public static void main(String[] args) {
        Vehicle vehicle = new SportsVehicle();
        vehicle.drive();

        Vehicle normal = new NormalVehicle();
        normal.drive();
    }
}