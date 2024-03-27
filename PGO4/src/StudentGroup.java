import java.util.ArrayList;
import java.util.List;
public class StudentGroup {
    public String name;
    public List<Student> students;
    public StudentGroup(String name) {
        this.name = name;
        this.students = new ArrayList<>();
    }
    public void addStudent(Student student) {
        if (students.size() >= 15) {
            throw new IllegalStateException("Group is full. Cannot add more students.");
        }
        if (students.contains(student)) {
            throw new IllegalStateException("Student is already in the group.");
        }
        students.add(student);
    }
    public void removeStudent(Student student) {
        students.remove(student);
    }
    @Override
    public String toString() {
        return "StudentGroup{" +
                "name='" + name + '\'' +
                ", students=" + students +
                '}';
    }
}

