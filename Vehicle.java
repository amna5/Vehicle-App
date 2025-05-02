// interface named Vehicle
// to make methods that will be implemented in another class
public interface Vehicle { // create interface

    // all methods are implicitly public and abstract
    public void start(); // method to start vehicle

    public void stop(); // method to stop vehicle

    public void accelerate(double speed); // method to accelerate vehicle

    public void decelerate(double speed); // method to decelerate vehicle

} // end interface