package shapes;

public class Rectangle extends Quadralateral implements Measurable {
    public Rectangle(double l, double w){
        this.length = l;
        this.width = w;
    }
    @Override
    public double getPerimeter() {
        return (2 * length) + (2 * width);
    }

    @Override
    public double getArea() {
        return length * width;
    }

    @Override
    public void setLength(double l) {
        this.length = l;
    }

    @Override
    public void setWidth(double w) {
        this.width = w;
    }
//    private int length;
//    private int width;
//
//    public int getLength() {
//        return length;
//    }
//
//    public int getWidth() {
//        return width;
//    }
//
//    public Rectangle (int length, int width) {
//        this.length = length;
//        this.width = width;
//    }
//
////    public Rectangle () {}
//
//    public int getArea () {
//        return length * width;
//    }
//
//    public int getPerimeter () {
//        return (2 * length) + (2 * width);
//    }
}
