import java.util.ArrayList;
public class StudentGroup {

    String nazwa;
    ArrayList<Student> students; // Lista studentów w grupie

    public StudentGroup(String nazwa) {
        this.nazwa = nazwa;
        this.students = new ArrayList<>();
    }

    public void addStudent(Student student) {
        if (students.size() >= 15) {
            throw new IllegalStateException("Grupa studencka jest już pełna.");
        }

        if (students.contains(student)) {
            throw new IllegalStateException("Ten student jest już w tej grupie.");
        }

        students.add(student);
    }
}
