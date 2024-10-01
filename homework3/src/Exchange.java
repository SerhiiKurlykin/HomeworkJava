//Программа запрашивает у пользователя сумму в Евро для конвертации
//Реализовать метод, который конвертирует полученную сумму в сумму в долларах США


import java.util.Scanner;

public class Exchange {


    public static double convertEuroToDollar(double euroAmount, double exchangeRate) {
        return euroAmount * exchangeRate;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.println("Enter the amount in euros : ");
              double euroAmount = sc.nextDouble();

        double exchangeRate = 1.10;

             double dollarAmount = convertEuroToDollar(euroAmount, exchangeRate);


        System.out.printf("Sum in US dollars: %.2f%n", dollarAmount);


    }
}