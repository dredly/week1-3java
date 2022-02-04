import java.util.Scanner;

public class PrintStarRectangle {
    public static void main(String args[]) {
        try (Scanner in = new Scanner(System.in)) {
            System.out.print("Please enter a width: ");
            int w = in.nextInt();
            System.out.print("Please enter a height: ");
            int h = in.nextInt();
            for (int i = 0; i < h; i++) {
                for (int j = 0; j < w; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        }
    }
}
