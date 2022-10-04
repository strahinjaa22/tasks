import java.util.Scanner;

public class AppExercises {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        absoluteJava();
        System.out.println("\n");
        bigger();
        System.out.println("\n");
        biggerSmaller();
        System.out.println("\n");
        escaping();
        System.out.println("\n");
        functionSolver();
        System.out.println("\n");
        messageCharacters();
        System.out.println("\n");
        printCalculation();
        System.out.println("\n");
        printStars();
        System.out.println("\n");
    }

    public static void absoluteJava() {
        System.out.println("Insert a number:");
        double a = input.nextDouble();
        if (a<0){
            System.out.println("The number you've insterted is: " + a + " and absolute value of your number is: " + Math.abs(a));
        } else{
            System.out.println("Absolute value of inserted number is: " + Math.abs(a));
        }
    }

    public static void bigger() {
        System.out.println("Insert first number:");
        int a = input.nextInt();
        System.out.println("Insert second number:");
        int b = input.nextInt();

        if (a==b) {
            do {
                System.out.println("Numbers cannot be equal!");
                System.out.println("Insert first number:");
                a = input.nextInt();
                System.out.println("Insert second number:");
                b = input.nextInt();
            } while(a==b);
        } else {
            if (a>b) {
                System.out.println("Bigger number is: " + a);
            } else {
                System.out.println("Bigger number is: " + b);
            }
        }
    }

    public static void biggerSmaller() {
        System.out.println("Insert first number:");
        int a = input.nextInt();
        System.out.println("Insert second number:");
        int b = input.nextInt();

        System.out.println("Bigger number is: " + Math.max(a,b) + ", while smaller is: " + Math.min(a,b));
    }

    public static void escaping() {
        System.out.println("Name\t" + "Height\t" +"Gender");
        System.out.println("----------------------");
        System.out.println("Anna\t" + "5\'4\"\t" + "F");
        System.out.println("Test\t" + "6\'2\"\t" + "M");
        System.out.println("Ben \t" + "6\'2\"\t" + "M");
    }

    public static void functionSolver() {
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

    public static void mathCalculation() {
        double a = 2.8;
        double b = 3.1;
        double c = 6.0;
        System.out.println(a+b);
        System.out.println(Math.abs(a));
        System.out.println(Math.round(a));
        System.out.println(Math.ceil(a));
        System.out.println(Math.floor(a));
        System.out.println(Math.exp(a));
        System.out.println(Math.max(a,b));
        System.out.println(Math.min(a,b));
        System.out.println(Math.pow((Math.pow(2,c)-2),c));
    }

    public static void messageCharacters() {
        System.out.println("Insert a text message: ");
        String message;
        message = input.nextLine();

        if (message.length()>=6 && message.length()<=10) {
            System.out.println("Your message is: " + message);
        } else {
            System.out.println("Your message has to be between 6-10 characters!");
        }
    }

    public static void printCalculation() {
        System.out.println("Insert first number:");
        int a = input.nextInt();
        System.out.println("Insert second number:");
        int b = input.nextInt();
        System.out.println("       " + a);
        System.out.println("+" + "      " + b);
        System.out.println("----------");
        System.out.println("       "+ (a+b));
    }

    public static void printStars() {
        System.out.println("Insert a number:");
        int x = input.nextInt();

        String message = switch (x) {
            case 1 -> "*";
            case 2 -> "**";
            case 3 -> "***";
            case 4 -> "****";
            case 5 -> "*****";
            case 6 -> "*******";
            case 7 -> "*******";
            default -> "invalid number of";
        };
        System.out.println("The number you have picked has " + message + " stars");
    }
}

