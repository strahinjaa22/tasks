import java.util.ArrayList;

public class Exceptions {
    public static void main(String[] args) {
        arritmeticException();
        nullException();
        arrayException();
    }

    public static void arritmeticException() {
       try {
           int data = 100/0;
       } catch (ArithmeticException e) {
           System.out.println(e);
       } finally {
           System.out.println("test");
       }
    }

    public static void nullException() {
        try {
            String s = null;
            System.out.println(s.length());
        } catch (NullPointerException n) {
            System.out.println(n);
        }
    }

    public static void arrayException() {
        try {
            int[] a = new int[5];
            a[11] = 15;
        } catch (Exception i) {
            ArrayList<String> test = new ArrayList<String>();
            test.add(String.valueOf(i));
            System.out.println(test);
        }
    }
}
