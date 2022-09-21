import java.util.Scanner;

public class PrintStars {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Insert a number:");
        int x = input.nextInt();

        String message = switch (x) {
            case 1 -> "*";
            case 2 -> "**";
            case 3 -> "***";
            case 4 -> "****";
            case 5 -> "*****";
            case 6 -> "*******";
            default -> "invalid number of";
        };
        System.out.println("The number you have picked has " + message + " stars");
    }
}
