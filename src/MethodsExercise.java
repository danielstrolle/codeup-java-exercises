import java.util.Scanner;

public class MethodsExercise {
    private static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println(add(4, 25));
        System.out.println(subtract(25, 4));
        System.out.println(multiply(4, 25));
        System.out.println(divide(25, 4));
        System.out.println(modulus(25, 4));
        String contin;
        String rollAgain;
        do {
            int userNum = getInteger(1, 10);
            long factorNum = (factorial(userNum));
            System.out.println(userNum + "! = " + factorNum);
            System.out.println("Do you wish to continue? y/n");
            contin = scan.next();
        } while (contin.equalsIgnoreCase("y"));

        do {
            System.out.println("How many sides are on your dice?");
            int userInput = scan.nextInt();
            int dice1 = diceSides(userInput);
            int dice2 = diceSides(userInput);
            System.out.println("Your " + userInput + " sided dice rolled a " + dice1 + " and a " + dice2);
            System.out.println("Do you want to roll again? y/n");
            rollAgain = scan.next();
        } while (rollAgain.equalsIgnoreCase("y"));
    }

    public static int add(int x, int y) {
        return (x + y);
    }

    public static int subtract(int x, int y) {
        return (x - y);
    }

    public static int multiply(int x, int y) {
        return (x * y);
    }

    public static int divide(int x, int y) {
        return (x / y);
    }

    public static int modulus(int x, int y) {
        return (x % y);
    }

    public static int getInteger(int min, int max) {
        System.out.println("Enter a number between " + min + " and " + max);
        int userInput = scan.nextInt();
        if (userInput > max || userInput < min) {
            System.out.println("Please enter a valid number!");
            return getInteger(min, max);
        } else {
            return userInput;
        }
    }

    public static long factorial(int userInput) {
        int factor = 1;
        for (int i = 1; i <= userInput; i++) {
            factor = factor * i;
        }
        return (factor);
    }

    public static int diceSides(int userInput) {
        int diceRoll = (int) (Math.random() * userInput);
        return (diceRoll);
    }
}


