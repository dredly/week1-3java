import java.util.Scanner;

public class DoWhileAverage {
    public static void main( String args[] ) {
        Scanner in = new Scanner(System.in);
        Scanner keyboard = new Scanner(System.in);
        int total = 0;
        int counter = 0;
        String continueKey = "";
        do {
            System.out.print("Input a new mark ");
            int mark = in.nextInt();
            total += mark;
            counter ++;
            float currentAvg = (float) total / counter;
            System.out.println("Current average: " + currentAvg);
            System.out.print("Press the q key if you wish to quit, otherwise press any key to continue ");
            continueKey = keyboard.nextLine();
        } while (continueKey.compareTo("q") != 0);
        float avg = (float) total / counter;
        System.out.println("Final average: " + avg);
    }
}