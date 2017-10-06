package shapes;

public class Square extends Quadrilateral {

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
            return this.length * 4;
//        return (4 * super.getLength());  WORKS THE SAME AS THIS.LENGTH, HOWEVER MORE INDIRECT, PROBABLY ONLY NEED IF LENGTH IS PRIVATE...WE CAN ACCESS LENGTH SINCE ITS PROTECTED IN QUAD AND SQUARE EXTENDS QUAD
    }

    @Override
    public double getArea() {
        return this.length * this.width;
//        return (super.getLength() * super.getWidth());
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
