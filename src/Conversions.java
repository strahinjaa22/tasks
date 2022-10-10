public class Conversions {

    public static void main(String[] args) {
        stringToInt();
        intToString();
    }

    public static void stringToInt() {
        String s = "100";
        int i = Integer.parseInt(s);
        String st = "200";
        int in = Integer.valueOf(st);
        System.out.println(i+in);
    }

    public static void intToString() {
        int num = 300;
        String str = String.valueOf(num);
        int num1 = 500;
        String str1 = String.format("%d", num1);
        int num2 = 200;
        String str2 = Integer.toString(num2);
        System.out.println(str1 + " " + str + " " + str2);
    }
}
