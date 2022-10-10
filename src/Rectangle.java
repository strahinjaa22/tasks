public class Rectangle {
    double width;
    double height;
    double area;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double rectangleArea() {
        this.area = getWidth()*getHeight();
        return area;
    }

    public double getWidth() { return width; }
    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }
    public void setHeight(double height) {
        this.height = height;
    }

    public double getArea() {
        return area;
    }
    public void setArea(double area) {
        this.area = area;
    }
}
