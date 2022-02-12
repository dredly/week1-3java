public class Student {
    private String name;
    private int idNumber;
    private String school;
    private String email;

    // Constructors
    public Student() {
        name = "";
        idNumber = 0;
        school = "";
        email = "";
    }

    public Student(String name, int idNumber) {
        this.name = name;
        this.idNumber = idNumber;
        school = "";
        email = "";
    }

    public Student(String name, int idNumber, String school, String email) {
        this.name = name;
        this.idNumber = idNumber;
        this.school = school;
        this.email = email;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getIdNumber() {
        return this.idNumber;
    }

    public void setIdNumber(int idNumber) {
        this.idNumber = idNumber;
    }

    public String getSchool() {
        return this.school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "name='" + getName() + "'" +
                ", idNumber=" + getIdNumber() +
                ", school='" + getSchool() + "'" +
                ", email='" + getEmail() + "'";
    }
}