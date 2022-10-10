public class TestArea {
    public static void main(String[] args) {

        Rectangle r = new Rectangle(5.0, 2.0);
        System.out.println(r.calculateArea());
        Square s = new Square(6.0);
        System.out.println(s.calculateArea());
        System.out.println("Total area is: " + (r.calculateArea() + s.calculateArea()));

    }
}
