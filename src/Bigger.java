import java.util.Scanner;

public class Bigger {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Insert first number:");
        int a = input.nextInt();
        System.out.println("Insert second number:");
        int b = input.nextInt();

        if (a > b) {
            System.out.println("Bigger number is: " + a);
        }
        else if (a < b) {
            System.out.println("Bigger number is: " + b);
        }
        else {
            System.out.println("Numbers are equal!");
        }
    }
}
