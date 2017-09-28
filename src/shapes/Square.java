package shapes;

public class Square extends Rectangle {

    public Square (int sides) {
        super(sides, sides);
    }

    public int getArea () {
        System.out.println("from square");
        return (super.getLength() * super.getWidth());
    }
    public int getPerimeter () {
        System.out.println("from square");
        return (4 * super.getLength());
    }
}
