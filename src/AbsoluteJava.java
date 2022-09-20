import java.util.Scanner;

public class AbsoluteJava {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Insert a number:");
        int a = input.nextInt();
        System.out.println("Absolute value of inserted number is: " + Math.abs(a));

    }
}
