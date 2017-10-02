import util.Input;

import java.util.ArrayList;
import java.util.HashMap;

public class Student {
    private String name;

    private ArrayList <Integer> grades;

    private HashMap<String, String> attendance;

    public Input input = new Input();

    public Student (String name) {
        this.name = name;
        this.grades = new ArrayList<>();
        this.attendance = new HashMap<>();
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

    public void recordAttendance(String date, String value) {
//        while(true) {
//            if (value.equalsIgnoreCase("a") || value.equalsIgnoreCase("p")) {
                attendance.put(date, value);
//                break;
//            } else {
//                System.out.println("Sorry, please enter a valid input!");
//            }
//        }
    }

    public double attendancePercentage () {
        double counter = 0;
        for (String value : this.attendance.values()) {
            if(value.equalsIgnoreCase("p")){
                counter++;
            }
        }
        return (counter / this.attendance.size()) * 100;

    }

    public static void main(String[] args) {
        Student student = new Student("Jim Bob Cooter");
        Input input = new Input();
        System.out.println(student.getName());
        student.addGrade(100);
        student.addGrade(99);
        student.addGrade(88);
        student.addGrade(0);

        do{
            String date = input.getString("Enter a date: ");
            System.out.println("Enter Students attendance");
            String att = input.thisOrThat("a", "p");
            student.recordAttendance(date, att);

        } while (input.yesNo("Add another attendance score: (y/n)"));

        System.out.println(student.attendancePercentage());
    }
}
