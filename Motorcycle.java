// Motorcycle class as the blueprint to make motorcycle objects
public class Motorcycle extends LandVehicle { // create class and inherit LandVehicle class

    // declare variable
    private boolean hasHelmet;

    // Motorcycle constructor
    public Motorcycle(String make, String model, int year) {
        super(make, model, year); // refers to attributes in super class
        this.hasHelmet = false; // default value
    }

    // method to set whether the helmet is provided of not
    public void setHelmet(boolean hasHelmet) {
        this.hasHelmet = hasHelmet;
        System.out.println(make + " " + model + " helmet: " + (hasHelmet ? "Provided" : "Not provided"));
    }

    // getter
    public boolean hasHelmet() {
        return hasHelmet;
    }

} // end class