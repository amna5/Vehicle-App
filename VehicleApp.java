public class VehicleApp {
    public static void main(String[] args) {
        // Create cars
        Car car1 = new Car("Toyota", "Camry", 2023, 4);
        Car car2 = new Car("Honda", "Civic", 2022, 2);

        // Create motorcycles
        Motorcycle bike1 = new Motorcycle("Yamaha", "YZF-R1", 2024);
        Motorcycle bike2 = new Motorcycle("Kawasaki", "Ninja 650", 2023);

        // Set additional properties
        car1.setAirConditioner(true);
        car2.setAirConditioner(false);
        bike1.setHelmet(true);
        bike2.setHelmet(false);

        // Demonstrate vehicle operations
        System.out.println("\n--- Operating Vehicles ---");
        car1.start();
        car1.accelerate(50);
        car1.decelerate(20);
        car1.stop();
        System.out.println(); // print blank line for clarity
        bike1.start();
        bike1.accelerate(80);
        bike1.decelerate(30);
        bike1.stop();

        System.out.println("\nNumber of vehicles created: " + Vehicle.numberOfVehicles);
    }
}