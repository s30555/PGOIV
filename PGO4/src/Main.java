import java.util.Arrays;
import java.util.List;
public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("Anna", "Kowalska", "s3456", "ann.kowalska@example.com", "Gwiezdna 46", (List) Arrays.asList(6, 4, 5));
        Student student2 = new Student("Maciek", "Rybak", "s6678", "m.rybak@example.com", "Wesoła 334", (List) Arrays.asList(5, 5, 3));
        StudentGroup group1 = new StudentGroup("Group A");

        try {
            group1.addStudent(student1);
            group1.addStudent(student2);

        } catch (IllegalStateException e) {
            System.out.println("Error adding student to group: " + e.getMessage());
        }

        try {
            double averageGrade1 = student1.calculateAverageGrade();
            double averageGrade2 = student2.calculateAverageGrade();
            System.out.println("Student " + student1.fname + " " + student1.lname + " average grade: " + averageGrade1);
            System.out.println("Student " + student2.fname + " " + student2.lname + " average grade: " + averageGrade2);
        } catch (IllegalArgumentException e) {
            System.out.println("Error calculating average grade: " + e.getMessage());
        }

        System.out.println("StudentGroup Information:");
        System.out.println(group1.toString());
    }
}