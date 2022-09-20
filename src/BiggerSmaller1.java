import java.util.Scanner;

public class BiggerSmaller1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Insert first number:");
        double a = input.nextDouble();
        System.out.println("Insert second number:");
        double b = input.nextDouble();

        System.out.println("Bigger number is: " + Math.max(a,b) + ", while smaller is: " + Math.min(a,b));
    }
}
