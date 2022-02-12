import java.util.ArrayList;
import java.util.Objects;
import java.util.Optional;

public class Module {
    private String moduleCode;
    private String name;
    private ArrayList<Student> students;

    // Constructor
    public Module(String moduleCode, String name) {
        this.moduleCode = moduleCode;
        this.name = name;
        this.students = new ArrayList<Student>();
    }

    // Getters
    public String getModuleCode() {
        return this.moduleCode;
    }

    public String getName() {
        return this.name;
    }

    public ArrayList<Student> getStudents() {
        return this.students;
    }

    // Setters and other methods
    public void changeName(String name) {
        this.name = name;
    }

    public void addStudents(Student[] newStudents) {
        for (Student s : newStudents) {
            this.students.add(s);
        }
    }

    public void removeStudentsById(int[] studentIds) {
        for (int id : studentIds) {
            Optional<Student> foundStudent = this.students.stream().filter(s -> s.getIdNumber() == id).findAny();
            foundStudent.ifPresent(s -> {
                this.students.remove(s);
            });
        }
    }

    public void removeAllStudents() {
        this.students = new ArrayList<Student>();
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Module)) {
            return false;
        }
        Module module = (Module) o;
        // Name and module code should be eqaul, but do not necessarily need the same
        // students
        return Objects.equals(moduleCode, module.moduleCode) && Objects.equals(name, module.name);
    }

    @Override
    public String toString() {
        return moduleCode + " " + name + " - " + students.size() + " students enrolled";
    }
}
