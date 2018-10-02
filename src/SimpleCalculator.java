import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Number1: ");
        int num1 = sc.nextInt();
        System.out.print("Number2: ");
        int num2 = sc.nextInt();
        int sum = num1 + num2;
        int mult = num1 * num2;
        int subt = num1 - num2;
        float div = num1 / (float) num2;
        int mod = num1 % num2;
        System.out.println(num1 + " + " + num2 + " = " + sum);
        System.out.println(num1 + " * " + num2 + " = " + mult);
        System.out.println(num1 + " - " + num2 + " = " + subt);
        System.out.println(num1 + " / " + num2 + " = " + div);
        System.out.println(num1 + " % " + num2 + " = " + mod);
    }
}
