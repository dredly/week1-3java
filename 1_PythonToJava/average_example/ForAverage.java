import java.util.Scanner;
import java.util.ArrayList;

public class ForAverage {
   public static void main( String args[] ) {
      Scanner in = new Scanner(System.in);
      System.out.print("How many marks would you like to input? ");
      int numMarks = in.nextInt();
      int total = 0;
      // ArrayList<Integer> marks = new ArrayList<Integer>();
      for (int i=0; i < numMarks; i++) {
          System.out.print("Input a mark ");
          int mark = in.nextInt();
          total += mark;
      }
      float avg = (float) total / numMarks;
      System.out.println("The average is: " +  avg);
   }
}