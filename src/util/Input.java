package util;

import java.util.Scanner;

public class Input {
    private Scanner scanner;

    public Input() {
        scanner = new Scanner(System.in);
    }

    public String getString() {
        return this.scanner.nextLine();
    }

    public boolean yesNo() {
        String userInput = scanner.nextLine();
        return (userInput.equalsIgnoreCase("y") || userInput.equalsIgnoreCase("yes"));
    }

    public int getInt(int min, int max) {
        System.out.println("Please enter a number between " + min + " & " + max);
        int userInput = scanner.nextInt();
        if ((userInput > max) || (userInput < min)) {
            System.out.println("Please enter a valid number!");
            scanner.nextLine();
            return getInt(min, max);
        }
        scanner.nextLine();
        return userInput;
    }

//    public int getInt(int min, int max) {
//        int userInput;
//        do {
//            System.out.println("Please enter a number between " + min + " & " + max);
//            userInput = scanner.nextInt();
//            if ((userInput > max) || (userInput < min)) {
//                System.out.println("Please enter a valid number!");
//            }
//        } while ((userInput > max) || (userInput < min));
//        return userInput;
//    }

    // USING EITHER DO WHILE OR RECURSION ACCOMPLISHES THE SAME FUNCTIONALITY, JUST USE WHICHEVER IS MORE CLEAR IN THE CURRENT SITUATION/TO THE PROBLEM

    public double getDouble() {
        System.out.println("Please enter a number: ");
        double userInput = scanner.nextDouble();
        scanner.nextLine();
         return userInput;
    }

    public double getDouble(double min, double max) {
        System.out.println("Please enter a number between " + min + " & " + max);
        double userInput = scanner.nextDouble();
        if ((userInput > max) || (userInput < min)) {
            System.out.println("Please enter a valid number!");
            scanner.nextLine();
            return getDouble(min, max);
        }
        scanner.nextLine();
        return userInput;
    }
}

