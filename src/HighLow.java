import java.util.Scanner;

public class HighLow {
    private static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        int rando = generateRandom();
        int userGuess = getInteger(1, 100);

        if (userGuess > rando) {
            System.out.println("LOWER");
        } else if (userGuess < rando) {
            System.out.println("HIGHER");
        } else {
            System.out.println("You got it!");
        }
    }

    public static int generateRandom() {
        int randomNumber = (int) (Math.random() * 100);
        System.out.println(randomNumber);
        return (randomNumber);
    }

    public static int getInteger(int min, int max) {
        System.out.println("I have chosen a number between 1 & 100. Guess my number!");
        int userGuess = scan.nextInt();
        if (userGuess > max || userGuess < min) {
            System.out.println("Please enter a valid number!");
            return getInteger(min, max);
        } else {
            return userGuess;
        }
    }
}
