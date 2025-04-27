public abstract class LandVehicle implements Vehicle {

    // use protected so it can only be accessed by subclasses
    protected String make;
    protected String model;
    protected int year;
    protected double speed;
    protected boolean isMoving;

    // LandVehicle constructor
    LandVehicle(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.speed = 0; // default value
        this.isMoving = false; // default value
        Vehicle.Counter.increment(); // keep track of vehicles created
    }

    // method to start the car
    @Override
    public void start() {
        if (!isMoving) {
            isMoving = true;
            System.out.println(make + " " + model + " has started.");
        } else {
            System.out.println(make + " " + model + " is already running.");
        }
    }

    // method to stop the car
    @Override
    public void stop() {
        if (isMoving) {
            isMoving = false;
            speed = 0;
            System.out.println(make + " " + model + " has stopped.");
        } else {
            System.out.println(make + " " + model + " is already stopped.");
        }
    }

    // method to accelerate the car based on speed provided
    @Override
    public void accelerate(double speed) {
        if (isMoving) {
            this.speed += speed;
            System.out.println(make + " " + model + " accelerated to " + this.speed + " km/h.");
        } else {
            System.out.println("Please start the vehicle first.");
        }
    }

    // method to decelerate car based on speed provided
    @Override
    public void decelerate(double speed) {
        if (isMoving) {
            this.speed = Math.max(0, this.speed - speed);
            System.out.println(make + " " + model + " decelerated to " + this.speed + " km/h.");
        } else {
            System.out.println("Vehicle is not moving.");
        }
    }

}
