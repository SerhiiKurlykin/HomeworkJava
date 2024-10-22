package homeWork.homework7;

import java.util.Scanner;

public class Numbers {
    // Создать программу, которая переставит числа в переменных таким образом, чтобы при выводе
    //на экран последовательность a, b и c оказалась строго возрастающей.
    //Например:
    //Числа в переменных a, b и c: 7 0 -5
    //Возрастающая последовательность -5 0 7
    public static void main(String[] args) {
        Scanner  scanner = new Scanner(System.in);


        System.out.print("Enter the first number (a): ");
        int a = scanner.nextInt();
        System.out.print("Enter the second number (b): ");
        int b = scanner.nextInt();
        System.out.print("Enter the third number (c): ");
        int c = scanner.nextInt();


        if (a > b) {
            int temp = a;
            a = b;
            b = temp;
        }
        if (b > c) {
            int temp = b;
            b = c;
            c = temp;
        }
        if (a > b) {
            int temp = a;
            a = b;
            b = temp;
        }


        System.out.println("Ascending sequence " + a + " " + b + " " + c);
    }
}
