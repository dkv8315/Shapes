
public class Rectangle extends Trapezoid {
    public Rectangle(double h, double w) {
        super(h, w, w);
    }

    public double area() { return getHeight() * getWidth(); }
}


