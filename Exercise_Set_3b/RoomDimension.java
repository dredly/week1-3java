public class RoomDimension {
    private double length;
    private double width;
    
    // Constructor
    public RoomDimension(double len, double w) {
        length = len;
        width = w;
    }

    public double getArea() {
        return length * width;
    }

    @Override
    public String toString() {
        return "Room with dimensions " + length + "x" + width;
    }
}
