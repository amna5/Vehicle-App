public class VehicleApp { // create class
    public static void main(String[] args) { // starting point of code execution

        // create car objects from Car class and initializing
        Car car1 = new Car("Toyota", "Camry", 2023, 4);
        Car car2 = new Car("Honda", "Civic", 2022, 2);

        // create bike object from Motorcycle class and initializing
        Motorcycle bike1 = new Motorcycle("Yamaha", "YZF-R1", 2024);
        Motorcycle bike2 = new Motorcycle("Kawasaki", "Ninja 650", 2023);

        // set additional properties using <object name>.<method name>
        car1.setAirConditioner(true);
        car2.setAirConditioner(false);
        bike1.setHelmet(true);
        bike2.setHelmet(false);

        // demonstrate vehicle operations <object name>.<method name>
        System.out.println("\n--- Operating Vehicles ---");
        car1.start();
        car1.accelerate(50);
        car1.decelerate(20);
        car1.stop();
        System.out.println(); // print blank line for clarity
        car2.start();
        car2.accelerate(60);
        car2.decelerate(30);
        car2.stop();
        System.out.println();
        bike1.start();
        bike1.accelerate(80);
        bike1.decelerate(30);
        bike1.stop();
        System.out.println();
        bike2.start();
        bike2.accelerate(80);
        bike2.decelerate(40);
        bike2.stop();

        // get back the number of vehicles created using <class name>.<method name>
        System.out.println("\nNumber of vehicles created: " + LandVehicle.getNumberOfVehicles());

    } // end main method

} // end class