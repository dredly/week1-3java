import java.io.FileReader;

public class CharReader {
    public static void main(String[] args) {
        try {
            FileReader reader = new FileReader("alphabet2.txt");
            while (true) {
                int c = reader.read();
                if (c == -1)
                    break;
                System.out.print((char) c);
            }
            reader.close();
        } catch (Exception e) {
            e.getStackTrace();
        }

    }
}
