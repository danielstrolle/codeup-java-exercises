package shapes;

import util.Input;

public class CircleApp {
    public static void main(String[] args) {
        boolean contin;
        do {
            Input input = new Input();
            double userInput = input.getDouble();
            Circle circle = new Circle(userInput);
            System.out.println("The area of the circle is " + circle.getArea());
            System.out.println("The circumference of the circle is " + circle.getCircumference());
            System.out.println("Do you want to create another circle?");
            contin = input.yesNo();
        } while (contin == true);
        System.out.println("OK, bye!");

        }

    }
