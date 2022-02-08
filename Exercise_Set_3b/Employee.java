public class Employee {
    private String name;
    private int idNumber;
    private String department;
    private String position;

    // Default constructor
    public Employee() {
        name = "";
        idNumber = 0;
        department = "";
        position = "";
    }

    public Employee(String name, int idNumber) {
        this.name = name;
        this.idNumber = idNumber;
        department = "";
        position = "";
    }

    public Employee(String name, int idNumber, String department, String position) {
        this.name = name;
        this.idNumber = idNumber;
        this.department = department;
        this.position = position;
    }

    // Getters
    public String getName() {
        return name;
    }

    public int getIdNumber() {
        return idNumber;
    }

    public String getDepartment() {
        return department;
    }

    public String getPostion() {
        return position;
    }

    // Setters
    public void setName(String newName) {
        name = newName;
    }

    public void setIdNumber(int newIdNumber) {
        idNumber = newIdNumber;
    }

    public void setDepartment(String newDepartment) {
        department = newDepartment;
    }

    public void setPosition(String newPosition) {
        position = newPosition;
    }

    @Override
    public String toString() {
        return name + "   " + idNumber + "   " + department + "   " + position;
    }
}
