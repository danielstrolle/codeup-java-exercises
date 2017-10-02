import java.util.ArrayList;

public class Student {
    private String name;

    private ArrayList <Integer> grades;

    public Student (String name) {
        this.name = name;
        this.grades = new ArrayList<>();
    }

    // returns the student's name
    public String getName() {
        return this.name;
    }

    // adds the given grade to the grades property
    public void addGrade(int grade) {
        grades.add(grade);
    }

    // returns the average of the students grades
    public double getGradeAverage() {
        double numberOfGrades = grades.size();
        double sum = 0;
        for (int grade : grades) {
            sum += grade;
        } return (sum/numberOfGrades);
    }

    public static void main(String[] args) {
        Student student = new Student("Jim Bob Cooter");
        System.out.println(student.getName());
        student.addGrade(100);
        student.addGrade(99);
        student.addGrade(88);
        student.addGrade(0);
        System.out.println(student.getGradeAverage());
    }
}
