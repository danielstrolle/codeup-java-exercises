package shapes;

public abstract class Quadralateral extends Shape implements Measurable {
    protected double length;
    protected double width;

    public Quadralateral(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public Quadralateral () {}

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    public abstract void setLength(double l);
    public abstract void setWidth(double w);
}
