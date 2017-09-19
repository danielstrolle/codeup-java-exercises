import java.util.Scanner;

public class ConsoleExercises {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter an integer: ");
        int number = scan.nextByte();
        System.out.println(number);

        System.out.println("Enter three words: ");
        String wordOne = scan.next();
        String wordTwo = scan.next();
        String wordThree = scan.next();
        scan.nextLine();
        System.out.println(wordOne);
        System.out.println(wordTwo);
        System.out.println(wordThree);

        System.out.println("Enter a sentence: ");
        String sentence = scan.nextLine();
        System.out.println(sentence);

        System.out.println("What is the length of the classroom?");
        String length = scan.nextLine();
        float lngth = Float.parseFloat(length);
        System.out.println("What is the width of the classroom?");
        String width = scan.nextLine();
        float wdth = Float.parseFloat(width);
        System.out.println("What Is the height of the classroom?");
        String height = scan.nextLine();
        float hght = Float.parseFloat(height);
        float area = wdth * lngth;
        System.out.println("The area of the classroom is: " + area);
        float perim = 2 * wdth + 2 * lngth;
        System.out.println("The perimeter of the classroom is " + perim);
        float vol = lngth * wdth * hght;
        System.out.println("The volume of the classroom is " + vol);
    }
}