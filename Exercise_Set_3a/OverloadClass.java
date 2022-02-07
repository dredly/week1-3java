import java.util.Date;

public class OverloadClass {
    public static void foobar(float a, Date b) {
        System.out.println("Your float, sir: " + a);
        System.out.println("The date: " + b);
    }

    public static void foobar(Date a, float b) {
        System.out.println("Your date, sir: " + a);
        System.out.println("The float: " + b);
    }

    public static void foobar(float a, String b) {
        System.out.println("Your float, sir: " + a);
        System.out.println("The string: " + b);
    }

    public static void foobar(float a, Date b, int c) {
        System.out.println("Your float, sir: " + a);
        System.out.println("The string: " + b);
        System.out.println("Here is an int: " + c);
    }
}
