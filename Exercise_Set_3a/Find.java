import java.util.Scanner;
import java.io.File;

public class Find {
    public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println("Please provide a string to find and a filename as arguments");
            System.exit(1);
        }
        System.out.println("Searching for \"" + args[0] + "\" in file " + args[1]);
        try {
            Scanner in = new Scanner(new File(args[1]));
            while (in.hasNextLine()) {
                String currentLine = in.nextLine();
                if (currentLine.contains(args[0])) {
                    System.out.println(currentLine);
                }
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
