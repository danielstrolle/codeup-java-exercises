public class MethodsExercise {
    public static void main(String[] args) {
        System.out.println(add(4, 25));
        System.out.println(subtract(25, 4));
        System.out.println(multiply(4, 25));
        System.out.println(divide(25, 4));
        System.out.println(modulus(25, 4));
    }
    public static int add(int x, int y) {
        return (x+y);
    }
    public static int subtract(int x, int y) {
        return (x-y);
    }
    public static int multiply(int x, int y) {
        return (x*y);
    }
    public static int divide(int x, int y) {
        return (x/y);
    }
    public static int modulus(int x, int y) {
        return (x % y);
    }
}
