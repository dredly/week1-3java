import java.util.Scanner;
import java.io.File;

public class FindAdvanced {
    public static void main(String[] args) {
        boolean caseSensitive = true;
        String keyword = "";
        String filename = "";
        if (args.length == 2) {
            keyword = args[0];
            filename = args[1];
        } else if (args.length == 3 && args[0].equals("-i")) {
            caseSensitive = false;
            keyword = args[1].toLowerCase();
            filename = args[2];
        } else {
            System.out.println("Invalid command line arguments");
            System.exit(1);
        }
        try {
            Scanner in = new Scanner(new File(filename));
            while (in.hasNextLine()) {
                String currentLine = in.nextLine();
                if (caseSensitive) {
                    if (currentLine.contains(keyword)) {
                        System.out.println(currentLine);
                    }
                } else {
                    if (currentLine.toLowerCase().contains(keyword)) {
                        System.out.println(currentLine);
                    }
                }
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
