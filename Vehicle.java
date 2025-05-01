// interface named Vehicle
// to make methods that will be implemented in another class
public interface Vehicle { // create interface

    // class for counting vehicles created
    public static class Counter {

        // declare a static variable to track number of vehicles created
        private static int numberOfVehicles = 0;

        // increase number of vehicles created by 1
        public static void increment() {
            numberOfVehicles++;
        }

        // get number of vehicles created
        public static int getCount() {
            return numberOfVehicles;
        }
    }

    // all methods are implicitly public and abstract
    public void start(); // method to start vehicle

    public void stop(); // method to stop vehicle

    public void accelerate(double speed); // method to accelerate vehicle

    public void decelerate(double speed); // method to decelerate vehicle

} // end interface