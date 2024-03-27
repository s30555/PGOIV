import java.util.ArrayList;
import java.util.List;
public class Student {
    public String fname;
    public String lname;
    public String indexNumber;
    public String email;
    public String address;
    public List<Integer> grades;

    public Student(String fname, String lname, String indexNumber, String email, String address, List<Integer> grades) {
        this.fname = fname;
        this.lname = lname;
        this.indexNumber = indexNumber;
        this.email = email;
        this.address = address;
        this.grades = grades;
    }

    public double calculateAverageGrade() {
        if (grades.isEmpty()) {
            throw new IllegalArgumentException("Student has no grades.");
        }
        double sum = 0;
        for (int grade : grades) {
            sum += grade;
        }
        double average = sum / grades.size();
        return roundToNearestGrade(average);
    }

    private double roundToNearestGrade(double average) {

        double[] availableGrades = {2, 2.5, 3, 3.5, 4, 4.5, 5};
        double minDiff = Double.MAX_VALUE;
        double closest = average;
        for (double grade : availableGrades) {
            double diff = Math.abs(grade - average);
            if (diff < minDiff) {
                minDiff = diff;
                closest = grade;
            }
        }
        return closest;
    }

    @Override
    public String toString() {
        return "Student{" +
                "fname='" + fname + '\'' +
                ", lname='" + lname + '\'' +
                ", indexNumber='" + indexNumber + '\'' +
                ", email='" + email + '\'' +
                ", address='" + address + '\'' +
                ", grades=" + grades +
                '}';
    }
}


