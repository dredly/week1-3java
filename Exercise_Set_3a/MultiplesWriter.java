import java.io.FileWriter;
import java.io.PrintWriter;

public class MultiplesWriter {
    public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println("Please provide an integer to multiply by and a filename to save to");
            System.exit(1);
        }
        int multiplyBy = 1;
        String fileName = args[1];
        try {
            multiplyBy = Integer.parseInt(args[0]);
        } catch (Exception e) {
            System.out.println("Make sure you provide an integer as the first command line argument");
            System.out.println(e.getStackTrace());
        }
        try {
            FileWriter writer = new FileWriter(fileName);
            PrintWriter out = new PrintWriter(writer);
            for (int i = 1; i <= 12; i++) {
                out.println(multiplyBy * i);
            }
            out.close();
        } catch (Exception e) {
            System.out.println(e.getStackTrace());
        }

    }
}
