public interface Vehicle {

    // class for counting vehicles created
    class Counter {

        // declare a static variable to track number of vehicles created
        private static int numberOfVehicles;

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
    void start();

    void stop();

    void accelerate(double speed);

    void decelerate(double speed);

}