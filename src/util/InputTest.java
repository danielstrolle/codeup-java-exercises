package util;

import util.Input;

public class InputTest {

    public static void main(String[] args) {
        Input input = new Input();
        System.out.println(input.getString("Please enter a sentence: "));
        System.out.println(input.yesNo("Do you like JAVA"));
        System.out.println(input.getInt(1, 10));
        System.out.println(input.getDouble(.4, 8.5));
    }
}
