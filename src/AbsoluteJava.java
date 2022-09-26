import java.util.Scanner;

public class AbsoluteJava {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Insert a number:");
        double a = input.nextDouble();
        if (a<0){
            System.out.println("The number you've insterted is: " + a + " and absolute value of your number is: " + Math.abs(a));
        } else{
            System.out.println("Absolute value of inserted number is: " + Math.abs(a));
        }
//komentar tekst
        
    }
}
