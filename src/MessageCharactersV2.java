import java.util.Scanner;

public class MessageCharactersV2 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Insert a text message: ");
        String message = input.nextLine();

        if (message.length()>=6) {
            if (message.length()<=10){
                System.out.println("Your message is: " + message);
            } else {
                System.out.println("Your message is too long! It has to be between 6 - 10 characters!");
            }
        } else {
            System.out.println("Your message is too short! It has to be between 6-10 characters!");
        }
    }
}

