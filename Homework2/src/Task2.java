import java.util.Scanner;

public class Task2 {



    public static double add(double a, double b) {
        return a + b;
    }


    public static double subtract(double a, double b) {
        return a - b;
    }


    public static double multiply(double a, double b) {
        return a * b;
    }


    public static double divide(double a, double b) {
         {
            return (double) a / b;
        }
    }

        public static void main(String[] args){
            Scanner input = new Scanner(System.in);
            System.out.println("Enter first number please: ");
            double num1 = input.nextDouble();
            System.out.println("Enter second number please: ");
            double num2 = input.nextDouble();

            System.out.printf("Сложение: %.2f + %.2f = %2f%n", num1, num2, add(num1, num2));
            System.out.printf("Вычитание: %.2f - %.2f = %2f%n", num1, num2, subtract(num1, num2));
            System.out.printf("Умножение: %.2f * %.2f = %2f%n", num1, num2, multiply(num1, num2));
            System.out.printf("Деление: %.2f / %.2f = %.2f%n", num1, num2, divide(num1, num2));

        }
}


