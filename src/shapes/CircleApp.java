package shapes;

import util.Input;

public class CircleApp {
    public static void main(String[] args) {

        Input input = new Input();
        do {
            double userInput = input.getDouble();
            Circle circle = new Circle(userInput);
            System.out.println("The area of the circle is " + circle.getArea());
            System.out.println("The circumference of the circle is " + circle.getCircumference());
        } while (input.yesNo("Do you want to create another circle?"));

        System.out.println("OK, bye!");

        }

    }
