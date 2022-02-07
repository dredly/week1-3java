import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

public class ReaderTest {

    public static void main(String[] args) {

        try {

            FileReader reader = new FileReader("test.txt");
            BufferedReader in = new BufferedReader(reader);

            String s;
            ArrayList<Integer> lineLengths = new ArrayList<Integer>();
            while ((s = in.readLine()) != null) {
                lineLengths.add(s.length());
            }
            int totalChars = lineLengths.stream().mapToInt(a -> a).sum();
            float meanChars = totalChars / lineLengths.size();

            System.out.println("Least characters on a line = " + Collections.min(lineLengths));
            System.out.println("Most characters on a line = " + Collections.max(lineLengths));
            System.out.println("Average characters on a line = " + meanChars);

            in.close();
        } catch (FileNotFoundException e) { // may be thrown by new FileReader(...)
            System.out.println(e);
        } catch (IOException e) { // may be thrown by readLine()
            System.out.println(e);
        }
    }

}