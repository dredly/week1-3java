import java.util.Scanner;

public class CarpetsTest {
    public static void main(String[] args) {
        // RoomDimension rd = new RoomDimension(4.2d, 8.63d);
        // System.out.println(rd);
        // System.out.println("Area = " + rd.getArea());
        // RoomCarpet rc = new RoomCarpet(rd, 5);
        // System.out.println(rc);
        // System.out.println("Total cost = " + rc.getTotalCost());
        try (Scanner in = new Scanner(System.in)) {
            System.out.println("Enter the length of the room");
            double length = in.nextDouble();
            System.out.println("Enter the width of the room");
            double width = in.nextDouble();
            System.out.println("Enter a price per unit area");
            double price = in.nextDouble();
            RoomCarpet rc = new RoomCarpet(new RoomDimension(length, width), price);
            System.out.printf("That'll cost you $%.2f", rc.getTotalCost());
        }
    }
}
