public class Square extends Rectangle {

    public Square(double width) {
        super(width, width);
    }

    public double calculateArea() {
        area = getWidth()*getWidth();
        return area;
    }
}
