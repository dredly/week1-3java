public class Truck extends Vehicle {
    private double loadCapacity;
    private int towingCapacity;

    public Truck(String manufacturer, int numCylinders, Person owner, double loadCapacity, int towingCapacity) {
        super(manufacturer, numCylinders, owner);
        this.loadCapacity = loadCapacity;
        this.towingCapacity = towingCapacity;
    }

    // Getters
    public double getLoadCapacity() {
        return loadCapacity;
    }

    public double getTowingCapacity() {
        return towingCapacity;
    }

    // Setters
    public void setLoadCapacity(double newLc) {
        loadCapacity = newLc;
    }

    public void setTowingCapacity(int newTc) {
        towingCapacity = newTc;
    }

    public boolean equals(Truck otherTruck) {
        if (!super.equals(otherTruck)) {
            return false;
        }
        return loadCapacity == otherTruck.getLoadCapacity()
                && towingCapacity == otherTruck.getTowingCapacity();
    }

    @Override
    public String toString() {
        return super.toString() + ". Load capacity = " + loadCapacity +
                "tonnes, towing capacity = " + towingCapacity + "kg";
    }
}
