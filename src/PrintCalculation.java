import java.util.Scanner;

public class PrintCalculation {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        System.out.println("Insert first number:");
        int a = input.nextInt();
        System.out.println("Insert second number:");
        int b = input.nextInt();
        System.out.println("       " + a);
        System.out.println("+" + "      " + b);
        System.out.println("----------");
        System.out.println("      "+ (a+b));

    }
}
