package First;

import java.util.Scanner;

public class Condition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Number: ");
        int num = sc.nextInt();
        if (num < 10) {
            System.out.println("Your number is less than 10");
        } else if(num == 10) {
            System.out.println("Your number equals to 10");
        } else {
            System.out.println("Your number is greater than 10");
        }
    }
}
