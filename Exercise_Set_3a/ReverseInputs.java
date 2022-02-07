import java.util.Vector;
import java.util.Scanner;

public class ReverseInputs {
    public static void main(String[] args) {
        System.out.println("PLEASE ENTER TEXT. ENTER A BLANK LINE WHEN YOU ARE FINISHED:");
        Scanner in = new Scanner(System.in);
        Vector<String> lines = new Vector<String>();
        while (true) {
            String line = in.nextLine();
            if (line.equals("")) {
                break;
            }
            lines.add(line);
        }
        in.close();
        for (String line : lines) {
            StringBuilder strb = new StringBuilder(line);
            StringBuilder strbReversed = strb.reverse();
            System.out.println(strbReversed.toString());
        }
    }
}
