
public class Methods {
    public static void main(String[] args) {
        /*printName();
        String name= printNameOne("Strahinja");
        System.out.println("My name is " + name);
        calculate(3,5);*/
        calculate(5,6);
        calculate(3,4,5);
        int sum = calculateAgain(4,5);
        System.out.println("Your score is " + sum);
        Methods method = new Methods();
        method.greetMe();
    }
/*
    public static void printName() {
        System.out.println("Strahinja");
    }

    public static String printNameOne(String n) {
        System.out.println(n);
        return n;
    }*/

    public static void calculate(int a, int b) {
        System.out.println(a+b);
        System.out.println(a-b);
    }

    public static void calculate(int c, int d, int e) {
        System.out.println(c+d+e);
        System.out.println(c*d*e);
    }

    public static int calculateAgain(int a, int b) {
        int sum = a*b;
        System.out.println(sum);
        return sum;
    }

    public void greetMe() {
        System.out.println("hello");
    }
}
