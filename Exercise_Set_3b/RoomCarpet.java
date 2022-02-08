public class RoomCarpet {
    private RoomDimension size;
    private double carpetCost;

    // constructor
    public RoomCarpet(RoomDimension dim, double cost) {
        size = dim;
        carpetCost = cost;
    }

    public double getTotalCost() {
        return size.getArea() * carpetCost;
    }

    @Override
    public String toString() {
        return "Carpet for " + size.toString();
    }
}
