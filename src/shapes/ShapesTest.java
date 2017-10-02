package shapes;

public class ShapesTest {
    public static void main(String[] args) {

        Measurable myShape = new Rectangle(4,5);
        Measurable mySquare = new Square(6);


//        Rectangle box1 = new Rectangle(4, 5);
        System.out.println(myShape.getPerimeter());
        System.out.println(myShape.getArea());
//        Rectangle box2 = new Square(5);
        System.out.println(mySquare.getPerimeter());
        System.out.println(mySquare.getArea());

    }
}
