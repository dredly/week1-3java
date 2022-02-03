import java.util.Scanner;

public class WhileAverage {
   public static void main( String args[] ) {
      int total = 0;
      int counter = 0;
      Scanner in = new Scanner(System.in);
      System.out.print("Input a mark, or -1 to stop ");
      int prevMark = in.nextInt();
      while (prevMark != -1) {
         total += prevMark;
         System.out.print("Input another mark ");
         int mark = in.nextInt();
         prevMark = mark;
         counter++;
      }
      float avg = (float) total / counter;
      System.out.println("The average is: " +  avg);
   }
}