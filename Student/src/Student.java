import java.util.ArrayList;
import java.util.List;

//creating an instance of the class Student
public class Student {
    private int student_id;
    private String student_name;
    private List <Double> grades;

//using getters and setters methods to modify and access the variables
    public int getStudent_id() {
        return student_id;
    }

    public void setStudent_id(int student_id) {
        this.student_id = student_id;
    }

    public String getStudent_name() {
        return student_name;
    }

    public void setStudent_name(String student_name) {
        this.student_name = student_name;
    }

    //putting method add grade to add grades

    public List<Double> getGrades() {
        return grades;
    }

    public void setGrades(List<Double> grades) {
        this.grades = grades;
    }
    public void addGrade(double grade) {
        if (grades == null) {
            grades = new ArrayList<>();
        }
        grades.add(grade);
    }

}
class Main{
    public static void main(String[] args) {
        //creating instance of student
        Student student = new Student();

        //setting values using the setter method
        student.setStudent_id(1);
        student.setStudent_name("Deborah Kulak");

        //adding grades using the add grade method
        student.addGrade(94.0);
        student.addGrade(83.9);
        student.addGrade(91.5);

        //getting values using the getter method
        int student_id = student.getStudent_id();
        String student_name = student.getStudent_name();
        List <Double> grades = student.getGrades();

       // Print the values
        System.out.println("Student ID: " +  student_id);
        System.out.println("Student Name: " + student_name);
        System.out.println("Grades: " + grades);

    }
}