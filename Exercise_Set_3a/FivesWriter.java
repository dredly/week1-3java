import java.io.FileWriter;
import java.io.PrintWriter;

public class FivesWriter {
    public static void main(String[] args) {
        try {
            FileWriter writer = new FileWriter("times5append.txt", true);
            PrintWriter out = new PrintWriter(writer);
            for (int i = 1; i <= 12; i++) {
                out.println(5 * i);
            }
            out.close();
        } catch (Exception e) {
            System.out.println(e.getStackTrace());
        }

    }
}
