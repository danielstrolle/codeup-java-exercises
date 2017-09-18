public class JavaSyntax {
    public static void main(String[] args) {
        int myFavoriteNumber = 10;
        System.out.println(myFavoriteNumber);
        String myString = "ten";
        // have to use double quotes to assign to a string, wont accept single quotes or a number
        System.out.println(myString);
//        long myNumber = 123;
        //will print 123, but not 3.14. 3.14 is a double, cant go back to a long from a double, can go up from an int ie. 123 to a long
        float myNumber = 3.14f;
        // can use 3.14f to specify we are using a float.
        System.out.println(myNumber);

//        int x = 5;
//        System.out.println(++x);
//        System.out.println(x);
        // prints 6, 6
        // increments x, then prints it so we get 6, then call x again and its 6 still


//        int x = 5;
//        System.out.println(x++);
//        System.out.println(x);
        // prints 5, 6
        //prints x first, then increments it, so when we call x again after its moved from 5 to 6. but the first call to x is before we increment

       // cannot assign a variable named class, it is a reserved word and may not be used as an identifier
//
//        int x = 4;
////        x = x + 5;
//        x += 5;
//
//        int x = 3;
//        int y = 4;
////        y = y * x;
//        y *= x;
//
//        int x = 10;
//        int y = 2;
////        x = x / y;
////        y = y - x;
//        x /= y;
//        y -= x;
//
    }
}
