public class LoopPrinter {
    public static void main(String args[]) {
        for (int i = 1; i <= 5; i++) {
            System.out.println(i);
        }
        for (int i = 1; i <= 15; i++) {
            System.out.print(i + ",");
        }
        System.out.println("");
        for (int i = 15; i > 0; i--) {
            System.out.print(i + ",");
        }
        System.out.println("");
        for (int i = 5; i < 50; i += 5) {
            System.out.print(i + ",");
        }
    }
}
