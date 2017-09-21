import java.util.Scanner;

public class Bob {
    public static void main(String[] args) {
        while (true) {

            Scanner scan = new Scanner(System.in);
            System.out.println("Ask Anything.");
            String convo = scan.nextLine();

            if (convo.endsWith("?")) {
                System.out.println("sure.");
            } else if (convo.endsWith("!") || (convo.equals(convo.toUpperCase()) && !convo.isEmpty())) {
                System.out.println("Whoa, chill out!");
            } else if (convo.isEmpty()) {
                System.out.println("Fine. Be that way!");
            } else {
                System.out.println("whatever.");
            }

            System.out.println("Continue? (y/n)");
            String option = scan.nextLine();
            if (!option.equalsIgnoreCase("y")) {
                break;
            }
//        boolean question;
//        boolean yelling;
//        boolean empty;
//        question = convo.endsWith("?");
//        yelling = convo.endsWith("!");
//        empty = convo.equals("");
//       if (question == true) {
//           System.out.println("sure.");
//       } else if (yelling == true) {
//           System.out.println("Whoa, chill out!");
//       } else if (empty == true) {
//           System.out.println("Fine. Be that way!");
//       } else {
//           System.out.println("whatever.");
//       }
//    }
//}
        }
    }
}