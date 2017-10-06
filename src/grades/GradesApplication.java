package grades;

import grades.Student;

import java.util.*;

public class GradesApplication {
    public static void main (String[] args) {
        HashMap<String, Student> students = new HashMap<>();
        Student student1 = createStudent("Billy Ray Cyrus");
        List<Integer> stuOneGrades = Arrays.asList(69, 70, 71);

//        student1.addGrade(69);
//        student1.addGrade(70);
//        student1.addGrade(71);
        addGrades(student1, stuOneGrades);

        Student student2 = createStudent("Lil' Jon");
        student2.addGrade(3);
        student2.addGrade(6);
        student2.addGrade(9);

        Student student3 = createStudent("Mike Tyson");
        student3.addGrade(100);
        student3.addGrade(100);
        student3.addGrade(99);

        Student student4 = createStudent("Albert Einstein");
        student4.addGrade(10);
        student4.addGrade(20);
        student4.addGrade(30);

        students.put("ridingMiley", student1);
        students.put("eastsideBoyz", student2);
        students.put("whatLispth", student3);
        students.put("imtoodrunktotastethischicken", student4);


        Scanner scan = new Scanner(System.in);


        System.out.println("Welcome!");
        System.out.println();
        System.out.println("Here are the github usernames of our students: ");
        System.out.print("| ");
        for(String key: students.keySet()){
            System.out.print(key + " | ");
        }
        System.out.println("\n");

        System.out.println("Do you want to see a CSV report of all the students? (y/n)");
        String seeAll = scan.nextLine();
        if (seeAll.equalsIgnoreCase("y")) {
            classAverages(students);
        }



        String contin;
        do {

        System.out.println("What student would you like to see more information on?");
        String whichStudent = scan.nextLine();

        if (students.get(whichStudent) == null) {
            System.out.println("Sorry, no student found with the username " + whichStudent + ". :(");


        } else {
            System.out.println("Name : " + students.get(whichStudent).getName() + "- Github Username: " + whichStudent);
            System.out.println("Current Average: " + students.get(whichStudent).getGradeAverage());
        }
            System.out.println("Would you like to see another student? (y/n)");
            contin = scan.nextLine();
        } while (contin.equalsIgnoreCase("y"));
        System.out.println("OK, Goodbye!");

    }

    public static Student createStudent(String name){
        return new Student(name);
    }
    public static void addGrades(Student student, List<Integer> grades){
        for(Integer grade : grades){
            student.addGrade(grade);
        }
    }

    public static void classAverages (HashMap<String, Student> list) {
        for (String student : list.keySet()) {
//            System.out.println(student.getGradeAverage());
            System.out.println(list.get(student).getName() + " with github username: " + student +  " has an average of " + list.get(student).getGradeAverage());

        }

    }
}
