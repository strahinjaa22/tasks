public class TestArea {
    public static void main(String[] args) {

        Rectangle r = new Rectangle(5.0, 2.0);
        System.out.println(r.rectangleArea());
        Square s = new Square(6.0);
        System.out.println(s.squareArea());
        System.out.println("Total area is: " + (r.rectangleArea() + s.squareArea()));

    }
}
