public class Rectangle extends Shapes {
    private int length,width;

    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }
    public double getArea() {
        return length*width;
    }

    public String toString() {
        return "Rectangle";
    }
}
