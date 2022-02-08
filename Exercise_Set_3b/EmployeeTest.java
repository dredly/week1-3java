public class EmployeeTest {
    public static void main(String[] args) {
        Employee emp1 = new Employee("Matt Morgan", 67485, "COMSC", "Lecturer");
        Employee emp2 = new Employee("Tim Marshall", 78495, "BIOSI", "Professor");
        Employee emp3 = new Employee("Richard Wright", 43637, "PHYSX", "Reader");
        System.out.println(emp1);
        System.out.println(emp2);
        System.out.println(emp3);
        // emp1.setPosition("Professor");
        // System.out.println(emp1);
    }
}
