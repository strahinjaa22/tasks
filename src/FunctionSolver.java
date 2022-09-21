import java.util.Scanner;

public class FunctionSolver {
    public static void main(String[] args) {

        System.out.println("Assign the value to X: ");
        Scanner input = new Scanner(System.in);
        int x = input.nextInt();
        System.out.println("Value of X is:" + x);

        if (0<=x && x<=100) {
            System.out.println("f(x)="+(2*x));
            System.out.println("g(x)="+(int)Math.pow(x,2));
        } else {
            System.out.println("f(x)="+0);
            System.out.println("g(x)="+0);
        }
    }
}
