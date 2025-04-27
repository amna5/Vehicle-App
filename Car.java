public class Car extends LandVehicle {

    int numberOfDoors;
    boolean hasAirConditioner;

    // Car constructor
    Car(String make, String model, int year, int numberOfDoors) {
        super(make, model, year);
        this.numberOfDoors = numberOfDoors;
        this.hasAirConditioner = false; // default value
        // this.hasAirConditioner = hasAirConditioner;
    }

    void setAirConditioner(boolean hasAirConditioner) {
        this.hasAirConditioner = hasAirConditioner;
        System.out.println(make + " " + model + " air conditioner: " + (hasAirConditioner ? "ON" : "OFF"));
    };

}
