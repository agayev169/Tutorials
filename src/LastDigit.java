import java.util.Scanner;

public class LastDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Number: ");
        int num = sc.nextInt();
        int rem = num % 10;
        System.out.println("Last digit: " + rem);
    }
}
