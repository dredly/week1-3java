public class StudentTest {
    public static void main(String[] args) {
        Student s1 = new Student("Matt Morgan", 67485, "COMSC", "mm@gmail.com");
        Student s2 = new Student("Tim Marshall", 17435, "MUSIC", "tm@gmail.com");
        Student s3 = new Student("Richard Wright", 12561, "MATHS", "rw@gmail.com");
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        Module m1 = new Module("CMT245", "Machine Learning");
        Student[] m1Students = { s1, s2, s3 };
        m1.addStudents(m1Students);
        System.out.println(m1);
        int[] idsToRemove = { 67485, 17435, 420 };
        m1.removeStudentsById(idsToRemove);
        System.out.println(m1);
        m1.removeAllStudents();
        System.out.println(m1);
    }
}
