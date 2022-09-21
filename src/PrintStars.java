import java.util.Scanner;

public class PrintStars {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Insert a number:");
        int x = input.nextInt();
        String message = null;

        switch (x){
            case 1:
                message="*";
                break;
            case 2:
                message="**";
                break;
            case 3:
                message="***";
                break;
            case 4:
                message="****";
                break;
            case 5:
                message="*****";
                break;
            case 6:
                message="*******";
                break;
            default:
                message="invalid number of";
        }
        System.out.println("The number you have picked has " + message + " stars");
    }
}
