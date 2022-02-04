public class FloatingPointTest {
    public static void main(String args[]) {
        float myFloat = 1.37f;
        double myDouble = 1.37d;
        System.out.println(myFloat == myDouble);
        float myFloat2 = 0.1f;
        System.out.println(myFloat2 + 0.6f);
        float myFloatFraction = 1 / 49f;
        System.out.println("Float 1/49f * 49 = " + myFloatFraction * 49);
        double myDoubleFraction = 1 / 49d;
        System.out.println("Double 1/49d * 49 = " + myDoubleFraction * 49);
    }
}
