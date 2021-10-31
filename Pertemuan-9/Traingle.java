public class Traingle extends Shapes{
    private int base, height;

    public Traingle(int base, int height) {
        this.base = base;
        this.height = height;
    }

    public double getArea () {
        return 0.5*base*height;
    }

    public String toString() {
        return "Triangle";
    }
}
