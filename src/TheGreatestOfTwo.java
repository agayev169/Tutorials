import java.util.Scanner;

public class TheGreatestOfTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Number1: ");
        int num1 = sc.nextInt();
        System.out.print("Number2: ");
        int num2 = sc.nextInt();
        if (num1 > num2) System.out.println(num1 + " > " + num2);
        else if (num1 < num2) System.out.println(num1 + " < " + num2);
        else if (num1 == num2) System.out.println(num1 + " = " + num2);
    }
}
