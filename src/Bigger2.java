import java.util.Scanner;

public class Bigger2 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Insert first number:");
        int x = input.nextInt();
        System.out.println("Insert second number:");
        int y = input.nextInt();

        if (x>y) {
            System.out.println("Bigger number is: " + x);
        } else if (x<y) {
            System.out.println("Bigger number is: " + y);
        } else {
            System.out.println("Numbers are equal!");
        }
    }
}
