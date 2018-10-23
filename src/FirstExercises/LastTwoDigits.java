package FirstExercises;

import java.util.Scanner;

public class LastTwoDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Number: ");
        int num = sc.nextInt();
        System.out.println("The last two digits of " + num + ": " + num % 100);
    }
}
