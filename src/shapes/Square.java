package shapes;

public class Square extends Quadralateral {

    public Square (double side) {
        this.length = side;
        this.width = side;
    }

    @Override
    public void setLength(double l) {
        this.length = l;
        this.width = l;
    }

    @Override
    public void setWidth(double w) {
        this.width = w;
        this.length = w;
    }

    @Override
    public double getPerimeter() {
        return (4 * super.getLength());
    }

    @Override
    public double getArea() {
        return (super.getLength() * super.getWidth());
    }

//    public Square (int sides) {
//        super(sides, sides);
//    }
//
//    public int getArea () {
//        System.out.println("from square");
//        return (super.getLength() * super.getWidth());
//    }
//    public int getPerimeter () {
//        System.out.println("from square");
//        return (4 * super.getLength());
//    }
}
