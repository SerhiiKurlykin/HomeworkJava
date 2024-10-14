package homeWork.homework5;

import java.util.Scanner;
//Показать на экране равнобедренный треугольник (пользователь вводит высоту).
public class Triangle1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the height");
        int height = scanner.nextInt();
        printTriangle(height);
    }

    public static void printTriangle(int height) {
        for (int i = 1; i <= height; i++) {
            for (int j = 1; j <= height - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }


            System.out.println();
        }
    }
}
