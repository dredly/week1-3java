public class Vehicle {
    private String manufacturer;
    private int numCylinders;
    private Person owner;

    public Vehicle(String manufacturer, int numCylinders, Person owner) {
        this.manufacturer = manufacturer;
        this.numCylinders = numCylinders;
        this.owner = owner;
    }

    // Getters
    public String getManufacturer() {
        return manufacturer;
    }

    public int getNumCylinders() {
        return numCylinders;
    }

    public Person getOwner() {
        return owner;
    }

    // Setters
    public void changeCylinders(int newNum) {
        if (newNum <= 0) {
            System.out.println(" You must have at least 1 cylinder");
        } else {
            numCylinders = newNum;
        }
    }

    public void changeOwner(Person newOwner) {
        owner = newOwner;
    }

    public boolean equals(Vehicle otherVehicle) {
        return manufacturer.equals(otherVehicle.getManufacturer())
                && numCylinders == otherVehicle.getNumCylinders();
    }

    @Override
    public String toString() {
        return owner.getName() + "'s vehicle. Made by " + manufacturer;
    }

}
