public class Car extends LandVehicle {

    // declare variables
    private int numberOfDoors;
    private boolean hasAirConditioner;

    // Car constructor
    Car(String make, String model, int year, int numberOfDoors) {
        super(make, model, year);
        this.numberOfDoors = numberOfDoors;
        this.hasAirConditioner = false; // default value
    }

    // set whether the car has air conditioner or not
    void setAirConditioner(boolean hasAirConditioner) {
        this.hasAirConditioner = hasAirConditioner;
        System.out.println(make + " " + model + " air conditioner: " + (hasAirConditioner ? "ON" : "OFF"));
    };

    // getters
    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    public boolean hasAirConditioner() {
        return hasAirConditioner;
    }

}
