import java.util.Scanner;

public class Main {


        public static void main (String[]args){
            Scanner input1 = new Scanner(System.in);
            System.out.println("Enter number please: ");
            double num1 = input1.nextDouble();
            System.out.println("Enter number please: ");
            double num2 = input1.nextDouble();

            System.out.printf("%.2f + %.2f = %.2f%n", num1, num2, (num1 + num2));
            System.out.printf("%.2f - %.2f = %.2f%n", num1, num2, (num1 - num2));
            System.out.printf("%.2f * %.2f = %.2f%n", num1, num2, (num1 * num2));
            System.out.printf("%.2f / %.2f = %.2f%n", num1, num2, (num1 / num2));
        }
    }