public interface Vehicle {

    static int numberOfVehicles = 0;

    // all methods are implicitly public and abstract
    void start();

    void stop();

    void accelerate(double speed);

    void decelerate(double speed);

}