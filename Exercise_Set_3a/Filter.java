import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.File;
import java.util.Scanner;

public class Filter {
    public static void main(String[] args) {
        if (args.length != 3) {
            System.out.println("Please enter a keyword, an input file and an output file");
            System.exit(1);
        }
        String keyword = args[0];
        String inputFileName = args[1];
        String outputFileName = args[2];
        try {
            FileWriter writer = new FileWriter(outputFileName);
            PrintWriter out = new PrintWriter(writer);
            Scanner in = new Scanner(new File(inputFileName));
            while (in.hasNextLine()) {
                String currentLine = in.nextLine();
                if (currentLine.contains(keyword)) {
                    out.println(currentLine);
                }
            }
            out.close();
        } catch (Exception e) {
            System.out.println(e.getStackTrace());
        }
    }
}
