
 public class Trapezoid {
    private double height, width, base;

    public Trapezoid(double h, double w, double b) {
        setHeight(h);
        setWidth(w);
        setBase(b);
    }

    public double getHeight() { return height; }
    public double getWidth() { return width; }
    public double getBase() { return base; }

    public void setHeight(double h) { height = h; }
    public void setWidth(double w) { width = w; }
    public void setBase(double b) { base = b; }
    public double area() { 
        return getHeight() * (getWidth() + getBase()) / 2;
    }

    public double perimeter() {
        return 2 * getHeight() + getWidth() + getBase();
    }
 
 }
