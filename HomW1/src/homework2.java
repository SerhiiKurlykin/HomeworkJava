import java.util.Scanner;

public class homework2 {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите трёхзначное число: ");
        int number = scanner.nextInt();


        int hundreds = number / 100;
        int tens = (number / 10) % 10;
        int ones = number % 10;


        System.out.println("Число " + number + " -> " + hundreds + ", " + tens + ", " + ones);
    }
}

