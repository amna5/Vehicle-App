// LandVehicle abstract class to implement methods from Vehicle
public abstract class LandVehicle implements Vehicle { // create class and implement Vehicle interface

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

    // method to start the vehicle
    @Override
    public void start() {
        if (!isMoving) { // if the vehicle is not moving, it will start
            isMoving = true;
            System.out.println(make + " " + model + " has started.");
        } else { // otherwise it will display this message
            System.out.println(make + " " + model + " is already running.");
        }
    }

    // method to stop the vehicle
    @Override
    public void stop() {
        if (isMoving) { // if the vehicle is moving, it will stop
            isMoving = false;
            speed = 0;
            System.out.println(make + " " + model + " has stopped.");
        } else { // otherwise program will display this message
            System.out.println(make + " " + model + " is already stopped.");
        }
    }

    // method to accelerate the vehicle based on speed provided
    @Override
    public void accelerate(double speed) {
        if (isMoving) { // if the vehicle is moving, it will accelerate
            this.speed += speed;
            System.out.println(make + " " + model + " accelerated to " + this.speed + " km/h.");
        } else { // otherwise user will be told to start the vehicle first
            System.out.println("Please start the vehicle first.");
        }
    }

    // method to decelerate vehicle based on speed provided
    @Override
    public void decelerate(double speed) {
        if (isMoving) { // if the vehicle is moving, it will decelerate
            // Math.max takes the the max of 2 values provided
            // this ensures that the speed never goes below 0
            this.speed = Math.max(0, this.speed - speed);
            System.out.println(make + " " + model + " decelerated to " + this.speed + " km/h.");
        } else { // otherwise user will be notified that the car is not moving
            System.out.println("Vehicle is not moving.");
        }
    }

} // end class
