package First;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Number1: ");
        int num1 = sc.nextInt();
        System.out.print("Number2: ");
        int num2 = sc.nextInt();
        System.out.print("Which operator you need?(+, -, *, /) ");
        String oper = sc.next();
        if (oper.equals("+")) {
            int sum = num1 + num2;
            System.out.println(num1 + " + " + num2 + " = " + sum);
        } else if (oper.equals("-")) {
            int subt = num1 - num2;
            System.out.println(num1 + " - " + num2 + " = " + subt);
        } else if (oper.equals("*")) {
            int mult = num1 * num2;
            System.out.println(num1 + " * " + num2 + " = " + mult);
        } else if (oper.equals("/")) {
            int div = num1 / num2;
            System.out.println(num1 + " / " + num2 + " = " + div);
        }
    }
}
