package homeWork.homework5;

import java.util.Scanner;
//У вас на банковском счету N долларов.
//Вы хотите снять все, но банк разрешает снять только сумму, которая является делителем текущей суммы на счету и меньше текущей суммы.
//Если вы снимаете максимально возможную сумму каждый день, сколько дней вам понадобится, чтобы забрать все свои деньги из банка?
//Примечание: если оставшаяся сумма равна 1, вы можете снять ее.
//
//
//Ввод:  N = 21
//Выход:  7
//Объяснение:  N = 21
//Снято 7, осталось = 14
//Снято 7, осталось = 7
//Снято 1, осталось = 6
//Снято 3, осталось = 3
//Снято 1, осталось = 2
//Снято 1, Осталось = 1
//Снято 1, осталось = 0
public class Bank {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the amount of money ");
        int N = scanner.nextInt();


    calculateDays(N);
    }

    public static void calculateDays(int N) {
        int days = 0;

        while (N > 0) {
            int Divisor = 1;
            for (int i = N - 1; i >= 1; i--) {
                if (N % i == 0) {
                    Divisor = i;
                    break;
                }
            }

            System.out.println("Withdrawn: " + Divisor);
            N = N - Divisor;
            System.out.println("Remaining balance: " + N);
            days++;
        }


        System.out.println("Total days to withdraw all money: " + days);
    }
}








