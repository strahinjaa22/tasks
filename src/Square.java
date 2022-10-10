public class Square extends Rectangle {
    double sArea;

    public Square(double width) {
        super(width, width);
    }

    public double squareArea() {
        this.sArea = getWidth()*getWidth();
        return sArea;
    }
}
