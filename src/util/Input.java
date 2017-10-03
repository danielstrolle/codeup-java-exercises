package util;

import java.util.Scanner;

public class Input {
    private Scanner scanner;

    public Input() {
        scanner = new Scanner(System.in);
    }

    public String getString(String prompt) {
        System.out.println(prompt);
        return this.scanner.nextLine();
    }

    public boolean yesNo(String prompt) {
        System.out.println(prompt);
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

    public int getInt() {
        System.out.println("Please enter an Integer: ");
        String userInput = scanner.nextLine();
        try {
            return Integer.valueOf(userInput);
        } catch (NumberFormatException nfe) {
            System.out.println("Please enter a valid integer");
            return getInt();
        }
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

    public String thisOrThat (String key, String value) {
        System.out.println("Enter a " + key + " or " + value);
        String userInput = scanner.nextLine();
        if (userInput.equalsIgnoreCase(key) || userInput.equalsIgnoreCase(value)) {
            return userInput;
        } else {
            System.out.println("Invalid Input");
            return thisOrThat(key, value);
        }
    }

    public double getDouble() {
        System.out.println("Please enter a number: ");
        String userInput = scanner.nextLine();
        try {
            return Integer.valueOf(userInput);
        } catch (NumberFormatException nfe) {
            System.out.println("Please enter a valid number!");
            return getDouble();
        }

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

