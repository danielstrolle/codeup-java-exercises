import java.util.Scanner;

public class ControlFlowExercises {
    public static void main(String[] args) {
//        int i = 5;
//        while (i <= 15){
//            System.out.println(i);
//            i++;
//        }


//        int counter = 100;
//        do {
//            System.out.println(counter);
//            counter -= 5;
//        } while (counter >= -10);

//        long number = 2;
//        do {
//            System.out.println(number);
//            number *= number;
//        }
//        while (number < 1000000);


        for (int i = 5; i <= 15; i++) {
            System.out.println(i);
        }

        for (int counter = 100; counter >= -10; counter -= 5) {
            System.out.println(counter);
        }

        for (long number = 2; number < 1000000; number *= number) {
            System.out.println(number);
        }


        for (int i = 1; i <= 100; i++) {
            if ((i % 3 == 0) && (i % 5 == 0)) {
                System.out.println("FizzBuzz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
            } else {
                System.out.println(i);
            }
        }

        Scanner scan = new Scanner(System.in);
        String contin;
        do {

            System.out.println("Enter an integer: ");
            int userInteger = scan.nextInt();

//        System.out.print("number |");
//        System.out.print(" squared |");
//        System.out.println(" cubed");

            String leftAlignFormat = "| %-6d | %-7d | %-5d |%n";

            System.out.format("+--------+---------+-------+%n");
            System.out.format("| number | squared | cubed |%n");
            System.out.format("+--------+---------+-------+%n");

            for (int i = 1; i <= userInteger; i++) {

//            System.out.print(i + " | ");
                int squared = i * i;

//            System.out.print(squared + " | ");
                int cubed = (i * i) * i;

//            System.out.println(cubed);
//            System.out.format("%10d%10d%10d", i, squared, cubed);

                System.out.format(leftAlignFormat, i, squared, cubed);
            }
            System.out.format("+--------+---------+-------+%n");

            System.out.println("Do you want to continue? (yes/no)");
            contin = scan.nextLine();
        }
        while (contin.equalsIgnoreCase("yes"));


        do {

            System.out.println("Give me a numerical grade: ");
            String userGrade = scan.nextLine();
            int numberGrade = Integer.parseInt(userGrade);

            if (numberGrade <= 60) {
                // ((numberGrade <=100) && (numberGrade >=88)) sout "A!"
                // ((numberGrade <=60) && (numberGrade >= 0)) sout "F!" MORE SPECIFIC WAY, ORDER OF IFS DOESN'T MATTER THIS WAY
                // ((numberGrade <=66) && (numberGrade >=60)) sout "D!")....etc.
                System.out.println("You got a F!");
            } else if (numberGrade <= 62){
                System.out.println("You got a D-!");
            } else if (numberGrade <= 64) {
                System.out.println("You got a D!");
            } else if (numberGrade <= 66) {
                System.out.println("You got a D+!");
            } else if (numberGrade <= 72) {
                System.out.println("You got a C-!");
            } else if (numberGrade <= 77) {
                System.out.println("You got a C!");
            } else if (numberGrade <= 79) {
                System.out.println("You got a C+!");
            } else if (numberGrade <= 81) {
                System.out.println("You got a B-!");
            } else if (numberGrade <= 85) {
                System.out.println("You got a B!");
            } else if (numberGrade <= 87) {
                System.out.println("You got a B+!");
            } else if (numberGrade <= 90) {
                System.out.println("You got an A-!");
            } else if (numberGrade <= 98) {
                System.out.println("You got an A!");
            } else if (numberGrade <= 100) {
                System.out.println("You got an A+!");
            }
            System.out.println("Do you want to continue? (yes/no)");
            contin = scan.nextLine();
        } while (contin.equals("yes"));
        }
    }
