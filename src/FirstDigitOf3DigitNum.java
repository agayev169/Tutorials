import java.util.Scanner;

public class FirstDigitOf3DigitNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Number: ");
        int num = sc.nextInt();
        System.out.println("The first digit of " + num + ": " + num / 100);
    }
}
