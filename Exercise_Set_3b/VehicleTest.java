public class VehicleTest {
    public static void main(String[] args) {
        Vehicle v1 = new Vehicle("Peugeot", 4, new Person("Bob", 33));
        System.out.println(v1);
        Vehicle v2 = new Vehicle("Mitsubishi", 2, new Person("Jake", 24));
        Vehicle v3 = new Vehicle("Peugeot", 4, new Person("Alice", 29));
        System.out.println("v1 = v2? " + v1.equals(v2));
        System.out.println("v1 = v3? " + v1.equals(v3));
        System.out.println(v2.getOwner().getAge());
        v3.changeCylinders(-1);
        v3.changeCylinders(6);
        System.out.println(v3);
        System.out.println(v3.getNumCylinders());
    }
}
