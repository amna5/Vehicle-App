public class Motorcycle extends LandVehicle {
    private boolean hasHelmet;

    public Motorcycle(String make, String model, int year) {
        super(make, model, year);
        this.hasHelmet = false; // default value
    }

    public void setHelmet(boolean hasHelmet) {
        this.hasHelmet = hasHelmet;
        System.out.println(make + " " + model + " helmet: " + (hasHelmet ? "Provided" : "Not provided"));
    }

    public boolean hasHelmet() {
        return hasHelmet;
    }
}