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
        int userInput = getInt();
        if ((userInput > max) || (userInput < min)) {
            System.out.println("Please enter a valid number!");
            scanner.nextLine();
            return getInt(min, max);
        }
        scanner.nextLine();
        return userInput;
    }

    public int getInt() {
        String userInput = getString("Please enter an Integer: ");
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
        String userInput = getString("Please enter a number: ");
        try {
            return Double.valueOf(userInput);
        } catch (NumberFormatException nfe) {
            System.out.println("Please enter a valid number!");
            return getDouble();
        }

    }

    public double getDouble(double min, double max) {
        System.out.println("Please enter a number between " + min + " & " + max);
        double userInput = getDouble();
        if ((userInput > max) || (userInput < min)) {
            System.out.println("Please enter a valid number!");
            scanner.nextLine();
            return getDouble(min, max);
        }
        scanner.nextLine();
        return userInput;
    }

    public int getBinary () {
        String userInput = getString("Enter a Binary Number: ");
        try {
        return Integer.valueOf(userInput, 2);
        } catch (NumberFormatException nfe) {
            System.out.println("Please enter a valid Binary number!");
            return getBinary();
        }
    }

    public int getHex () {
        String userInput = getString("Enter a Hexidecimal number: ");
        try {
            return Integer.valueOf(userInput, 16);
        } catch (NumberFormatException nfe) {
            System.out.println("Please enter a valid Hexadecimal number!");
            return getHex();
        }
    }

    public static void main(String[] args) {
        Input input = new Input();
        int user = input.getBinary();
        System.out.println("Your number converted is: " + user);
        int user2 = input.getHex();
        System.out.println("Your number converted is: " + user2);
    }
}

