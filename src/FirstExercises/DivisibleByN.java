package FirstExercises;

import java.util.Scanner;

public class DivisibleByN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Number: ");
        int num = sc.nextInt();
        if (num % 3 == 0) System.out.println(num + " is divisible by 3");
        if (num % 5 == 0) System.out.println(num + " is divisible by 5");
    }
}
