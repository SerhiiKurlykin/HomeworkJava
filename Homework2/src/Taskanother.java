public class Taskanother {

        public static int add(int a, int b) {
            return a + b;
        }


        public static int subtract(int a, int b) {
            return a - b;
        }


        public static int multiply(int a, int b) {
            return a * b;
        }


        public static double divide(int a, int b) {
           {
                return (double) a / b;
            }

        }

        public static void main(String[] args) {
            int num1 = 11;
            int num2 = 5;

            // Вызов методов и печать результатов с помощью printf
            System.out.printf("Сложение: %d + %d = %d%n", num1, num2, add(num1, num2));
            System.out.printf("Вычитание: %d - %d = %d%n", num1, num2, subtract(num1, num2));
            System.out.printf("Умножение: %d * %d = %d%n", num1, num2, multiply(num1, num2));
            System.out.printf("Деление: %d / %d = %.2f%n", num1, num2, divide(num1, num2));
        }
    }


