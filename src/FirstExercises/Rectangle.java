package FirstExercises;

import java.util.Scanner;

public class Rectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Width: ");
        int width = sc.nextInt();
        System.out.print("Heigth: ");
        int height = sc.nextInt();
        int perimeter = 2 * (width + height);
        int area = width * height;
        System.out.println("Perimeter: " + perimeter);
        System.out.println("Area: " + area);
    }
}
