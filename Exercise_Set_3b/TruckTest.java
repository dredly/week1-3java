public class TruckTest {
    public static void main(String[] args) {
        Truck t1 = new Truck("Brockway", 6, new Person("John", 40), 23.4, 46);
        Truck t2 = new Truck("Brockway", 6, new Person("John", 40), 23.1, 46);
        Truck t3 = new Truck("Brockway", 6, new Person("Alice", 26), 23.4, 46);
        System.out.println(t1);
        System.out.println(t1.getNumCylinders());
        System.out.println("t1 = t2? " + t1.equals(t2));
        System.out.println("t1 = t3? " + t1.equals(t3));
    }
}
