
public class Square extends Rectangle {
    public Square(double w) {
        super(w, w);
    }

    public double area() { return getWidth() * getWidth(); }
}

